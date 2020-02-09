package com.jm3200104.spring.mvc.aspect;

import java.util.Objects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * @see https://docs.spring.io/spring/docs/2.0.x/reference/aop.html
 */
@Component
@Aspect
public class LogginAspect {
	@Pointcut("execution(* com.jm3200104.spring.mvc.*.*.*(..))")
	public void allMethodsInMvcPackage() {
	}

	@Pointcut("execution(* com.jm3200104.spring.mvc.*.*.getItem(..))")
	public void allGetItemMethodsInMvcPackage() {
	}

	@Before("allMethodsInMvcPackage()")
	public void runBeforeEveryMethodInMvcPackage(JoinPoint joinPoint) {
		System.out.println(">> " + joinPoint.getSignature() + " started");
	}

	@After("allMethodsInMvcPackage()")
	public void runAfterEveryMethodInMvcPackage(JoinPoint joinPoint) {
		System.out.println("<< " + joinPoint.getSignature() + " completed");
	}

	@AfterThrowing(value = "allMethodsInMvcPackage()", throwing = "myExp")
	public void runWhenSomethingIsFailing(Throwable myExp) {
		System.out.println("Something failed" + myExp);
		if (myExp instanceof ArithmeticException) {
			throw new RuntimeException("Please try after sometime");
		}
	}

	@Around(value = "allGetItemMethodsInMvcPackage()", argNames = "")
	public Object captureMethodExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object result = proceedingJoinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println(proceedingJoinPoint.getSignature() + ":  " + (endTime - startTime));
		return result;
	}

	@Around(value = "execution(* com.jm3200104.spring.mvc.*.*.getAllItems(..))", argNames = "")
	public Object changeTheResultOfMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Object result = proceedingJoinPoint.proceed();
		if (!Objects.nonNull(result)) {
			result = "There is nothing to show.";
		}
		return result;
	}
}
