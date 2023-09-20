package ru.miit.ProgrammingJ2EE.Service.impl;

import ru.miit.ProgrammingJ2EE.Util.Vertex;
import ru.miit.ProgrammingJ2EE.Model.Triangle;
import ru.miit.ProgrammingJ2EE.Service.HeightFinder;

import javax.enterprise.inject.Default;

@HEIGHT_BY_SIDES
@Default
public class HeightBySides implements HeightFinder {

    public double findHeight(Triangle triangle, Vertex vertex) {
        float sideA = triangle.getSideA();
        float sideB = triangle.getSideB();
        float sideC = triangle.getSideC();

        float base = 0f;

        if (vertex.equals(Vertex.A)) {
            base = triangle.getSideA();
        }
        else if (vertex.equals(Vertex.B)) {
            base = triangle.getSideB();
        }
        else {
            base = triangle.getSideC();
        }


        float sp = (sideA + sideB + sideC) * 0.5f;
        return 2 * Math.sqrt(sp * (sp - sideA) * (sp - sideB) * (sp - sideC)) / base;
    }

    @Override
    public String getMethodName() {
        return "3 sides method";
    }
}
