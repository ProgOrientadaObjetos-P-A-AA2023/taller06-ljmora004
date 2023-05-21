package paquete02;

public class Hospital {

    private String nombre;
    private Ciudad ciudad;
    private int nroEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;
    private double sueldosPagar;

    public Hospital(String nom, Ciudad ciu, int nEsp,
            Medico[] meds, Enfermero[] enfs) {
        nombre = nom;
        ciudad = ciu;
        nroEspecialidades = nEsp;
        medicos = meds;
        enfermeros = enfs;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public int obtenerNroEspecialidades() {
        return nroEspecialidades;
    }

    public void establecerNroEspecialidades(int n) {
        nroEspecialidades = n;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public void establecerMedicos(Medico[] n) {
        medicos = n;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public void establecerEnfermeros(Enfermero[] n) {
        enfermeros = n;
    }

    public double obtenerSueldosPagar() {
        return sueldosPagar;
    }

    public void calcularSueldosPagar() {
        for (int i = 0; i < medicos.length; i++) {
            sueldosPagar += medicos[i].obtenerSueldo();    
        }
        for (int i = 0; i < enfermeros.length; i++) {
            sueldosPagar += enfermeros[i].obtenerSueldo();
        }
    }

    @Override
    public String toString() {
        String m = String.format("""
                                 
                                 %S
                                 Ciudad: %s
                                 Provincia: %s
                                 Número de especialidades: %d
                                 Listado de médicos:
                                 """, 
                nombre,
                ciudad.obtenerNombre(),
                ciudad.obtenerProvincia(),
                nroEspecialidades);
        
        for (int i = 0; i < medicos.length; i++) {
            m += String.format("""
                               - %s - sueldo: %.2f - %s
                               """,
                    medicos[i].obtenerNombre(),
                    medicos[i].obtenerSueldo(),
                    medicos[i].obtenerEspecialidad());
        }
        
        m += "\nListado de enfermeros(ras)\n";
        
        for (int i = 0; i < medicos.length; i++) {
            m += String.format("""
                               - %s - sueldo: %.2f - %s
                               """,
                    enfermeros[i].obtenerNombre(),
                    enfermeros[i].obtenerSueldo(),
                    enfermeros[i].obtenerTipo());
        }
        
        m += String.format("\nTotal de sueldos a pagar por mes: %.2f",
                sueldosPagar);
        
        return m;
    }
    
    
    
}
