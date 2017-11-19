package estadistica;

import java.util.List;

public class ProcesadorMinimo extends ProcesadorEstadistico {
    public void calculaResultado(List<Double> datos) {

        if (datos.isEmpty()) {
            System.out.print("No hay datos suficientes para calcular el mínimo.\n");
            this.resultado = Double.NaN;
            return;
        }

        Double minimo = Double.POSITIVE_INFINITY;

        for (Double dato:datos) {
            if (dato < minimo)
                minimo = dato;
        }
        this.resultado = minimo;
    }
}
