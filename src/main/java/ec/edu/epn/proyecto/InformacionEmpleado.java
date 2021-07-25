package ec.edu.epn.proyecto;

public class InformacionEmpleado {

    private double salary;
    private static double valueHourAdd;
    private static int numMemo;
    private String typeContract;
    private ListaServicio servicios = new ListaServicio();


    public InformacionEmpleado(double salary) {
        this.salary = salary;
        this.valueHourAdd = 2.50;
        this.numMemo = 0;
        setKindEmp("Tiempo completo");
    }

    public double incrementSalary(int numExtraHours) {
        return this.salary += (numExtraHours*this.valueHourAdd);
    }

    public double discountSalary(double discountSalary) {
        //increaseMemo();
        return this.salary -= discountSalary;
    }

    public boolean verifyMemo() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.numMemo == 3;
    }

    public void increaseMemo(){
        this.numMemo++;
    }

    public String getFired() {
        return verifyMemo()?"El empleado cometió 3 faltas debe ser despedido por reincidencia.":
                "El empleado tiene actualmente " + this.numMemo + " faltas";
    }

    public String setKindEmp(String type_contract) {
        return this.typeContract = type_contract;
    }

    public double decrementSalary(int numHours) {
        return this.salary -= (numHours*this.valueHourAdd);
    }

    public String toString(){
        return "Información Empleado: \nSalario: " + salary + "\nTipo de contrato: "+ typeContract;
    }

    public boolean addService(Servicio service) {
        this.servicios.aniadir(service);
        return true;
    }
}
