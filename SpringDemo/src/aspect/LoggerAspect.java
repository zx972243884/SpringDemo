package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {


    public Object log(ProceedingJoinPoint joinPoint){
        System.out.println("Start log : " + joinPoint.getSignature().getName());
        Object object = null;
        try {
            object = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("End log : " + joinPoint.getSignature().getName());

        return object;
    }
}
