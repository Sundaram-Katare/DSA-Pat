package Trees;

public class MaxPathSum {
    int maxSum = Integer.MIN_VALUE;
    public int maxSum(Node root) {
        dfs(root);
        return maxSum;
    }

    public int dfs(Node root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));

        maxSum = Math.max(maxSum, left + right + root.data);

        return Math.max(left, right) + root.data;
    }
}
