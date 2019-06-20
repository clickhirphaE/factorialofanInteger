
import java.util.*;
public class Factorial_N {
    public static void main(String args[]) {
        int fact = 1;
        Scanner cc = new Scanner(System.in);
        System.out.println("Insert an integer:");
        int in = cc.nextInt();
        if (in==0||in==1){
            System.out.println(in);
        }
        for(int x=in;x>=1;x--){
            fact=fact*x;
        }
        System.out.println("Factorial of "+in+" is:"+fact);
    }
}
