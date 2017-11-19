package datos;

import estadistica.ProcesadorDesviacionTipica;
import estadistica.ProcesadorMaximo;
import estadistica.ProcesadorMedia;
import estadistica.ProcesadorMinimo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuntoDatosTest {

    private ConjuntoDatos creaConjuntoDatosConProcesadores() {
        ConjuntoDatos conjuntoDatos= new ConjuntoDatos();
        conjuntoDatos.addProcesadorEstadistico(new ProcesadorMedia());
        conjuntoDatos.addProcesadorEstadistico(new ProcesadorDesviacionTipica());
        conjuntoDatos.addProcesadorEstadistico(new ProcesadorMaximo());
        conjuntoDatos.addProcesadorEstadistico(new ProcesadorMinimo());

        return conjuntoDatos;
    }

    @Test
    public void ConjuntoSuficiente() {
        ArrayList<Double> datos = new ArrayList<Double>();

        datos.add(1.0);
        datos.add(2.0);
        datos.add(3.0);
        datos.add(4.0);
        datos.add(5.0);

        ConjuntoDatos conjuntoDatos = creaConjuntoDatosConProcesadores();

        conjuntoDatos.recibeDatos(datos);
        assertEquals(3.0, conjuntoDatos.getDatoEstadistico(ProcesadorMedia.class));
        assertEquals(2.5, conjuntoDatos.getDatoEstadistico(ProcesadorDesviacionTipica.class));
        assertEquals(5.0, conjuntoDatos.getDatoEstadistico(ProcesadorMaximo.class));
        assertEquals(1.0, conjuntoDatos.getDatoEstadistico(ProcesadorMinimo.class));
    }

    @Test
    public void ConjuntoInsuficiente() {
        ArrayList<Double> datos = new ArrayList<Double>();

        datos.add(3.0);

        ConjuntoDatos conjuntoDatos = creaConjuntoDatosConProcesadores();

        conjuntoDatos.recibeDatos(datos);

        assertEquals(3.0, conjuntoDatos.getDatoEstadistico(ProcesadorMedia.class));
        assertEquals(Double.NaN, conjuntoDatos.getDatoEstadistico(ProcesadorDesviacionTipica.class));
        assertEquals(3.0, conjuntoDatos.getDatoEstadistico(ProcesadorMaximo.class));
        assertEquals(3.0, conjuntoDatos.getDatoEstadistico(ProcesadorMinimo.class));
    }

    @Test
    public void ConjuntoVacio() {
        ArrayList<Double> datos = new ArrayList<Double>();

        ConjuntoDatos conjuntoDatos = creaConjuntoDatosConProcesadores();

        conjuntoDatos.recibeDatos(datos);

        assertEquals(Double.NaN, conjuntoDatos.getDatoEstadistico(ProcesadorMedia.class));
        assertEquals(Double.NaN, conjuntoDatos.getDatoEstadistico(ProcesadorDesviacionTipica.class));
        assertEquals(Double.NaN, conjuntoDatos.getDatoEstadistico(ProcesadorMaximo.class));
        assertEquals(Double.NaN, conjuntoDatos.getDatoEstadistico(ProcesadorMinimo.class));
    }
}
