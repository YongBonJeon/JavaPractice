package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    // 맵(key,value)
    // 맵은 키의 중복 허용 X, 순서 보장 X
    // 키가 중복될 경우 마지막 업데이트

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("전용본",10);
        map.put("전용근",29);

        System.out.println(map.size());

        System.out.println(map.get("전용본"));

        System.out.println(map.containsKey("전용본"));

        map.remove("전용본");

        System.out.println(map.containsKey("전용본"));

        map.clear();

        map.put("전용본",10);
        map.put("전용근",29);

        for(String key : map.keySet()){
            System.out.println(key);
        }
        for(Integer i : map.values()){
            System.out.println(i);
        }
        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        HashMap<String, Integer> map1 = new LinkedHashMap<>();
    }



}
