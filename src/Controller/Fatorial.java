package Controller;

public class Fatorial {
	
	public Fatorial() {
		super();
		}

	public int Fat (int N) {
		if (N!=1) { // pois o fatorial de 1 é sempre 1.
			return N*Fat(N-1); 
		} else {
			return 1; // resultado de 1!
		}
	}
}