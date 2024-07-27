import java.util.Scanner;
class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        String s=Integer.toString(num);
        int n=s.length();
        int rem;
        double each;
        double sum=0;
        for(int i=0;i<=n;i++){
        rem=num%10;
        each=Math.pow(rem,n);
        sum=sum+each;
        num=num/10;
        }
        System.out.println(sum);
        if(num==sum){
            System.out.println("The given number is Armstrong number");
        }
        else{
            System.out.println("The given number is not Armstrong number");

        }
    }
}