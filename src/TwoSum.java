class SolutionTwoSum {
    /**
     * Given an array of integers and an integer target,
     * return indices of the two numbers such that they add up to target.
     * @param nums the array of nums
     * @param target the target value
     * @return indices of the two numbers such that they add up to target
     */
    public int[] twoSum(int[] nums, int target) {
        int[] returnArr = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for(int j = 1; j < nums.length; j++) {
                if(j != i) {
                    int num2 = nums[j];
                    if(num1 + num2 == target) {
                        returnArr[0] = i;
                        returnArr[1] = j;

                    }
                }
            }
        }
        return returnArr;
    }
}