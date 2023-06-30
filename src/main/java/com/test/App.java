package com.test;

import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Supplier<String> supplier =()->"Hello World";
        System.out.println(supplier.get());
    }
}
