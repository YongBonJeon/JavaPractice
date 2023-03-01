package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (list,set,map)

        // 배열
        int[] array = new int[3];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;

        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("전용본");
        list.add("전용근");
        list.add("전홍진");
        list.add("윤미연");
        list.add("전용주");

        // 데이터 조회
        System.out.println(list.get(0));

        // 삭제
        System.out.println(list.size());
        list.remove("전홍진");
        System.out.println(list.size()+list.get(2));

        System.out.println("------");

        list.remove(list.size()-1);

        // 순회
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("------");

        // 변경
        list.set(1,"김민석");
        System.out.println(list.get(0));
        System.out.println(list.indexOf("김민석"));
        
        // 전체 삭제
        list.clear();
        System.out.println(list.isEmpty());

        // 정렬
        list.add("전용본");
        list.add("전용근");
        list.add("전홍진");
        list.add("윤미연");
        list.add("전용주");

        Collections.sort(list);
        for(String s : list){
            System.out.println(s);
        }

    }
}
