package Mine.Constructor;

public class DefaultConstructor {
    int height, weight;

    DefaultConstructor(){
        System.out.println("Con...Called");
        height=2;
        weight=2;

    }

    void boy() {
        int check = height + weight;
        System.out.println(check);
    }
}

class Main {
    public static void main(String[] args) {
        DefaultConstructor constructor=new DefaultConstructor();
        constructor.boy();
//        Constructor constructor1=new Constructor(22,33);

    }
}


