package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yujt
 * @Date 2021/12/17 13:55
 * @Version 1.0
 */
public class LongSubStringDemo {
    public static void main(String[] args) {
        String s = "ababacb";
        System.out.println(longestSubstring(s, 3));
    }


    public static int longestSubstring(String s, int k) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 97]++;
        }
        // ����k���г���
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] < k && count[i] > 0) {
                characters.add((char) (i + 97));
            }
        }
        // ����
        int index = 0;
        int right = 0;
        int max = 0;
        while (index < s.length()) {
            if (characters.contains(s.charAt(index))) {
                index++;
                continue;
            }
            right = index + k;
            while (right < s.length()) {
                if (!characters.contains(s.charAt(right))) {
                    right++;
                } else {
                    break;
                }
            }
            max = Math.max(max, right - index);
            index = right + 1;
        }
        return max;
    }
}

