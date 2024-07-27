import java.util.Scanner;
class Compound{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        double rate=sc.nextDouble();
        double years=sc.nextDouble();
        double compound=(1+(rate/100));
        double intrest=principal*Math.pow(compound,years);
        System.out.println(intrest);
        
    }
}