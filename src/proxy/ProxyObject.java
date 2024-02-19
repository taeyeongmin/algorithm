package proxy;

public class ProxyObject implements Interface1{

    private final RealObject ro;
    public ProxyObject(RealObject ro) {
        this.ro = ro;
    }

    @Override
    public void action() {
        System.out.println("========= before =========");
        ro.action();
        System.out.println("========= after =========");
    }
}
