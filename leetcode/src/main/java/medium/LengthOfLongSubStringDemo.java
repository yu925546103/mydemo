package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author yujt
 * @Date 2021/12/16 10:20
 * @Version 1.0
 */
public class LengthOfLongSubStringDemo {
    public static void main(String[] args) {
        String s = "";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(32);
        int right = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            while (right + 1 < s.length()) {
                if (!set.contains(s.charAt(right + 1))) {
                    set.add(s.charAt(right + 1));
                    right++;
                } else {
                    set.remove(s.charAt(i));
                    break;
                }
            }
            max = Math.max(max, right - i + 1);
        }
        return max;
    }

}
