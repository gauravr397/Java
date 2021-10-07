interface qwerty {
    void show();
}

class qwertyimpl implements qwerty {
    public void show() {
        System.out.println("qwertykeypad");
    }
}

public class interf {
    public static void main(String[] args) {
        qwerty obj = new qwertyimpl();
        obj.show();
    }
}