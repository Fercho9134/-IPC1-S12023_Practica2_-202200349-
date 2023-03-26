package modelo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import vista.Simulacion;

public class Hilo implements Runnable {

    private int codigo;
    private int tiempoInventario;
    private int tiempoProduccion;
    private int tiempoEmpaquetado;
    private int tiempoSalida;
    private int retrasoInicial;
    private Simulacion frame;

    public Hilo(int codigo, int tiempoInventario, int tiempoProduccion, int tiempoEmpaquetado, int tiempoSalida, int retrasoInicial, Simulacion frame) {
        this.codigo = codigo;
        this.tiempoInventario = tiempoInventario;
        this.tiempoProduccion = tiempoProduccion;
        this.tiempoEmpaquetado = tiempoEmpaquetado;
        this.tiempoSalida = tiempoSalida;
        this.retrasoInicial = retrasoInicial;
        this.frame = frame;
    }

    static int xInv = 375;
    static int yInv = 274;
    static int filasInv = 0;
    static int xProd = 375;
    static int yProd = 66;
    static int filasProd = 0;
    static int xEmp = 55;
    static int yEmp = 66;
    static int filasEmp = 0;
    static int xSal = 55;
    static int ySal = 274;
    static int filasSal = 0;

    public static void reiniciarCoordenadas() {

        xInv = 375;
        yInv = 274;
        filasInv = 0;
        xProd = 375;
        yProd = 66;
        filasProd = 0;
        xEmp = 55;
        yEmp = 66;
        filasEmp = 0;
        xSal = 55;
        ySal = 274;
        filasSal = 0;

    }

    static ImageIcon iconoInactivo = new ImageIcon("inactivo.png");
    static ImageIcon iconoInventario = new ImageIcon("inventario.png");
    static ImageIcon iconoProduccion = new ImageIcon("produccion.png");
    static ImageIcon iconoEmpaquetado = new ImageIcon("empaquetado.png");
    static ImageIcon iconoSalida = new ImageIcon("salida.png");

    @Override
    public void run() {
        try {

            //Entrando
            JLabel etiqueta = new JLabel(iconoInactivo);
            frame.agregarComponenteAPanelPrincipal(etiqueta);
            etiqueta.setVisible(false);
            etiqueta.setBounds(660, 172, 18, 18);
            //562
            Thread.sleep(retrasoInicial - 750);
            etiqueta.setVisible(true);
            for (int i = 660; i >= 560; i = i - 10) {
                etiqueta.setBounds(i, 172, 18, 18);
                Thread.sleep(25);
            }
            frame.setInicio(Integer.toString(frame.getInicio() - 1));
            Thread.sleep(500);

            // Entrando a inventario
            etiqueta.setBounds(xInv, yInv, 18, 18);
            etiqueta.setIcon(iconoInventario);
            frame.setInventario(Integer.toString(frame.getInventario() + 1));
            xInv = xInv + 20;
            filasInv++;
            if (filasInv % 11 == 0) {
                yInv = yInv + 20;
                xInv = 375;
            }
            System.out.println(codigo + " entrando a inventario.");
            Thread.sleep(tiempoInventario - 500);

            //saliendo de inventario
            etiqueta.setBounds(390, 187, 18, 18);
            frame.setInventario(Integer.toString(frame.getInventario() - 1));
            Thread.sleep(500);

            //Entrando a produccion
            etiqueta.setBounds(xProd, yProd, 18, 18);
            etiqueta.setIcon(iconoProduccion);
            frame.setProduccion(Integer.toString(frame.getProduccion() + 1));
            xProd = xProd + 20;
            filasProd++;
            if (filasProd % 11 == 0) {
                yProd = yProd + 20;
                xProd = 375;
            }
            System.out.println(codigo + " entrando a produccion.");
            Thread.sleep(tiempoProduccion - 500);

            //Saliendo de produccion
            etiqueta.setBounds(314, 82, 18, 18);
            frame.setProduccion(Integer.toString(frame.getProduccion() - 1));
            Thread.sleep(500);

            //Entrando a empaquetado
            etiqueta.setBounds(xEmp, yEmp, 18, 18);
            etiqueta.setIcon(iconoEmpaquetado);
            frame.setEmpaquetado(Integer.toString(frame.getEmpaquetado() + 1));
            xEmp = xEmp + 20;
            filasEmp++;
            if (filasEmp % 11 == 0) {
                yEmp = yEmp + 20;
                xEmp = 55;
            }
            System.out.println(codigo + " entrando a empaquetado.");
            Thread.sleep(tiempoEmpaquetado - 500);

            //Saliendo de empaquetado
            etiqueta.setBounds(222, 187, 18, 18);
            frame.setEmpaquetado(Integer.toString(frame.getEmpaquetado() - 1));
            Thread.sleep(500);

            //Entrando a salida
            etiqueta.setBounds(xSal, ySal, 18, 18);
            etiqueta.setIcon(iconoSalida);
            frame.setSalida(Integer.toString(frame.getSalida() + 1));
            xSal = xSal + 20;
            filasSal++;
            if (filasSal % 11 == 0) {
                ySal = ySal + 20;
                xSal = 55;
            }
            System.out.println(codigo + " entrando a salida.");
            Thread.sleep(tiempoSalida - 500);

            //saliendo de salida
            etiqueta.setBounds(75, 175, 18, 18);
            frame.setSalida(Integer.toString(frame.getSalida() - 1));
            Thread.sleep(250);

            for (int i = 75; i >= 0; i = i - 5) {
                etiqueta.setBounds(i, 175, 18, 18);
                Thread.sleep(100 / 6);
            }

            // Desapareciendo
            etiqueta.setVisible(false);
            frame.setFinal(Integer.toString(frame.getFin() + 1));
            System.out.println(codigo + " desapareciendo.");
        } catch (InterruptedException e) {
            // Manejo de excepciones
            e.printStackTrace();
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTiempoInventario() {
        return tiempoInventario;
    }

    public void setTiempoInventario(int tiempoInventario) {
        this.tiempoInventario = tiempoInventario;
    }

    public int getTiempoProduccion() {
        return tiempoProduccion;
    }

    public void setTiempoProduccion(int tiempoProduccion) {
        this.tiempoProduccion = tiempoProduccion;
    }

    public int getTiempoEmpaquetado() {
        return tiempoEmpaquetado;
    }

    public void setTiempoEmpaquetado(int tiempoEmpaquetado) {
        this.tiempoEmpaquetado = tiempoEmpaquetado;
    }

    public int getTiempoSalida() {
        return tiempoSalida;
    }

    public void setTiempoSalida(int tiempoSalida) {
        this.tiempoSalida = tiempoSalida;
    }

    public int getRetrasoInicial() {
        return retrasoInicial;
    }

    public void setRetrasoInicial(int retrasoInicial) {
        this.retrasoInicial = retrasoInicial;
    }

}
