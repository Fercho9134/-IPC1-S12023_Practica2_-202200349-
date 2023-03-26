
package modelo;

import java.awt.Desktop;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reporte {
    
    public void generarReporte(String costoInv, String costoProd, String costoEmp, String costoSal, String totalSim) {

        String plantilla = "";
        try {
            plantilla = new String(Files.readAllBytes(Paths.get("reporte.html")));
        } catch (IOException e) {
            System.out.println("Error al leer la plantilla: " + e.getMessage());
            return;
        }

        // Reemplazamos las secciones dinámicas de la plantilla con el contenido generado
        String paginaFinal = plantilla
                .replace("[costo_inventario]", costoInv)
                .replace("[costo_produccion]", costoProd)
                .replace("[costo_empaquetado]", costoEmp)
                .replace("[costo_salida]", costoSal)
                .replace("[total_simulacion]", totalSim);

        // Escribimos el archivo HTML
        try {
            FileWriter writer = new FileWriter("ReporteSimulacion.html");
            writer.write(paginaFinal);
            writer.close();
            System.out.println("Archivo HTML generado correctamente");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo HTML: " + e.getMessage());
        }

        try {
            Desktop.getDesktop().browse(Paths.get("ReporteSimulacion.html").toUri());
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo HTML: " + e.getMessage());
        }

    }
    
}
