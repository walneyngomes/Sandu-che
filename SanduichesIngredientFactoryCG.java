
public class SanduichesIngredientFactoryCG extends SanduichesIngredientFactory {

	@Override
	public Sanduiche criarSanduiche(String tipo) {
		Sanduiche sanduba = null;
		if ("X-TUDO".equals(tipo)) {
			sanduba = new Xtudo();
		} else if ("Sanduiche Milho".equals(tipo)) {
			sanduba = new MilhoSanduba();
		}
		return sanduba;
	}

}
