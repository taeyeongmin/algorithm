package proxy;

public class RealObject implements Interface1{
    @Override
    public void action() {
        System.out.println("실제 객체의 action 메소드 실행");
    }
}
