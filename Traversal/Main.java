import java.util.Scanner;


class Testing 
{
    
   static void traversal(int [] arr , int size)
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");

        int size = sc.nextInt();

        int []arr = new int[size];
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter " + (i+1) + " Element: ");
           arr[i] = sc.nextInt();
        }
        Testing.traversal(arr, size);
        sc.close();
    }
}