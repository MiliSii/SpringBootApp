package com.example.demo.advice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {

  private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class);


  public LoggingAspect() {
  }

  @Around("execution(* com.example.demo..*(..)))")
  public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

    String className = methodSignature.getDeclaringType().getSimpleName();
    String methodName = methodSignature.getName();

    final StopWatch stopWatch = new StopWatch();

    stopWatch.start();
    Object result = proceedingJoinPoint.proceed();
    stopWatch.stop();

    LOGGER.info("Execution time of class: " + className + "and method: " + methodName + " :: " + stopWatch.getTotalTimeMillis() + " ms");

    return result;
  }



}
