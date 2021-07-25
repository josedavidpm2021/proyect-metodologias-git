package ec.edu.epn.proyecto;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InformacionEmpleadoTest {
    InformacionEmpleado inf = null;
    Mecanico mecanico = null;
    Servicio service = null;

    @Before
    public void setUp(){
        inf = new InformacionEmpleado(400.0);
        inf.increaseMemo();
        inf.increaseMemo();
        inf.increaseMemo();
        mecanico = new Mecanico("José", "1232321289", "0984568790", "Mitad del Mundo");
        service = new Servicio();
    }

    @Test
    public void given_one_int_when_addition_salary_then_ok(){
        assertEquals(450.00, inf.incrementSalary(20),0.001);
    }

    @Test
    public void given_value_discount_when_subtract_salary_then_ok(){
        assertEquals(375, inf.discountSalary(25.0), 0.001);
    }

    @Test
    public void given_int_when_check_num_memo_then_ok(){
        assertTrue(inf.verifyMemo()== true);
    }

    @Test
    public void given_int_when_check_num_memo_then_fired(){
        assertSame("El empleado cometió 3 faltas debe ser despedido por reincidencia.",inf.getFired());
    }

    /*@Test
    public void given_int_when_check_less_num_memo_then_ok(){
        assertEquals("El empleado tiene actualmente 2 faltas", inf.getFired());
    }*/

    @Test(timeout = 60)
    public void given_int_when_check_num_memo_then_timeout(){
        assertTrue(inf.verifyMemo()== true);
    }

    @Test
    public void given_kind_when_modify_inf_then_ok(){
        assertEquals("Contrato indefinido",inf.setKindEmp("Contrato indefinido"));
    }

    @Test
    public void given_one_int_when_subtract_salary_then_ok(){
        assertEquals(387.5, inf.decrementSalary(5),0.001);
    }

    //Prueba para crear el metodo toString de la clase información empleado
    @Test
    public void given_information_employee_when_print_information_then_ok(){
        assertEquals("Información Empleado: \nSalario: 400.0\nTipo de contrato: Tiempo completo",inf.toString());
    }

    @Test
    public void given_employee_when_print_information_then_ok(){
        mecanico.setInformacionEmpleado(inf);
        assertEquals("Mecánico\nNombre: José\nCédula: 1232321289\nTeléfono: 0984568790\nDirección: Mitad del Mundo" +
                "\nInformación Empleado: \nSalario: 400.0\nTipo de contrato: Tiempo completo",mecanico.toString());
    }

    @Test
    public void given_service_when_add_then_ok(){
        assertTrue(inf.addService(service));
    }
}