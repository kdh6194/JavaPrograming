package honeybee;

import java.util.Scanner;

public class C08Loop {
    public static void main(String[] args) {
        // while
        // 조건식이 참일 동안 코드블록을 실행하는 반복문
        // for는 반복 횟수를 처음부터 알고 있을 때 실행하는 반복문인 반면,
        // while은 반복 횟수를 모르고 실행하는 반복문

        // while의 경우 증감식이 정의되지않으면 무한 루프 동작

        int i = 0;
        while (true) {
            i += 1;
            if (i%2==0){
                System.out.println(i);
            }
            if (i >100) break;
        }

        i = 0;
        int sum = 0;
        while (true) {
            i += 1;
            if (i >100) break;
            sum += i;
        }System.out.println(sum);

        i = 0;
        sum = 0;
        while (true) {
            i += 1;
            if (i >100) break;
            if (i%2!=0){
                sum += i;
            }
        }System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        for (int j = 1; j < 10; j++) {
//            System.out.printf("%d * %d = %d\n",num,j,num*j);
//        }

        int j = 0;
        while(true){
            j += 1;
            if (j>9) break;
            System.out.printf("%d * %d = %d\n",num,j,num*j);
        }

        // 변수를 i로 쓰면 안되는 이유 : 위에서 변수i가 존재하기 때문에
        // 배열 선언후 배열 인덱스로 증감식을 넣어줘야

        int[] k = new int[100];
        int idx = 0; // 배열 인덱스
        sum = 0;
        while(true){
           k[idx] = sc.nextInt();
            if (k[idx] == 0)break;
            sum += k[idx];
            ++idx;
        }
        System.out.printf("입력 받은 정수의 합 : %d\n",sum);

        for (int val : k){
            if (val !=0) System.out.println(val);
        }



    }
}
