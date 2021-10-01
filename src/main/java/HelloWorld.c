//
// Created by 杨建伟 on 2021/5/19.
//

# include <stdio.h>

int getSum(int x, int y);
long getFactorial_A(int x);
long getFactorial_B(int x);

int main() {
    int i = 0;
    printf("welcome hotspot in action!\n");
    printf("i =  %d\n", i);
    i++;
    printf("i =  %d\n", i);

    int x = 10;
    int y = 20;
    int sum = getSum(x, y);
    printf("x = %d, y = %d, sum = %d\n", x, y, sum);

    int m = 5;
    long factorial_a = getFactorial_A(m);
    printf("m = %d, factorial_a = %ld\n", m, factorial_a);

    int n = 10;
    long factorial_b = getFactorial_B(n);
    printf("n = %d, factorial_b = %ld\n", n, factorial_b);
    return 0;
}

int getSum(int x, int y) {
   return x + y;
}

long getFactorial_A(int x) {
   if(x <= 0) {
      return x;
   }
   long value = 1;
   for(int i = 1; i <= x; i++) {
      value = value * i;
   }
   return value;
}

long getFactorial_B(int x) {
   if(x <= 0) {
      return x;
   }
   if(x == 1) {
      return 1;
   }
   return x * getFactorial_B(x - 1);
}


