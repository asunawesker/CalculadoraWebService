/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author asunawesker
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public Integer suma(@WebParam(name = "numberA") int numberA, @WebParam(name = "numberB") int numberB) {
        //TODO write your implementation code here:
        return numberA + numberB;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "resta")
    public Integer resta(@WebParam(name = "numberA") int numberA, @WebParam(name = "numberB") int numberB) {
        //TODO write your implementation code here:
        return numberA - numberB;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicacion")
    public Integer multiplicacion(@WebParam(name = "numberA") int numberA, @WebParam(name = "numberB") int numberB) {
        //TODO write your implementation code here:
        return numberA * numberB;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "division")
    public Float division(@WebParam(name = "numberA") float numberA, @WebParam(name = "numberB") float numberB) {
        //TODO write your implementation code here:
        return numberA/numberB;
    }
    

}
