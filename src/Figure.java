abstract class Figure {

    protected String nom; 

    public Figure(String nom){
        this.nom = nom;
    }

    abstract float calculerSurface();

    abstract float calculerPerimetre();

    protected void afficher(){
        System.out.println("Je suis une figure de type " + this.nom);
    }





}
