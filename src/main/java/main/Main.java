package main;

import datos.ConjuntoDatos;
import estadistica.ProcesadorDesviacionTipica;
import estadistica.ProcesadorMaximo;
import estadistica.ProcesadorMedia;
import estadistica.ProcesadorMinimo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> datos = new ArrayList<>();

        datos.add(1.0);
        datos.add(2.0);
        datos.add(3.0);
        datos.add(4.0);
        datos.add(5.0);

        ConjuntoDatos conjuntoDatos= new ConjuntoDatos();
        conjuntoDatos.addProcesadorEstadistico(new ProcesadorMedia());
        conjuntoDatos.addProcesadorEstadistico(new ProcesadorDesviacionTipica());
        conjuntoDatos.addProcesadorEstadistico(new ProcesadorMaximo());
        conjuntoDatos.addProcesadorEstadistico(new ProcesadorMinimo());

        conjuntoDatos.recibeDatos(datos);

        System.out.printf("Media: %s%n", conjuntoDatos.getDatoEstadistico(ProcesadorMedia.class));
        System.out.printf("Desviación típica: %s%n", conjuntoDatos.getDatoEstadistico(ProcesadorDesviacionTipica.class));
        System.out.printf("Máximo: %s%n", conjuntoDatos.getDatoEstadistico(ProcesadorMaximo.class));
        System.out.printf("Mínimo: %s%n", conjuntoDatos.getDatoEstadistico(ProcesadorMinimo.class));

        // Sin datos suficientes

        System.out.printf("%nPrueba sin datos suficientes%n");
        datos = new ArrayList<>();

        datos.add(3.0);

        conjuntoDatos.recibeDatos(datos);

        System.out.printf("Media: %s%n", conjuntoDatos.getDatoEstadistico(ProcesadorMedia.class));
        System.out.printf("Desviación típica: %s%n", conjuntoDatos.getDatoEstadistico(ProcesadorDesviacionTipica.class));
        System.out.printf("Máximo: %s%n", conjuntoDatos.getDatoEstadistico(ProcesadorMaximo.class));
        System.out.printf("Mínimo: %s%n", conjuntoDatos.getDatoEstadistico(ProcesadorMinimo.class));
    }
}
