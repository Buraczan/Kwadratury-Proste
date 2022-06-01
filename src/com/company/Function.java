package com.company;

import java.util.ArrayList;

public class Function {
    private int size;
    private ArrayList<Double> factors;

    public Function(int s) {

        size = s;
        factors = new ArrayList<Double>();  //if factors needed

        factors.add(55.0);
        factors.add(-2.0);
        factors.add(-6.0);
        factors.add(5.0);
        factors.add(0.4);
    }

    public double calculateValue(double x) {

        double result = 0;

        //      INSERT YOUR FUNCTION HERE   //

        //      TEST FUNCTION (XCLS)    //
        for(int i = 0; i < size; i++) {
            result += (factors.get(i) * Math.pow(x,i));
        }

        //      FUNCTION 1 TO DO        //
//        result = x * x * Math.pow(Math.sin(x), 3);

        //      FUNCTION 2 TO DO        //
//        result = Math.exp(x * x) * (x - 1);
        return(result);
    }

    public double trapezoidMethod(double a, double b, int trapezoids) {

//        double result = (b - a)/2 * calculateValue(a) + (b - a)/2 * calculateValue(b);

        double result = 0;
        double pom = (b - a) / trapezoids;

        for(int i = 1; i <= trapezoids; i++) {
            result += i * pom/2 * (calculateValue(i*pom) + calculateValue((i + 1) * pom));
        }

        return result;
    }

    public double methodSimpson(double a, double b) {

        double result = (b - a)/6;

        result *= calculateValue(a) + 4*calculateValue((a+b)/2) + calculateValue(b);

        return result;
    }

    public double notMineSimpson(double a, double b, int N) {
        double result = 0;
        double x;
        double pom2 = 0;
        double pom = (b - a) / 2;
        for(int i = 1; i <= N; i++) {
            x = a + i * pom;
            pom2 += calculateValue(x - pom/2);
            if(i < N) result += calculateValue(x);
        }

        result = pom / 6 * (calculateValue(a) + calculateValue(b) + 2 * result + 4 * pom2);

        return result;
    }
}
