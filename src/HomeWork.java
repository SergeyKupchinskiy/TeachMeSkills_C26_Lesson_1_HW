import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        String username = sc.nextLine();
        System.out.println("Hello," + username + "!");
    }
}
