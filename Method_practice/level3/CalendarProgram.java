package Level_3_Java_Methods_Practice_Problems;
import java.util.*;
public class CalendarProgram {
    static String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    static boolean isLeap(int y){ return (y%4==0 && y%100!=0)|| (y%400==0); }
    static int getFirstDay(int m,int y){
        int d=1; int c=y/100; int k=y%100; if(m<3){m+=12;y--;} return (d + (13*(m+1))/5 + k + (k/4) + (c/4) + 5*c)%7;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(); int y=sc.nextInt();
        int daysInMonth=days[m-1]; if(m==2&&isLeap(y)) daysInMonth=29;
        int start=getFirstDay(m,y); System.out.println("   "+months[m-1]+" "+y); System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<start;i++) System.out.print("    ");
        for(int d=1;d<=daysInMonth;d++){ System.out.printf("%3d ",d); if((d+start)%7==0) System.out.println(); }
    }
}
