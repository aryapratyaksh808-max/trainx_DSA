// note this code contain all type of right angled triangle...
import java.util.*;
public class RightAngledTriangle {

       static void triSerialNum(int n){
          int p=1;
          for(int i=1;i<=n;i++){   
               for(int j=1;j<=i;j++){
                    System.out.print(p+" ");
                    p++;
               }
               System.out.println();
          }
     }
       static void triRowNum(int n){
          for(int i=1;i<=n;i++){
               for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
               }
               System.out.println();
          }
     }

     static void triColNum(int n){
          for(int i=1;i<=n;i++){
               for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
               }
               System.out.println();
          }
     }
     static void triStar(int n){
          for(int i=1;i<=n;i++){
               for(int j=1;j<=i;j++){
                    System.out.print("* ");
               }
               System.out.println();
          }
     }
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number-> ");
     int n = sc.nextInt();
     triStar(n);
     triColNum(n);  
     triRowNum(n);
     triSerialNum(n);
     }
}