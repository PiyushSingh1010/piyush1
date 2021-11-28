import java.util.InputMismatchException;
import java.util.Scanner;
public class Array_element {
    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array");
            int x = sc.nextInt();
            int y[] = new int[x];
            System.out.println("enter the element");
            for (int i=0;i<x;i++)
            {
                y[i]=sc.nextInt();
            }
            System.out.println("enter the index you want to search");
            int index=sc.nextInt();
            System.out.println("the element at index "+index+" = "+y[index]);
            System.out.println("the array is successfully executed");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}
