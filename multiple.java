import java.util.*;
public class multiple{
    static int gcd(int x, int y)
    {
        if(y == 0)
            return x;
        return gcd(y,x%y);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
        int num1;
        int num2;
        int target;
        System.out.println("Enter the two numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Enter the target upto which the multiples have to be selected");
        target = sc.nextInt();
        int total = (target/num1) + (target/num2) + (target/((num1 * num2)/gcd(num1,num2)));
        System.out.println("The total some is: "+total);
    }
}
//nb=