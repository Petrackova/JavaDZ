/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HomeWork2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст");
        try {
            String str = reader.readLine();
            if(str.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
