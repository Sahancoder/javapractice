
import java.util.Scanner;


public class SwapNumbers {

    public static void main(String[] args) {
        int x,y,temp;
        System.out.println("Enter your x and  y");
        Scanner in =new Scanner(System.in);
        x=in.nextInt();
        y= in.nextInt();

        System.out.println("Before swapping \n x="+x+" \n y="+y);

        temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping \n x="+x+" \n y="+y);
    }
}
