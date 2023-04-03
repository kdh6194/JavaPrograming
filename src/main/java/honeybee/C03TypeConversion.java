package honeybee;

public class C03TypeConversion {
    public static void main(String[] args) {
        // 자료형 형변환
        // 묵시적 형변환(auto,promotion)
        // 명시적 형변환(casting,overflow)

        //묵시적 형변환
        byte z = 10;    // byte 는 1byte 크기의 자료형
        //int a = z;    // int 는 4byte 크기 자료형 (승격 promotion)
        int a = (int)z; // 승격시 명시적 형변환이 불필요

        System.out.printf("%d, %d\n",z,a);

        // 명시적 형변환 : cast연산자 사용
        // 자료형 변수명 = (변환할 자료형) 변수명B;
        z = (byte)a;
        System.out.printf("%d, %d\n",z,a);

        a= 512;
        z = (byte)a;
        System.out.printf("%d, %d\n",z,a);

        double b = 3.14;
        long c = (long)b;
        System.out.printf("%f, %d\n",b,c);

        // 의도적인 형변환
        // 정수끼리 산술연산 결과 : 정수
        // 하지만, 산술연산 결과를 실수로 출력하려면 - 형변환필요!
        int x = 98;
        int y = 99;

        System.out.printf("98 / 99 = %d\n",x/y);
        // 정수끼리 연산시 결과도 정수 : 소수부 출력 불가!

        System.out.printf("98 / 99 = %f\n",x/(double)y);
        // 자동형변환에 의해 연산 결과는 실수로 바뀌어 출력
    }
}
