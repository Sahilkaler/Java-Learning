import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter some input:");
            int num1= input.nextInt();
            int num2= input.nextInt();
            
            int sum= num1+num2;
            System.out.println("sum=" + sum);
        }
    }
    
}
