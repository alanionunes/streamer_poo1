package streamer_poo1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AlterarDadosCliente {

	private static List<Cliente> listaCadastro = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private static int j;

	private List<Cliente> getCliente() {
		return listaCadastro;
	}

	public void addCliente(Cliente cliente) {
		listaCadastro.add(cliente);
	}

	public void removeCliente(Cliente cliente) {
		listaCadastro.remove(cliente);
	}
	
	public static void verificacaoID(int nCad) {

		int cont;
		do {
			cont = 0;
			for (int i = 0; i < listaCadastro.size(); i++) {
				if (nCad == listaCadastro.get(i).getID()) {
					cont++;
					j = i;
					System.out.println();
					System.out.println("Ola, " + listaCadastro.get(i).getNome() +"!");
				}
			}

			if (cont == 0) {
				cont = 2;
				System.out.println("Numero de cadastro nao encontrado.");
				System.out.print("Digite novamente: ");
				nCad = sc.nextInt();
			}

		} while (cont == 2);
	}

	public static Date dataVencimento() {

		return listaCadastro.get(j).getdataVenc();

	}
	
	public static void editDataVencimento(Date date) {

		listaCadastro.get(j).setdataVenc(date);
		System.out.println("Nova data de vencimento: " + sdf.format(listaCadastro.get(j).getdataVenc()));

	}
	

}
