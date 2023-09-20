package ru.miit.ProgrammingJ2EE.Component;

import ru.miit.ProgrammingJ2EE.Interceptor.EfficiencyLog;
import ru.miit.ProgrammingJ2EE.Service.impl.HEIGHT_BY_SIDES;
import ru.miit.ProgrammingJ2EE.Util.Vertex;
import ru.miit.ProgrammingJ2EE.Interceptor.ProfileInterceptor;
import ru.miit.ProgrammingJ2EE.Model.Triangle;
import ru.miit.ProgrammingJ2EE.Service.HeightFinder;
import ru.miit.ProgrammingJ2EE.Service.impl.HEIGHT_BY_SQUARE_AND_BASE;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
public class TriangleHeight {

    @Inject
    @HEIGHT_BY_SIDES
    private HeightFinder heightFinder;

    @EfficiencyLog
    public double find(Triangle triangle, Vertex vertex) {
        return heightFinder.findHeight(triangle, vertex);
    }

    public String getMethodName() {
        return heightFinder.getMethodName();
    }
}
