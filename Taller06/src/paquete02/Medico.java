package paquete02;

public class Medico {
    private String nombre;
    private String especialidad;
    private double sueldo;

    public Medico(String nom, String espc, double suel) {
        nombre = nom;
        especialidad = espc;
        sueldo = suel;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public void establecerEspecialidad(String a) {
        especialidad = a;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double a) {
        sueldo = a;
    }
    
    
}
