import java.util.Scanner;
import java.util.HashMap;
//se agregaron las importaciones

public class Codigo7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); //se agregó System.in
        HashMap<String, String> capitales = new HashMap<>(); //corregida la inicialización de HashMap. c por capitales
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "Ciudad de México");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");//Se agregó capital
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Ciudad de Panamá");
//Se agregaron tildes a las respectivas palabras
        String c = ""; //se agregó una r a Sting

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            c = s.nextLine(); //se cambió Nextdouble por NextLine

            if (!c.equals("salir")) {
                if (capitales.containsKey(c)) {
                    System.out.print("La capital de " + c + " es " + capitales.get(c));
                    System.out.println();
                } else {
                    System.out.print("No conozco la respuesta. ");
                    System.out.print("¿Cuál es la capital de " + c + "?: ");
                    String capital = s.nextLine();
                    capitales.put(c, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        } while (!c.equals("salir")); //estaba mal escrito while
        s.close(); //se agregó close() para cerrar el objeto
    }
//se eliminó una llave adicional