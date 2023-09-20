package ru.miit.ProgrammingJ2EE.Service;

import ru.miit.ProgrammingJ2EE.Util.Vertex;
import ru.miit.ProgrammingJ2EE.Model.Triangle;

public interface HeightFinder {

    public double findHeight(Triangle triangle, Vertex vertex);

    public String getMethodName();
}
