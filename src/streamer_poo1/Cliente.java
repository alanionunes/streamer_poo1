package streamer_poo1;

import java.text.SimpleDateFormat;
import java.util.Date;
import streamer_poo1.DAO.ClienteDAO;

public class Cliente extends DadosPessoais implements ClienteDAO {
	
private static final Cliente Cliente = null;

private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataVenc;
	
	public Cliente() {
		
	}	
	
	public Cliente(int id, String nome, String endereco, Date dataVenc) {
		super(id, nome, endereco);
		this.dataVenc = dataVenc;
	}

	public Date getdataVenc() {
		return dataVenc;
	}

	public void setdataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}

	@Override
	public Cliente Criar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente Pesquisar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente Deletar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente Atualizar() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
