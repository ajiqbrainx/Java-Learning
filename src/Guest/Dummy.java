package Guest;

public class Dummy {


    public static void main(String[] args) {
        String name = "character";
        StringBuilder output= new StringBuilder();
        System.out.println(name);
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != 'a') {
                output.append(ch);
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
