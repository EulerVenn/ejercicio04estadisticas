package estadistica;

import java.util.ArrayList;

public class ProcesadorDesviacionTipica extends ProcesadorEstadistico {

    @Override
    public void calculaResultado(ArrayList<Double> datos) {

        if (datos.size() < 2) {
            System.out.printf("No hay datos suficientes para calcular la desviación típica.\n");
            this.resultado = Double.NaN;
        }

        ProcesadorMedia procesadorMedia = new ProcesadorMedia();
        procesadorMedia.calculaResultado(datos);
        Double media = procesadorMedia.getResultado();

        Double sumatorioDesviacionesAlCuadrado = 0.0;

        for (Double dato:datos) {
            sumatorioDesviacionesAlCuadrado += Math.pow(dato - media, 2.0);
        }

        this.resultado = sumatorioDesviacionesAlCuadrado / (datos.size() - 1.0);
    }
}
