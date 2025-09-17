package Level_3_Java_Methods_Practice_Problems;
import java.util.*;
public class NumberChecker {
    public static int countDigits(int n) { return String.valueOf(n).length(); }
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i=0;i<s.length();i++) d[i] = s.charAt(i)-'0';
        return d;
    }
    public static boolean isDuck(int n) {
        int[] d=getDigits(n);
        for(int x:d) if(x==0) return true;
        return false;
    }
    public static boolean isArmstrong(int n) {
        int[] d=getDigits(n); int p=d.length; int sum=0;
        for(int x:d) sum+=Math.pow(x,p);
        return sum==n;
    }
    public static boolean isHarshad(int n) {
        int[] d=getDigits(n); int sum=0;
        for(int x:d) sum+=x;
        return n%sum==0;
    }
    public static boolean isPalindrome(int n) {
        int[] d=getDigits(n);
        for(int i=0,j=d.length-1;i<j;i++,j--) if(d[i]!=d[j]) return false;
        return true;
    }
    public static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0) return false;
        return true;
    }
    public static boolean isNeon(int n) {
        int sq=n*n; int sum=0;
        while(sq>0){ sum+=sq%10; sq/=10; }
        return sum==n;
    }
    public static boolean isSpy(int n) {
        int sum=0,prod=1;
        while(n>0){ int d=n%10; sum+=d; prod*=d; n/=10; }
        return sum==prod;
    }
    public static boolean isAutomorphic(int n) {
        return String.valueOf(n*n).endsWith(String.valueOf(n));
    }
    public static boolean isBuzz(int n) {
        return n%7==0 || n%10==7;
    }
    public static boolean isPerfect(int n) {
        int sum=1; for(int i=2;i<=n/2;i++) if(n%i==0) sum+=i;
        return n>1 && sum==n;
    }
    public static boolean isAbundant(int n) {
        int sum=1; for(int i=2;i<=n/2;i++) if(n%i==0) sum+=i;
        return sum>n;
    }
    public static boolean isDeficient(int n) {
        int sum=1; for(int i=2;i<=n/2;i++) if(n%i==0) sum+=i;
        return sum<n;
    }
    public static boolean isStrong(int n) {
        int temp=n,sum=0;
        while(temp>0){
            int d=temp%10; int fact=1; for(int i=1;i<=d;i++) fact*=i;
            sum+=fact; temp/=10;
        }
        return sum==n;
    }
}
