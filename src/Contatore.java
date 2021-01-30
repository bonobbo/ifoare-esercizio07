
public class Contatore {

	// Attributi
	private int val;
	
	// Costruttori
	Contatore() { // costruttore di default
		
	}
	
	Contatore(int val) {
		this();
		this.val = val;
	}
	
	Contatore(int val, int inc) {
//		this.val = val;
		this(val);
//		this.val += inc;
		for (int i=0; i < inc; i++) {
			incrementa();
		}
	}
	
	
	// Metodi
	public void incrementa() {
		val = val + 1;
	}
	
	public void decrementa() {
		val--;
	}
	
	public void reset() {
		val =0;
	}
	
	public int getValue() {
		return val;
	}
}
