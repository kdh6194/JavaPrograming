package examples;

import java.util.Random;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배송한 거리를 입력하세요");
        int  km = sc.nextInt();

        if (km >= 300) {
            int price = 75000;
            System.out.printf("%d Km의 배송료는 %d원 입니다\n",km,price);
        }
        else if (km < 300 && km >= 100) {
            int price = 55000;
            System.out.printf("%d Km의 배송료는 %d원 입니다\n",km,price);
        }
        else if (km < 100 && km >= 50) {
            int price = 18000;
            System.out.printf("%d Km의 배송료는 %d원 입니다\n",km,price);
        }else {
            int price = 10000;
            System.out.printf("%d Km의 배송료는 %d원 입니다\n",km,price);
        }

        System.out.println("숫자를 입력하세여");
        int checkNumber = sc.nextInt();
        if( checkNumber >= 20000 && checkNumber < 30000){
            System.out.println("20000~30000");

        }else if(checkNumber >= 10000 && checkNumber < 20000){
            System.out.println("10000~20000");

        }else if(checkNumber < 10000){
            System.out.println("10000미만");

        }else {System.out.println("범위 밖 값");}


        System.out.println("원금을 입력하세여");
        int tong = sc.nextInt();
        double sale = 0.06;
        int jango = tong*2;

        /*double month = (tong * sale) / 12;
        double year = tong / (month * 12);
        System.out.printf("%.0f년 뒤에 수익이 2배가 됩니다.\n",year);*/

        String jang = "%d년 뒤에 수익이 %d원 정도 됩니다.\n";
        for (int i = 0; i <= 100 ; i++) {
            tong = tong + (int)(tong*sale);
            System.out.printf(jang,i,tong);
            if (tong >= jango) break;
        }

        //---------

        Random rnd = new Random();
        int num2 = rnd.nextInt(100)+1;
        int num1;

        System.out.println("1-100까지 숫자중에 아무거나 입력하세여\n");
        do{
            num1 = sc.nextInt();

            if (num1 > num2) {
                System.out.println("정답보다 큽니다");
            }
            if (num1 < num2) {
                System.out.println("정답보다 작습니다");
            }
        }while (num1 != num2);

        System.out.println("빙고");



    }
}
