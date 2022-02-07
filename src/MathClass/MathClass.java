package MathClass;

public class MathClass {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double z = Math.max(x,y);
        System.out.println("Max :" + z);

        double min = Math.min(x, y);
        System.out.println("Min :" + min);

        double abs = Math.abs(y);
        System.out.println("Absulate value of y:" + abs);

        double sqrt = Math.sqrt(x);
        System.out.println("Square root of x: " + sqrt);

        double round = Math.round(x);
        System.out.println("Round of x:" + round);

        double ceil = Math.ceil(x);
        System.out.println("Ceil of x :" + ceil);

        double floor = Math.floor(x);
        System.out.println("Floor of x:" + floor);


    }
}
