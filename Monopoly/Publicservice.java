public Publicservice extends Property { // gares, EDF, Gaz
	boolean isgare;
	
	public Publicservice (String s, int prix, int loyer, boolean g) {
		super(s, prix, loyer);
		isgare = g;
	}
	
	public int loyer () {
		if (isgare) {
			return 100*howMuchGares(owner);
		}
		else return 150;
	}
	
}
