package streamer_poo1.DAO;

import streamer_poo1.Filme;

//CRUD
public interface FilmeDAO {
	
	public Filme Criar();

	public Filme Pesquisar();

	public Filme Deletar();

	public Filme Atualizar();
}
