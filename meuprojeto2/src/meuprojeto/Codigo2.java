package meuprojeto;

public class Codigo2 {
	   public static void main(String[] args) {
	        int estoque = 150;
	        estoque += 30; // Adiciona 30 unidades
	        estoque -= 50; // Remove 50 unidades

	        double precoUnitario = 29.95;
	        precoUnitario *= 1.1; // Aumenta o preço em 10%
	        precoUnitario /= 2; // Divide o preço pela metade

	        String produto = "Camiseta";
	        int quantidade = 10;
	        double valorTotal = precoUnitario * quantidade;

	        String descricao = "Produto: " + produto + ", Quantidade: " + quantidade + 
	                           ", Valor Total: R$ " + String.format("%.2f", valorTotal);

	        System.out.println("Estoque atual: " + estoque);
	        System.out.printf("Preço unitário final: R$ %.2f\n", precoUnitario);
	        System.out.println(descricao);
	    }
	}

