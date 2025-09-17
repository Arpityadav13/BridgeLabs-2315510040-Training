package Level_3_Java_Methods_Practice_Problems;
import java.util.*;
public class OTPGenerator {
    static int generateOTP() { return 100000 + new Random().nextInt(900000); }
    static boolean isUnique(int[] arr) {
        Set<Integer> set=new HashSet<>(); for(int x:arr) set.add(x);
        return set.size()==arr.length;
    }
    public static void main(String[] args){ int[] otps=new int[10]; for(int i=0;i<10;i++) otps[i]=generateOTP(); System.out.println(Arrays.toString(otps)); System.out.println(isUnique(otps)); }
}
