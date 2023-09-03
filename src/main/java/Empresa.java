import java.util.ArrayList;
import java.util.List;
class Empresa {
    private String nombre;
    private List<Departamento> departamentos;
    private List<Oficina> oficinas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
        this.oficinas = new ArrayList<>();
    }

    public void agregarDepartamento(String nombre, Empleado administrador) {
        Departamento departamento = new Departamento(nombre, administrador);
        departamentos.add(departamento);
    }

    public void agregarOficina(int numero, String tipo) {
        Oficina oficina = new Oficina(numero, tipo);
        oficinas.add(oficina);
    }

    // Getters para departamentos y oficinas
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }

    // Otros getters y setters
    public String getNombre() {
        return nombre;
    }
}