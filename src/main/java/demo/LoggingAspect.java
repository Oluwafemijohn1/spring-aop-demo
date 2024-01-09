package demo;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before execution Loggers with argument: " + arg);
    }

    /**
     * this means * for any return type
     * then * for any package
     * then .* for class
     * then .checkout if there is any
     * */
    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After execution Loggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterRetuningPointCut(){

    }

    @AfterReturning(pointcut = "afterRetuningPointCut()", returning = "retVal" )
    public void afterReturning(String retVal){
        System.out.println("After Retuning: " + retVal);
    }
}
