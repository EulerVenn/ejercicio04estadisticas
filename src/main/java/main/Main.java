package main;

import datos.ConjuntoDatos;
import estadistica.ProcesadorDesviacionTipica;
import estadistica.ProcesadorMaximo;
import estadistica.ProcesadorMedia;
import estadistica.ProcesadorMinimo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> datos = new ArrayList<Double>();

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

        System.out.printf("Media: " + conjuntoDatos.getDatoEstadistico(ProcesadorMedia.class) + "\n");
        System.out.printf("Desviación típica: " + conjuntoDatos.getDatoEstadistico(ProcesadorDesviacionTipica.class) + "\n");
        System.out.printf("Máximo: " + conjuntoDatos.getDatoEstadistico(ProcesadorMaximo.class) + "\n");
        System.out.printf("Mínimo: " + conjuntoDatos.getDatoEstadistico(ProcesadorMinimo.class) + "\n");
    }
}
