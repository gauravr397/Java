class Pet {
    public void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Pet {

    public void bark() {
        System.out.println("barking...");
    }
}

public class SingleInherit {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
