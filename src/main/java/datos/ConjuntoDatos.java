package datos;

import estadistica.*;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoDatos {
    private double media;
    private double desviacionTipica;
    private double maximo;
    private double minimo;

    private List<ProcesadorEstadistico> procesadoresEstadisticos;

    public ConjuntoDatos() {
        procesadoresEstadisticos = new ArrayList<ProcesadorEstadistico>();

        procesadoresEstadisticos.add(new ProcesadorMedia());
        procesadoresEstadisticos.add(new ProcesadorDesviacionTipica());
        procesadoresEstadisticos.add(new ProcesadorMaximo());
        procesadoresEstadisticos.add(new ProcesadorMinimo());
    }

    public double getMedia() {
        return media;
    }

    public double getDesviacionTipica() {
        return desviacionTipica;
    }

    public double getMaximo() {
        return maximo;
    }

    public double getMinimo() {
        return minimo;
    }

    public void recibeDatos(ArrayList<Double> datos) {

    }
}
