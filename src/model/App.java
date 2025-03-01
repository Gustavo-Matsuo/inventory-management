package model;

import java.util.Scanner;
import model.*;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Estoque estoque = new Estoque();
		
		while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Remover Produto");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer

            if (opcao == 1) {
                // Adicionar produto
                System.out.print("Digite o código do produto: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();  // Limpa o buffer

                System.out.print("Digite o nome do produto: ");
                String nome = scanner.nextLine();

                System.out.print("Digite a quantidade do produto: ");
                int quantidade = scanner.nextInt();

                System.out.print("Digite o preço do produto: ");
                double preco = scanner.nextDouble();

                Produto produto = new Produto();
                produto.setCodigo(codigo);
                produto.setNome(nome);
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);

                estoque.adicionarProduto(produto);
                System.out.println("Produto adicionado com sucesso!");

            } else if (opcao == 2) {
                // Listar produtos
                estoque.listarProdutos();

            } else if (opcao == 3) {
                // Atualizar quantidade
                System.out.print("Digite o código do produto: ");
                int codigo = scanner.nextInt();

                System.out.print("Digite a nova quantidade: ");
                int novaQuantidade = scanner.nextInt();

                estoque.atualizarQuantidade(codigo, novaQuantidade);
                System.out.println("Quantidade atualizada com sucesso!");

            } else if (opcao == 4) {
                // Remover produto
                System.out.print("Digite o código do produto para remover: ");
                int codigo = scanner.nextInt();

                estoque.removerProduto(codigo);
                System.out.println("Produto removido com sucesso!");

            } else if (opcao == 5) {
                // Sair do programa
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }

}


