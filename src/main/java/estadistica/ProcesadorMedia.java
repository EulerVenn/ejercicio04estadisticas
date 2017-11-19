package estadistica;

import java.util.ArrayList;

public class ProcesadorMedia extends ProcesadorEstadistico {

    @Override
    public void calculaResultado(ArrayList<Double> datos) {

        if (datos.size() == 0) {
            System.out.printf("No hay datos suficientes para calcular la media.\n");
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
