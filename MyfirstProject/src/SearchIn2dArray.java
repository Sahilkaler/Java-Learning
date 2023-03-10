import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int arr [] [] = {
            {24,35,56},
            {789,58,23,4},
            {26,56,89,20},
            {67,8}
        };
        int target = 8;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target) {
                    return new int[]{row,col};
                    
                }
                
            }
            
        }
        return new int[] {-1,-1};
    }
    
}
