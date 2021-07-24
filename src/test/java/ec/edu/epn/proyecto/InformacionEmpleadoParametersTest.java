package ec.edu.epn.proyecto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value= Parameterized.class)
public class InformacionEmpleadoParametersTest {
    private double expected;
    private int increment;

    public InformacionEmpleadoParametersTest(double expected, int increment) {
        this.expected = expected;
        this.increment = increment;
    }

    @Parameterized.Parameters
    public static Iterable<Object []> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[] {450.0,20});
        objects.add(new Object[] {425.0,10});
        objects.add(new Object[] {412.5,5});
        objects.add(new Object[] {462.5,25});
        return objects;
    }

    @Test
    public void given_parameters_when_addition_salary_then_ok(){
        InformacionEmpleado inf = new InformacionEmpleado(400.0);
        assertEquals(expected, inf.incrementSalary(increment),0.001);
    }

}


  /*@Parameterized.Parameters
    public static Iterable<Object []> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[] {350.0,20});
        objects.add(new Object[] {387.5,5});
        objects.add(new Object[] {375.0,10});
        objects.add(new Object[] {337.5,25});
        return objects;
    }

    @Test
    public void given_parameters_when_subtract_salary_then_ok(){
        InformacionEmpleado inf = new InformacionEmpleado(400.0);
        assertEquals(expected, inf.decrementSalary(decrement),0.001);
    }
     */