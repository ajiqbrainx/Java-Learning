package Mine.Interview;

class AI {

    static void ok() {
        System.out.println("It is a AI class");
    }
}

class Aji extends AI {

    static public void ok() {
        System.out.println("It is a Aji class");
    }
}

public class StaticMethodOverride {
    public static void main(String[] args) {


        AI ai = new AI();
        ai.ok();
        Aji aji = new Aji();
        aji.ok();

        AI aiAji=new Aji();
        aiAji.ok();



    }
}
