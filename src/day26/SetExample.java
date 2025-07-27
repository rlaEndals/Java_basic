package day26;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("서울");
        set.add("부산");
        set.add("서울");

        System.out.println("부산 포함 여부 → " + set.contains("부산"));

        set.remove("서울");
        System.out.println("서울 삭제 후 크기 → " + set.size());

        System.out.println("\n출력할 도시 목록");
        for (String city : set) {
            System.out.println(city);
        }

        set.clear();
        System.out.println("\nclear() 후 set 크기 → " + set.size());
    }
}
