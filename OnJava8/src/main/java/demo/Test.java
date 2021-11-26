package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yujt
 * @Date 2021/11/11 14:13
 * @Version 1.0
 */
public class Test {
    private List<String> testList;

    public List<String> getTestList() {
        return testList;
    }

    public void setTestList(List<String> testList) {
        this.testList = testList;
    }

    public Test() {
        this.testList = new ArrayList<String>();
    }
}
