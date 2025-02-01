package ETI.String;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String name = "Aiqfwiodwfew wefjjbfej wefjbek";
        //        output = "Aiqfwode jb k"
        List<Character> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                stringBuilder.append(' ');
                continue;
            }
            if (!list.contains(name.charAt(i))) {
                list.add(name.charAt(i));
                stringBuilder.append(name.charAt(i));
            }
        }

        Set<Character> set = new HashSet<>();
        System.out.println(stringBuilder);
        var output = name.chars()
                .mapToObj(f -> (char) f)
                .map(f -> f == ' ' || set.add(f) ? f : null)
                .filter(Objects::nonNull)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(output);
    }
}
