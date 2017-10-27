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
public class hikisuumodorichi1 extends HttpServlet {
   String[] dataArray(int no){
        
         String data[] = new String[4];
         
         String id;          
         String name;        
         String birth;       
         String adress;      
         
     switch(no){
         
         case 1:
             id    ="1";
             name  ="和田";
             birth ="1989年10月30日";
             adress="千葉";
             
             data[0]=id;
             data[1]=name;
             data[2]=birth;
             data[3]=adress;
        break;
         case 2:
             id    ="2";
             name  ="野田";
             birth ="1989年11月11日";
             adress="青森";
             
             data[0]=id;
             data[1]=name;
             data[2]=birth;
             data[3]=adress;             
         break;
         case 3:
             id    ="3";
             name  ="横山";
             birth ="1987年12月12日";
             adress="東京";
             
             data[0]=id;
             data[1]=name;
             data[2]=birth;
             data[3]=adress;
         break;
       }
    return data;
    }
     
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        
          PrintWriter out = response.getWriter();
         
         String data[];
         
         int id = 2;
         
         data = dataArray(id);
            
         for(int i = 1; i < data.length; i++){
             out.print(data[i] + "<br>");
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