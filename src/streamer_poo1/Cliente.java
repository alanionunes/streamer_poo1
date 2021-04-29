package streamer_poo1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
	
private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private int id;
	private String nome;
	private String endereco;
	private Date dataVenc;
	
	public Cliente() {
		
	}
	
	public Cliente(int id, String nome, String endereco, Date dataVenc) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.dataVenc = dataVenc;
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

	public Date getdataVenc() {
		return dataVenc;
	}

	public void setdataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}
	
//	private static List<Cliente> listaCadastro = new ArrayList<>();
//	
//	public List<Cliente> getCliente() {
//		return listaCadastro;
//	}
//
//	public static void addCliente(Cliente cliente) {
//		listaCadastro.add(cliente);
//	}
//	
//	public void removeCliente(Cliente cliente) {
//		listaCadastro.remove(cliente);
//	}
//	
//	public String toString() {
//		StringBuilder sb = new StringBuilder(); 
//		for (Cliente c : listaCadastro) {
//			sb.append(c.getID() + "\n");
//			sb.append(c.getNome() + "\n");
//			sb.append(c.getEndereco() + "\n");
//		}
//
//		return sb.toString();
//	}


}
