package meuprojeto;

public class Codigo10 {
	  public static void main(String[] args) {
	        int participantes = 300;
	        participantes += 75; // Adiciona 75 participantes
	        participantes -= 25; // Remove 25 participantes

	        double taxaInscricao = 58.90;
	        taxaInscricao *= 1.06; // Aumenta a taxa de inscrição em 6%
	        taxaInscricao /= 1.02; // Reduz a taxa em aproximadamente 2%

	        String evento = "Workshop de Java";
	        int vagas = 100;
	        double valorTotal = taxaInscricao * participantes;

	        String informacoes = "Evento: " + evento + 
	                             "\nTotal de vagas: " + vagas + 
	                             "\nValor total arrecadado: R$ " + String.format("%.2f", valorTotal);

	        System.out.println("Total de participantes: " + participantes);
	        System.out.printf("Taxa de inscrição final: R$ %.2f\n", taxaInscricao);
	        System.out.println(informacoes);
	    }
}
