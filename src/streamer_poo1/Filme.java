package streamer_poo1;

import streamer_poo1.DAO.FilmeDAO;

public class Filme implements FilmeDAO {
	
	private String titulo;
	private int ano;
	private String diretor;
	private String ator;
	private String genero;
	
	public Filme() {

	}
	
	public Filme(String titulo, int ano, String diretor, String ator, String genero) {
		this.titulo = titulo;
		this.ano = ano;
		this.diretor = diretor;
		this.ator = ator;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getAtor() {
		return ator;
	}

	public void setAtor(String ator) {
		this.ator = ator;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String toString() {
		
		return "Titulo: " + titulo + " | Ano: " + ano + " | Diretor: " + diretor + " | Ator: " + ator + " | Genero: " + genero;
	}

	@Override
	public Filme Criar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Filme Pesquisar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Filme Deletar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Filme Atualizar() {
		// TODO Auto-generated method stub
		return null;
	}

	
		
}
