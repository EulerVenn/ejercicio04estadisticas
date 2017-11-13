package estadistica;

import java.util.ArrayList;

public class ProcesadorMaximo extends ProcesadorEstadistico {
    public void calculaResultado(ArrayList<Double> datos) {

        if (datos.size() == 0)
            this.resultado = 0.0;

        Double maximo = Double.NEGATIVE_INFINITY;

        for (Double dato:datos) {
            if (dato > maximo)
                maximo = dato;
        }
        this.resultado = maximo;
    }
}
