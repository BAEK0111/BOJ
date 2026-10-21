class Solution {
    private static int dfs(int[] numbers, int node, int sum, int target) {
        if(node == numbers.length) {
            if (sum == target) return 1;
            else return 0;
        }
        int number = numbers[node];
        node += 1;
        return dfs(numbers, node, sum + number, target) + dfs(numbers, node, sum - number, target);
    }

    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }
}