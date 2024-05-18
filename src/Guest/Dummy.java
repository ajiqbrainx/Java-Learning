package Guest;

public class Dummy {


    public static void main(String[] args) {
        String name = "character";
        String output="";
        System.out.println(name);
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != 'a') {
                output=output+ch;
            }
        }
        System.out.println(output);
        Dummy dummy=new Dummy();
        dummy.num();

    }
    void num(){
        System.out.println("Num is printing");
    }

}
