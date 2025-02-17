package ETI.Keywords;

public class PrivateClass {
//    static and private wont possible in class level
//    It is only in inner class level

    private class InnerPrivate{
        void innerCall(){
            System.out.println("Inner method call");
        }
    }

    void objCreation(){
        InnerPrivate innerPrivate =new InnerPrivate();
        innerPrivate.innerCall();
    }

    public static void main(String[] args) {
        PrivateClass privateClass=new PrivateClass();
        privateClass.objCreation();
//        PrivateClass.InnerPrivate innerPrivate=new PrivateClass.InnerPrivate();

    }
}
