class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //1. Sort the array
        //iterate the array with i
        //have a pointer j which is i +1
        //have a another pointer k. which i the last index i.e nums.lenght - 1
        // add it to the list if the sum is 0
        //greater than 0 mean k--
        //lesser than 0 mean j++
        if(nums.length < 3){
            return new ArrayList<>();
        }

        Set<ArrayList<Integer>> distinctTriplets = new HashSet<ArrayList<Integer>>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i = 0; i < nums.length - 2; i++){
            int j = i +1;
            int k = length -1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    ArrayList<Integer> values = new ArrayList<Integer>();
                    values.add(nums[i]);
                    values.add(nums[j]);
                    values.add(nums[k]);
                    distinctTriplets.add(values);
                    
                    j++;
                    k--;
                }else if( sum > 0){
                    k--;
                }else if( sum < 0){
                    j++;
                }
            }

        }

        return new ArrayList<List<Integer>>(distinctTriplets);
    }
}
