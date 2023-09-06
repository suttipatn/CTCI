import java.util.Arrays;
import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(Character.getNumericValue('a'));
        System.out.println(Character.getNumericValue('A'));
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char[] arr= input.toCharArray();
        Arrays.sort(arr);
        char cur=arr[0];
        for(int i=1;i<arr.length;i++){
            if((cur^arr[i])==0){
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE");

    }
}
