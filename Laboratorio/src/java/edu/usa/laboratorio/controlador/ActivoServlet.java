/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usa.laboratorio.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import udu.usa.laboratorio.modelo.Activo;

/**
 *
 * @author fabian.giraldo
 */
public class ActivoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           String nombreEquipo= request.getParameter("nombreEquipo"); 
           String fechaAdquisicion = request.getParameter("fechaAdquisicion"); 
           String codigo=  request.getParameter("codigo"); 
           String marca = request.getParameter("marca"); 
           String modelo=     request.getParameter("modelo"); 
           String ubicacion =  request.getParameter("ubicacion");  
           String numeroSerie =    request.getParameter("numeroSerie");
           String funcionamiento = request.getParameter("funcionamiento");  
           String referencia =   request.getParameter("referencia");    
           String  manual =  request.getParameter("manual");
           
           Activo activo = new Activo();
           activo.setNombreEquipo(nombreEquipo);
           activo.setFechaAdquisicion(fechaAdquisicion);
           activo.setCodigo(codigo);
           activo.setMarca(marca);
           activo.setModelo(modelo);
           activo.setUbicacion(ubicacion);
           activo.setNumeroSerie(numeroSerie);
           activo.setFuncionamiento(funcionamiento);
           activo.setReferencia(referencia);
           activo.setManual(manual);
           
           System.out.println(activo);
           
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
