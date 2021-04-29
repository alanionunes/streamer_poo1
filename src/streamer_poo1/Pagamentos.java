package streamer_poo1;

import java.util.Calendar;
import java.util.Date;

public class Pagamentos {

	static Calendar cal = Calendar.getInstance();
	
	public static void formaPagamento(Date dataAtual, int op) {
		String x = null;
		
		if(op == 1) {
			x = "CARTAO DE CREDITO";
		}
		
		if(op == 2) {
			x = "CARTAO DE DEBITO";
		}
		
		if(op == 3) {
			x = "BOLETO";
		}
		
		if(op == 4) {
			x = "CARTAO PRE PAGO";
		}
		
		if(op == 5) {
			x = "TED";
		}
		
		if(op == 6) {
			x = "PIX";
		}
		
		cal.setTime(dataAtual);
		System.out.println("Meio da pagamento: " + x);
		System.out.println("Status: Pagamento aprovado!");
		cal.add(Calendar.DAY_OF_MONTH, 30);
		Date novaDataVenc1 = cal.getTime();
		AlterarDadosCliente.editDataVencimento(novaDataVenc1);
	}
}
