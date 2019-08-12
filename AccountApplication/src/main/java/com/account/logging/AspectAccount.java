package com.account.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectAccount {
	
	private Logger logger = LoggerFactory.getLogger(AspectAccount.class);
	
	@Pointcut("execution(* com.account..*(..))")
	public void loggingOperation() { }
	
	@Before("loggingOperation()")
	public void before(JoinPoint joinPoint) {
		logger.info("start of method : "+ joinPoint.getSignature().getName() + " and class :" +joinPoint.getTarget().toString());
	}
	
	@After("loggingOperation()")
	public void after(JoinPoint joinPoint) {
		logger.info("end of method : "+ joinPoint.getSignature().getName() + " and class : " +joinPoint.getTarget().toString());
	}

}
