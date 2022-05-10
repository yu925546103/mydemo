package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author yujt
 * @Date 2022/5/10 15:19
 * @Version 1.0
 */
public class IsSymmetric_101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * [1,2,2,2,null,2]
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode u, TreeNode v) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()) {
            u = q.poll();
            v = q.poll();
            if (u == null && v == null) {
                continue;
            }
            if ((u == null || v == null) || (u.val != v.val)) {
                return false;
            }

            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        return true;
    }


//    public boolean isSymmetric(TreeNode root) {
//        if (null == root) {
//            return false;
//        }
//        Deque<TreeNode> stack = new LinkedList<>();
//        List<Integer> left = new ArrayList<>();
//        TreeNode leftNode = root.left;
//        while (null != leftNode || !stack.isEmpty()) {
//            while (null != leftNode) {
//                stack.push(leftNode);
//                leftNode = leftNode.left;
//                if (null == leftNode) {
//                    left.add(-9999);
//                }
//            }
//            leftNode = stack.pop();
//            left.add(leftNode.val);
//            leftNode = leftNode.right;
//            if (null == leftNode) {
//                left.add(-9999);
//            }
//        }
//        List<Integer> right = new ArrayList<>();
//        TreeNode rightNode = root.right;
//        while (null != rightNode || !stack.isEmpty()) {
//            while (null != rightNode) {
//                stack.push(rightNode);
//                rightNode = rightNode.right;
//                if (null == rightNode) {
//                    right.add(-9999);
//                }
//            }
//            rightNode = stack.pop();
//            right.add(rightNode.val);
//            rightNode = rightNode.left;
//            if (null == rightNode) {
//                right.add(-9999);
//            }
//        }
//
//        return left.equals(right);
//    }
}
