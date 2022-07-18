package domain;

public class Agir {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		Mamifero m = new Mamifero();
		Lobo k = new Lobo();
		/*c.emitirSom();
		m.emitirSom();
		k.emitirSom();*/

	/*	c.reagir("Olá");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(21, 00); 
		c.reagir(false);
		c.reagir(true); */
		c.reagir(2, 12.45f);
		c.reagir(17, 4.5f);
	}

}
