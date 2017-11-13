package estadistica;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcesadorEstadistico {
    Double resultado;
    public abstract void calculaResultado(ArrayList<Double> datos);

    public Double getResultado() {
        return resultado;
    }
}
