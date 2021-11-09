class Main {
    void sum(int[]a){
        int total=0;
        for(int i:a)
            total =total+1;
        System.out.println("The sum is:"+total);


    }
}
public class Test
{
    public static void main(String[] args) {
        Main m=new Main();
        m.sum(new int[]{1,2,3});
    }

}