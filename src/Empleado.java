public class Empleado {

    /* Crea una clase Empleado con los atributos nombre, salario y categoria
    , y los métodos get y set correspondientes para cada atributo.*/
    
    private String nombre;
    private int Salario;
    private String categoria;
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setSalario(int salario){
        this.Salario=salario;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    public String getNombre(){
        return nombre;
    }
    public int getSalario() {
        return Salario;
    }
    public String getCategoria(){
        return categoria;
    }
    public Empleado(String nombre,int salario,String categoria){
        this.nombre=nombre;
        this.Salario=salario;
        this.categoria=categoria;
    }

    @Override
    public String toString() {
        String mensaje="";
        mensaje+="Nombre del empleado:" + getNombre()+"\n";
        mensaje+="Salario del empleado: " + getSalario()+"\n";
        mensaje+="Categoria del trabajador: " +getCategoria()+"\n";

        return mensaje;
    }
}
