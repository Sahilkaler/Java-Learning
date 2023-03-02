import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       /* int[] ros={3,4,5,6,7,8};
        System.out.println(ros[0]); */
        int[] arr= new int[5];
       /*  arr[0]=23;
        arr[1]=33;
        arr[2]=43;
        arr[3]=323;
        arr[4]=523;
        System.out.println(arr[3]); */

        //input using for loop
        for (int i=0; i<arr.length; i++) {
            arr[i]= input.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");

    
        
    }
   
    

    
}
}
