package meuprojeto;

public class Codigo9 {
	 public static void main(String[] args) {
	        int seguidores = 2000;
	        seguidores += 500; // Adiciona 500 seguidores
	        seguidores -= 200; // Remove 200 seguidores

	        double engajamento = 3.8;
	        engajamento *= 1.05;  // Aumenta o engajamento em 5%
	        engajamento /= 1.02;  // Diminui o engajamento em aproximadamente 2%

	        String perfil = "JavaDev";
	        int posts = 50;
	        double engajamentoFinal = engajamento;

	        String resumo = "Perfil: " + perfil + 
	                        "\nTotal de posts: " + posts + 
	                        "\nEngajamento final: " + String.format("%.2f", engajamentoFinal);

	        System.out.println("Total de seguidores: " + seguidores);
	        System.out.printf("Engajamento final: %.2f\n", engajamento);
	        System.out.println(resumo);
	    }
}
