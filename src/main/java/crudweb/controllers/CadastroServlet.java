package crudweb.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudweb.model.ListaUser;
import crudweb.model.User;


@WebServlet("/")
	public class CadastroServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    @SuppressWarnings("unchecked")
		private ArrayList<User> ls = new ArrayList();
	    ListaUser lsa = new ListaUser();
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }
	 
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String action = request.getServletPath();
	 
	        try {
	            switch (action) {
	            case "/new":
	                showNewForm(request, response);
	                break;
	            case "/insert":
	                insertUser(request, response);
	                break;
	                
	            case "/ver":
	                seeUser(request, response);
	                break;
//	            case "/delete":
//	                deleteBook(request, response);
//	                break;

//	            case "/update":
//	                editarUser(request, response);
//	                break;
	            default:
	                listUser(request, response);
	                break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	    }
	    
	    private void insertUser(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	    	
	    	
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			int idade = Integer.parseInt(request.getParameter("idade"));

			User usuarioNovo = new User(nome, email, idade);
			
			ls.add(usuarioNovo);	
			
	        response.sendRedirect("list");

	    }
	    
	    private void listUser(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {

	    	lsa.setUsuarios(ls);
	    	
	        request.setAttribute("listUser", ls);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("usuarios.jsp");
	        dispatcher.forward(request, response);
	    }
	    

	 
	    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("usuarios.jsp");
	        dispatcher.forward(request, response);
	    }
	    
	    
	    
	    private void seeUser(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	
	        int id_search = Integer.parseInt((request.getParameter("id")));
	        User user = ListaUser.getUsuario(id_search);
	        
	        request.setAttribute("user", user);
			
	        RequestDispatcher dispatcher = request.getRequestDispatcher("usuario.jsp");
	        dispatcher.forward(request, response);
	    }
	  
	    private void editarUser(HttpServletRequest request, HttpServletResponse response)
	            throws  IOException, ServletException {
	        int id = Integer.parseInt(request.getParameter("id"));
	        
	        String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			
	        User user = ListaUser.getUsuario(id);
	        
	        request.setAttribute("user", user);
			
	        RequestDispatcher dispatcher = request.getRequestDispatcher("editar.jsp");
	        dispatcher.forward(request, response);
	 
//	        Book book = new Book(id, title, author, price);
//	        bookDAO.updateBook(book);
//	        response.sendRedirect("ver");
	    }
	 
//	    private void deleteBook(HttpServletRequest request, HttpServletResponse response)
//	            throws SQLException, IOException {
//	        int id = Integer.parseInt(request.getParameter("id"));
//	 
//	        Book book = new Book(id);
//	        bookDAO.deleteBook(book);
//	        response.sendRedirect("list");
//	 
//	    }
	}
