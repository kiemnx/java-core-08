package vn.plusplus.javacore.lesson9;

public class ExceptionExample2 {
    public static void main(String[] args) {
        System.out.println("Before call phepChia func.");
        int ret=  0;
        ret = phepChia(23, 0);
        System.out.println("Result = " + ret);
        System.out.println("After call phepChia func.");
    }

    private static int phepChia(int a, int b) {
        System.out.println("phepChia func is being run!");
        try {
            int c = a / b;
            return c;
        } catch (ArithmeticException e) {
            System.out.println("Co loi, ctrinh se dung lai");
            System.exit(0);
            return -1;
        } finally {
            System.out.println("Finally block!");
        }
    }
}

