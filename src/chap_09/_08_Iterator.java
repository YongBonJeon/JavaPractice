package chap_09;

import java.sql.Array;
import java.util.*;

public class _08_Iterator {
    // 이터레이터

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("전용본");
        list.add("전용근");
        list.add("전홍진");
        list.add("윤미연");
        list.add("전용주");

        for(String s : list){
            System.out.println(s);
        }

        System.out.println("------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("------");

        it = list.iterator();
        while(it.hasNext()){
            //System.out.println(it);
            String s = it.next();
            System.out.println(s);
            if(s.contains("전용본")){
                it.remove();
            }
        }

        for(String s : list){
            System.out.println(s);
        }

        HashSet<String> set = new HashSet<>();
        set.add("전용본");
        set.add("전용근");
        set.add("전홍진");
        set.add("윤미연");
        set.add("전용주");
        Iterator<String> it1 = set.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        HashMap<String, Integer> map = new HashMap<>();

        map.put("전용본",10);
        map.put("전용근",29);

        Iterator<Map.Entry<String,Integer>> itMap = map.entrySet().iterator();
        while(itMap.hasNext()){
            System.out.println(itMap.next());
        }



    }
}
