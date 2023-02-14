package employee;

public class Programador extends Funcionario {
	
	private Linguagem linguagem1;
	private Linguagem linguagem2;
	private Linguagem linguagem3;
	
	public Programador(String nome, String cpf, String rg, int idade, int matricula, Linguagem linguagem1,
			Linguagem linguagem2, Linguagem linguagem3) {
		super(nome, cpf, rg, idade, matricula);
		this.linguagem1 = linguagem1;
		this.linguagem2 = linguagem2;
		this.linguagem3 = linguagem3;
	}

	public Linguagem getLinguagem1() {
		return linguagem1;
	}

	public void setLinguagem1(Linguagem linguagem1) {
		this.linguagem1 = linguagem1;
		linguagem1.setProgramador(this);
	}

	public Linguagem getLinguagem2() {
		return linguagem2;
	}

	public void setLinguagem2(Linguagem linguagem2) {
		this.linguagem2 = linguagem2;
		linguagem2.setProgramador(this);
	}

	public Linguagem getLinguagem3() {
		return linguagem3;
	}

	public void setLinguagem3(Linguagem linguagem3) {
		this.linguagem3 = linguagem3;
		linguagem3.setProgramador(this);
	}
	
	
}
