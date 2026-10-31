package pe.edu.pucp.iweb.lab7.beans;

/**
 * Ejercicio 2b: equipo de tipo 'SWITCH'.
 *
 * Soporte mensual (S/) = 0.015 x precio x cantidad
 */
public class EquipoSwitch extends EquipoRed { // TODO 2b: debe heredar de EquipoRed

    // TODO 2b: implementar calcularSoporteMensual()
    @Override
    public double calcularSoporteMensual(double precio, double cantidad) {
        return (0.02*precio+5)*cantidad;
    }
}
