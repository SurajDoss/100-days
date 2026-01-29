class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mPointer = m-1;
        int nPointer = n-1;

        int arrayIndexer = ( m + n ) -1;

        while( nPointer >= 0){ // need to loop, based on the second array length
            if(mPointer >= 0 && nums1[mPointer] > nums2[nPointer] ){
                nums1[arrayIndexer] = nums1[mPointer]; 
                arrayIndexer--;
                mPointer--; 
            }else{
                nums1[arrayIndexer] = nums2[nPointer]; // place the second array (nums2) value in the nums1 using indexer
                arrayIndexer--;
                nPointer--;
            }
        }

    }

    public void mergeBetter(int[] nums1, int m, int[] nums2, int n) {
        int nums1Length = nums1.length;

        int pointerOne = m - 1;
        int pointerTwo = n - 1;
        int pointerThree = ( m + n ) - 1;

        while(pointerThree >= 0){
            int elementOne = pointerOne >= 0 ? nums1[pointerOne] : Integer.MIN_VALUE;
            int elementTwo = pointerTwo >= 0 ? nums2[pointerTwo] : Integer.MIN_VALUE;

            if(elementOne > elementTwo){
                nums1[pointerThree] = elementOne;
                pointerOne--;
            }else{
                nums1[pointerThree] = elementTwo;
                pointerTwo--;
            }
            pointerThree--;
        }
    }
}
