package datos;

import estadistica.*;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoDatos {

    private List<ProcesadorEstadistico> procesadoresEstadisticos;

    public ConjuntoDatos() {
        procesadoresEstadisticos = new ArrayList<ProcesadorEstadistico>();
    }

    public void addProcesadorEstadistico(ProcesadorEstadistico procesadorEstadistico) {
        procesadoresEstadisticos.add(procesadorEstadistico);
    }

    public double getDatoEstadistico(Class clase) {
        for (ProcesadorEstadistico procesador:procesadoresEstadisticos) {
            if (procesador.getClass() == clase) {
                return procesador.getResultado();
            }
        }
        return 0.0;
    }

    public void recibeDatos(ArrayList<Double> datos) {
        for (ProcesadorEstadistico procesador:procesadoresEstadisticos) {
            procesador.calculaResultado(datos); // Poco eficiente, hay que recorrer los datos en cada procesador estadístico, cuando con un solo recorrido sería suficiente
        }
    }
}
