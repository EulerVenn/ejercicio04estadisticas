package estadistica;

import java.util.List;

public abstract class ProcesadorEstadistico {
    Double resultado;
    public abstract void calculaResultado(List<Double> datos);

    public Double getResultado() {
        return resultado;
    }
}
