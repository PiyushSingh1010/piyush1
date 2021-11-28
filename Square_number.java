import java.util.Scanner;
public class Square_number {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String x=s.nextLine();
        int y;
        try{
            y=Integer.parseInt(x);
            System.out.println("The square value is: "+(y*y));
        }
        catch(NumberFormatException e){
            System.out.println("Enter input is not a valid format for an integer.");
        }
    }
}
