package datos;

import estadistica.*;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoDatos {

    private boolean conjuntoDatosValido;
    private List<ProcesadorEstadistico> procesadoresEstadisticos;

    public ConjuntoDatos() {
        procesadoresEstadisticos = new ArrayList<ProcesadorEstadistico>();
        conjuntoDatosValido = false;
    }

    public void addProcesadorEstadistico(ProcesadorEstadistico procesadorEstadistico) {
        procesadoresEstadisticos.add(procesadorEstadistico);
    }

    public double getDatoEstadistico(Class clase) {
        if (conjuntoDatosValido) {
            for (ProcesadorEstadistico procesador : procesadoresEstadisticos) {
                if (procesador.getClass() == clase) {
                    return procesador.getResultado();
                }
            }
        }
        return Double.NaN;
    }

    public void recibeDatos(ArrayList<Double> datos) {
        if (datos.size() < 2) {
            conjuntoDatosValido = false;
            System.out.printf("La lista de datos debe contener al menos dos valores.\n");
            //throw new ArithmeticException("La lista de datos debe contener al menos dos valores.");
        }
        else {
            for (ProcesadorEstadistico procesador : procesadoresEstadisticos) {
                procesador.calculaResultado(datos); // Poco eficiente, hay que recorrer los datos en cada procesador estadístico, cuando con un solo recorrido sería suficiente
            }
            conjuntoDatosValido = true;
        }
    }
}
