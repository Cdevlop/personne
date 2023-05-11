public class Personne{
    /* Les propriétés (ou attributs) définies dans une classe correspondent
     * aux caractéristiques des objets qui vont être créés à partir de cette
     * classe.
     */
    private String prenom = "défaut";
    private String nom;
    private int age;

    /** CONSTRUCTEUR
     * Un constructeur est une méthode qui est exécutée quand un objet est instancié.
     * Toutes les classes ont un constructeur par défaut dans Java. Ce constructeur A LE MEME NOM QUE LA CLASSE.
     * Par exempe: Personne p = new Personne();
     * 
     * On peut définir un nouveau constructeur.
     * ⚠ Un constructeur ne DOIT PAS retourner une valeur. Donc il n'y a pas de type avant le nom de la méthode lors de la
     * déclaration. En général, les constructeurs sont utilisés pour initialiser la valeur des propriétés de l'objet. 
     */
    public Personne(String name, String firstname, int old) {
        nom = name;
        prenom = firstname;
        age = old;
    }
    /**
     * Quand on définit un constructeur, le constructeur par défaut n'est plus accessible.
     * Si on veut l'utiliser à nouveau, il faut déclarer un constctructeur sans argument.
     * NB : on peut laisser les{} vides si aucune instruction ne doit être exécutée.
     * PS : on peut déclarer autant de constructeurs que l'on veut
     */
    public Personne() {}

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    /**
     * Une fonction dans une classe est appelée une METHODE. 
     * @return
     */

    public String identite(){
        return this.prenom + " " + this.nom;
    }
    public String identite(boolean vrai){
        return this.prenom + " " + this.nom + ",agé de " + this.age + " ans";
    }

    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public void setPrenom() {
        this.prenom = prenom;
    }
    public void setNom() {
        this.nom = nom;
    }
    public String getNom() {
        return this.nom;
    }
    
  
    
}