package estadistica;

import java.util.ArrayList;

public class ProcesadorMinimo extends ProcesadorEstadistico {
    public Double calculaResultado(ArrayList<Double> datos) {

        if (datos.size() == 0)
            return 0.0;

        Double minimo = Double.POSITIVE_INFINITY;

        for (Double dato:datos) {
            if (dato < minimo)
                minimo = dato;
        }
        return minimo;
    }
}
