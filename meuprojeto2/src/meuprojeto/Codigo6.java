package meuprojeto;

public class Codigo6 {
	 public static void main(String[] args) {
	        int paginas = 300;
	        paginas += 50; // Adiciona 50 páginas
	        paginas -= 25; // Remove 25 páginas

	        double precoLivro = 45.90;
	        precoLivro *= 1.15; // Aumenta o preço em 15%
	        precoLivro /= 1.05; // Diminui o preço em aproximadamente 5%

	        String livro = "Aventuras de Java";
	        int edicao = 2;
	        double valorFinal = precoLivro;

	        String detalhes = "Livro: " + livro + 
	                          "\nEdição: " + edicao + 
	                          "\nPreço final: R$ " + String.format("%.2f", valorFinal);

	        System.out.println("Total de páginas: " + paginas);
	        System.out.printf("Preço do livro: R$ %.2f\n", precoLivro);
	        System.out.println(detalhes);
	    }
	}

