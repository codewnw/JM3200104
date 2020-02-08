package com.jm3200104.spring.mvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {
	@Pointcut("execution(* com.jm3200104.spring.mvc.*.*.*(..))")
	public void allMethodsInMvcPackage() {
	}

	@Before("allMethodsInMvcPackage()")
	public void runBeforeEveryMethod(JoinPoint joinPoint) {
		System.out.println(">> " + joinPoint.getSignature() + " started");
	}
}
