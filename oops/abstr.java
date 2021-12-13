public class abstr {
    public static void main(String[] args) {
        Horse hr = new Horse();
        hr.walk();
        hr.eats();

    }
}

abstract class Animal {
    abstract void walk();

    public void eats() {
        System.out.println("eats grass and peas");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class chimken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}