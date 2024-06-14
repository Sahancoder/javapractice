

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        int MarksObtained,passingMarks;
        passingMarks=40;

        Scanner input=new Scanner(System.in);
        System.out.println("input marks scored by you");

        MarksObtained= input.nextInt();

        if (MarksObtained>=passingMarks){
            System.out.println("You passed the exam");

        }else {
            System.out.println("Unfortunately you failed the exam ");
        }
    }
}
