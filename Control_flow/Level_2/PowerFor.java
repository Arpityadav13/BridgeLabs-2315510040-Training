package Control_Flow;

import java.util.*;
public class PowerFor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int power=sc.nextInt();
        if(number<=0||power<0) return;
        int result=1;
        for(int i=1;i<=power;i++){
            result*=number;
        }
        System.out.println(result);
    }
}
