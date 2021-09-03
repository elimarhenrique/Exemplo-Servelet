package br.com.elimar.gerenciador.servlet.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sessao = request.getSession();

//      Exemplo removendo apenas o atributo
//		sessao.removeAttribute("usuarioLogado");
		
		// Invalidando a sessao
		sessao.invalidate();
		return "redirect:entrada?acao=LoginForm";
	}

}
