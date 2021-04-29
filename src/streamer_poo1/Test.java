package streamer_poo1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date dataAtual = new Date();
						
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataAtual);

		int n = 3;

		// cadastro de filmes
		Filme filme[] = new Filme[12];

		filme[0] = new Filme("Titanic", 1997, "James Cameron", "Leonardo DiCaprio", "Romance");
		filme[1] = new Filme("Meninas Malvadas", 2004, "Mark Waters", "Lindsay Lohan", "Comédia");
		filme[2] = new Filme("Para Todos os Garotos: Agora e Sempre", 2021, "Michael Fimognari", "Lana Condor",	"Romance");
		filme[3] = new Filme("Jogos Vorazes: Em Chamas", 2013, "Francis Lawrence", "Jennifer Lawrence", "Ação");
		filme[4] = new Filme("Jurassic Park", 2015, "Colin Trevorrow", "Chris Pratt", "Ficção Científica");
		filme[5] = new Filme("Invocação do Mal 2", 2016, "James Wan", "Vera Farmiga", "Terror");
		filme[6] = new Filme("Minha Mãe é Uma Peça 3", 2019, "Susana Garcia", "Paulo Gustavo", "Nacional");
		filme[7] = new Filme("O Rei Leão (Live Action)", 2019, "Jon Favreau", "Icaro Silva", "Animação");
		filme[8] = new Filme("Resident Evil: O Último Capítulo", 2016, "Paul W. S. Anderson", "Milla Jovovich", "Ficção Científica");
		filme[9] = new Filme("Jumanji", 2017, "Jake Kasdan", "Dwayne Johnson", "Ação");
		filme[10] = new Filme("Shrek 2", 2017, "Adrew Adamson", "Mike Myers", "Animação");
		filme[11] = new Filme("Central do Brasil", 1998, "Walter Salles", "Fernanda Montenegro", "Nacional");

		// cadastro de clientes
		Cliente cli1 = new Cliente(11, "Kayo Amorim", "Av. Bezerra de Menezes, 2021", sdf.parse("29/04/2021"));
		Cliente cli2 = new Cliente(12, "Fernanda Santiago", "Av. Mister Hull, 2021", sdf.parse("19/04/2021"));
		Cliente cli3 = new Cliente(13, "Vitor Alves", "Av. Washington Soares, 2021", sdf.parse("05/04/2021"));
		AlterarDadosCliente cadastrarCliente = new AlterarDadosCliente();

		cadastrarCliente.addCliente(cli1);
		cadastrarCliente.addCliente(cli2);
		cadastrarCliente.addCliente(cli3);

		System.out.println("Bem vindo!");
		System.out.print("Por gentileza, digite seu numero de cadastro: ");
		int nCad = sc.nextInt();

		AlterarDadosCliente.verificacaoID(nCad);
		Date venc = AlterarDadosCliente.dataVencimento();
		int opPag = 0;

		if (venc.before(dataAtual) == true) {
			System.out.println("Voce esta em debito com o pagamento da mensalidade.");
			System.out.println();
			System.out.printf("Escolha a forma de pagamento: \n1. Cartão de credito\n2. Cartão de debito\n3. Boleto\n4. Cartão pre-pago\n5. TED\n6. PIX\n");

			opPag = sc.nextInt();

			while (opPag < 1 || opPag > 6) {
				System.out.printf("Opção inválida.\nDigite novamente.\n");
				opPag = sc.nextInt();
			}
			
			switch (opPag) {
			case 1:
				Pagamentos.formaPagamento(dataAtual, opPag);
				break;
			case 2:
				Pagamentos.formaPagamento(dataAtual, opPag);
				break;
			case 3:
				Pagamentos.formaPagamento(dataAtual, opPag);
				break;
			case 4:
				Pagamentos.formaPagamento(dataAtual, opPag);
				break;
			case 5:
				Pagamentos.formaPagamento(dataAtual, opPag);
				break;
			case 6:
				Pagamentos.formaPagamento(dataAtual, opPag);
				break;
			}
			
		}
		
		System.out.println();
		System.out.println("================================================LISTA DE FILMES================================================");
		System.out.println("ULTIMOS LANCAMENTOS: ");
		System.out.println(filme[2]);
		System.out.println(filme[6]);
		System.out.println(filme[7]);
		System.out.println();

		System.out.println("OS FILMES MAIS VISTOS: ");
		System.out.println(filme[1]);
		System.out.println(filme[10]);
		System.out.println(filme[3]);
		System.out.println();

		System.out.println("FILMES MAIS BEM AVALIADOS: ");
		System.out.println(filme[5]);
		System.out.println(filme[6]);
		System.out.println(filme[11]);
		System.out.println("=================================================================================================================");

		int opcao = 0;

		// pesquisa de filme
		while (opcao != 6) {
			System.out.println();
			System.out.printf("Vamos lá!\nDe qual maneira voce quer escolher o filme?\n1. Titulo\n2. Ano\n3. Diretor\n4. Ator\n5. Genero\n6. Sair\n");

			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o titulo do filme: ");
				String t = sc.nextLine();
				int cf = 0;

				for (int i = 0; i < 12; i++) {
					if (t.equalsIgnoreCase(filme[i].getTitulo()) == true) {
						System.out.println("Filme encontrado!");
						System.out.println("Dados do filmes: " + filme[i]);
						System.out.println("Bom filme!");
						System.out.println();
						cf++;
						opcao = 6;
					}
					if (cf == 0) {
						System.out.println("Filme nao encontrado. Refaça sua pesquisa.");
						System.out.println();
					}
				}
				break;

			case 2:
				System.out.print("Digite o ano do filme: ");
				int a = sc.nextInt();
				System.out.print("");

				int ca = 0;

				for (int i = 0; i < 12; i++) {
					if (a == (filme[i].getAno())) {
						System.out.println("Filme encontrado!");
						System.out.println("Dados do filmes: " + filme[i]);
						ca++;
					}
				}

				if (a == 2019) {
					System.out.printf("\nQual dos filmes deseja assistir?\n1: Minha Mãe é Uma Peça 3\n2: O Rei Leão (Live Action)\n");
					int opa = sc.nextInt();

					switch (opa) {
					case 1:
						System.out.printf("\nFilme escolhido: Minha Mãe é Uma Peça 3\nBom filme!\n");
						break;
					case 2:
						System.out.printf("\nFilme escolhido: O Rei Leão (Live Action)\nBom filme!\n");
						break;
					}
				}
				opcao = 6;

				if (ca == 0) {
					System.out.println("Filme nao encontrado. Refaça sua pesquisa.");
					System.out.println();
				}
				break;

			case 3:
				System.out.print("Digite o diretor do filme: ");
				String d = sc.nextLine();

				int cd = 0;

				for (int i = 0; i < 12; i++) {
					if (d.equalsIgnoreCase(filme[i].getDiretor()) == true) {
						System.out.println("Filme encontrado!");
						System.out.println("Dados do filmes: " + filme[i]);
						System.out.println("Bom filme!");
						System.out.println();
						cd++;
						opcao = 6;
					}
				}

				if (cd == 0) {
					System.out.println("Filme nao encontrado. Refaça sua pesquisa.");
					System.out.println();
				}
				break;

			case 4:
				System.out.print("Digite o ator do filme: ");
				String at = sc.nextLine();

				int cat = 0;

				for (int i = 0; i < 12; i++) {
					if (at.equalsIgnoreCase(filme[i].getAtor()) == true) {
						System.out.println("Filme encontrado!");
						System.out.println("Dados do filmes: " + filme[i]);
						System.out.println("Bom filme!");
						System.out.println();
						cat++;
						opcao = 6;

					}
				}

				if (cat == 0) {
					System.out.println("Filme nao encontrado. Refaça sua pesquisa.");
					System.out.println();
				}
				break;

			case 5:
				System.out.print("Digite o genero do filme: ");
				String g = sc.nextLine();

				int cg = 0;

				for (int i = 0; i < 12; i++) {
					if (g.equalsIgnoreCase(filme[i].getGenero()) == true) {
						System.out.println("Filme encontrado!");
						System.out.println("Dados do filmes: " + filme[i]);
						System.out.println("Bom filme!");
						System.out.println();
						cg++;
						opcao = 6;
					}
				}
				
				int opa;
				//condição romance
				if (g.equalsIgnoreCase(filme[0].getGenero()) || g.equalsIgnoreCase(filme[2].getGenero())) {
					System.out.printf("\nQual dos filmes deseja assistir?\n1: Titanic 3\n2: Para Todos os Garotos: Agora e Sempre\n");
					opa = sc.nextInt();

					switch (opa) {
					case 1:
						System.out.printf("\nFilme escolhido: Titanic!\n");
						break;
					case 2:
						System.out.printf("\nFilme escolhido: Para Todos os Garotos: Agora e Sempre\nBom filme!\n");
						break;
					}
				}
				
				//condição ação
				if (g.equalsIgnoreCase(filme[3].getGenero()) || g.equalsIgnoreCase(filme[9].getGenero())) {
					System.out.printf("\nQual dos filmes deseja assistir?\n1: Jogos Vorazes: Em Chamas 3\n2: Jumanji\n");
					opa = sc.nextInt();

					switch (opa) {
					case 1:
						System.out.printf("\nFilme escolhido: Jogos Vorazes: Em Chamas 3!\n");
						break;
					case 2:
						System.out.printf("\nFilme escolhido: Jumanji\nBom filme!\n");
						break;
					}
				}
				
				//condição ficção cientifica
				if (g.equalsIgnoreCase(filme[4].getGenero()) || g.equalsIgnoreCase(filme[8].getGenero())) {
					System.out.printf("\nQual dos filmes deseja assistir?\n1: Jurassic Park\n2: Resident Evil: O Último Capítulo\n");
					opa = sc.nextInt();

					switch (opa) {
					case 1:
						System.out.printf("\nFilme escolhido: Jurassic Park!\n");
						break;
					case 2:
						System.out.printf("\nFilme escolhido: Resident Evil: O Último Capítulo\nBom filme!\n");
						break;
					}
				}
				
				//condição nacional
				if (g.equalsIgnoreCase(filme[6].getGenero()) || g.equalsIgnoreCase(filme[11].getGenero())) {
					System.out.printf("\nQual dos filmes deseja assistir?\n1: Minha Mãe é Uma Peça 3\n2: Central do Brasil\n");
					opa = sc.nextInt();

					switch (opa) {
					case 1:
						System.out.printf("\nFilme escolhido: Minha Mãe é Uma Peça 3!\n");
						break;
					case 2:
						System.out.printf("\nFilme escolhido: Central do Brasil\nBom filme!\n");
						break;
					}
				}
				
				//condição animação
				if (g.equalsIgnoreCase(filme[7].getGenero()) || g.equalsIgnoreCase(filme[10].getGenero())) {
					System.out.printf("\nQual dos filmes deseja assistir?\n1: O Rei Leão (Live Action)\n2: Shrek 2\n");
					opa = sc.nextInt();

					switch (opa) {
					case 1:
						System.out.printf("\nFilme escolhido: O Rei Leão (Live Action)!\n");
						break;
					case 2:
						System.out.printf("\nFilme escolhido: Shrek 2\nBom filme!\n");
						break;
					}
				}

				if (cg == 0) {
					System.out.println("Filme nao encontrado. Refaça sua pesquisa.");
					System.out.println();
				}
				break;

			}

		}

		System.out.println("Obrigado! Até mais.");

		sc.close();

	}
}