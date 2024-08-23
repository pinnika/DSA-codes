import java.util.Scanner;
class Ass1{
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int a=ss.nextInt();
        int b=ss.nextInt();
        int c=ss.nextInt();
        int max=maxOfThree(a,b,c);
        int min=minOfThree(a,b,c);
        System.out.println("Maximum of three numbers is:"+max);
        System.out.println("Minimun of three numbers is:"+min);
    }
    static int maxOfThree(int a,int b,int c){
        int ma=(a>b && a>c) ? a:(b>a && b>c) ? b:c;
        return ma;

    }
    static int minOfThree(int a,int b,int c){
        int mi=(a<b && a<c) ? a:(b<a && b<c) ? b:c;
        return mi;
        
    }
}