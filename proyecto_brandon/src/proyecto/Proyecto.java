package proyecto;
import javax.swing.JOptionPane;
public class Proyecto {

    public static void main(String[] args) {
               String h = "";
        int cantidadDeEmpleados = 0;  
        h = JOptionPane.showInputDialog("Ingrese la cantidad de empleados");
        cantidadDeEmpleados = Integer.parseInt(h);
        
        Empleado arrEmpleado[] = new Empleado[cantidadDeEmpleados];
        
        for (int z = 0; z < arrEmpleado.length; z++) {
            JOptionPane.showMessageDialog(null, "Se solicitan los datos de los empleados");
            String nombreEmpleado = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
            String e = "";
            int id = 0;
            e = JOptionPane.showInputDialog("Ingrese el id del empleado"); 
            id = Integer.parseInt(e);

            if (!empleadoExiste(arrEmpleado, id)) {
                arrEmpleado[z] = new Empleado(nombreEmpleado, id);
                JOptionPane.showMessageDialog(null, "Empleado agregado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Error: El empleado ya existe. Ingrese un ID único.");
                z--; 
            }
        }
    }

    private static boolean empleadoExiste(Empleado[] arrEmpleado, int id) {
        for (Empleado empleado : arrEmpleado) {
            if (empleado != null && empleado.getId() == id) {
                return true; // El empleado ya existe
            }
        }
        return false; // El empleado no existe
    }
}