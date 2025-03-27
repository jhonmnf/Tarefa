package meuprojeto;

public class Codigo12 {
	  public static void main(String[] args) {
	        int alunos = 150;
	        alunos += 50; // Adiciona 50 alunos
	        alunos -= 20; // Remove 20 alunos

	        double notaMedia = 7.5;
	        notaMedia *= 1.04; // Aumenta a nota média em 4%
	        notaMedia /= 1.01; // Reduz a nota média em aproximadamente 1%

	        String curso = "Curso de Python";
	        String melhorAluno = "João";

	        String informacoes = "Curso: " + curso + 
	                             "\nMelhor aluno: " + melhorAluno;

	        System.out.println("Total de alunos: " + alunos);
	        System.out.printf("Nota média final: %.2f\n", notaMedia);
	        System.out.println(informacoes);
	    }
}
