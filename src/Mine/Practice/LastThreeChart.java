package Mine.Practice;

public class LastThreeChart {
    public static void main(String[] args) {
        String name = "ajithashok2530@gmail.comm";
        String check = name.substring(name.length() - 10);
        if (check.equals("@gmail.com")) System.out.println("It's match");
        else System.out.println("It's not match");
    }
}
