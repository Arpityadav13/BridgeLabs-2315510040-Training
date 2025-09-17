package Level_3_Java_Methods_Practice_Problems;
import java.util.*;
public class MatrixOperations2 {
    static int[][] transpose(int[][] a){ int r=a.length,c=a[0].length; int[][] t=new int[c][r]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) t[j][i]=a[i][j]; return t; }
    static int det2(int[][] m){ return m[0][0]*m[1][1]-m[0][1]*m[1][0]; }
    static int det3(int[][] m){ return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1]) - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0]) + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]); }
    static double[][] inverse2(int[][] m){ double d=det2(m); return new double[][]{{m[1][1]/d,-m[0][1]/d},{-m[1][0]/d,m[0][0]/d}}; }
    public static void main(String[] args){ int[][] m={{1,2},{3,4}}; System.out.println(det2(m)); System.out.println(Arrays.deepToString(inverse2(m))); }
}
