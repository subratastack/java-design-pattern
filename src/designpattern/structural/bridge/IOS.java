package designpattern.structural.bridge;

public class IOS implements PhoneOS {

    @Override
    public void upload(String data) {
        System.out.println("iOS upload:" + data);
    }

    @Override
    public void download(String url) {
        System.out.println("iOS upload:" + url);
    }

    @Override
    public void display(String data) {
        System.out.println("iOS upload:" + data);
    }
}
