import java.util.Scanner;
class Discount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cost_price=sc.nextInt();
        int selling_price=sc.nextInt();
        int discount_price=cost_price-selling_price;
        double dis_per=(discount_price*100)/cost_price;
        System.out.println(discount_price);
        System.out.println(dis_per);
    }
}