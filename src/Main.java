import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        /*Escribe un programa en Java que gestione una lista de empleados de una empresa.
        Cada empleado tiene los siguientes atributos: nombre, salario y categoría
         (por ejemplo, "jefe", "administrativo", "operario", etc.).

        El programa debe ofrecer las siguientes funcionalidades:

        Permitir al usuario agregar empleados a la lista. El programa debe solicitar al usuario que ingrese
        el nombre, salario y categoría del empleado.

        Mostrar la lista de empleados con su información completa (nombre, salario y categoría).

        Calcular y mostrar el salario total de la empresa, que es la suma de los salarios de todos los empleados.

        Para implementar estas funcionalidades, sigue estos pasos:

        Crea una clase Empleado con los atributos nombre, salario y categoria, y los métodos get y set correspondientes para cada atributo.

        Crea una clase Empresa que contenga un array de objetos Empleado. Esta clase debe tener métodos para agregar empleados
        a la lista y para calcular el salario total de la empresa.

        En el programa principal, solicita al usuario que ingrese la cantidad de empleados que desea agregar y luego solicita
         la información de cada empleado (nombre, salario y categoría). Luego, agrega cada empleado a la lista de la empresa.

        Después de agregar todos los empleados, muestra la lista completa de empleados con su información.

        Calcula y muestra el salario total de la empresa.

        Asegúrate de utilizar encapsulamiento adecuado para los atributos de la clase Empleado, y utiliza un array para
         almacenar los empleados en la clase Empresa.

        Este enunciado proporciona una guía clara para desarrollar un programa que se centre en el uso de arrays para
         almacenar y gestionar datos de empleados en una empresa.*/

        Empresa empresa = new Empresa();
        Scanner esc= new Scanner(System.in);
        System.out.println("INTRODUCE EL NUMERO DE TRABAJADOR QUE QUIERES AÑADIR");

        int numeroTrabajador = esc.nextInt();
        esc.nextLine();
        for (int i =0; i<numeroTrabajador;i++){
            System.out.println("INTRODUCE EL NOMBRE DEL TRABAJADOR ");
            String nombreTrabajador= esc.nextLine();
            System.out.println("Introduce s salario");
            int salarioTrabajador = esc.nextInt();
            esc.nextLine();
            System.out.println("Introduce su categoria");
            String categoriaUser=esc.nextLine();
            Empleado empleado= new Empleado(nombreTrabajador,salarioTrabajador,categoriaUser);
            empresa.agregarEmpleados(empleado);
        }

        Empleado empleado1= new Empleado("JUAN",1200,"Fontanero");
        Empleado empleado2= new Empleado("perdro",1500,"Fontanero");
        Empleado empleado3= new Empleado("andres",2000,"Informatico");

        empresa.agregarEmpleados(empleado1);
        empresa.agregarEmpleados(empleado2);
        empresa.agregarEmpleados(empleado3);


        empleado2.setSalario(empleado2.getSalario()+200);

        System.out.println(empresa.enseñarEmpleados());
        System.out.println("Esta es la cantidad total de pagos que realiza la empresa de los empleados : " + empresa.cantidadPagosEmpleados());
    }
}
