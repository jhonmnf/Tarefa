package meuprojeto;

public class Codigo3 {
	public static void main(String [] args) {
int pontuaçao = 1000;
pontuaçao += 200;
pontuaçao -= 100;

double taxaCambio = 5.25;
taxaCambio *= 1.05; // Aumenta a taxa em 5%
taxaCambio /= 1.1; // Diminui a taxa em aproximadamente 9%

String moeda = "Dólar";
int valorInicial = 50;
double valorConvertido = valorInicial * taxaCambio;

String mensagem = "Valor inicial: " + valorInicial + " " + moeda + 
", Valor convertido: R$ " + String.format("%.2f", valorConvertido);

System.out.println("Pontuação final: " + pontuaçao);
System.out.printf("Taxa de câmbio final: %.2f\n", taxaCambio);
System.out.println(mensagem);
}
}