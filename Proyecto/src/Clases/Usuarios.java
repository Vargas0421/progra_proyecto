package Clases;

/**
 *
 * @author darry
 */
public class Usuarios {
    
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;

    public Usuarios(int id, String nombre, String apellidos, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }
    
    public Usuarios(){
    
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public Object[] toArray(){
    
        Object[] obj = new Object[4];
        
        obj[0] = id;
        obj[1] = nombre;
        obj[2] = apellidos;
        obj[3] = correo;
        
        return obj;
        
    
    }

    
    
    
    
}
