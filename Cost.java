import java.util.Scanner;
class Cost{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float bill=pencil+pen+eraser;
        double gst=0.18*bill;
        System.out.println("The total bill for three products is:"+bill);
        System.out.println("The gst for three products is:"+gst);
    }
}