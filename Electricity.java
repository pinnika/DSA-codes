import java.util.Scanner;
class Electricity{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double units=sc.nextDouble();
        if(units>=0 && units<=100){
            System.out.println("bill amount is:"+25+units*2.6);
        }
        else if(units>=101 && units<=300){
            System.out.println("bill amount is:"+50+units*3.35);
        }
        else if(units>=301 && units<=500){
            System.out.println("bill amount is:"+75+units*5.4);
        }
        else{
            System.out.println("bill amount is:"+100+units*8.5);
        }

    }
}