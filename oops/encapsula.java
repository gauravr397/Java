class encapsula {
    public static void main(String[] args) {
        bank bn1 = new bank();
        bn1.name = "customer1";
        bn1.email = "qweryu@sfdfaf.com";
        bn1.setPassword("qwewet");
        System.out.println(bn1.getPassword());
    }

}

class bank {

    public String name;
    protected String email;
    private String password;

    // getter and setter used for using private and protected//
    public String getPassword() {
        return this.password;
    }

    // ccan make it private as well//
    public void setPassword(String pass) {
        this.password = pass;
    }
}