package Level_3_Java_Methods_Practice_Problems;
import java.util.*;
public class FactorsProgram {
    static int[] factors(int n) {
        int count=0; for(int i=1;i<=n;i++) if(n%i==0) count++;
        int[] f=new int[count]; int idx=0;
        for(int i=1;i<=n;i++) if(n%i==0) f[idx++]=i;
        return f;
    }
    static int greatest(int[] f) { int max=Integer.MIN_VALUE; for(int x:f) if(x>max) max=x; return max; }
    static int sum(int[] f) { int s=0; for(int x:f) s+=x; return s; }
    static int product(int[] f) { int p=1; for(int x:f) p*=x; return p; }
    static int productCubes(int[] f) { int p=1; for(int x:f) p*=Math.pow(x,3); return p; }
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int[] f=factors(n); System.out.println(Arrays.toString(f)); System.out.println(greatest(f)); System.out.println(sum(f)); System.out.println(product(f)); System.out.println(productCubes(f)); }
}
