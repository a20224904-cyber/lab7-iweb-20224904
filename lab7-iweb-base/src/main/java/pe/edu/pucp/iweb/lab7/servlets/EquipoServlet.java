package pe.edu.pucp.iweb.lab7.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Clases de OpenPDF que necesitará en el Ejercicio 4 (paquete com.lowagie.text):
// import com.lowagie.text.Document;
// import com.lowagie.text.Paragraph;
// import com.lowagie.text.pdf.PdfPTable;
// import com.lowagie.text.pdf.PdfWriter;

@WebServlet(name = "EquipoServlet", urlPatterns = {"/equipos"})
public class EquipoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        if (accion == null) {
            accion = "listar";
        }

        int idSede = 0;
        String paramSede = request.getParameter("idsede");
        if (paramSede != null && !paramSede.isEmpty()) {
            idSede = Integer.parseInt(paramSede);
        }

        switch (accion) {
            case "pdf":
                generarPdf(request, response, idSede);
                break;
            default:
                listar(request, response, idSede);
                break;
        }
    }

    /**
     * Ejercicio 3: listado con combobox.
     */
    private void listar(HttpServletRequest request, HttpServletResponse response, int idSede)
            throws ServletException, IOException {

        // TODO 3: obtener las sedes (SedeDao) y los equipos (EquipoDao),
        //         enviarlos a la vista como atributos del request,
        //         junto con la sede seleccionada.

        request.getRequestDispatcher("equipos.jsp").forward(request, response);
    }

    /**
     * Ejercicio 4: reporte PDF descargable.
     */
    private void generarPdf(HttpServletRequest request, HttpServletResponse response, int idSede)
            throws IOException {

        // TODO 4: cabeceras Content-Type y Content-Disposition (nombre inventario_<sede>.pdf),
        //         y generar el PDF con OpenPDF directamente en response.getOutputStream().
    }
}
