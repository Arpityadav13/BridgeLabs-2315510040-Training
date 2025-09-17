package String;

import java.util.Scanner;

public class CalendarDisplay {
    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }

    public static int getFirstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        return d0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        int numDays = days[month-1];
        if (month == 2 && isLeapYear(year)) numDays = 29;
        System.out.println("   " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int startDay = getFirstDay(month, year);
        for (int i = 0; i < startDay; i++) System.out.print("    ");
        for (int i = 1; i <= numDays; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay) % 7 == 0) System.out.println();
        }
    }
}

