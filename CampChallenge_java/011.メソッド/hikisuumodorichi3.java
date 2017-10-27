/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kazuma
 */
public class hikisuumodorichi3 extends HttpServlet {
   String[][] dataArray(int no){
        
         String data[] []= new String[3][4];
         
         String id;          
         String name;        
         String birth;       
         String adress;      
         
     switch(no){
         
         case 0:
             id    ="1";
             name  ="和田";
             birth ="1989年10月30日";
             adress="千葉";
             
             data[0][0]=id;
             data[0][1]=name;
             data[0][2]=birth;
             data[0][3]=adress;
        break;
         case 1:
             id    ="2";
             name  ="野田";
             birth ="1989年11月11日";
             adress="青森";
             
             data[1][0]=id;
             data[1][1]=name;
             data[1][2]=birth;
             data[1][3]=adress;             
         break;
         case 2:
             id    ="3";
             name  ="横山";
             birth ="1987年12月12日";
             adress="東京";
             
             data[2][0]=id;
             data[2][1]=name;
             data[2][2]=birth;
             data[2][3]=adress;
         break;
       }
    return data;
    }
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          String data[][];
         
         Integer limit = 2;
         
         for(int i = 0; i < limit; i++){
             
             data = dataArray(i);
         
             for(int j = 1; j < data[i].length ; j++){
             
                 if(data[i][j] == null){
                     continue;
                 }
                 
                 out.print(data[i][j] + "<br>");
             }
             
             out.print("<br>");
         }
        }
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
