import java.util.Scanner;
class Rev_String{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char[] s1=new char[n];
        for(int i=n-1;i>=0;i--){
            s1[i]=s.charAt(n-1-i);
        }
        System.out.println(s1);
    }
}