public class Rectangle extends Figure{

    private float longueur;
    private float largeur;

    

    public Rectangle(String nom, float longueur, float largeur){
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public float calculerSurface(){

        return this.longueur * this.largeur;

    }

    @Override
    public float calculerPerimetre(){

        return (this.longueur + this.largeur) * 2;

    }

    @Override
    public void afficher(){
        System.out.println("Je suis un rectanble");
    }

    
}
