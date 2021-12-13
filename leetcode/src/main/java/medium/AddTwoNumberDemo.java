package medium;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @Author yujt
 * @Date 2021/12/11 13:40
 * @Version 1.0
 */
public class AddTwoNumberDemo {
    public static void main(String[] args) {
        int[] a = {-1, -1};
        int[] res = topKFrequent(a, 1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oldStart = head;
        ListNode pre = head;
        int count = 1;
        while (head.next != null) {
            head = head.next;
            count++;
        }
        k = k % count;
        if (k == 0) {
            return pre;
        }
        int index = 1;
        int targetLast = count - k;
        ListNode newStart;
        while (index < targetLast) {
            pre = pre.next;
            index++;
        }
        newStart = pre.next;
        ListNode res = newStart;
        pre.next = null;
        while (newStart.next != null) {
            newStart = newStart.next;
        }
        newStart.next = oldStart;
        return res;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[nums[i] - 1]++;
        }
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                continue;
            }
            map.put(result[i], i);
        }
        quickSort(result, 0, result.length - 1);
        int[] res = new int[k];
        for (int i = result.length - 1; i > (result.length - 1 - k); i--) {
            res[result.length - i - 1] = map.get(result[i]) + 1;
        }
        return res;
    }

    static void quickSort(int[] arr, int left, int right) {
        int center;
        if (left < right) {
            center = partiton(arr, left, right);
            quickSort(arr, left, center - 1);
            quickSort(arr, center + 1, right);
        }
    }


    static int partiton(int[] arr, int left, int right) {
        int pivot = left;
        int i = left + 1;
        int j = right;
        int temp;
        while (true) {
            while (i <= j && arr[i] <= arr[pivot]) {
                i++;
            }
            while (i <= j && arr[j] >= arr[pivot]) {
                j--;
            }
            if (i >= j) {
                break;
            }
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        return j;
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
