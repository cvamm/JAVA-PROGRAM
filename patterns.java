import java.util.*;
//nested loop and square pattern
// public class patterns {
//    public static void main(String args[]){
//          Scanner sc=new Scanner(System.in);
//          int num=sc.nextInt();
//          for(int i=0;i<num;i++){
//           for(int j=0;j<num;j++){
//               System.out.print("* ");}
//              System.out.println();
//          }
//    }
//}
//pattern of rectangle by user input

//public class patterns {
//    public static void main(String args[]){
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

/////////hollow rectangle///
//public class patterns {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}

//pyramid
//public class patterns {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println((" "));
//        }
//
//    }
//}

//
public class patterns {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         int a=sc.nextInt();
         int k=1;
         for(int i=1;i<=a;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(k+" ");
                 k=k+1;
             }
             System.out.println();
         }
    }

}



