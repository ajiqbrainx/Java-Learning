package JavaInterview;

public class SpaceRemover {
    public static void main(String[] args) {
        String s = ". abc  def "+"Abi";

        s = s.strip();

//        s = s.trim();
        Character.isWhitespace(s.charAt(1));

        System.out.println(s);

    }
}
