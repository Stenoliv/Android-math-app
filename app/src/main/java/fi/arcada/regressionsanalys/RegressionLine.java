package fi.arcada.regressionsanalys;

public class RegressionLine {

    public static double k = 0, m = 0, x = 0, cc = 0;

    public RegressionLine(double[] xVals, double[] yVals) {
        k = (xVals.length*sumXY(xVals, yVals) - sum(xVals)*sum(yVals))/((xVals.length*sumPow(xVals,2))-Math.pow(sum(xVals),2));
        m = avg(yVals)-(k*avg(xVals));
        System.out.println("k = "+k+" m = "+m);
    }

    private double avg(double[] values) {
        double output = 0;
        for (double val : values) {
            output += val;
        }
        output = output / values.length;
        return output;
    }

    private double sumXY(double[] x, double[] y) {
        double output = 0;
        for (int i = 0; i < x.length;i++) {
            output += x[i]*y[i];
        }
        return output;
    }

    private double sum(double[] arr) {
        double output = 0;
        for (double val : arr) {
            output += val;
        }
        return output;
    }

    private double sumPow(double[] arr, int pow) {
        double output = 0;
        for (double val : arr) {
            output += Math.pow(val,pow);
        }
        return output;
    }

    public double getX(double y) {
        double output = 0;
        output = (y-this.m)/this.k;
        return output;
    }

    public double getCorrelationCoefficient() {
        return this.cc;
    }

    public String getCorrelationGrade() {
        String output = "";
        return output;
    }

    // deklarera k, m, x  och correlationCoefficient som double

    // Skapa en konstruktor som tar emot data-arrays för x och y
    // Uträkningen för k och m kan ske i konstruktorn m.h.a.
    // formeln för minsta kvadratmetoden
    // Del 3: uträkningen för correlationCoefficient kan också ske i konstruktorn
    // (det är förstås också ok att ha en skild metod för uträknigarna om man vill
    // hålla konstruktorn simpel.)

    // skapa en metod getX som tar emot ett y-värde, räknar ut x
    // m.h.a. räta linjens ekvation y=kx+m, och returnerar x

    // Del 3:
    // - skapa en getter-metod för correlationCoefficient
    // - skapa en String-metod getCorrelationGrade() för uträkning av korrelationsgrad

}