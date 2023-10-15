package ifsc;

import java.util.ArrayList;

public class MainProduto {
	public static void main(String[] args) {
		ArrayList<Produto> listaProdutos = new ArrayList<>();

		Produto produto1 = new Produto();
		produto1.setNome("Headphone");
		produto1.setCodBarras(1234567890L);
		produto1.setPreco(49.90);
		produto1.setFornecedor("Magazine Luiza");

		Produto produto2 = new Produto();
		produto2.setNome("Smartphone Iphone XR");
		produto2.setCodBarras(9876543210L);
		produto2.setPreco(1969.99);
		produto2.setFornecedor("Mercado Livre");

		Produto produto3 = new Produto();
		produto3.setNome("Tablet Samsung");
		produto3.setCodBarras(5432167890L);
		produto3.setPreco(1739.90);
		produto3.setFornecedor("Amazon");

		listaProdutos.add(produto1);
		listaProdutos.add(produto2);
		listaProdutos.add(produto3);

		for (Produto produto : listaProdutos) {
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Código de Barras: " + produto.getCodBarras());
			System.out.println("Preço: R$" + produto.getPreco());
			System.out.println("Fornecedor: " + produto.getFornecedor() + "\n");
		}
	}
}
