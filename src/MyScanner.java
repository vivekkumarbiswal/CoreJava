import java.util.Scanner;
public class MyScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Hello " + name);
        System.out.print(" Age: " + age);
        sc.close();
    }
}
