package proxy;

public class Tester {


    public static void main(String[] args) {
        Internet in1 = new ProxyInternet();
        in1.connectTo("google.com");
        in1.connectTo("banned.com");

    }
}
