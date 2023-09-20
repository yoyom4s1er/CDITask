package ru.miit.ProgrammingJ2EE.Service.impl;

import ru.miit.ProgrammingJ2EE.Util.Vertex;
import ru.miit.ProgrammingJ2EE.Model.Triangle;
import ru.miit.ProgrammingJ2EE.Service.HeightFinder;

import javax.enterprise.inject.Alternative;

@Alternative
@HEIGHT_BY_SQUARE_AND_BASE
public class HeightBySquareAndBase implements HeightFinder {
    public double findHeight(Triangle triangle, Vertex vertex) {
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

        double square = triangle.getSquare();

        return 2 * square / base;
    }

    @Override
    public String getMethodName() {
        return "Square and base side method";
    }
}
