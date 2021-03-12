class Solution {
    public boolean canJump(int[] nums) {

        //last good position

        int lp = nums.length-1;

        // 当前位置是否可以到达last goodposition

        for(int i = nums.length-1; i>=0; i--){
            if (i+ nums[i]>=lp){
                lp = i;
            }
        }
        return lp == 0;
    }
}