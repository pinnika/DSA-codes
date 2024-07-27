import java.util.Scanner;
class Ascii{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //char p='A';
        for(int i=65;i<=n;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}