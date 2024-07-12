package designpattern.structural.bridge;

public class Facebook implements App {

    private final PhoneOS os;

    public Facebook(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        System.out.println("**----------**");
        os.upload("Facebook data upload");
        os.download("facebook.com");
        os.display("Facebook data");
        System.out.println("**----------**");
    }
}
