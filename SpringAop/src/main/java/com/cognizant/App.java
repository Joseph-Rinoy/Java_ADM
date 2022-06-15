package com.cognizant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        context = new ClassPathXmlApplicationContext("com/cognizant/config.xml");
        
        PaymentService paymentService=context.getBean("payment",PaymentService.class);
        
        paymentService.makePayment();
    }
}
