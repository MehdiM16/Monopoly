import java.util.ArrayList;

public class Joueur {
	final String name;
	int solde;
	ArrayList<Property> list;
	boolean inHebs;
	int d;
	int position;
	
	public Joueur (String nom) {
		name = nom;
		solde = 15000;
		list = new ArrayList<Property>();
		inHebs = false;
		d = 0;
		position = 0; // case départ
	}
	
	public int howMuchGares () {
		int res = 0;
		for (Property p : list) {
			if (p.isgare == true) {
				res++;
			}
		}
		return res;
	}
	
	public int[] lancer () {
		Random r = new Random();
		int de1 = r.nextInt(7);
		int de2 = r.nextInt(7);
		while (de1 + de2 < 2) {
			de1 = r.nextInt(7);
			de2 = r.nextInt(7);
		}
		int[] res = {de1, de2, de1+de2};
		return res;
	}
	
	public void joueurmouv () {
		int[]t = lancer();
		if (t[0] == t[1]) {
			d++;
			if (d == 3) { inHebs = true; d = 0; }
		}
		position = (position + t[2])%40; // vérifier si c'est pas %39 ou %41
	}
}
