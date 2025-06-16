
import java.util.Scanner;

public class UpdateValueUsingFunction{

      //update Function Creation 
      public static void update(int mark[]){

            //for loop for Traversing Total  Array & UPdate
            for (int i=0;i<mark.length;i++){
                  mark[i]=mark[i]+1;
            }
      }
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in); // scanner Class Object Created
            int[] marks = new int[4]; // Size Defined
            System.out.println("Enter YOur MArks ");

            // This For Loop For taking input
            for(int i=0;i<marks.length;i++){
                  marks[i]=sc.nextInt();
            }

            //update fucntion call here by //Call by  Reference 
            update(marks);


            // THe Mark Will also Updated ON main functin coz the
            // function is call by reference
            //This For LOOP print the VAlues of all array
            for (int i=0;i<marks.length;i++){
                  System.out.println ("Update Mark "+marks[i]);
            }
            sc.close();

      }
}