/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
 Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
import java.util.Scanner;
    public class Homework1 {
        public static void main(String[] args) {
            System.out.println("Введите число");
            Scanner scan = new Scanner(System.in);
            while (true) {
                try {
                    float num1 = Float.parseFloat(scan.nextLine());
                    System.out.println("Отлично это дробное число: = " + num1);
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }