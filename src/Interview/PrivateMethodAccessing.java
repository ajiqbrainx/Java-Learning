package Interview;

import java.lang.reflect.Method;

public class PrivateMethodAccessing {
    int a=11;
    int b=22;

    private void add(){
        int c=a+b;
        System.out.println(c);
    }
}

class PrivateUsed extends PrivateMethodAccessing{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class privateClass=Class.forName("Interview.PrivateMethodAccessing");
        Object obj=privateClass.newInstance();
        Method m=privateClass.getDeclaredMethod("add");
        m.setAccessible(true);
//        m.invoke(obj,null)

    }
}
