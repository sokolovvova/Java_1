package Week5;


import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        HashSet<String> a2 = new HashSet<>();
        Queue<Character> a3 = new ArrayDeque<>();

        a1.add(1); a1.add(2); a1.add(3); a1.add(1);
        a2.add("str1"); a2.add("str2"); a2.add("str3"); a2.add("str2");
        a3.add('1'); a3.add('1'); a3.add('2'); a3.add('3');
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println();

        System.out.println(dd(a1));
        System.out.println(dd(a2));
        System.out.println(dd(a3));

    }

    public static <T> HashSet<T> dd(Collection<T> collection){
        HashSet<T> set =new HashSet<>(collection);
        return set;
    }
}
