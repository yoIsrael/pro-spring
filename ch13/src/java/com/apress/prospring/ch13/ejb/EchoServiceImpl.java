/*
 * Created on 20-Sep-2004
 */
package com.apress.prospring.ch13.ejb;

/**
 * @author robh
 */
public class EchoServiceImpl implements EchoService {
    
    public String echo(String message) {
        return message;
    }
}
