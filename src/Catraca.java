import java.util.ArrayList;
import java.util.Scanner;

public class Catraca {
	private int codigoCatraca;
	private String fabricante;
	private int valorLeitura = 0;
	Principal p = new Principal();
	static ArrayList<Catraca> catracas = new ArrayList<Catraca>();

	public int getCodigoCatraca() {
		return codigoCatraca;
	}

	public void girarCatraca() {
		this.valorLeitura++;
	}

	public void setCodigoCatraca(int codigoCatraca) {
		this.codigoCatraca = codigoCatraca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String frabricante) {
		this.fabricante = frabricante;
	}

	public int getValorLeitura() {
		return valorLeitura;
	}

	public void setValorLeitura(int valorLeitura) {
		this.valorLeitura = valorLeitura;
	}

	public void cadastrarCatraca() {
		int opcao2;

		Catraca catraca2 = new Catraca();
		Scanner entrada2 = new Scanner(System.in);
		do {
			System.out.println("##########################");
			System.out.println("Escolha uma opção para Catraca:");
			System.out.println("##########################");
			System.out.println("1 - Incluir catraca");
			System.out.println("2 - Consultar catraca ");
			System.out.println("3 - Alterar catraca");
			System.out.println("4 - Excluir Catraca");
			System.out.println("5 - Sair");
			System.out.println("##########################");
			opcao2 = entrada2.nextInt();

			switch (opcao2) {
			case 1:
				incluirCatraca();
				break;
			case 2:
				consultarCatraca();
			case 3:
				alterarCatraca();
				break;
			// case 4:ExcluirCatraca();
			case 5:
				p.main(null);
				break;
			default:
				System.out.println("Opcão invalida !!!");
			}
		} while (opcao2 != 5);
	}

	public void incluirCatraca() {
		Catraca catraca = new Catraca();
		Scanner entrada = new Scanner(System.in);
		String mensagem;

		System.out.println("Código da catraca?");
		catraca.setCodigoCatraca(entrada.nextInt());

		System.out.println("Valor de leitura da catraca?");
		catraca.setValorLeitura(entrada.nextInt());

		System.out.println("Nome do fabricante da catraca?");
		catraca.setFabricante(entrada.next());

		catracas.add(catraca);
		System.out.println("Catracas adicionadas: " + catracas.size());

	}

	public Catraca alterarCatraca() {

		Catraca catraca = new Catraca();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Código da catraca? ");
		int c = entrada.nextInt();
		int posicao = 0;
		boolean achou = false;
		for (int i = 0; i < catracas.size(); i++) {
			if (catracas.get(i).codigoCatraca == (c)) {
				catraca.setCodigoCatraca(c);
				achou = true;
				posicao = i;
			}
		}
		if (achou) {
			catraca.setCodigoCatraca(c);

			System.out.println("Valor de leitura da catraca?");
			catraca.setValorLeitura(entrada.nextInt());

			System.out.println("Nome do fabricante da catraca?");
			catraca.setFabricante(entrada.next());

			System.out.println("Mudança realizada!!");
		} else {
			System.out.println("Catraca não cadastrada");
		}
		return catraca;

	}

	public void consultarCatraca() {
		if (catracas.isEmpty()) {
			System.out.println("Nao ha catracas \n");
		}

		Catraca catraca = new Catraca();
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha 1 para catraca específica ou 2 para todas as catracas");
		int entrada0 = sc.nextInt();
		if (entrada0 == 2) {
			int entrada = sc.nextInt();
			for (Catraca c : catracas) {
				System.out.println("Código da catraca: " + c.getCodigoCatraca());
				System.out.println("Nome do fabricante: " + c.getFabricante());
				System.out.println("Valor da leitura da catraca: " + c.getValorLeitura());
			}
			/*if(entrada0 == 1) {
				System.out.println("Digite o codigo da catraca para consulta..");
				entrada1= 
			}*/

		}

	}
}
