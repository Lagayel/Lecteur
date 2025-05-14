import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("TestExercice3.txt");
        int totalMots = 0;

        try {
            Scanner fileScanner = new Scanner(file);

            // Exemple de lecture
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                // Séparation par espace
                String[] mots = line.split("\\s+");
                // Comptage des mots
                int nbrMots = mots.length;
                // Ajout au total
                totalMots += nbrMots;


            }

            // Affichage du total
            System.out.println("Nombre total de mots dans le fichier : " + totalMots);

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé : ");
        }


    }
}