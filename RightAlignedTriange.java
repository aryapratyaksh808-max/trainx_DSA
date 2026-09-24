import java.util.*;
public class RightAlignedTriange {
     static void rightAlignedTri(int n){
          for(int i=1;i<=n;i++){
               for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
               }
               for(int j=1;j<=i;j++){
                    System.out.print("*");

               }
               System.out.println();

          }


     }
          static void serialNumPyramid(int n){
          for(int i=1;i<=n;i++){
               for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
               }
               for(int j=1;j<=i;j++){
                    System.out.print(" *");

               }
               System.out.println();

          }


     }    
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int n = sc.nextInt();
          rightAlignedTri(n);
          System.out.println("__________________________________________________");// just to distingues between both
          serialNumPyramid(n);
     }
     
}
