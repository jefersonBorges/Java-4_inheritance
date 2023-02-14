package employee;
public class App {
	
	public static void main (String[] args) {
		
		Linguagem l1 = new Linguagem("Java", 2, 1);
		Linguagem l2 = new Linguagem("Phyton", 5, 2);
		Linguagem l3 = new Linguagem("C", 4, 3);

		
		Programador programador1 = new Programador("Jeferson","111111111-11", "1111111111", 32, 123456, l1, l2, l3);
		l1.setProgramador(programador1);
		l2.setProgramador(programador1);
		l3.setProgramador(programador1);
		
		System.out.println(
							"\nNome: "+programador1.getNome()
							+"\nCPF: "+programador1.getCpf()
							+"\nRG: "+programador1.getRg()
							+"\nIdade: "+programador1.getIdade()
							+"\nMatricula: "+programador1.getMatricula()
							+"\nLinguagem #1: "+programador1.getLinguagem1().getLinguagem()
							+"\nLinguagem #2: "+programador1.getLinguagem2().getLinguagem()
							+"\nLinguagem #3: "+programador1.getLinguagem3().getLinguagem()
				
							);
		
		Linguagem l4 = new Linguagem("Phyton", 8, 1);
		Linguagem l5 = new Linguagem("C", 10, 2);
		Linguagem l6 = new Linguagem("Java", 4, 3);

		
		Programador programador2 = new Programador("Borges","222222222-22", "2222222222", 33, 7891011, l4, l5, l6);
		l4.setProgramador(programador2);
		l5.setProgramador(programador2);
		l6.setProgramador(programador2);
		
		System.out.println(
							"\nNome: "+programador2.getNome()
							+"\nCPF: "+programador2.getCpf()
							+"\nRG: "+programador2.getRg()
							+"\nIdade: "+programador2.getIdade()
							+"\nMatricula: "+programador2.getMatricula()
							+"\nLinguagem #1: "+programador2.getLinguagem1().getLinguagem()
							+"\nLinguagem #2: "+programador2.getLinguagem2().getLinguagem()
							+"\nLinguagem #3: "+programador2.getLinguagem3().getLinguagem()
				
							);
		
		System.out.println(
							"\nNome: "+programador1.getNome()
							+"\nMatricula: "+programador1.getMatricula()
							+"\nLinguagem #1: "+programador1.getLinguagem1().getLinguagem() 
							+", Experiencia: "+programador1.getLinguagem1().getExperiencia() + " Anos"
							+"\nLinguagem #2: "+programador1.getLinguagem2().getLinguagem()
							+", Experiencia: "+programador1.getLinguagem2().getExperiencia() + " Anos"
							+"\nLinguagem #3: "+programador1.getLinguagem3().getLinguagem()
							+", Experiencia: "+programador1.getLinguagem3().getExperiencia() + " Anos"
				
							);
		System.out.println(
							"\nNome: "+programador2.getNome()
							+"\nMatricula: "+programador2.getMatricula()
							+"\nLinguagem #1: "+programador2.getLinguagem1().getLinguagem() 
							+", Experiencia: "+programador2.getLinguagem1().getExperiencia() + " Anos"
							+"\nLinguagem #2: "+programador2.getLinguagem2().getLinguagem()
							+", Experiencia: "+programador2.getLinguagem2().getExperiencia() + " Anos"
							+"\nLinguagem #3: "+programador2.getLinguagem3().getLinguagem()
							+", Experiencia: "+programador2.getLinguagem3().getExperiencia() + " Anos"
	
							);
		
		System.out.println(
							"\nNome: "+programador1.getNome()
							+", Matricula: "+programador1.getMatricula() + " | "
							+ "Nome: "+programador2.getNome()
							+", Matricula: "+programador2.getMatricula()
							+"\n Java: " + l1.getExperiencia()  + " Anos" + " | "
							+ l6.getExperiencia()  + " Anos"
							+"\n Phyton: " + l2.getExperiencia()  + " Anos" + " | "
							+ l4.getExperiencia()  + " Anos"
							+"\n C: " + l3.getExperiencia()  + " Anos" + " | "
							+ l5.getExperiencia()  + " Anos"
							
							);
		
	}

}
