class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] res = new int[2];
        res[0] = findleft(nums, target);
        res[1] = findright(nums, target);

        return res;
    }
    public int findleft(int[] nums, int target){

        int left = -1;
        int start = 0;
        int end = nums.length-1;

        while (start<= end){
            int mid = start + (end - start)/2;
            if (nums[mid] >= target){
                end = mid -1;
            }else{
                start = mid +1;
            }
            if (nums[mid]==target) left = mid;
        }
        return left;
    }
    public int findright(int[] nums, int target){

        int right = -1;
        int start = 0;
        int end = nums.length-1;

        while (start<= end){
            int mid = start + (end - start)/2;
            if (nums[mid] <= target){
                start = mid +1;
            }else{
                end = mid -1;
            }
            if (nums[mid]==target) right = mid;
        }
        return right;

    }
}