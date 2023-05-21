package paquete02;

public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldo;

    public Enfermero(String nom, String ti, double suel) {
        nombre = nom;
        tipo = ti;
        sueldo = suel;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String s) {
        nombre = s;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String s) {
        tipo = s;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }
    
    
    
    
}
