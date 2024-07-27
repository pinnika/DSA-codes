import java.util.Scanner;
class Lcm_and_Hcf{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
                System.out.println(hcf+" ");
            }
        }
        // int lcm=a*b/hcf;
        // System.out.println("the lcm of two numbers is:"+lcm);
        int lcm=1;
        for(int i=1;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        System.out.println("the lcm of two numbers is:"+lcm);

    }
}