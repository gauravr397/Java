class phone {
    public void call() {
        System.out.println("phone calling");
    }

    public void sms() {
        System.out.println("phone sending sms");
    }
}

interface camera {
    void click();

    void record();
}

interface musicplayer {
    void play();

    void stop();
}

class smartphone extends phone implements camera, musicplayer {
    public void videoCall() {
        System.out.println("video calling in progress");
    }

    public void click() {
        System.out.println("clicking photo");
    }

    public void record() {
        System.out.println("recording video");
    }

    public void play() {
        System.out.println("playinng song ");
    }

    public void stop() {
        System.out.println("stoping music");
    }

}

class InterfaceExample {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.call();
        sp.click();
        sp.play();
        sp.videoCall();
        sp.sms();
    }
}
