package br.com.lucas.cm;

import br.com.lucas.cm.modelo.Tabuleiro;
import br.com.lucas.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
	}
	
}
