import java.util.ArrayList;
import java.util.List;
class Departamento {
    private String nombre;
    private Empleado administrador;
    private List<Empleado> empleados;

    public Departamento(String nombre, Empleado administrador) {
        this.nombre = nombre;
        this.administrador = administrador;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(String nombre) {
        Empleado empleado = new Empleado(nombre);
        empleados.add(empleado);
    }

    public void asignarAdministrador(Empleado administrador) {
        this.administrador = administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado getAdministrador() {
        return administrador;
    }
}