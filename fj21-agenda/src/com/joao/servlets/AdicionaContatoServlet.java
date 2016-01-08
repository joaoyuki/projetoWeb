package com.joao.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/adicionaContato")// é chamado no form no adiciona-contato.html. Quando o usuário clicar no botão, a linha <form action="adicionaContato"> vai cair aqui.
public class AdicionaContatoServlet extends HttpServlet {
    protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
                        
        PrintWriter out = response.getWriter();
                        
        // pegando os parâmetros do request
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
        String dataEmTexto = request.getParameter("dataNascimento");
        Calendar dataNascimento = null;
        
        // fazendo a conversão da data
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
            dataNascimento = Calendar.getInstance();
            dataNascimento.setTime(date);
        } catch (ParseException e) {
            out.println("Erro de conversão da data");
            return; //para a execução do método
        }
        
        // imprime o nome do contato que foi adicionado
//        out.println("<html>");
//        out.println("<body>");
//        out.println("Contato " + nome + endereco + email + 
//                " adicionado com sucesso");    
//        out.println("</body>");
//        out.println("</html>");
        
        //Vai receber o chamado de adiciona-contato.html e vai redirecionar para contato-adicionado.jsp
        RequestDispatcher rd = request.getRequestDispatcher("/contato-adicionado.jsp");
        rd.forward(request,response);
        
    }
    
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("Iniciando a servlet");
    }
    
}