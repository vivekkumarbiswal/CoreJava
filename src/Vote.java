import java.util.Scanner;;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >=18){
            System.out.println(name+" you are Eligible to vote");
        } else {
            System.out.println(name+" you are not Eligible to vote");
        }
        sc.close();
    }
}
