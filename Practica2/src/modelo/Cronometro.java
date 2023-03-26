
package modelo;

import javax.swing.JLabel;
import vista.Simulacion;

public class Cronometro implements Runnable {
    JLabel tiempo;
    Simulacion frame;
    int tiempoTotal;
    int segundos = 0, minutos = 0, horas = 0, segundosTotales=0;

    public Cronometro(JLabel tiempo, Simulacion frame, int tiempoTotal) {
        this.tiempo = tiempo;
        this.frame = frame;
        this.tiempoTotal = tiempoTotal;
    }

    @Override
    public void run() {
        while (segundosTotales<tiempoTotal) {
            System.out.println("Segundos " + segundos + " <= " + "Tiempo total" + tiempoTotal);
            try {
                Thread.sleep(1000); // Esperamos un segundo
            } catch (InterruptedException ex) {
                System.out.println("Error en el hilo del cronómetro");
            }

            segundos++;
            segundosTotales++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                }
            }

            String tiempoTexto = String.format("%02d:%02d:%02d", horas, minutos, segundos);
            tiempo.setText(tiempoTexto);
        }
        frame.habilitarBotones();
    }
}
