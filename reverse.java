import java.util.*;
class reverse
{
    static void swap(int x, int y, int[] arr)
    {
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i <= 5/2; i++)
        {
            swap(i,5-1-i,arr);
        }
        System.out.println("The reversed array:");
        for(int i = 0;i<5;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
//nb=