class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] result = new int[A.length];
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            setA.add(A[i]);
            setB.add(B[i]);
            if (setB.contains(A[i])) {
                count++;
            }
            if (setA.contains(B[i]) && A[i] != B[i]) {
                count++;
            }
            result[i] = count;
        }
        return result;
    }
}