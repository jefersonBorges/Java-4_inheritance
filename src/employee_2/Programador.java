package employee_2;

import java.util.ArrayList;

public class Programador extends Funcionario {

	private ArrayList<String> linguagens;
	private ArrayList<Integer> tempoDeExperiencia;

	public Programador(String nome, String codigo) {
		super(nome, codigo);
		this.linguagens = new ArrayList<String>();
		this.tempoDeExperiencia = new ArrayList<Integer>();
	}

	public ArrayList<String> getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(ArrayList<String> linguagens) {
		this.linguagens = linguagens;
	}

	public void setLinguagens(String linguagem1, String linguagem2, String linguagem3) {
		
		linguagens.add(linguagem1);
		linguagens.add(linguagem2);
		linguagens.add(linguagem3);

	}
	
	public void setLinguagem(int posicao, String linguagem, int tempoDeExperiencia) {
		if ( posicao >= 0 && posicao < linguagens.size() ) {
			this.linguagens.set(posicao, linguagem);
			this.tempoDeExperiencia.set(posicao, tempoDeExperiencia);
		}
	}

	private void setTemposDeExperiencia(ArrayList<Integer> tempoDeExperiencia) {
		this.tempoDeExperiencia = tempoDeExperiencia;
		
	}

	public void setTemposDeExperiencia(int tempoDeExperiencia1, int tempoDeExperiencia2, int tempoDeExperiencia3) {

		ArrayList<Integer> tempoDeExperiencia = new ArrayList<Integer>();
		
		tempoDeExperiencia.add(tempoDeExperiencia1);
		tempoDeExperiencia.add(tempoDeExperiencia2);
		tempoDeExperiencia.add(tempoDeExperiencia3);
		
		this.setTemposDeExperiencia(tempoDeExperiencia);
	}
	
	public String toString() {
		return super.toString() + " Programador [linguagens=" + linguagens + "]";
	}

}
