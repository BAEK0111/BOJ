class Solution {
    public static int dfs(int node, int sum, int[] numbers, int target) {
        if(node == numbers.length) {
            if(sum == target) return 1;
            else return 0;
        }
        int number = numbers[node];
        node += 1;
        
        return dfs(node, sum + number, numbers, target) + dfs(node, sum - number, numbers, target);
    }
    
    public int solution(int[] numbers, int target) {
        return dfs(0, 0, numbers, target);
    }
}