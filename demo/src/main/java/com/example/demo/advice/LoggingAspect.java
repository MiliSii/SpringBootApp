package com.example.demo.advice;

//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

//import org.apache.logging.log4j.Level;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {
    
    /*Logger log=LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut(value="execution(* com.example.demo.*.*.*(..))")
   // @Pointcut(value="execution:(* com.example.demo.controller.ControllerForHtml.sayHello(..))")
    public void myPointcut(){

    }

    @Around("myPointcut()")
    public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable{
        ObjectMapper mapper=new ObjectMapper();
        String methodName=pjp.getSignature().getName();
        String className=pjp.getTarget().getClass().toString();
        Object[] array=pjp.getArgs();
        log.info("method invocked"+className+":"+methodName+"()"+"arguments :"+mapper.writeValueAsString(array));
        Object object= pjp.proceed();
        log.info(className+":"+methodName+"()"+"response :"+mapper.writeValueAsString(object));
        return object;
    }*/



  private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class);
 
  //AOP expression for which methods shall be intercepted
  @Around("execution(* com.example.demo..*(..)))")
  public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable 
  {
    MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
     
    //Get intercepted method details
    String className = methodSignature.getDeclaringType().getSimpleName();
    String methodName = methodSignature.getName();
     
    final StopWatch stopWatch = new StopWatch();
     
    //Measure method execution time
    stopWatch.start();
    Object result = proceedingJoinPoint.proceed();
    stopWatch.stop();
 
    //Log method execution time
    LOGGER.info("Execution time of " + className + "." + methodName + " :: " + stopWatch.getTotalTimeMillis() + " ms");
 
    return result;
  }

}
