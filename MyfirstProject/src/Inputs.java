import java.util.Scanner;


public class Inputs {
    public static void main(String[] args) {
        
        // System.out.println("enter your name:");
         Scanner input= new Scanner(System.in);
        // String name= input.nextLine();
        // System.out.println("Good Morning " + name);

        int num= input.nextInt();
        if (num % 2 == 0)
        System.out.println(num + " is Even");
        else
        System.out.println(num + " is odd");
         }

    }
   

