package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FlorDao;
import model.Flor;

@WebServlet("/doCriar")
public class DoCriarFlorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String nome = (String) request.getParameter("nome");
		String nomeCientifico = (String) request.getParameter("nomeCientifico");
		String cor = (String) request.getParameter("cor");

		Flor flor = new Flor(nome, nomeCientifico, cor);
		try {
			FlorDao.incluir(flor);
		} catch (Exception e) {
			e.printStackTrace();
		}

		response.sendRedirect(request.getContextPath() + "/lista");
	}
	

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}