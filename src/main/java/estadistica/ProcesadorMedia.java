package estadistica;

import java.util.ArrayList;

public class ProcesadorMedia extends ProcesadorEstadistico {

    @Override
    public void calculaResultado(ArrayList<Double> datos) {

        if (datos.size() == 0)
            this.resultado = 0.0;

        Double sumatorio = 0.0;

        for (Double dato:datos) {
            sumatorio += dato;
        }
        this.resultado = sumatorio / datos.size();
    }
}
