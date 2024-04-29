import java.util.ArrayList;


public class Empresa {
    private ArrayList<Empleado>empleados;
    public Empresa(){
        empleados=new ArrayList<>();
    }
    public void agregarEmpleados(Empleado empleado){
        empleados.add(empleado);
    }
    public String enseñarEmpleados(){
        String mensaje="";
        for (Empleado empleado : empleados){
         mensaje+=empleado+"\n";
        }
        return mensaje;
    }
    public int cantidadPagosEmpleados(){
        int cantidadDinero=0;
        for (Empleado empleado:empleados){
            cantidadDinero+=empleado.getSalario();
        }
        return cantidadDinero;
    }
}
