package Task2;

public class Task2_2 {
    public static boolean SummEquals(String str1, String str2, String str3) {
        double a = Double.parseDouble(str1);
        double b = Double.parseDouble(str2);
        double c = Double.parseDouble(str3);
        double epsilon = 0.0000001d;
        return ((a+b)-c)<epsilon;
    }
}
