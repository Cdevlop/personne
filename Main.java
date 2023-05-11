import outils.Personne;
public class Main {
    public static void main(String[] args) {
        /** Lorsque'on déclare une variable de type objet, on dit que l'on fait
         * une INSTANCIATION.
         * Un objet est une INSTANCE d'une classe.
         */
        Personne p = new Personne("Onyme","Anne",50);
        p.prenom = "Anne";
        p.nom = "Onyme";
        p.setAge(50);
        System.out.println("Nom : " + p.nom);
        System.out.println("Prénom : " + p.prenom);
        System.out.println("Age : " + p.getAge());
        System.out.println(p.identite());
        Personne p1 = new Personne("Jean","Cérien");
        // p1.prenom = "jean";
        // p1.nom = "Cérien";
        p1.setAge(25);
        System.out.println("Identité de p1 : " + p1.identite());
        System.out.println("-----------------------------------");

        /*
         * EXERCICES :
         * 1.Déclarer un tableau d'objet Personne.
         * 2. Remplir le tableau avec les données utilisées dans exempleArray.java (cf. ci-dessous)
         * 3. Affichez toutes les identités des personnes (en utilisant la méthode identite()).
         * 4. ajoutez un constructeur qui permet d'instancier 
         *      une personne en définissant directement son prénom, 
         *      son nom et son âge. (Cherchez sur internet ce qu'est un constructeur
         		et comment le déclarer)
         */
        
        
        // Personne p1 = new Personne(null, null, 0);
        Personne[] tableauPersonnes = new Personne[10]; //correction
        for (int i = 0; i < tableauPersonnes.length; i++) {
            tableauPersonnes[i] = new Personne();
        }

        tableauPersonnes[0].prenom = "Gérard";
        tableauPersonnes[0].nom = "Menfin";
        tableauPersonnes[0].setAge(35);
        // tableauPersonnes[1] = new Personne();
        tableauPersonnes[1].prenom = "Nordine";
        tableauPersonnes[1].nom = "Ateur";
        tableauPersonnes[1].setAge(20);

        for (Personne personne : tableauPersonnes) {
            System.out.println(personne.identite() + " " + personne.getAge());
        }
        System.out.println(tableauPersonnes[1].identite());
        /* NULL est un type de données particulier (qu'on peut considérer comme une valeur particulière).
         * Une variable de type objet qui n'as pas été initialisée est considéréé comme étant NULL
         */

        
       
        

       




    }
    
}
