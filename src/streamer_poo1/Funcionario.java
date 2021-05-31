package streamer_poo1;

import java.util.Date;

public class Funcionario extends DadosPessoais {

	private Date dataAdmissao;
	
	public Funcionario() {

	}
	
	public Funcionario(int id, String nome, String endereco, Date dataAdmissao) {
		super(id, nome, endereco);
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
}
