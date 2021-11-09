public class string3 {
    public static void main(String[] args) {
        String str="";
        int length=str.length();
        if(length<=1){
            System.out.println(str);
        }
        else {
            for (int i = 0; i < length; i++) {
                System.out.print(str.charAt(0));
                System.out.print(str.charAt(1));
            }
        }

    }
}
