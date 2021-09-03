package br.com.elimar.gerenciador.servlet.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.elimar.gerenciador.servlet.modelo.Banco;

public class RemoveEmpresa implements Acao  {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("acao removendo empresa");
		
		String id = request.getParameter("id");
		System.out.println("remove id " + id);

		Banco banco = new Banco();
		banco.remove(Integer.parseInt(id));

		return "redirect:entrada?acao=ListaEmpresas";
	}
}
