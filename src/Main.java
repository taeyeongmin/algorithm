import proxy.ProxyObject;
import proxy.RealObject;
import proxy2.Dog;
import proxy2.Interface2;
import proxy2.Cat;
import proxy2.TransactionHandler;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1(){
        ProxyObject proxyObject = new ProxyObject(new RealObject());
        proxyObject.action();
    }

    public static void test2(){

//        Interface2 target = new Cat("냐옹냐옹");
        Dog target = new Dog("멍멍");

        TransactionHandler th = new TransactionHandler(target);

        /**
         * newProxyInstance 생성자 param
         *  1. interface.getClass -> 클래스 파일을 로딩하여 메모리에 올리는 역할
         *  2. 프록시가 구현해야 하는 인터페이스 class 객체의 배열
         *  3. InvocationHandler 인터페이스를 구현한 객체, 메서드 호출 시 실제 동작을 정의
         */
        Interface2 proxy = (Interface2) Proxy.newProxyInstance(
                Interface2.class.getClassLoader()
                , new Class[]{Interface2.class}
                , th);

        System.out.println("targetClass = "+target.getClass());
        System.out.println("proxyClass = "+proxy.getClass());

        proxy.action("Hi"); // invoke 실행
    }
}
