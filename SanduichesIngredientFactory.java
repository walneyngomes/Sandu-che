
public abstract class SanduichesIngredientFactory {

	public Sanduiche obterSanduba(String tipo) {
		Sanduiche iche = criarSanduiche(tipo);
		iche.colocarCarne();
		iche.colocarMolho();
		iche.colocarVerduras();

		return iche;
	}

	public abstract Sanduiche criarSanduiche(String tipo);

}
