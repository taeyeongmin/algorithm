package proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TransactionHandler implements InvocationHandler {

    private final Object target;

    public TransactionHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(proxy+" | "+method+" | "+args);
        System.out.println("======== before ========");

        Object result = method.invoke(target, args); // action 메소드 실행

        System.out.println("======== after ========");
//        System.out.println(result);
        return result;
    }
}
