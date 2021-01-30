
public class Prova {

	public static void main(String[] args) {
		//istanzio un oggetto contatore
		Contatore c1 = new Contatore();
		Contatore c2 = new Contatore(100);
		
		c1.incrementa(); //1
		c1.incrementa(); //2
		
		c1.decrementa(); //1
		
		System.out.println("c1 vale: " + c1.getValue());
		System.out.println("c2 vale: " + c2.getValue());
		
		c2.reset();

		System.out.println("c1 vale: " + c1.getValue());
		System.out.println("c2 vale (dopo reset): " + c2.getValue());
		
//		System.out.println("c2 vale (dopo reset): " + c2.val);
		
//		c2.val = -100;
	}

}
