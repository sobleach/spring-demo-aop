package com.thum.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLogginAspect {

	// this is where we add all of our related advises for logging

	// let's start with an @Before advice

	@Before("execution(public void com.thum.aopdemo.dao.AccountDAO.addAccount())")
	public void beforeAddAccountAdvice() {

		System.out.println("\n====>>> Executing @Before advice on addAccount()");
	}
}
