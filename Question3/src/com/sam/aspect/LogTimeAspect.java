package com.sam.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogTimeAspect {
	
	
	
	@Around ("execution(* com.sam.service..*(..))")
	public void logTime(ProceedingJoinPoint joinPoint) throws Throwable{
		long startTime = System.nanoTime();
		
		joinPoint.proceed();
		System.out.println("intercepted method : " + joinPoint.getSignature().getName()+
				"\nintercepted arguments : " + Arrays.toString(joinPoint.getArgs())+
				"\nused time = "+(System.nanoTime()-startTime));
		
	}
}
