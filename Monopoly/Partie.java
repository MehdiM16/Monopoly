import java.util.Scanner;

public class Partie {

	public void jouetour (Joueur j, Property[]tab) {
		j.joueurmouv();
		if (tab[j.position].owner() != null) {
			int n = tab[j.position].loyer()
			j.solde -= n;
		}
		else if (j.position%40 == 30) {
			j.inHebs = true;
			j.position = 10;
		}
		else if (j.position%40 == 0) {
			System
