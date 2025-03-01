package model;

import java.util.ArrayList;

public class Estoque {
	private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    // Método para adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para listar produtos
    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCodigo() + 
                               ", Nome: " + produto.getNome() + 
                               ", Quantidade: " + produto.getQuantidade() + 
                               ", Preço: " + produto.getPreco());
        }
    }

    // Método para atualizar a quantidade de um produto
    public void atualizarQuantidade(int codigo, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produto.setQuantidade(novaQuantidade);
                break;
            }
        }
    }

    // Método para remover um produto
    public void removerProduto(int codigo) {
        produtos.removeIf(produto -> produto.getCodigo() == codigo);
    }

}
