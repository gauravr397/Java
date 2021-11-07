
public class thiskeyword {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen pen2 = new pen();
        pen2.color = "red";
        pen2.type = "ball";
        pen1.write();
        pen1.pencolor();
        pen2.write();
        pen2.pencolor();

    }
}

class pen {
    String color;
    String type; // ball or gel

    public void write() {
        System.out.println("writting with");
    }

    public void pencolor() {
        System.out.println(this.color);
    }
}
