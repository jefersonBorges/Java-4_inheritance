package employee;

public class Linguagem {
	
	private String linguagem;
	private int experiencia;
	private int rank;
	private Programador programador;
	
	public Linguagem(String linguagem, int experiencia, int rank) {
		
		this.linguagem = linguagem;
		this.experiencia = experiencia;
		this.rank = rank;
	}


	public String getLinguagem() {
		return linguagem;
	}


	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public Programador getProgramador() {
		return programador;
	}


	public void setProgramador(Programador programador) {
		this.programador = programador;
	}

	

}
