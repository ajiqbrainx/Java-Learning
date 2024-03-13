package InterviewPractice;

public class Abcd {
    public static void main(String[] args) {

        char first = 'A';
        char last = 'Z';

        for (int i = first; i <= last; i++) {
            System.out.println(first);
            first = (char) (first + 1);
        }
    }
}
