import java.util.ArrayList;
import java.util.Scanner;

public class Vendas {
	private String codigo;
	private int valor;
	private Onibus linha;
	Principal p = new Principal();
	static ArrayList<Vendas> venda = new ArrayList<Vendas>();

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/*public Onibus getCodigoOnibus() {
		return codigoOnibus;
	}

	public void setCodigoOnibus(Onibus codigoOnibus) {
		this.codigoOnibus = codigoOnibus;
	}*/

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void cadastrarVendas() {
		Scanner entrada1 = new Scanner(System.in);
		Principal p1 = new Principal();
		int opcao1;
		do {
			System.out.println("Escolha uma opção para venda:");
			System.out.println("##########################");
			System.out.println("1 - Incluir venda");
			System.out.println("2 - Consultar venda(s)");
			System.out.println("3 - Alterar venda(s)");
			System.out.println("4 - Excluir venda(s)");
			System.out.println("5 - Sair");
			System.out.println("##########################");
			opcao1 = entrada1.nextInt();

			switch (opcao1) {
			case 1:incluirVenda();
			case 2:consultarVenda();
			// case 3:AlterarVendas;
			// case 4:Excluirvendas();
			case 5:
				p1.main(null);
				break;
			default:
				System.out.println("Opcão invalida !!!");
			}
		} while (opcao1 != 5);
	}

	public Onibus getLinha() {
		return linha;
	}

	public void setLinha(Onibus linha) {
		this.linha = linha;
	}
	
	public void incluirVenda() {

		Vendas vendas = new Vendas();
		Onibus bus = new Onibus();
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Codigo do ônibus?");
		bus.setCodigoOnibus(entrada.nextLine());
		
		System.out.println("Codigo da venda");
		vendas.setCodigo(entrada.next());
		
		
		System.out.println("Valor da venda");
		vendas.setValor(entrada.nextInt());
		
		System.out.println("Linha do Onibus");
		vendas.setLinha(bus);
		
		
		venda.add(vendas);

		if (venda.size() > 0) {
			System.out.println("Vendas cadastradas " + venda.size());
		}

		
	}
	public void consultarVenda() {
		Scanner sc = new Scanner(System.in);
		Onibus bus = new Onibus();
		
		System.out.println("Você quer:\n1 - consultar uma venda em específico\n2 - todas as vendas");
		int a = sc.nextInt();
		if (a == 2) {
			for(Vendas b:venda) {
				
				System.out.println("==============================");
				System.out.println("Codigo da venda: "+b.getCodigo());
				System.out.println("Valor da venda: "+b.getValor());
				System.out.println("Linha do ônibus: "+b.getLinha());
				System.out.println("==============================");
			}
		}
	}

	

}
