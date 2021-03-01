class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums == null || nums.length == 0) return res;

        backtrack( nums, res, new ArrayList<Integer>(),new boolean[nums.length]);
        return res;

    }

    private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> temp, boolean[] visited){

        if (temp.size() == nums.length){
            res.add (new ArrayList<Integer>(temp));
            return;
        }

        for (int i=0; i<nums.length; i++){

            // skip used letter

            if (visited[i]) continue;

            temp.add(nums[i]);
            visited[i] = true;
            backtrack(nums, res, temp, visited);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }

        //出口

    }
}