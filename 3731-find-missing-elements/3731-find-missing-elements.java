class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
        for (int i : nums) {
            set.add(i);
        }
        int start = nums[0];
        int end = nums[nums.length - 1];
        for (int i = start; i <= end; i++) {
            if (!set.contains(i)) {
                lst.add(i);
            }
        }
        return lst;
    }
}