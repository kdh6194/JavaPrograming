package examples;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        // Q3
        int colorPen = 5* 12;
        int studentCount = 27;

        int divColorPen = colorPen/studentCount;
        System.out.printf("학생당 나눠가지는 색연필수 :%d\n",divColorPen);
        int remainColorPen = colorPen%studentCount;
        System.out.printf("똑같이 나눠가지고 남은 색연필수 :%d\n",remainColorPen);

        // Q4
        int age = 3;
        int height = 110;
        boolean parent = true;
        boolean hearchDease = true;

        if (age > 6) {
            if (height > 120 && parent) {
                System.out.println("탑승가능\n");
            }
        }else if(height > 120) {
            System.out.println("탑승가능\n");
        } else if (hearchDease) {
            System.out.println("탑승불가능\n");
        }

        // Q5
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        boolean checkYear = year%4 == 0 && year%100 != 0 || year%400 ==0 ;
        String leapYear = checkYear ? "윤년":"윤년아님";
        //String leapYear = year%4 == 0 ? "윤년" : "윤년아님" ;
        System.out.println(leapYear);

        // Q6
        int price = 187000;
        int oman = price / 50000;
        int ilman = (price%50000) / 10000;
        int ochun = (price%10000) / 5000;
        int ilchun = (price%5000) / 1000;

        System.out.printf("5만원권 : %d장\n",oman);
        System.out.printf("1만원권 : %d장\n",ilman);
        System.out.printf("5천원권 : %d장\n",ochun);
        System.out.printf("1천원권 : %d장\n",ilchun);

    }
}
