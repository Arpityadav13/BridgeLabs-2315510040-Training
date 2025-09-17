package Level_3_Java_Methods_Practice_Problems;
import java.util.*;
public class MatrixOperations1 {
    static int[][] createMatrix(int r,int c){ Random rand=new Random(); int[][] m=new int[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=rand.nextInt(10); return m; }
    static int[][] add(int[][] a,int[][] b){ int r=a.length,c=a[0].length; int[][] m=new int[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=a[i][j]+b[i][j]; return m; }
    static int[][] sub(int[][] a,int[][] b){ int r=a.length,c=a[0].length; int[][] m=new int[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=a[i][j]-b[i][j]; return m; }
    static int[][] mul(int[][] a,int[][] b){ int r=a.length,c=b[0].length; int[][] m=new int[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++){ int sum=0; for(int k=0;k<b.length;k++) sum+=a[i][k]*b[k][j]; m[i][j]=sum; } return m; }
}
