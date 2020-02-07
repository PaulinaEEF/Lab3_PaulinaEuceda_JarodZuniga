package lab3_jarodzuniga_paulinaeuceda;

import java.util.Scanner;

public class Lab3_JarodZuniga_PaulinaEuceda {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        char resp = 's';
        while (resp == 's') {
            System.out.println("1) Crear equipo");
            System.out.println("2) Despedir jugador");
            System.out.println("3) Despedir medico");
            System.out.println("4) Despedir entrenador");
            System.out.print("Eliga la opcion que desea: ");

            String nombrePer, apellido, colegioMed, ciudadNatal, jugadaFav;
            int años, salario, numcamiseta, tiro3, defensa, tiroMedia, rebote, bandeja, pases, posteo, altura;
            int cantCiru, cantEnf, cantTer, valorDueño;
            boolean Fue;

            String nomEq, descripcion;
            int año, catCampeo, porcentaje;

            int opcion = lea.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    char salida = 's';
                    while (salida == 's') {
                        System.out.print("Ingrese el nombre del jugador: ");
                        nombrePer = lea.next();

                        System.out.print("Ingrese apellido: ");
                        apellido = lea.next();

                        System.out.print("Ingrese años como profesional: ");
                        años = lea.nextInt();

                        System.out.print("Ingrese el salario del jugador: ");
                        salario = lea.nextInt();

                        System.out.println("");
                        System.out.println("Puestos a asignar a la persona : ");
                        System.out.println("1) Crear jugador");
                        System.out.println("2) Crear dueño");
                        System.out.println("3) Crear entrenador principal");
                        System.out.println("4) Crear asistente");
                        System.out.println("5) Crear medico");
                        System.out.println("6) Crear preparador fisico");
                        System.out.print("Ingrese la opcion que desea: ");
                        int op = lea.nextInt();

                        System.out.println("");
                        switch (op) {
                            case 1:
                                break;

                            case 2:
                                System.out.print("Ingrese el valor neto del dueño: ");
                                valorDueño = lea.nextInt();

                                System.out.print("Ingrese la ciudad natal: ");
                                ciudadNatal = lea.next();

                                break;
                            default:
                                throw new AssertionError();
                        }

                    }
                    break;
                default:

                    break;

            }

        }
    }

}
