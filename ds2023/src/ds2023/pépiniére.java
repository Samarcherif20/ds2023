package ds2023;

public class pépiniére {
	private Plantes[]inventaire;
	private final int MAX_PLANTES=100;
	private int nombreDePlantes=0;
	public pépiniére(int taille) {
		if (taille<this.MAX_PLANTES) {
			this.inventaire=new Plantes[taille];
		}
	}
	public void ajoutPlante(Plantes plante) {
		if(this.nombreDePlantes<this.inventaire.length) {
			this.inventaire[this.nombreDePlantes]=plante;
			this.nombreDePlantes++;
		}
		else {
			System.out.println("inventaire complet");
		}
	}
	public void afficherInventaire() {
		  for (int i = 0; i < this.nombreDePlantes; i++) {
			  inventaire[i].description();;
	            
	            if (inventaire[i] instanceof Fleur) {
	                ((Fleur) inventaire[i]).fleur();
	}
	
	
		  }}
	public int totalAbsorptionTotaleCO2() {
	    int t = 0;
	    for (int i = 0; i < this.nombreDePlantes; i++) {
	        if (inventaire[i] instanceof Arabre) {
	            t += ((Arabre) inventaire[i]).absorptionCO2();
	        }
	    }

	    return t;
	}
	public int compterArbresCaduques() {
	    int nb = 0;
	    for (int i = 0; i < this.nombreDePlantes; i++) {
	        if (inventaire[i] instanceof Arabre) {
	        	 if ("Caduque".equals(((Arabre) inventaire[i]).getType_feuillage())) {
	               nb++;
	        }
	    }

	   }
		return nb;}
	public static void main(String[] args) {
	    System.out.println("        Pépinière GREEN HANDS");

	  
	    pépiniére pépinière = new pépiniére(3);


	    Fleur rose = new Fleur(null, 30, 12, 15.99f, "Rouge", 2);
	    Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99f, "Jaune", 4);

	   
	    Arabre chêne = new Arabre("Chêne", 200, 60, 89.99f, "Caduque", 5);
	    Arabre sapin = new Arabre("Sapin", 150, 30, 59.99f, "Persistant", 4);
	    rose.setNom("Rose");
	   
	    System.out.println("La " + rose.getNom() + " a la couleur " + rose.getCouleur());


	    pépinière.ajoutPlante(rose);
	    pépinière.ajoutPlante(tulipe);
	    pépinière.ajoutPlante(chêne);
	    pépinière.ajoutPlante(sapin);

	    pépinière.afficherInventaire();

	  
	    System.out.println("Total absorption CO2: " + pépinière.totalAbsorptionTotaleCO2());

	   
	    System.out.println("Nombre d'arbres caduques dans la pépinière: " + pépinière.compterArbresCaduques());
	}

    

}
