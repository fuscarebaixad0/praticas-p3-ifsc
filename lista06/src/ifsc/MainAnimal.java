package ifsc;

public class MainAnimal {

	public static void main(String[] args) {

		Gato gato = new Gato();
		gato.setComprimento(47f);
		gato.setCor("Laranja");
		gato.setEcossistema("Doméstico(casa)");
		gato.setNome("Garfield");
		gato.setNumeroDePatas(4);
		gato.setRaca("Persa");

		Cachorro cachorro = new Cachorro();
		cachorro.setComprimento(98f);
		cachorro.setCor("Preto");
		cachorro.setEcossistema("Domético(casa)");
		cachorro.setNome("Negão");
		cachorro.setNumeroDePatas(4);
		cachorro.setRaca("Rottweiler");

		System.out.println("CACHORRO");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Comprimento: " + cachorro.getComprimento());
		System.out.println("Cor: " + cachorro.getCor());
		System.out.println("Ecossistema: " + cachorro.getEcossistema());
		System.out.println("Numero de patas: " + cachorro.getNumeroDePatas());
		System.out.println("Raça: " + cachorro.getRaca());
		cachorro.late();
		cachorro.caminha();

		System.out.println("GATO");
		System.out.println("Nome: " + gato.getNome());
		System.out.println("Comprimento: " + gato.getComprimento());
		System.out.println("Cor: " + gato.getCor());
		System.out.println("Ecossistema: " + gato.getEcossistema());
		System.out.println("Numero de patas: " + gato.getNumeroDePatas());
		System.out.println("Raça: " + gato.getRaca());
		gato.mia();
		gato.caminha();
	}
}
