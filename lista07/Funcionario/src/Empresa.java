import java.util.ArrayList;

public class Empresa {
	private static int TAM_MAX = 50;
	private Enderešo enderešo;
	ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	private Cliente[] clientes;

	
	public Empresa(Enderešo enderešo, ArrayList<Funcionario> listaFuncionario, Cliente[] clientes) {
		super();
		this.enderešo = enderešo;
		this.listaFuncionario = listaFuncionario;
		this.clientes = clientes;
	}

	public static int getTAM_MAX() {
		return TAM_MAX;
	}

	public static void setTAM_MAX(int tAM_MAX) {
		TAM_MAX = tAM_MAX;
	}

	public Enderešo getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(Enderešo enderešo) {
		this.enderešo = enderešo;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public void addFuncionario(Funcionario f) {
		this.listaFuncionario.add(f);
	}

	public void removeFuncionario(Funcionario f) {
		this.listaFuncionario.remove(f);
	}

}
