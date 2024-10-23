package ds2023;

public class Fleur extends Plantes {
	
	private String couleur;
	private int moisF;
	
	public Fleur(String nom, float hauteur, int age, float prix,String couleur,int moisF) {
		super(nom, hauteur, age, prix);
		this.couleur=couleur;
		this.moisF=moisF;
	}
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getMoisF() {
		return moisF;
	}

	public void setMoisF(int moisF) {
		this.moisF = moisF;
	}

public void description() {
	System.out.println(super.toString()+"couleur"+ couleur+"moisF"+moisF);
	
}
public void fleur() {
	if(this.moisF==4||this.moisF==5||this.moisF==6) {
		System.out.println(this.nom+"est considerée une fleur");
		
	}
	else {System.out.println(this.nom+"n'est pas considerée une fleur");}
}



}
