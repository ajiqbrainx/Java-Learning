package Mine.Practice;

import java.util.ArrayList;
import java.util.List;

class Mains {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
//        list.add(Boolean.parseBoolean("FalSe"));
        list.add(Boolean.parseBoolean("23"));
        list.add(Boolean.TRUE);
        System.out.print(list.size());
        System.out.print(list.get(1) instanceof Boolean);
    }

}
