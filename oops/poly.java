public class poly {
    String name;
    int age;

    public void prntinfo(int age) {
        System.out.println(age);
    }

    public void prntinfo(String name) {
        System.out.println(name);
    }

    public void prntinfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

class OOPS {
    public static void main(String[] args) {
        poly p1 = new poly();
        p1.name = "qwerty";
        p1.age = 23;

        p1.prntinfo(p1.name, p1.age);
    }
}
