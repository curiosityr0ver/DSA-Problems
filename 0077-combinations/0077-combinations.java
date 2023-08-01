class Solution {
     List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        generateCombinations(1, n, k, new ArrayList<Integer>());
        return result;
    }

    private void generateCombinations(int start, int n, int k, List<Integer> combination) {
        if (k == 0) result.add(new ArrayList<>(combination));
        else {
            for (int i = start; i <= n - k + 1; i++) {
            combination.add(i);
            generateCombinations(i + 1, n, k - 1, combination);
            combination.remove(combination.size() - 1);
            }
        }
    }
}