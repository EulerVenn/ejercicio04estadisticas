package estadistica;

import java.util.ArrayList;

public class ProcesadorMinimo extends ProcesadorEstadistico {
    public void calculaResultado(ArrayList<Double> datos) {

        if (datos.size() == 0) {
            System.out.printf("No hay datos suficientes para calcular el mínimo.\n");
            this.resultado = Double.NaN;
        }

        Double minimo = Double.POSITIVE_INFINITY;

        for (Double dato:datos) {
            if (dato < minimo)
                minimo = dato;
        }
        this.resultado = minimo;
    }
}
