package meuprojeto;

public class Codigo8 {
    public static void main(String[] args) {
        int visualizacoes = 5000;
        visualizacoes += 1000; // Adiciona 1000 visualizações
        visualizacoes -= 500;  // Remove 500 visualizações

        double receita = 150.75;
        receita *= 1.1;  // Aumenta a receita em 10%
        receita /= 1.05; // Diminui a receita em aproximadamente 5%

        String video = "Java para Iniciantes";
        int duracao = 10;
        double receitaFinal = receita;

        String detalhes = "Vídeo: " + video + 
                          "\nDuração: " + duracao + " min" + 
                          "\nReceita final: R$ " + String.format("%.2f", receitaFinal);

        System.out.println("Total de visualizações: " + visualizacoes);
        System.out.printf("Receita final: R$ %.2f\n", receita);
        System.out.println(detalhes);
    }
}
