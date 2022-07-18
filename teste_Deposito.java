package ProjetoBloco1.ProjetoBloco1;

public class teste_Deposito {

	public static void main(String[] args) {
		
		Deposito pedido = new Deposito("Rum", "Montilla", "Pernod Ricard", 50, 35122928, 25);
		pedido.imprimirInfo();
		pedido.taGelada();
		
		Deposito pedido2 = new Deposito("Vodca", "Natasha", "nãofaçoideia", 10, 351229536, 4);
		pedido2.imprimirInfo();
		pedido2.taGelada();
		
	}

}
