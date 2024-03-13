package Mine.Practice;

public class InnerClass {
  private int a =23;
    private int b=45;
    void add(){
        System.out.println(a+b);
    }


    class Inner{
        int aa=11;
        int bb=22;

        void sub(){
            System.out.println(a-b);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass=new InnerClass();
        innerClass.add();
    }
}


