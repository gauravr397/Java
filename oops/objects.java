
class objects {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
    }

}

class pen {
    String color;
    String type; // ball or gel

    public void write() {
        System.out.println("writting");
    }
}
