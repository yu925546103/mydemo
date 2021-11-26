package medium;

import org.springframework.util.comparator.Comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author yujt
 * @Date 2021/8/26 14:45
 * @Version 1.0
 */
public class NumRescueBoats {

    public static int numRescueBoats(int[] people, int limit) {
        int count = 0;
        List<Integer> peopleList = Arrays.stream(people).boxed().sorted().collect(Collectors.toList());
        System.out.println(peopleList);
        while (peopleList.size() > 0) {
            int value = peopleList.get(0);
            peopleList.remove(0);
            int dif = limit - value;
            if (dif < value) {
                count++;
                continue;
            }
            while (dif > 0) {
                if (findProperPeople(1, dif, peopleList)) {
                    count++;
                    break;
                }
                dif--;
                if (dif == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean findProperPeople(int i, int weigh, List<Integer> people) {
        int index = binarySearch(people, weigh);
        if (index >= 0) {
            people.remove(index);
            return true;
        }
        return false;
    }

    private static int binarySearch(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums.get(mid) == target){
                return mid;
            }
            else if (nums.get(mid) < target) {
                left = mid + 1;
            }
            else if (nums.get(mid) > target){
                right = mid - 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] people = {2,2};
        int limit = 6;
        System.out.println(numRescueBoats(people, limit));
    }

//    public static void main(String[] args) {
//        int[] p = {1,5,6,8,5,8,3};
//        List<Integer> list = Arrays.stream(p).boxed().collect(Collectors.toList());
//        System.out.println(list.size());
//        list.remove(4);
//        System.out.println(list.toString());
//        System.out.println(list.size());
//    }

}
