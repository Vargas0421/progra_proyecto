package Clases;

/**
 *
 * @author darry
 */
public class Reservas {

    private String nombre;
    private String horario;
    private int idUsuario;

    public Reservas(String nombre, String horario, int idUsuario) {
        this.nombre = nombre;
        this.horario = horario;
        this.idUsuario = idUsuario;
    }
    
    public Reservas(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Object[] toArray() {
        
        Object[] obj = new Object[3];
        
        obj[0] = idUsuario ;
        obj[1] = nombre ;
        obj[2] = horario;
        
        return obj;
    

    }

}
