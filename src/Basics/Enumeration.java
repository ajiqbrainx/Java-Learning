package Basics;


public class Enumeration {
    enum Status {

        CHECK,
        OK
    }

    public static void main(String[] args) {
        Status status = Status.CHECK;
        System.out.println(status);
        switch (status) {
            case OK:
                System.out.println("It is the ok Statement");
                break;
            case CHECK:
                System.out.println("It is the Checking statement");
        }

        for (Status status1 : Status.values()) {
            System.out.println(status1);
        }

    }
}
