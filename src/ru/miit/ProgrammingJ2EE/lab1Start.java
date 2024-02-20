package ru.miit.ProgrammingJ2EE;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import ru.miit.ProgrammingJ2EE.Component.TriangleHeight;
import ru.miit.ProgrammingJ2EE.Model.Triangle;

public class lab1Start {
    protected static Weld weld;
    protected static WeldContainer container;
    public static void main(String args[]) throws Exception {
        weld = new Weld();
        container = weld.initialize();

        try {
            TriangleHeight triangleHeight = container.instance().select(TriangleHeight.class).get();
            Triangle triangle = new Triangle(10f, 12f, 19f);

            System.out.println(triangle);
            System.out.println(triangleHeight.getMethodName());

            System.out.println("Height from vertex " + triangleHeight.getVertex() + " = " + triangleHeight.find(triangle));

        }
        finally {
            weld.shutdown();
        }
    }
}
