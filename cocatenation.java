import java.util.Locale;
import java.util.Scanner;

public class cocatenation {
    public static void main(String[] args) {
        String str,substr= "";
        String s3;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        substr=sc.next();
        str = str.toLowerCase();
        substr = substr.toLowerCase();
        if(str.charAt(str.length()-1)==substr.charAt(0)){
            s3=str.concat(substr.substring(1,substr.length()));
            System.out.println(s3);
        }
        else {
            s3 = str.concat(substr);
            System.out.println(s3);
        }

    }
}
