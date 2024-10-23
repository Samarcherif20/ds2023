package ds2023;

public class Arabre extends Plantes {
	private String type_feuillage;
	private final  int absorMoyenne;
	public Arabre(String nom, float hauteur, int age, float prix, String type_feuillage, int absorMoyenne) {
		super(nom, hauteur, age, prix);
		this.type_feuillage = type_feuillage;
		this.absorMoyenne = absorMoyenne;}
	public String getType_feuillage() {
		return type_feuillage;
	}

	public void setType_feuillage(String type_feuillage) {
		this.type_feuillage = type_feuillage;
	}

	public int getAbsorMoyenne() {
		return absorMoyenne;
	}
		
	public void description() {
			System.out.println(super.toString( )+"type de feuillage"+ this.type_feuillage);
			
		}
	public double absorptionCO2() {
	        if (hauteur > 5000) {
	            return this.absorMoyenne + 3;
	        }
	        return this.absorMoyenne;}

	
	}
		
		
