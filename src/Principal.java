import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner op = new Scanner(System.in);
		
		int opcao;
		Onibus onibus = new Onibus();
		Vendas venda = new Vendas();
		Catraca catraca = new Catraca();
		
		
		do {
			System.out.println("##########################");
			System.out.println("Escolha uma opção abaixo:");
			System.out.println("##########################");
			System.out.println("1 - Ônibus");
			System.out.println("2 - Catraca ");
			System.out.println("3 - Vendas");
			System.out.println("4 - Sair");
			System.out.println("##########################");
			opcao = op.nextInt();

			switch (opcao) {
			case 1:
				onibus.cadastrarOnibus();
			case 2:
				catraca.cadastrarCatraca();
			case 3:
				venda.cadastrarVendas();
			case 4:
				break;
			default:
				System.out.println("Opcão invalida !!!");
			}
		} while (opcao != 4);

	}
		
	}

