import java.util.Scanner;
public class element {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of element in the array ");
            int x= sc.nextInt();
            int y[]=new int[x];
            System.out.println("Enter the element in the array ");
            for(int i=0;i<x;i++){
                y[i]= sc.nextInt();
            }
            System.out.println("Enter the index of the element you want to access ");
            int index=sc.nextInt();
            System.out.println("The array element at index "+index+ "=" +y[index]);
            System.out.println("The array is successfully accessed ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
