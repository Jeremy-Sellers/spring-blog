package com.codeup.springblog.services;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public double doOperation(String operation, double a, double b){
        double total = 0;
        switch (operation) {
            case "add":
                total = a + b;
                break;
            case "subtract":
                total = a - b;
                break;
            case "multiply":
                total = a * b;
                break;
            case "divide":
                total = a / b;
                break;
        }
        return total;
    }

    public double add(double a, double b){
        return doOperation("add",a,b);
    }
    public double subtract(double a, double b){
        return doOperation("subtract",a,b);
    }
    public double multiply(double a, double b){
        return doOperation("multiply",a,b);
    }
    public double divide(double a, double b){
        if (b == 0) {return Double.MIN_VALUE;}
        return doOperation("divide",a,b);
    }
}
