public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result;


        for(int i=0; i<nums.length-1; i++){

            for(int j=i+1; j<nums.length; j++){
                int temp = 0;
                temp = nums[i] + nums[j];

                if (temp == target){
                    result = new int[]{i, j};
                    return result;
                }
            }
        }
        return null;
    }

}
