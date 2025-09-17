package Level_3_Java_Methods_Practice_Problems;
import java.util.*;
public class EmployeeBonus {
    static int[][] generateData(){ int[][] arr=new int[10][2]; Random r=new Random(); for(int i=0;i<10;i++){ arr[i][0]=r.nextInt(90000)+10000; arr[i][1]=r.nextInt(10)+1; } return arr; }
    static double[][] calculateBonus(int[][] arr){ double[][] res=new double[10][2]; for(int i=0;i<10;i++){ double bonus= arr[i][1]>5? arr[i][0]*0.05: arr[i][0]*0.02; res[i][0]=arr[i][0]+bonus; res[i][1]=bonus; } return res; }
    public static void main(String[] args){ int[][] data=generateData(); double[][] res=calculateBonus(data); int sumOld=0; double sumNew=0,sumBonus=0; for(int i=0;i<10;i++){ sumOld+=data[i][0]; sumNew+=res[i][0]; sumBonus+=res[i][1]; } System.out.println("Old:"+sumOld+" New:"+sumNew+" Bonus:"+sumBonus); }
}
