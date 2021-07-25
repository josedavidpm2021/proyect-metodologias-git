package ec.edu.epn.proyecto;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class I_InformacionEmpleadoTest {
    I_InformacionEmpleado inf = null;

    @Before
    public void setUp(){
        inf = Mockito.mock(I_InformacionEmpleado.class);
    }

    @Test
    public void given_one_inf_when_addService_then_ok() {
        Mockito.when(inf.addService(5)).thenReturn("Service");
        assertEquals("Service",inf.addService(5));
    }

    @Test
    public void given_int_when_return_bonus_salary_then_ok(){
        Mockito.when(inf.bonusSalary("1724082605")).thenReturn(100.0);
        assertEquals(100.00, inf.bonusSalary("1724082605"),0.001);
    }

}