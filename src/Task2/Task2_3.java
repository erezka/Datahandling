package Task2;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Task2_3 {
    public static void MinMax(int a,int b, int c) {
        System.out.println("Максимальное число: " + max(max(a, b), c));
        System.out.println("Минимальное число: " + min(min(a, b), c));
    }
}

