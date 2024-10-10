package chp09.ex09_4;

import java.util.ArrayList;

public class ArrayListTest {
//
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();

        // 요소 추가
        names.add("Kim");
        names.add("Park");
        names.add("Lee");
        names.add("Jung");

        // 요소 변경
        names.set(1, "Cha");

        // 요소 삭제
        String removedName = names.remove(2);

        System.out.println("삭제된 요소: " + removedName);

        // 요소 반환
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s | ", names.get(i));
        }
    }
}
