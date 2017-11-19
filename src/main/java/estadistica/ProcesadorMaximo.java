package estadistica;

import java.util.List;

public class ProcesadorMaximo extends ProcesadorEstadistico {
    public void calculaResultado(List<Double> datos) {

        if (datos.isEmpty()) {
            System.out.print("No hay datos suficientes para calcular el máximo.\n");
            this.resultado = Double.NaN;
            return;
        }

        Double maximo = Double.NEGATIVE_INFINITY;

        for (Double dato:datos) {
            if (dato > maximo)
                maximo = dato;
        }
        this.resultado = maximo;
    }
}
