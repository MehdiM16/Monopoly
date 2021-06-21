public class Property extends Case {
	int prix;
	int loyer;
	int apparts; // [0,5]
	Joueur owner;
	
	public Property (String s, int prix, int loyer) {
		super(s);
		this.prix = prix;
		this.loyer = loyer;
		apparts = 0;
		owner = null;
	}
	
	public int loyer () {
		if (owner != null) {
			return loyer*(1+apparts);
		}
		return 0;
	}
	
}
	
	
