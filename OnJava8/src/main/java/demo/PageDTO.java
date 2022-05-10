package demo;

/**
 * @Author yujt
 * @Date 2022/4/14 14:16
 * @Version 1.0
 */
public class PageDTO {
    /**
     * 每页显示条数
     */
    private transient int pageSize = 20;

    /**
     * 当前页号
     */
    private int pageIndex = 1;

    private transient int test;

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    /**
     * 开始行
     */
    private transient int startRow;

    /**
     * 结束行
     */
    private transient int endRow;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getStartRow() {
        return pageIndex * pageSize;

    }

    public void setStartRow(int startRow) {
        this.startRow = pageIndex * pageSize;
    }

    public int getEndRow() {
        return getStartRow() + pageSize;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }
}

