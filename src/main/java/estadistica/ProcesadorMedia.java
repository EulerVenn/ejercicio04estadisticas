package estadistica;

import java.util.List;

public class ProcesadorMedia extends ProcesadorEstadistico {

    @Override
    public void calculaResultado(List<Double> datos) {

        if (datos.isEmpty()) {
            System.out.print("No hay datos suficientes para calcular la media.\n");
            this.resultado = Double.NaN;
            return;
        }

        Double sumatorio = 0.0;

        for (Double dato:datos) {
            sumatorio += dato;
        }
        this.resultado = sumatorio / datos.size();
    }
}
