package Collection;

import com.sun.jdi.NativeMethodException;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MethodsInCollection  {
    public static void main(String[] args) {
        ArrayList<Object>number=new ArrayList<>();
//        add Method >>>>>>>>>>>>>>>>>>>
        number.add("Ajith");
        number.add("Abi");
        number.add("Ashok");
        ArrayList<Object>name=new ArrayList<>();

        name.add("Ajith");
        name.add("Ashok");
        System.out.println(name);
        System.out.println(number);

//        addAll Method >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        number.addAll(name);
//        System.out.println(number);

//        remove Method >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        name.remove("Ashok");
//        System.out.println(name);

//        removeAll Method >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        number.removeAll(name);
//        System.out.println(number);

        ArrayList<Object>color=new ArrayList<>();
        color.add("White");
        color.add("Black");
        color.add("Yellow");
        color.add("White");
        color.add("Green");
        color.add("White");
        System.out.println(color);

        Color<String>color1 =new Color<>();
//       color1.
//        removeIf >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        color.removeIf();
    }


}
class Color<T> implements Predicate{

    T name;
    @Override
    public boolean test(Object o) {
      if(name.equals(o))return true;
      else return false;
    }
}