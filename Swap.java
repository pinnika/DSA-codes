import java.util.Scanner;
class Swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a;
        float b;
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.println("the value of a before swapping:"+a);
        System.out.println("the value of b before swapping:"+b);
        float temp=a;
        a=b;
        b=temp;
        System.out.println("the value of a after swapping is:"+a);
        System.out.println("the value of b after swapping is:"+b);
    }
}