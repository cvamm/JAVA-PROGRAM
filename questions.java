import java.util.*;
public class questions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=1;

            for (int i = n; i>0; i--) {
                f=f*i;
            }
            System.out.println(f);

        }
    }
