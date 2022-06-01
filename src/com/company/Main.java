package com.company;

public class Main {

    public static void main(String[] args) {

        Function myFunction = new Function(5);

        double x = 1.0;

        System.out.println("Result for " + x + " is " + myFunction.calculateValue(x));


        double a = 0;
        double b = 1;
        int trap = 10;

        System.out.println("TRAPEZOID METHOD");
        System.out.println("Result of integral from " + a + " to " + b + " is " + myFunction.trapezoidMethod(a, b, trap));

        System.out.println("SIMPSONS METHOD");
        System.out.println("Result of integral from " + a + " to " + b + " is " + myFunction.methodSimpson(a, b));

        int N = 10;
        System.out.println("(not mine) SIMPSONS METHOD");
        System.out.println("Result of integral from " + a + " to " + b + " is " + myFunction.notMineSimpson(a, b, N));
    }
}
