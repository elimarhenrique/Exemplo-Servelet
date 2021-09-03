package br.com.elimar.gerenciador.servlet.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.elimar.gerenciador.servlet.modelo.Banco;
import br.com.elimar.gerenciador.servlet.modelo.Empresa;

public class ListaEmpresas implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Tratamento de Usuario logado (Esse exemplo deveria ser implementado em todas as classes, não é uma boa pratica)
//		HttpSession sessao = request.getSession();
//		if(sessao.getAttribute("usuarioLogado") == null ) {
//			return "forward:entrada?acao=LoginForm";
//		}
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		
		return "forward:listaEmpresas.jsp";
	}

}
