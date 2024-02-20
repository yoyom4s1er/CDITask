package ru.miit.ProgrammingJ2EE.Component;

import ru.miit.ProgrammingJ2EE.Interceptor.EfficiencyLog;
import ru.miit.ProgrammingJ2EE.Service.impl.HEIGHT_BY_SIDES;
import ru.miit.ProgrammingJ2EE.Service.impl.HEIGHT_BY_SQUARE_AND_BASE;
import ru.miit.ProgrammingJ2EE.Util.Vertex;
import ru.miit.ProgrammingJ2EE.Model.Triangle;
import ru.miit.ProgrammingJ2EE.Service.HeightFinder;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

public class TriangleHeight {

    @Inject
    @HEIGHT_BY_SIDES
    private HeightFinder heightFinder;
    @Inject
    @Named("A")
    private Vertex vertex;

    @EfficiencyLog
    public double find(Triangle triangle) {
        return heightFinder.findHeight(triangle, vertex);
    }

    public String getMethodName() {
        return heightFinder.getMethodName();
    }

    public Vertex getVertex() {
        return vertex;
    }
    @Produces
    @Named("A")
    public static Vertex getVertexA()
    {
        return Vertex.A;
    }

    @Produces
    @Named("B")
    public static Vertex getVertexB()
    {
        return Vertex.A;
    }

    @Produces
    @Named("C")
    public static Vertex getVertexC()
    {
        return Vertex.C;
    }
}
