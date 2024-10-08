package Mine.Basics;

public class PrintWords {
    public static void main(String[] args) {


        StringBuffer stringBuffer=new StringBuffer();
        var name = "Hi machi how are u";
        for (int i = 0; i < name.length(); i++) {
            var ch=name.charAt(i);
            if (ch != ' ') {
                stringBuffer.append(ch);
            } else {
                System.out.println(stringBuffer);
                stringBuffer.setLength(0);
            }

        }
        System.out.println(stringBuffer);
    }
}
