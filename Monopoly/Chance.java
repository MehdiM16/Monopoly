public class Chance extends Case {
    int re; // positive or negative

    public Chance (String s, int n) {
	super(s); // description of the card
	re = n;
    }

    public void execution (Joueur j) {
        if ( re>0 || j.solde>=re ) {
	    j.solde += re;
	}
	else {
	    System.out.println ("Problème, vous ne pouvez pas payer");
	    // Some more code incoming
	}
    }
	
