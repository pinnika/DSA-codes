//Area of the circle
import java.util.Scanner;
class CircleArea{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double area=3.14*radius*radius;
        System.out.println("The area of the circle is:"+area);
    }
}