package proyecto;
public class Empleado {
  private String nombre;
    private int id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
}
