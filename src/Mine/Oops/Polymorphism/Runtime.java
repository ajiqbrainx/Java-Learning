package Mine.Oops.Polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog sound");
    }

}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat sound");
    }
}

public class Runtime {
    public static void main(String[] args) {

//        The method that is already defined in its superclass that can be overridden and we used it
//        The method in the subclass must have the same name, return type, and parameters as in the superclass.

        Animal cat = new Cat();   // at run time which method you are calling
        cat.sound();

        Animal dog = new Dog();   // at run time which method you are calling
        dog.sound();

        Animal animal = new Animal();   // at run time which method you are calling
        animal.sound();
    }

}
