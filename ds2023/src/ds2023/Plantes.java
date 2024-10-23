package ds2023;

public class Plantes {
	protected String nom;
	protected float hauteur;
	protected int age;
	protected float prix;
	public Plantes(String nom, float hauteur, int age, float prix) {
		super();
		this.nom = nom;
		this.hauteur = hauteur;
		this.age = age;
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getHauteur() {
		return hauteur;
	}

	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String toString() {
		return "Plantes [nom=" + nom + ", hauteur=" + hauteur + ", age=" + age + ", prix=" + prix + "]";
	}
	 public void description() {
	        System.out.println(toString());
	

}

	
	 }
