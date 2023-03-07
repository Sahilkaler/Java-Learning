import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

       // list.add(77);
       //list.add(8877);
       //list.add(75527);
       //list.add(73657);
       //list.add(9879777);
       //list.add(74647);

      //System.out.println(list.contains(8877));
      //list.set(0, 8569);

      //System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());    
        }
        //get an item
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));   
        }

        
    }
    
}
