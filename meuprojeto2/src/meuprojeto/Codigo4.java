package meuprojeto;

public class Codigo4 {
	   public static void main(String[] args) {
	        int temperatura = 25;
	        temperatura += 5; // Aumenta 5 graus
	        temperatura -= 10; // Diminui 10 graus

	        double velocidade = 80.5;
	        velocidade *= 1.2; // Aumenta a velocidade em 20%
	        velocidade /= 1.1; // Diminui a velocidade em aproximadamente 9%

	        String cidade = "São Paulo";
	        int tempo = 3;
	        double distancia = velocidade * tempo;

	        String informacao = "Cidade: " + cidade + 
	                            "\nDistância percorrida: " + String.format("%.2f", distancia) + " km";

	        System.out.println("Temperatura final: " + temperatura + " °C");
	        System.out.printf("Velocidade final: %.2f km/h\n", velocidade);
	        System.out.println(informacao);
	    }
	}


