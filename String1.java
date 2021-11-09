public class String1 {
    public static void main(String[] args) {
        String str="Piyush" ;
        String s1 ="";
        int length=str.length();
        if(length<=1){
            System.out.println(str);
        }
        else {
            for (int i = 0; i < length; i++) {
                s1=s1.concat(str.substring(0,2));
            }
        }
        System.out.println(s1);
    }
}
