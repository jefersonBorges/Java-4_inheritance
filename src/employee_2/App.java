package employee_2;

public class App {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Marilia", "567890");
		Funcionario f2 = new Funcionario("Gabriela", "098765");

		Programador p1 = new Programador("Rodrigo", "12345");
		Programador p2 = new Programador("Rafael", "54321");
		
		System.out.println(f1.toString());
		System.out.println(p1.toString());
		
		System.out.println(f2.toString());
		System.out.println(p2.toString());
		
		p1.setLinguagens("Java","Shell Script","Python");
		p1.setTemposDeExperiencia(10,15,3);

		System.out.println(p1.toString());

		p1.setLinguagem(5, "Lua", 2);
	}

}
