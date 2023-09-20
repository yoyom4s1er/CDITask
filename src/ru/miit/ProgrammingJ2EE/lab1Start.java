package ru.miit.ProgrammingJ2EE;

import ru.miit.ProgrammingJ2EE.Interceptor.EfficiencyLog;
import ru.miit.ProgrammingJ2EE.Service.HeightFinder;
import ru.miit.ProgrammingJ2EE.Service.impl.HEIGHT_BY_SIDES;
import ru.miit.ProgrammingJ2EE.Service.impl.HEIGHT_BY_SQUARE_AND_BASE;
import ru.miit.ProgrammingJ2EE.Util.Vertex;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import ru.miit.ProgrammingJ2EE.Component.TriangleHeight;
import ru.miit.ProgrammingJ2EE.Model.Triangle;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

public class lab1Start {
    protected static Weld weld;
    protected static WeldContainer container;

    @Inject
    @HEIGHT_BY_SQUARE_AND_BASE
    HeightFinder heightFinder;

    public static void main(String args[]) throws Exception {
        weld = new Weld();
        container = weld.initialize();

        try {
            HeightFinder heightFinder = container.instance().select(HeightFinder.class).get();
            Triangle triangle = new Triangle(1000f, 1200f, 1900f);

            System.out.println(triangle);
            System.out.println(heightFinder.getMethodName());

            findHeight(heightFinder, triangle, Vertex.A);

        }
        finally {
            weld.shutdown();
        }
    }

    @EfficiencyLog
    public static void findHeight(HeightFinder heightFinder, Triangle triangle, Vertex vertex) {
        System.out.println("Height is: " + heightFinder.findHeight(triangle, vertex));
    }
}
