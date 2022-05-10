package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author yujt
 * @Date 2022/5/8 23:15
 * @Version 1.0
 */
public class LevelOrder_102 {

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9);
        TreeNode node1 = new TreeNode(3, node2, node3);
        System.out.println(levelOrder(node1));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> levelResult = new ArrayList<>();
            while (count > 0) {
                TreeNode node = queue.poll();
                levelResult.add(node.val);
                if (null != node.left) {
                    queue.add(node.left);
                }
                if (null != node.right) {
                    queue.add(node.right);
                }
                count--;
            }
            result.add(levelResult);
        }
        return result;
    }

    private static void getList(Queue<TreeNode> queue1, Queue<TreeNode> queue2, List<List<Integer>> result) {
        while (!queue1.isEmpty()) {
            List<Integer> levelResult = new ArrayList<>();
            while (!queue1.isEmpty()) {
                TreeNode node = queue1.poll();
                levelResult.add(node.val);
                if (null != node.left) {
                    queue2.add(node.left);
                }
                if (null != node.right) {
                    queue2.add(node.right);
                }
            }
            result.add(levelResult);
        }
    }
}
