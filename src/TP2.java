import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TP2 {
    public static void main(String[] args) {
        try {
            Class cEtudiant = Class.forName("Etudiant");
            Constructor[] etudiantConstructors = cEtudiant.getConstructors();

            // new etudiant :
            Object etudiant = cEtudiant.getConstructor(String.class, String.class).newInstance("OULHACI", "Yanis");

            // Récupération des méthodes get
            Method method = cEtudiant.getDeclaredMethod("getName", null);
            Method method2 = cEtudiant.getDeclaredMethod("getLastname", null);

            System.out.println(etudiant);

            // Invoquer les méthode sur l'objet etudiant
            method.invoke(etudiant);
            method2.invoke(etudiant);

            // Récupérer les element returner par les méthodes
            String nomEtudiant = (String) method.invoke(etudiant);
            String prenomEtudiant = (String) method2.invoke(etudiant);

            // Afficher les donnée récupéré
            System.out.print("Le nom complet de l'étudiant : ");
            System.out.println(nomEtudiant + " " + prenomEtudiant);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
