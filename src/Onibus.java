import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Onibus {

	private String codigoOnibus;
	private String empresa;
	private int catraca;
	static ArrayList<Onibus> onibuss = new ArrayList<Onibus>();

	public String getCodigoOnibus() {
		return codigoOnibus;
	}

	public void setCodigoOnibus(String codigoOnibus) {
		this.codigoOnibus = codigoOnibus;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getCatraca() {
		return catraca;
	}

	public void setCatraca(int catraca) {
		this.catraca = catraca;
	}

	public void cadastrarOnibus() {
		int opcao;
		Onibus onibuss = new Onibus();
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Escolha uma opção para Onibus:");
			System.out.println("##########################");
			System.out.println("1 - Incluir ");
			System.out.println("2 - Alterar  ");
			System.out.println("3 - Consultar ");
			System.out.println("4 - Excluir ");
			System.out.println("5 - Sair");
			System.out.println("##########################");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				onibuss.incluirOnibus();
				break;
			case 2:
				onibuss.alterarOnibus();
				break;
			case 3:
				onibuss.consultarOnibus();
				break;
			case 4:
				onibuss.excluirOnibus();
				break;
			case 5:
				;
				break;
			default:
				System.out.println("Opcão invalida !!!");
			}
		} while (opcao != 5);
	}

	public void incluirOnibus() {
		Onibus novoOnibus = new Onibus();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Codigo do ônibus?");
		novoOnibus.setCodigoOnibus(entrada.nextLine());
		System.out.println("Empresa do ônibus?");
		novoOnibus.setEmpresa(entrada.nextLine());
		System.out.println("Número da catraca do ônibus?");
		novoOnibus.setCatraca(entrada.nextInt());
		onibuss.add(novoOnibus);

		if (onibuss.size() > 0) {
			System.out.println("Onibus cadastrados " + onibuss.size());
		}

	}

	public Onibus alterarOnibus() {
		Onibus bus = new Onibus();

		System.out.println("Codigo do onibus: ");
		Scanner entrada = new Scanner(System.in);

		String c = entrada.nextLine();
		boolean achou = false;
		int posicao = 0;

		for (int i = 0; i < onibuss.size(); i++) {
			if (onibuss.get(i).codigoOnibus.equals(c)) {
				achou = true;
				posicao = i;
			}
		}
		if (achou) {

			bus.setCodigoOnibus(c);

			System.out.println("Nome da empresa?");
			bus.setEmpresa(entrada.nextLine());

			System.out.println("Catraca do onibus?");
			bus.setCatraca(entrada.nextInt());

			onibuss.set(posicao, bus);

		} else {
			// System.out.println(achou);
			System.out.println("Onibus não cadastrado!");
		}

		return bus;

	}

	public void consultarOnibus() {
		Onibus busaoo = new Onibus();
		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"Digite 1 para mostrar todos os ônibus cadastrados \nDigite 2 para pesquisar um ônibus em específico");
		int bus = entrada.nextInt();

		if (onibuss.isEmpty()) {
			System.out.println("Nao ha onibus \n");
		}

		else if (bus == 1) {
			for (Onibus b : onibuss) {
				System.out.println("---------------------------------------");
				System.out.println("Codigo do onibus: " + b.getCodigoOnibus());
				System.out.println("Empresa do onibus: " + b.getEmpresa());
				System.out.println("Numero da catraca do ônibus: " + b.getCatraca());
				System.out.println("---------------------------------------");
				System.out.println("");
			}
		}

		else if (bus == 2) {

			System.out.println("Código do ônibus?");
			String c = entrada.next();
			// entrada.nextLine();

			for (Onibus b : onibuss) {
				if (c.equals(b.getCodigoOnibus())) {
					System.out.println("---------------------------------------");
					System.out.println("Código do Ônibus: " + b.getCodigoOnibus());
					System.out.println("Valor da catraca: " + b.getCatraca());
					System.out.println("Nome da empresa: " + b.getEmpresa());
					System.out.println("---------------------------------------");
				}
			}

		}
	}

	public void excluirOnibus() {
		Scanner entrada = new Scanner(System.in);
		Onibus bus = new Onibus();

		if (onibuss.isEmpty()) {
			System.out.println("Nao ha onibus \n");

		} else {
			System.out.println("Qual onibus quer remover");
			String teste = entrada.nextLine();

			for (int q = 0; q < onibuss.size(); q++) {
				if (onibuss.get(q).codigoOnibus.equals(teste)) {
					onibuss.remove(q);
					System.out.println("alo");

				}
			}
			/*
			 * for (int i = 0; i < onibuss.size(); i++) { onibuss.equals(codigoOnibus);
			 * onibuss.remove(teste); }
			 */
		}
		System.out.println("Numeros de onibus: " + onibuss.size());
		return;
	}

}
