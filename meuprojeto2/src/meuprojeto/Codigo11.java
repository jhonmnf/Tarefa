package meuprojeto;

public class Codigo11 {
public static void main(String[] args) {
	int vendas = 100;
	vendas += 30; // Adiciona 30
	vendas -= 10; // Subtrai 10
	
	double preçomedio = 20.00;
	preçomedio *= 0.95;
	preçomedio /= 1.03;
	
	String produto = "produto ABC";
	int estoque = 500;
	double receitatotal = preçomedio * vendas;
	
	String resumo = "Produto: " + produto + ", receitatotal: R$" + receitatotal;

    System.out.println("Total de vendas: " + vendas);
    System.out.printf("Preço médio final: R$ %.2f\n", preçomedio);
    System.out.println(resumo);
}
}
