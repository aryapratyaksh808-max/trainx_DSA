import java.util.*;
public class OddPyramid {
     static void oddPyramid(int n){
          for(int i=1;i<=n;i++){
               for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
               }
               for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
               }
               System.out.println();
          }
     }
     static void InvertedOddPyramid(int n){
          for(int i=n-1;i>=1;i--){
               for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
               }
               for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
               }
               System.out.println();
          }
     }
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number: ");
          int n= sc.nextInt();
          oddPyramid(n);
          InvertedOddPyramid(n);
     }
}
