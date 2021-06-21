public class Game {
	Joueur [] joueurs;
	int aquiletour;
	Case[] p;
	
	public Game (int n, Plateau p) {
		joueurs = new Joueur[n];
		plateau = p;
	}
	
	public void tourjoueur (Joueur j) {
		t.joueurmouv();
		if (p[j.position] instanceof Property) {
			if (p[j.position].owner != null) {
				j.solde -= p[j.position].loyer(); // à revoir 
				p[j.position].owner.solde += p[j.position].loyer();
			}
	
	
