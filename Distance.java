import java.util.Scanner;
class Distance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        int x_axis=(x2-x1)*(x2-x1);
        int y_axis=(y2-y1)*(y2-y1);
        double result=Math.sqrt(x_axis+y_axis);
        System.out.println(result);
    }
}