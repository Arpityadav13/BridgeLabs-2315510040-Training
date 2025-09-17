package Level_3_Java_Methods_Practice_Problems;
import java.util.*;
public class StudentScores {
    static int[][] generateScores(int n){ Random r=new Random(); int[][] arr=new int[n][3]; for(int i=0;i<n;i++) for(int j=0;j<3;j++) arr[i][j]=r.nextInt(90)+10; return arr; }
    static double[][] calculate(int[][] arr){ int n=arr.length; double[][] res=new double[n][3]; for(int i=0;i<n;i++){ int total=arr[i][0]+arr[i][1]+arr[i][2]; double avg=total/3.0; double perc=(total/300.0)*100; res[i][0]=total; res[i][1]=Math.round(avg*100.0)/100.0; res[i][2]=Math.round(perc*100.0)/100.0; } return res; }
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int[][] scores=generateScores(n); double[][] res=calculate(scores); for(int i=0;i<n;i++){ System.out.println(Arrays.toString(scores[i])+" -> Total:"+res[i][0]+" Avg:"+res[i][1]+" %:"+res[i][2]); } }
}
