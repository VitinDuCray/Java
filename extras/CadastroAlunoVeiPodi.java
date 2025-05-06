package extras;

public class CadastroAlunoVeiPodi {
	public static void main(String[]args) {
	
	String divisaoLinha = "__________________________________________";
	String divisaoLinha2 = "____________________________________";
		
	String alunoNome = "Victor Hugo";
	int alunoIdade = 19;
	int alunoId = 24108692;
	String alunoCurso = "Superior de Tecnologia em Análise e Desenvolvimento de Sistemas";
	String alunoSala = "269BKJAVA";
	int alunoSemestre = 3;
	String alunoStatus = "Ativo";
	String alunoGrade = "¬ Apoio Pedagógico Matemática II"
			+ "\n¬ Humanidades - Inteligência Emocional"
			+ "\n¬ Aplicação Mobile em Java"
			+ "\n¬ Java - Quality assurance"
			+ "\n¬ Programação em Java - Banco de Dados"
			+ "\n¬ Programa Extensão II - TI"
			+ "\n";
	
	System.out.println(divisaoLinha);
	System.out.println("Nome do Aluno: " + alunoNome);
	System.out.println("Idade do Aluno: " + alunoIdade);
	System.out.println("Identificação do Aluno: " + alunoId);
	System.out.println(divisaoLinha);
	System.out.println("Curso: " + alunoCurso);
	System.out.println("Status: " + alunoStatus);
	System.out.println("Sala: " + alunoSala);
	System.out.println("Semestre: " + alunoSemestre);
	System.out.println(divisaoLinha);
	System.out.println(divisaoLinha + "\nGrade de Disciplínas:\n" +
						"\n" + alunoGrade + divisaoLinha2);
	}
}
