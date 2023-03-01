package chap_09;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();
        list.add("전용본");
        list.add("전용근");
        list.add("전홍진");
        list.add("윤미연");
        list.add("전용주");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // 추가
        list.addFirst("전용우");
        System.out.println(list.get(0));

        System.out.println("------");

        list.add(1,"김영철");
        System.out.println(list.get(1));

        // 삭제
        list.removeFirst();
        list.removeLast();
        for(String s : list){
            System.out.println(s);
        }
    }
}
