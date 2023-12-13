package excepciones;

/**
 * @author Joseph Magallanes
 */
public class Excepciones {

    public static void main(String[] args) {

        // ejemplo 1: division por 0
        try {
            int resultado = 3/0;
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero!!!");
        }
        
        // ejemplo 2: en un vector
        int edades[] = {15, 12, 23, 30};

        try {
            System.out.println("La edad de la posición 4 es: " + edades[4]);
        } catch (Exception e) {
            System.out.println("Intentastes acceder a un índice que no existe");
        }

    }

}
