package tree;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author yujt
 * @Date 2022/5/8 14:14
 * @Version 1.0
 */
public class PreorderTraversal_144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        if (null == root) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        while (null != node || !CollectionUtils.isEmpty(stack)) {
            while (null != node) {
                result.add(node.val);
                stack.push(node);
                node = node.left;
            }
        }
        search(root, result);
        return result;
    }

    public void search(TreeNode root, List<Integer> result) {
        if (null == root) {
            return;
        }
        result.add(root.val);
        search(root.left, result);
        search(root.right, result);
    }
}
