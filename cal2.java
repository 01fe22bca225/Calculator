import java.util.Scanner;

public class cal2 {
    public static void main(String[] args) {
     //   Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
       // double num1 = scanner.nextDouble();
        double num1=10;

        System.out.println("Enter second number:");
        //double num2 = scanner.nextDouble();
        double num2=20;

        System.out.println("Choose an operation: +, -, *, /");
        //char operation = scanner.next().charAt(0);
        

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
            result = num1 / num2;
            System.out.println("Result: " + result);
            break;
            
             
 default:
                System.out.println("Invalid operation.");
        }

        //scanner.close();
    }
}
