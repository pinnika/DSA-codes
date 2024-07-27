import java.util.Scanner;
class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        double avg=sum/3;
        System.out.println("The average of three numbers is:"+avg);


    }
}