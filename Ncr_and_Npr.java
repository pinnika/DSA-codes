import java.util.Scanner;
class Ncr_and_Npr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        double result_ncr=ncr(n)/((ncr(n-r)*ncr(r)));
        double result_npr=ncr(n)/(ncr(n-r));
        System.out.println(result_ncr);
        System.out.println(result_npr);

    }
    private static int ncr(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}