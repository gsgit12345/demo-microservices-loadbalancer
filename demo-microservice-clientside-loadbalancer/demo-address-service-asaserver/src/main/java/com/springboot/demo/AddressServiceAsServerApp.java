package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class AddressServiceAsServerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(AddressServiceAsServerApp.class,args);
        System.out.println( "Hello World!" );
    }
}
