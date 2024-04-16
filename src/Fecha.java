import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {

        /*
        * 1. Crear un nuevo proyecto Java llamado “Fechas”. Agregar una clase llamada
        Fechas.java, que incluya la función main.
        (1 Punto)
        * 2. Solicitar al usuario dos fechas de tipo String, una después de otra de la forma:
        (2 Puntos)
        Ingrese la primera fecha como DD/MM/AAAA
        3. Guardar cada parte de la fecha como integer, es decir, el día, mes y año. Utilizar
        substring de la clase String.
        (3 Puntos)
        4. Calcular cuál de las dos fechas es mayor.
        (3 Puntos)
        5. La salida del programa debe decir si la persona 1 o la persona 2 es mayor.
        (1 Punto)*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera fecha como DD/MM/AAAA: ");
        String data = scanner.nextLine();
        System.out.print("Ingrese la segunda fecha como DD/MM/AAAA: ");
        String data2 = scanner.nextLine();

        int dia1 = Integer.parseInt(data.substring(0,2));
        int mes1 = Integer.parseInt(data.substring(3,5));
        int anio1 = Integer.parseInt(data.substring(6));

        int dia2 = Integer.parseInt(data2.substring(0,2));
        int mes2 = Integer.parseInt(data2.substring(3,5));
        int anio2 = Integer.parseInt(data2.substring(6));

        if(anio1 < anio2){
            System.out.println("persona 1 es mayor");
        }else if( anio1 > anio2){
            System.out.println("persona 2 es mayor");
        }else{
            if (mes1 < mes2){
                System.out.println("persona 1 es mayor");
            } else if (mes1 > mes2){
                System.out.println("persona 2 es mayor");
            }
            else {
                if (dia1 < dia2){
                    System.out.println("persona 1 es mayor");
                } else if (dia1 > dia2){
                    System.out.println("persona 2 es mayor");
                } else {
                    System.out.println("Tienen la misma edad");
                }
            }
        }
    }
}
