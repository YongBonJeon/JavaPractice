package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    // set은 중복을 허용하지 않음, 순서 보장 하지 않음

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("삼겹살");

        System.out.println(set.size());

        for(String s : set){
            System.out.println(s);
        }

        System.out.println(set.contains("삼겹살"));

        set.remove("삼겹살");

        System.out.println(set.contains("삼겹살"));

        set.clear();

        System.out.println(set.isEmpty());

        // 순서 보장 되는 set
        HashSet<Integer> intSet = new LinkedHashSet<>();


    }
}
