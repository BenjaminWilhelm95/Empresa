
public class Main {
    public static void main(String[] args) {
        // Crear una empresa
        Empresa miEmpresa = new Empresa("Mi Empresa");

        // Agregar departamentos y empleados
        Empleado administrador1 = new Empleado("Administrador 1");
        miEmpresa.agregarDepartamento("Departamento 1", administrador1);

        Empleado administrador2 = new Empleado("Administrador 2");
        miEmpresa.agregarDepartamento("Departamento 2", administrador2);

        Empleado empleado1 = new Empleado("Empleado 1");
        Empleado empleado2 = new Empleado("Empleado 2");
        miEmpresa.agregarDepartamento("Departamento 3", empleado1);

        // Agregar oficinas
        miEmpresa.agregarOficina(101, "Oficina Normal");
        miEmpresa.agregarOficina(102, "Oficina Central");

        // Realizar algunas operaciones de prueba
        empleado1.cambiarDepartamento(miEmpresa.getDepartamentos().get(0));
        administrador2.cambiarDepartamento(miEmpresa.getDepartamentos().get(1));

        // Imprimir información
        System.out.println("Nombre de la empresa: " + miEmpresa.getNombre());
        System.out.println("Departamentos en la empresa:");
        for (Departamento departamento : miEmpresa.getDepartamentos()) {
            System.out.println(" - " + departamento.getNombre() + " (Administrador: " + departamento.getAdministrador().getNombre() + ")");
        }
        System.out.println("Oficinas en la empresa:");
        for (Oficina oficina : miEmpresa.getOficinas()) {
            System.out.println(" - Número: " + oficina.getNumero() + ", Tipo: " + oficina.getTipo());
        }
    }
}
