import java.util.Scanner;
class Cgpa{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total_sems=sc.nextInt();
        double percentage[]=new double[total_sems];
        System.out.println("Enter the percentages:");
        for(int i=0;i<total_sems;i++){
            percentage[i]=sc.nextDouble();
        }
        System.out.println();
        double sum_percentage=0;
        for(int i=0;i<total_sems;i++){
            if(percentage[i]>0){
                sum_percentage+=percentage[i];
            }
        }
        System.out.println(sum_percentage);
        double cgpa=(sum_percentage/total_sems)/9.5;
        System.out.println(cgpa);
    }
}