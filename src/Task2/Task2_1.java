package Task2;

import java.math.BigDecimal;

public class Task2_1 {
    public static BigDecimal AreaOfSircle (int radius) {
        double S = Math.PI * (radius *radius);
        BigDecimal result = new BigDecimal(S).setScale(50);
        return result;
    }
}
