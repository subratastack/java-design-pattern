package designpattern.structural.bridge;

public class Android implements PhoneOS {
    @Override
    public void upload(String data) {
        System.out.println("Android upload:" + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Android download:" + url);
    }

    @Override
    public void display(String data) {
        System.out.println("Android display:" + data);
    }
}
