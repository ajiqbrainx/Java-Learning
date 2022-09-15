package Basics;

class FinalEx {
    final int SMALL = 12;
    final int BIG;
    final int MEDIUM;

    FinalEx(int big, int medium) {
        BIG = big;
        MEDIUM = medium;
    }

    void print() {
        System.out.println(SMALL);
        System.out.println(BIG);
        System.out.println(MEDIUM);
    }
}

public class Final {
    public static void main(String[] args) {
        FinalEx finalEx = new FinalEx(23, 54);

        finalEx.print();
    }
}
