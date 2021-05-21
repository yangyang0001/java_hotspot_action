public class HelloWorld {

    public static void main(String[] args) {
        int i = 0;
        System.out.println("Welcome to hotspot in action!");
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);

        int x = 10;
        int y = 20;
        int sum = getSum(x, y);
        System.out.println("x = " + x + ", y = " + y + ", sum = " + sum);

        int m = 5;
        long factorial_a = getFactorial_A(m);
        System.out.println("m = " + m + ", factorial_a = " + factorial_a);

        int n = 10;
        long factorial_b = getFactorial_B(n);
        System.out.println("n = " + n + ", factorial_b = " + factorial_b);
    }

    public static int getSum(int x, int y) {
        return x + y;
    }

    public static long getFactorial_A(int x) {
        if(x <= 0) {
            return x;
        }
        long value = 1;
        for(int i = 1; i <= x; i++) {
            value = value * i;
        }
        return value;
    }

    public static long getFactorial_B(int x) {
        if(x <= 0) {
            return x;
        }
        if(x == 1) {
            return 1;
        }
        return x * getFactorial_B(x - 1);
    }


}
