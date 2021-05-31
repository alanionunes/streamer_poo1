package streamer_poo1;

public abstract class DadosPessoais {

	private int id;
	private String nome;
	private String endereco;
	
	public DadosPessoais() {
		
	}
	
	public DadosPessoais(int id, String nome, String endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getID() {
		return id;
	}


	public void setID(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
		
}
