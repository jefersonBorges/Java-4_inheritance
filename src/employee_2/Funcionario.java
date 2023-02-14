package employee_2;

public class Funcionario {
	
	private String nome;
	private String codigo;
	
	public Funcionario(String nome, String codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String toString() {
		return "Funcionario [nome=" + nome + ", codigo=" + codigo + "]";
	}

}
