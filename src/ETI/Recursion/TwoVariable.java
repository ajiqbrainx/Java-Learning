package ETI.Recursion;

public class TwoVariable {

    static double twoVariable(int x, int y, double output, boolean isNegative) {
        if (y < 0) {
            y = -(y);
            isNegative = true;
        }
        if (y > 0) {
            return twoVariable(x, y - 1, output * x, isNegative);
        } else {
            if (isNegative) {
                return 1 / output;
            } else return output;
        }
    }

    public static void main(String[] args) {

        System.out.println(twoVariable(2, -33, 1, false));
    }
}
