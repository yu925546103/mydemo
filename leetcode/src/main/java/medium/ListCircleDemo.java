package medium;

/**
 * @Author yujt
 * @Date 2021/12/15 10:29
 * @Version 1.0
 */
public class ListCircleDemo {

    public boolean hasCycle(AddTwoNumberDemo.ListNode head) {
        if (head == null) {
            return false;
        }
        AddTwoNumberDemo.ListNode slow = head;
        AddTwoNumberDemo.ListNode fast = head.next;
        if (fast == null) {
            return false;
        }
        while (slow != fast && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null) {
                return false;
            }
        }
        if (fast.next == null) {
            return false;
        } else {
            return true;
        }
    }
}
