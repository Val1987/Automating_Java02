package Lesson04;

public class Triangle {

    public double triangleSquare(double a, double b, double c) {

        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-b));

    }

}
