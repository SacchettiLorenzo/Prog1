import javax.print.attribute.standard.PrinterLocation;

public class Conversion {
    public static void main(String[] args) {
        int i = 90;
        float f = 34.3f;
        double d = 56.7;
        double z = i - f / 4;
        System.out.println("normal operation: " + z);
        System.out.println("converted to float: " + (float)z);
        System.out.println("converted to int: " + (int)z);
    }
}
