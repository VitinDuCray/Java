package extras;

public class PrecosItens {
	public static void main(String[] args) {

		int itens = 50;
		float custoPorItem = 9.99f;
		float custoTotal = itens * custoPorItem;
		String moeda = "R$";

		System.out.println("Número de itens: " + itens);
		System.out.println("Custo por item: " + custoPorItem);
		System.out.println("Custo total = " + moeda + custoTotal);
	}
}