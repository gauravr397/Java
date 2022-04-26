class nnatural {

    static void funn1() {
        int n = 3, sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + i;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        funn1();
    }

    int display() {
        int n = 5;
        return n * (n + 1) / 2;

    }

    public static void main(String[] args) {
        nnatural num = new nnatural();
        System.out.println(num.display());
    }

}
