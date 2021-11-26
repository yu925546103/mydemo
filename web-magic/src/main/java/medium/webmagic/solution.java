package medium.webmagic;

public class solution {
    public static void main(String[] args) {
        System.out.println(clumsy(12));
    }

    public static int clumsy(int N) {
        int result = 0;
        if (N == 1) {
            return 1;
        }
        if (N == 2) {
            return 2;
        }
        if (N == 3) {
            return 6;
        }
        int n = N/4 ;
        //大于等于4的初始值
        result = N*(N-1)/(N-2)+(N-3);
        N = N -4;
        for (int i=1;i<n;i++) {
            result = result - N*(N-1)/(N-2);
            result = result + (N-3);
            N = N - 4;
        }
        if (N == 3) {
            result = result - 6;
        }
        if (N == 2) {
            result = result - 2;
        }
        if (N == 1) {
            result = result - 1;
        }
        return result;
    }
}
