// Исправление кода задание 2
public class Main {
    public static void main(String[] args) {
        int[] Array = {100, 6, 324, 12, 123,1,6,7,24};
        try {
            int d = 0;
            double catchedRes1 = Array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}