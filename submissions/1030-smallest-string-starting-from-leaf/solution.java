/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    String mins = null;
    public String smallestFromLeaf(TreeNode root) {
        char arr[] = new char[26];
        for(int i = 0; i < 26 ; i++){
            arr[i] = (char) ('a' + i);
        }
        StringBuilder sb = new StringBuilder();
        List<Integer> l = new ArrayList<>();
        solve(root , arr, sb);
        return mins;
    }
    private void solve(TreeNode root , char[] arr, StringBuilder sb){
        if(root == null ) return;
        sb.append(arr[root.val]);
        if(root.left == null && root.right == null){
            String curr = new StringBuilder(sb).reverse().toString();
            if(mins == null || curr.compareTo(mins) < 0){
                mins = curr;
            }
        }
        solve(root.left , arr, sb);
        solve(root.right , arr , sb);
        sb.deleteCharAt(sb.length() - 1);
    }
    // private String find(String s1 , String s2){
    //     int n = s1.length();
    //     int m = s2.length();
    //     int req = Math.min(n, m);
    //         for(int i = 0; i < req ; i++){
                
    //             if(s1.charAt(i) < s2.charAt(i)){
    //                 return s1;
    //             }
    //             else if(s1.charAt(i) > s2.charAt(i)){
    //                 return s2;
    //             }
    //         }
    //     if(n <= m){
    //         return s1;
    //     }
    //     return s2;

    // }

}
