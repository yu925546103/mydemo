package demo;

import java.util.List;

public class finalizedemo {
    public static void main(String[] args) throws Throwable {
        Test test = new Test();
        test.getTestList().add("12");
        System.out.println(test.getTestList().get(0));
    }
}
class Book {
    boolean checkedOut;

    List<String> books;
}
