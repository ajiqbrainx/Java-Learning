package ETI.Keywords;

public class StaticClass {
    //    static and private wont possible in class level
//    It is only in inner class level
    static class InnerClass {
        void innerCall() {
            System.out.println("It method call");
        }
    }

    public static void main(String[] args) {
        StaticClass.InnerClass staticClass = new StaticClass.InnerClass();
//        Its is independent we can create instance directly in InnerClass
//        so we no need to create a instance for StaticClass
        staticClass.innerCall();

    }
}
