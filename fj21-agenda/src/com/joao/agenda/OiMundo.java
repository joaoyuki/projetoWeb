package com.joao.agenda;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name = "servletOiMundo",
		urlPatterns ={"/oi", "/ola"},
		initParams = {@WebInitParam(name = "param1", value = "valor1")})
public class OiMundo extends HttpServlet {
	
	private String parametro1;
	
    protected void service (HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        // escreve o texto
        out.println("<html>");
        out.println("<body>");
        out.println("Primeira servlet: " + parametro1);
        out.println("</body>");
        out.println("</html>");
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
      super.init(config);
      this.parametro1 = config.getInitParameter("param1");
      //this.parametro2 = config.getInitParameter("param2");
    }
}