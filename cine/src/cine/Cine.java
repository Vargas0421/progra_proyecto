package cine;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Cine {
    public static void main(String[] args) {
        String cine[][];
        String butacas[] = {"A", "B", "C", "D", "E", "F"};
        int filas = 5; // Fixed number of rows
        int columnas = 6; // Fixed number of columns
        int opcion, cualFila = -1, cualColumna = -1;
        JTextArea hoja = new JTextArea();
        String salida = "", cualBoleto, filaAsiento, columnaAsiento;
        boolean salir = false, encontrado = false;

        cine = new String[filas][columnas];

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                cine[fila][columna] = butacas[fila] + (columna + 1);
            }
        }

        while (!salir) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea\n1. Ver sala\n2. Comprar boleto\n3. Devolucion de boleto\n4. Cambio de asiento"));
            if (opcion == 1) { // ver sala
                salida = "";
                salida += "\t\tPANTALLA\n\t====================================\n\n";
                for (int fila = 0; fila < filas; fila++) {
                    for (int columna = 0; columna < columnas; columna++) {
                        salida += cine[fila][columna] + "\t";
                    }
                    salida += "\n";
                }
                hoja.setText(salida);
                JOptionPane.showMessageDialog(null, hoja);
            } else if (opcion == 2) { // comprar boleto
                salida = "";
                salida += "\t\tPANTALLA\n\t====================================\n\n";
                for (int fila = 0; fila < filas; fila++) {
                    for (int columna = 0; columna < columnas; columna++) {
                        salida += cine[fila][columna] + "\t";
                    }
                    salida += "\n";
                }
                salida += "\nIngrese el asiento que desea comprar";
                hoja.setText(salida);
                cualBoleto = JOptionPane.showInputDialog(hoja).toUpperCase();

                for (int fila = 0; fila < filas; fila++) {
                    for (int columna = 0; columna < columnas; columna++) {
                        if (cualBoleto.equals(cine[fila][columna])) {
                            if (!cine[fila][columna].equals("X")) {
                                JOptionPane.showMessageDialog(null, "Asiento #" + cualBoleto + " Asignado. Que disfrute la función");
                                cine[fila][columna] = "X";
                            } else {
                                JOptionPane.showMessageDialog(null, "El asiento " + cualBoleto + " ya está ocupado");
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        break;
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "El asiento " + cualBoleto + " no se encuentra en la sala");
                }
            } else if (opcion == 3) { // devolucion de boleto
                salida = "";
                salida += "\t\tPANTALLA\n\t====================================\n\n";
                for (int fila = 0; fila < filas; fila++) {
                    for (int columna = 0; columna < columnas; columna++) {
                        salida += cine[fila][columna] + "\t";
                    }
                    salida += "\n";
                }
                salida += "\nIngrese el asiento que desea devolver";
                hoja.setText(salida);
                cualBoleto = JOptionPane.showInputDialog(hoja).toUpperCase();

                for (int fila = 0; fila < filas; fila++) {
                    for (int columna = 0; columna < columnas; columna++) {
                        if (cualBoleto.equals(cine[fila][columna])) {
                            JOptionPane.showMessageDialog(null, "Procesando devolucion del asiento " + cualBoleto);
                            cine[fila][columna] = cualBoleto;
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        break;
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "El asiento " + cualBoleto + " no fue encontrado o no está ocupado");
                }
            } else if (opcion == 4) { // cambio de asiento
                salida = "";
                salida += "\t\tPANTALLA\n\t====================================\n\n";
                for (int fila = 0; fila < filas; fila++) {
                    for (int columna = 0; columna < columnas; columna++) {
                        salida += cine[fila][columna] + "\t";
                    }
                    salida += "\n";
                }
                salida += "\nIngrese el asiento que desea cambiar";
                hoja.setText(salida);
                cualBoleto = JOptionPane.showInputDialog(hoja).toUpperCase();

                for (int fila = 0; fila < filas; fila++) {
                    for (int columna = 0; columna < columnas; columna++) {
                        if (cualBoleto.equals(cine[fila][columna]) && cine[fila][columna].equals("X")) {
                            JOptionPane.showMessageDialog(null, "Procesando cambio de asiento para " + cualBoleto);
                            cine[fila][columna] = cualBoleto;
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        break;
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "El asiento " + cualBoleto + " no se encuentra en la sala o no está ocupado");
                }
            } else {
                salir = true;
            }
        }
    }
}
