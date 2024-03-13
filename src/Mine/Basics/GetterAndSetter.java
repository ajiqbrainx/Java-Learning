package Mine.Basics;

class Get {
    private int min, max;

    //    Getter method ....We can check with the
    int getMin() {
        return min;
    }

    int getMax() {
        return max;
    }

    void setMin(int l) {
        min = l;
    }

    void setMax(int m) {
        max = m;
    }


    void add() {
        int i = min + max;
        System.out.println("Adding  values = "+i);

    }


}

public class GetterAndSetter {
    public static void main(String[] args) {
        Get get = new Get();
        System.out.println(get.getMin());
        System.out.println(get.getMax());
        get.setMax(2);
        get.setMin(4);
        System.out.println(get.getMin());
        System.out.println(get.getMax());
        get.add();


    }

}
