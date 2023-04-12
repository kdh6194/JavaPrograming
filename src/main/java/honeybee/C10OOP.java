package honeybee;

public class C10OOP {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 개요
        // 현실의 모든 사물을 객체로 취급하여
        // 소프트웨어를 개발하는 방식
        // 객체 : 실생활에서 우리가 인식하는 유/무형의 사물
        // ex) 집, 자동차, 사람, 급여, 주문, ...

        // 클래스 : 객체를 만들어 내기 위한 틀, 설계도
        // 클래스에는 객체의 상태를 나타내는 필드/속성과
        // 객체의 기능을 나타내는 메서드로 구성됨

        // 클래스는 객체의 설계도이기 때문에
        // 실제 정보는 저장할 수 없음
        // 실제 정보를 저장하려면, 이것의 객체가 필요한데
        // 객체를 선언하는 과정을 개체화(instantate)라고 함
        // 개체화를 통해 나온 결과물을 객체/인스턴스라 하는데
        // 클래스에 정의된 필드와 기능이 실제 메모리상에 할당된 것

        // ex) 주소록 프로그램을 작성하려고할 때 사람 정보를 저장하는 클래스 정의
        // 개인정보 : 이름, 직업, 나이, 성별, 전화번호, 주소
        // 여러가지 정보를 하나의 클래스로 묶어서 사용

        // 객체 사용
        // 클래스명 객체명 = new 클래스명();
        Person p1 = new Person(); // 객체 생성

        // 객체의 멤버변수에 값 대입
        // 변수별로 값을 대입하는 것은 다소 불편
        // => 생성자 이용시 편리하게 값을 대입할 수 있음
        // 그러나 값을 입력 받을때는 변수가 필요하다
        p1.name = "문동은";
        p1.job = "초등학교 교사";
        p1.age = 43;
        p1.gender = "여성";
        p1.phone = "010-3225-0516";
        p1.address = "충청북도 청주 세명시 세명로154";

        //매개변수 생성자로 객체 초기화
        Person p2 = new Person("손명오","상남자",43,"남성","011-1234-4567","없음");
        System.out.println(p2.name);
        System.out.println(p2.job);
        System.out.println(p2.age);
        System.out.println(p2.gender);
        System.out.println(p2.phone);
        System.out.println(p2.address);


    }
}
// 클래스 정의 - 서로 다른 자료형으로 구성된 데이터들의 집합
class Person{
    // 멤버변수 : 클래스를 구성하는 변수
    String name;
    String job;
    int age;
    String gender;
    String phone;
    String address;
    // 생성자 : 멤버변수에 값을 초기화하는 특별한 메서드
    // public 클래스명(매개변수){
    //      변수 초기화 => this.변수 = 인자 로 쓰인다.
    // }
    public Person() {} // 기본생성자

    public Person (String name,String job,int age,String gender,String phone,String address){
        this.name = name;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

}