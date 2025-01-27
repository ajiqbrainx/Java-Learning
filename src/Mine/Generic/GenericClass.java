package Mine.Generic;

class Value<S> {

    private S value;

    public void setValue(S value) {
        this.value = value;
    }

    public S getValue() {
        return value;
    }


}

public class GenericClass {
    public static void main(String[] args) {

        Value<Integer> integer = new Value<>();
        integer.setValue(1);
        System.out.println(integer.getValue());

        Value<String> str =new Value<>();
        str.setValue("Ajith");

        System.out.println(str.getValue());
        str.setValue("Main");
    }
}
