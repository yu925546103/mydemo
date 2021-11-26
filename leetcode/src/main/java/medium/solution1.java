package medium;

import org.junit.Test;

import java.util.*;

/**
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
 *
 */
public class solution1 {
    private Set<List<Integer>> set = new HashSet<List<Integer>>();

    @Test
    public void test() {
        int[] a = {1,2,2};
        List<List<Integer>> lists = subsetsWithDup(a);
        for (List<Integer> list:lists){
            System.out.println(list);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(nums,0,new ArrayList<Integer>());
        return new ArrayList(set);
    }

      void dfs(int[] nums,int index,List<Integer> temp) {
        if (index <= nums.length) {
            set.add(new ArrayList(temp));
        } else
            return;

        for (int i = index; i<nums.length;i ++) {
            temp.add(nums[i]);
            dfs(nums,i+1,temp);
            temp.remove(temp.size() -1 );
        }

    }
}
