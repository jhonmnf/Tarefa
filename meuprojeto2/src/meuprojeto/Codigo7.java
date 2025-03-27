package meuprojeto;

public class Codigo7 {
	 public static void main(String[] args) {
	        int downloads = 10000;
	        downloads += 2000; // Adiciona 2000 downloads
	        downloads -= 1000; // Remove 1000 downloads

	        double avaliacao = 4.5;
	        avaliacao *= 1.02; // Aumenta a avaliação em 2%
	        avaliacao /= 1.01; // Diminui a avaliação em aproximadamente 1%

	        String aplicativo = "JavaApp";
	        int versao = 3;
	        double notaFinal = avaliacao;

	        String informacoes = "Aplicativo: " + aplicativo + 
	                             "\nVersão: " + versao + 
	                             "\nAvaliação final: " + String.format("%.2f", notaFinal);

	        System.out.println("Total de downloads: " + downloads);
	        System.out.printf("Avaliação final: %.2f\n", avaliacao);
	        System.out.println(informacoes);
	    }
}
