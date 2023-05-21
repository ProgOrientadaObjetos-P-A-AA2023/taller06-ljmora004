package paquete02;

public class Ciudad {
    private String nombre;
    private String provincia;

    public Ciudad(String nom, String prov) {
        nombre = nom;
        provincia = prov;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String s) {
        nombre = s;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public void establecerProvincia(String s) {
        provincia = s;
    }
    
    
}
