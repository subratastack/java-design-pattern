package designpattern.structural.facade;

public class NetworkAccessFacade {

    private final Comm comm;
    private final Cache cache;
    private final Converter converter;
    private final Interceptor interceptor;

    public NetworkAccessFacade() {
        comm = new Comm();
        cache = new Cache();
        converter = new Converter();
        interceptor = new Interceptor();
    }

    public void communicate() {
        cache.cache();
        comm.send("some data");
        comm.receive();
        interceptor.intercept();
        converter.convert();
    }
}
