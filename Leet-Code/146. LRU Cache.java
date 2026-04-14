class LRUCache {
    //properties needed
    HashMap<Integer, Node> nodeMap = new HashMap();
    int capacity;
    Node head;
    Node tail;

    //node object
    class Node{
        int value;
        int index;
        Node prev;
        Node next;

        public Node(int key, int value){
            this.value = value;
            this.index = key;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node(0,0);
        this.tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if( !nodeMap.containsKey(key) ){
            return -1;
        }

        Node node = nodeMap.get(key);
        //removeNode
        removeNode(node);
        //insertNode
        insertNode(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        //contains in map
        if(nodeMap.containsKey(key)){
            Node node = nodeMap.get(key);
            node.value = value;
            removeNode(node);
            insertNode(node);
        }else{
            //capacity over
            if( nodeMap.size() == capacity ){
                Node node = tail.prev;
                removeNode(node);
                nodeMap.remove(node.index);
            }

            //else new node
            Node node = new Node(key, value);
            insertNode(node);
            nodeMap.put(key, node);
        }
    }

    private void removeNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    private void insertNode(Node node){
        Node head = this.head;
        Node afterHead = head.next;

        head.next = node;
        node.prev = head;
        node.next = afterHead;
        afterHead.prev = node;
    }


}
