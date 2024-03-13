package Mine.Interview;

public class Outer {

    public class Inner {
        int a = 10;
        int b = 23;

        // We can Access the private methods and fields ...
        private void add() {
            System.out.println(a + b + " Its inner class");
        }
    }

    public void show() {
        Inner yes = new Inner();
        yes.add();

    }



    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
        PrivateClass privateClass=new PrivateClass();


//        ProtectedCheck protectedCheck=new ProtectedCheck();
//        protectedCheck.check();


    }
}


