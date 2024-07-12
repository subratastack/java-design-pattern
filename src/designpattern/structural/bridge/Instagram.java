package designpattern.structural.bridge;

public class Instagram implements App {

    private final PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        System.out.println("**----------**");
        os.upload("Instagram data upload");
        os.download("instagram.com");
        os.display("Instagram data");
        System.out.println("**----------**");
    }
}
