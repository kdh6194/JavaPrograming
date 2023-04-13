package honeybee;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C20Collection {
    // Collection
    // 데이터를 저장하는 자료구조와
    // 데이터를 처리(CRUD)하는 알고리즘을
    // 체계적으로 정리(구조화)하여
    // 인터페이스와 클래스로 구현해 놓은 프레임워크


    public static void main(String[] args) {
        // ArrayList
        // 동적배열의 한 종류
        // List 인터페이스를 구현해서 만든 컬렉션 프레임워크
        // 요소의 저장순서가 유지
        // 중복으로 데이터를 저장할 수 있음
        // 크기가 늘어나면 새로운 배열을 생성하고
        // 기존의 요소들을 옮겨야 하는 복잡한 과정이 동반됨

        //ArrayList names = new ArrayList();
        List<String> names = new ArrayList<>();
        // 인터페이스 형식으로 사용한다면 제네릭을 사용

        // 데이터 추가 : add(대상)
        // 특정위에 데이터 추가 : add(위치,대상)으로 작성하면됨
        names.add("문동은");
        names.add("주여정");
        names.add("박연진");
        names.add("손명오");

        // 조회 : enhanced for-> 향상된 for문(같은 말로 for-each문 이라고 함)
        for(String name : names){
            System.out.println(name+" ");
        }

        // 특정요소 조회 : get(위치)
        System.out.println(names.get(1));

        // 특정요소 변경 : set(위치, 새로운 값)
        names.set(1,"하도영");
        System.out.println(names.get(1));

        // 특정요소 제거 : remove(위치) -> 제거시 뒤에 있던 인덱스를 앞으로 땡김
        names.remove(1);
        System.out.println(names.get(1));

        names.remove("문동은");
        System.out.println(names.get(names.size()-1));

        // 데이터 검색
        // 위치로 찾음 : get(위치), indexOf
        // 값으로 찾음 : foreach, contains
        // size 는 컬렉션에선 length 대신 사용된다.

        // 위치 기반 검색
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("손명오")){
                System.out.println((i+1)+"번째에서 찾음");
            }
        }

        if(names.indexOf("손명오") > -1){
            System.out.println("데이터 찾음!");
        }

        // 값 기반 검색
        for (String name: names) {
            if(name.equals("손명오")){
                System.out.println("데이터 찾음!!");
            }
        }

        if (names.contains("손명오")) System.out.println("데이터 찾음!!!");

        // 게임정보 동적배열 생성
        List<GameInfo> games = new ArrayList<>();
        games.add(new GameInfo("디아블로4",89600));
        games.add(new GameInfo("젤다의 전설",74800));
        games.add(new GameInfo("스타크래프트",12500));
        games.add(new GameInfo("바람의나라",9000));

        // 조회
        // GameInfo 타입은 객체형이므로
        // 객체자체를 출력시 객체의 메모리 주소가 출력
        // 따라서, toString을 재정의해두어야 올바른 값이 출력

        // System.out.println(Arrays.toString(games));가 안되는 이유를 찾아보자
        // Arrays.toString은 배열객체의 문자열을 표현하는데
        // 리스트 요소가 GameInfo객체이므로 Arrays.toString 사용해서 문자열 표현이 안됨
        // toArray()는 List 컬렉션을 배열로 변환할 때 사용하는 메소드
         System.out.println(Arrays.toString(games.toArray())); // 배열형태로 출력

        for (GameInfo game : games) System.out.println(game); // 문자열형태로 출력
        for (GameInfo g : games) System.out.println(g.toString());
        // 위에 두개의 코드 모두 같은 결과의 값을 출력한다.
        // 하지만 밑에 코드가 굳이 작성안해도 되는 코드를 가지고 있다.


        // 젤다의전설 가격을 조회
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).name.equals("젤다의 전설")){
                System.out.println("데이터를 찾았습니다. "+games.get(i).price);
            }
        }

        for (GameInfo g : games) {
            if (g.name.equals("젤다의 전설")){
                System.out.println("데이터를 찾았습니다. "+g.price);
            }
        }


        //객체형인 경우 contains를 바로적용하긴 힘들다.
        for (GameInfo g : games) {
            if (g.name.contains("젤다의 전설")) {
                System.out.println("데이터를 찾았습니다. " + g.price);
            }
        }

        for (GameInfo g : games) {
            if (g.name.indexOf("젤다의 전설") > -1) {
                System.out.println("데이터를 찾았습니다. " + g.price);
            }
        }


    }

}
class GameInfo {
     String name;
     int price;

    public GameInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        String fmt = "%s %,d";
        return String.format(fmt,name,price);
    }
}