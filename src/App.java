public class App {
    public static void main(String[] args) throws Exception {

        Rectangle r1 = new Rectangle("R1", 12.0f, 2.5f); 

        r1.afficher();
        System.out.println("Surface : " + r1.calculerSurface());
        System.out.println("Périmetre : "+ r1.calculerPerimetre());
        
    }
}
