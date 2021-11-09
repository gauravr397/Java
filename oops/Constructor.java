public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();// constructor auto defined by java
        s1.name = "qwery";
        s1.age = 23;
        s1.prntinfo();
    }
}

class Student {
    String name;
    int age;

    public void prntinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
