package ru.miit.ProgrammingJ2EE.Interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
@Interceptor
@EfficiencyLog
public class ProfileInterceptor {
    @AroundInvoke
    public Object profile(InvocationContext ic) throws Exception {
        long initTime = System.currentTimeMillis();
        try {
            return ic.proceed();
        } finally {
            long diffTime = System.currentTimeMillis() - initTime;
            System.out.println(ic.getMethod() + " took " + diffTime + " millis");
        }
    }

}
