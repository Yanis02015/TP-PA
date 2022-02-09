import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TP1 {
    public static void main(String[] args) {
        System.out.println("La liste des interfaces de l'objet String sont : ");
        Class c = new String().getClass();
        Class[] faces = c.getInterfaces();
        System.out.println("+ Nombre d'interfaces : " + faces.length);
        for (Class face : faces) {
            //System.out.println("-- " + face);
        }

        System.out.println("\nLa liste des méthodes de l'objet String sont : ");

        Method[] methods = c.getMethods();
        System.out.println("+ Nombre de méthodes : " + methods.length);
        for (Method method : methods) {
            //System.out.println("-- " + method);
        }

        System.out.println("\nLa liste des champs de l'objet String sont : ");

        Field[] fields = c.getFields();
        System.out.println("+ Nombre de champs : " + fields.length);
        for (Field field : fields) {
            //System.out.println("-- " + field);
        }

        System.out.println("\nLa liste des constructeurs de l'objet String sont : ");

        Constructor[] constructors = c.getConstructors();
        System.out.print("+ Nombre de constructeur : " + constructors.length);
        for (Constructor constructor : constructors) {
            //System.out.println("-- " + constructor);
        }
    }
}
