class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];

                if (temp == 0) {
                    result.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));

                    // Move both pointers
                    left++;
                    right--;

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if (temp < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }
}