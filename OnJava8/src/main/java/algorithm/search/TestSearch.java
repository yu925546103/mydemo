package algorithm.search;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.struts.util.LabelValueBean;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Vector;

/**
 * @Author yujt
 * @Date 2021/11/30 16:10
 * @Version 1.0
 */
public class TestSearch {
    public static void main(String[] args) {
        Vector<LabelValueBean> wdlist = new Vector<>();
        wdlist.add(new LabelValueBean("测试（已撤销）", "12"));
        wdlist.add(new LabelValueBean("这（已撤销）", "12"));
        wdlist.add(new LabelValueBean("啊测试（已撤销）", "121"));
        wdlist.add(new LabelValueBean("测试（已撤销）", "12"));
        wdlist.add(new LabelValueBean("试（已撤销）", "12"));

        sort(wdlist);
        for (LabelValueBean labelValueBean : wdlist) {
            System.out.println(labelValueBean.getLabel());
        }
    }

    private static void sort(Vector<LabelValueBean> wdlist) {
        final Collator collator = Collator.getInstance(Locale.CHINA);

        int end = wdlist.size() - 1;
        int index = 0;
        while (index <= end) {
            if (validteCancel(wdlist.get(index))) {
                swap(wdlist, index, end);
                --end;
                continue;
            }
            index++;
        }
        wdlist.subList(0, end + 1).sort((o1, o2) -> {
            CollationKey key1 = collator.getCollationKey(o1.getLabel());
            CollationKey key2 = collator.getCollationKey(o2.getLabel());
            return key1.compareTo(key2);
        });
    }

    private static boolean validteCancel(LabelValueBean labelValueBean) {
        String wdName = labelValueBean.getLabel();
        String[] out = org.apache.commons.lang3.StringUtils.substringsBetween(wdName, "（", "）");
        if (!ArrayUtils.isEmpty(out) && Arrays.asList(out).contains("已撤销")) {
            return true;
        }
        return false;
    }

    private static void swap(Vector<LabelValueBean> wdlist, int a, int b) {
        LabelValueBean tempBean = wdlist.get(a);
        wdlist.set(a, wdlist.get(b));
        wdlist.set(b, tempBean);
    }


    private static Vector<LabelValueBean> sort2(Vector<LabelValueBean> wdlist) {
        final Collator collator = Collator.getInstance(Locale.CHINA);
        final String cancelFlag = "已撤销";

        Vector<LabelValueBean> canceledList = new Vector<>();
        Vector<LabelValueBean> normalList = new Vector<>();
        wdlist.forEach(labelValueBean -> {
            String wdName = labelValueBean.getLabel();
            String[] out = org.apache.commons.lang3.StringUtils.substringsBetween(wdName, "（", "）");
            if (ArrayUtils.isNotEmpty(out) && Arrays.asList(out).contains(cancelFlag)) {
                canceledList.add(labelValueBean);
                return;
            }
            normalList.add(labelValueBean);
        });
        normalList.sort((o1, o2) -> {
            CollationKey key1 = collator.getCollationKey(o1.getLabel());
            CollationKey key2 = collator.getCollationKey(o2.getLabel());
            return key1.compareTo(key2);
        });
        normalList.addAll(canceledList);
        return normalList;
    }
}
