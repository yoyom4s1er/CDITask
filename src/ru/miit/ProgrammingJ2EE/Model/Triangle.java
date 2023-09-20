package ru.miit.ProgrammingJ2EE.Model;

public class Triangle {

    float sideA;
    float sideB;
    float sideC;
    double angleA;
    double angleB;
    double angleC;
    double square;

    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public double getAngleA() {
        return angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public double getAngleC() {
        return angleC;
    }

    public double getSquare() {
        return square;
    }

    public Triangle(float sideA, float sideB, float sideC) {

        if (sideA + sideB <= sideC
            || sideB + sideC <= sideA
            || sideA + sideC <= sideB) {
            throw new RuntimeException();
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        angleA = Math.acos(((sideB*sideB + sideC*sideC - sideA*sideA)) / (2*sideB*sideC));
        angleB = Math.acos(((sideC*sideC + sideA*sideA - sideB*sideB))/ (2*sideC*sideA));
        angleC = Math.acos(((sideA*sideA + sideB*sideB - sideC*sideC)) / (2*sideA*sideB));

        this.square = 0.5 * sideA*sideB*Math.sin(angleC);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", angleA=" + Math.toDegrees(angleA) +
                ", angleB=" + Math.toDegrees(angleB) +
                ", angleC=" + Math.toDegrees(angleC) +
                ", square=" + square +
                '}';
    }
}
