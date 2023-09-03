class Empleado {
    private String nombre;
    private Departamento departamento;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDepartamento(Departamento nuevoDepartamento) {
        departamento = nuevoDepartamento;
    }

    // Getters y setters para nombre y departamento
    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
}
