/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.bi.PalindromeDetectorLocal;

/**
 *
 * @author User
 */
public class OutcomeServlet extends HttpServlet {
    @EJB private PalindromeDetectorLocal pdl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String word=(String)request.getParameter("word");
        
        String reverseWord = pdl.reverseWord(word);
        String outcome =pdl.isPalindrome(word, reverseWord);
        
        session.setAttribute("word", word);
        session.setAttribute("reverseWord", reverseWord);
        session.setAttribute("outcome", outcome);
        
        updateSession(session,outcome);
        
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }

    private void updateSession(HttpSession session, String outcome) {
        
        int count = (Integer)session.getAttribute("count");
        int numPalindrome =(Integer)session.getAttribute("numPalindrome");
        if(outcome.equals("Palindrome"))
        {
            numPalindrome++;
            session.setAttribute("numPalindrome", numPalindrome);
        }
        count++;
        session.setAttribute("count", count);
    }

    
}
