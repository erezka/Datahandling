package Task2;

public class Task2_1 {
    public static String AreaOfSircle (int radius) {
        double S = Math.PI * (radius *radius);
        String result = String.format("%.50f",S);
        return result;
    }
}
