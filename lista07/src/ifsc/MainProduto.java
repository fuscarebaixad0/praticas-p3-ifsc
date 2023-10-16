package ifsc;

import java.util.ArrayList;

public class MainProduto {
	public static void main(String[] args) {
		ArrayList<Desktop> desktops = new ArrayList<>();
		ArrayList<Smartphone> smartphones = new ArrayList<>();

		Desktop desktop1 = new Desktop();
<<<<<<< Updated upstream
		desktop1.setFabricante("Dell");
=======
		desktop1.setFabricante("Acer");
>>>>>>> Stashed changes
		desktop1.setCodBarras(1234567890L);
		desktop1.setGamer(true);
		desktop1.setPecas(new ArrayList<String>());

		Desktop desktop2 = new Desktop();
<<<<<<< Updated upstream
		desktop2.setFabricante("HP");
		desktop2.setCodBarras(9876543210L);
		desktop2.setGamer(false);
		desktop2.setPecas(new ArrayList<String>());

		Desktop desktop3 = new Desktop();
		desktop3.setFabricante("Acer");
		desktop3.setCodBarras(5678901234L);
		desktop3.setGamer(true);
=======
		desktop2.setFabricante("Lenovo");
		desktop2.setCodBarras(9876543210L);
		desktop2.setGamer(true);
		desktop2.setPecas(new ArrayList<String>());

		Desktop desktop3 = new Desktop();
		desktop3.setFabricante("HP");
		desktop3.setCodBarras(5432167890L);
		desktop3.setGamer(false);
>>>>>>> Stashed changes
		desktop3.setPecas(new ArrayList<String>());

		desktops.add(desktop1);
		desktops.add(desktop2);
		desktops.add(desktop3);

		Smartphone smartphone1 = new Smartphone();
<<<<<<< Updated upstream
		smartphone1.setFabricante("Samsung");
		smartphone1.setCodBarras(9876543210L);
		smartphone1.setDimensoesTela("6.2 polegadas");
		smartphone1.setOutraCaracteristica("Resistente à água");

		Smartphone smartphone2 = new Smartphone();
		smartphone2.setFabricante("Apple");
		smartphone2.setCodBarras(5678901234L);
		smartphone2.setDimensoesTela("5.8 polegadas");
		smartphone2.setOutraCaracteristica("Face ID");

		Smartphone smartphone3 = new Smartphone();
		smartphone3.setFabricante("Xiaomi");
		smartphone3.setCodBarras(1234567890L);
		smartphone3.setDimensoesTela("6.5 polegadas");
		smartphone3.setOutraCaracteristica("Bateria de longa duração");
=======
		smartphone1.setFabricante("Apple");
		smartphone1.setCodBarras(1234567890L);
		smartphone1.setDimensoesTela("6.0 polegadas");
		smartphone1.setOutraCaracteristica("Face ID");

		Smartphone smartphone2 = new Smartphone();
		smartphone2.setFabricante("Samsung");
		smartphone2.setCodBarras(9876543210L);
		smartphone2.setDimensoesTela("6.2 polegadas");
		smartphone2.setOutraCaracteristica("Impressão digital");

		Smartphone smartphone3 = new Smartphone();
		smartphone3.setFabricante("Xiaomi");
		smartphone3.setCodBarras(5432167890L);
		smartphone3.setDimensoesTela("6.4 polegadas");
		smartphone3.setOutraCaracteristica("Grande quantidade de armazenamento");
>>>>>>> Stashed changes

		smartphones.add(smartphone1);
		smartphones.add(smartphone2);
		smartphones.add(smartphone3);

		System.out.println("Lista de Desktops:");
		for (Desktop desktop : desktops) {
			System.out.println("Fabricante: " + desktop.getFabricante());
			System.out.println("Código de Barras: " + desktop.getCodBarras());
			System.out.println("Gamer: " + desktop.isGamer());
			System.out.println("Peças: " + desktop.getPecas());
			System.out.println();
		}

		System.out.println("Lista de Smartphones:");
		for (Smartphone smartphone : smartphones) {
			System.out.println("Fabricante: " + smartphone.getFabricante());
			System.out.println("Código de Barras: " + smartphone.getCodBarras());
			System.out.println("Dimensões da Tela: " + smartphone.getDimensoesTela());
			System.out.println("Outra Característica: " + smartphone.getOutraCaracteristica());
			System.out.println();
		}
	}
}