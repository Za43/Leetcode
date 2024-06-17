class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> vals = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            vals.add(nums[i]);
        }
        for (Integer val : vals){
            if (vals.contains(val-diff) && vals.contains(val-(2*diff))){
                count++;
            }
        }
        return count;
    }
}