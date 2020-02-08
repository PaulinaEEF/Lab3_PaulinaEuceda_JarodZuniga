package lab3_jarodzuniga_paulinaeuceda;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JarodZuniga_PaulinaEuceda {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        char resp = 's';
        ArrayList<Persona> equipo=new ArrayList();
        ArrayList<Persona> agenteLibre = new ArrayList();

        while (resp == 's') {
            System.out.println("1) Crear equipo");
            System.out.println("2) Despedir");
            System.out.println("3) Eliminar personal");
            System.out.println("4) Salida");
            System.out.print("Eliga la opcion que desea: ");

            String nombrePer, apellido, colegioMed, ciudadNatal, jugadaFav;
            int años, salario, numcamiseta, tiro3, defensa, tiroMedia, rebote, bandeja, pases, posteo, altura=0;
            int cantCiru, cantEnf, cantTer, valorDueño;
            boolean Fue=false;

            String nomEq, descripcion;
            int año, catCampeo, porcentaje;

            int opcion = lea.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    char salida = 's';
                    int conj=0, cond=0,conm=0,cone=0;
     
                        
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
                        System.out.println("1) Jugador");
                        System.out.println("2) Dueño");
                        System.out.println("3) Entrenador");
                        System.out.println("4) Medico");
                        System.out.print("Ingrese la opcion que desea: ");
                        int op = lea.nextInt();

                        System.out.println("");
                        switch (op) {
                            case 1://crear jugador
                                System.out.print("Ingrese el numero de camiseta: ");
                                numcamiseta = lea.nextInt();

                                System.out.print("Ingrese el tiro de 3: ");
                                tiro3 = lea.nextInt();
                                while (tiro3 >= 99 || tiro3 < 0) {
                                    System.out.print("Debe ser menor a 99. Ingrese otra vez: ");
                                    tiro3 = lea.nextInt();
                                }

                                System.out.print("Ingrese la defensa: ");
                                defensa = lea.nextInt();
                                while (defensa >= 99 || defensa < 0) {
                                    System.out.print("Debe ser menor a 99. Ingrese otra vez: ");
                                    defensa = lea.nextInt();
                                }

                                System.out.print("Ingrese el tiro de media: ");
                                tiroMedia = lea.nextInt();
                                while (tiroMedia >= 99 || tiroMedia < 0) {
                                    System.out.print("Debe ser menor a 99 y mayor a 0. Ingrese otra vez: ");
                                    tiroMedia = lea.nextInt();
                                }

                                System.out.print("Ingrese el rebote: ");
                                rebote = lea.nextInt();
                                while (rebote >= 99 || rebote < 0) {
                                    System.out.print("Debe ser menor a 99 y mayor a 0. Ingrese otra vez: ");
                                    rebote = lea.nextInt();
                                }

                                System.out.print("Ingrese la bandeja: ");
                                bandeja = lea.nextInt();
                                while (bandeja >= 99 || bandeja < 0) {
                                    System.out.print("Debe ser menor a 99 y mayor a 0. Ingrese otra vez: ");
                                    bandeja = lea.nextInt();
                                }

                                System.out.print("Ingrese los pases: ");
                                pases = lea.nextInt();
                                while (pases >= 99 || pases < 0) {
                                    System.out.print("Debe ser menor a 99 y mayor a 0. Ingrese otra vez: ");
                                    pases = lea.nextInt();
                                }

                                System.out.print("Ingrese el posteo: ");
                                posteo = lea.nextInt();
                                while (posteo >= 99 || posteo < 0) {
                                    System.out.print("Debe ser menor a 99 y mayor a 0. Ingrese otra vez: ");
                                    posteo = lea.nextInt();
                                }

                                boolean flag = true;
                                while (flag) {
                                    flag=false;
                                    System.out.println("Alturas:");
                                    System.out.println("1) Base (193)");
                                    System.out.println("2) Escolta (200)");
                                    System.out.println("3) Alero (205)");
                                    System.out.println("4) Alero -Pivot (210)");
                                    System.out.println("5) Centro (213)");
                                    System.out.print("Ingrese la opcion que desea: ");
                                    int eleccion = lea.nextInt();

                                    switch (eleccion) {
                                        case 1:
                                            altura = 193;
                                            break;
                                        case 2:
                                            altura = 200;
                                            break;
                                        case 3:
                                            altura = 205;
                                            break;
                                        case 4:
                                            altura = 210;
                                            break;
                                        case 5:
                                            altura = 213;
                                            break;
                                        default:
                                            System.out.println("Opcion incorrecta");
                                            flag = true;
                                            break;
                                    }
                                }
                                
                                System.out.println("");
                                equipo.add(new Jugador(numcamiseta, tiro3, defensa, tiroMedia, rebote, bandeja, pases, posteo, altura, nombrePer, apellido, años, salario));
                                break;

                            case 2://CREAR DUEÑO
                                System.out.print("Ingrese el valor neto del dueño: ");
                                valorDueño = lea.nextInt();

                                System.out.print("Ingrese la ciudad natal: ");
                                ciudadNatal = lea.next();

                                System.out.println("");
                                equipo.add(new Dueño(valorDueño, ciudadNatal, nombrePer, apellido, años, salario));
                                break;
                            case 3://crear entrenador
                                flag=true;
                                while (flag == true) {
                                    flag=false;  
                                    System.out.println("1) Entrenador fue jugador");
                                    System.out.println("2) Entrenador no fue jugador");
                                    int o = lea.nextInt();
                                    switch (o) {
                                        case 1:
                                            Fue = true;
                                            break;
                                        case 2:
                                            Fue = false;
                                        default:
                                            System.out.println("Opcion incorrecta");
                                            flag = true;
                                            break;
                                    }
                                }
                                
                                System.out.print("Ingrese la jugada favorita: ");
                                jugadaFav = lea.next();

                                flag = true;
                                
                                while (flag == true) {
                                    String tipoE;
                                    flag = false;
                                    System.out.println("1) Entrenador principal");
                                    System.out.println("2) Asistente de entrenador");
                                    System.out.println("3) Preparador fisico");
                                    int e = lea.nextInt();
                                    switch (e) {
                                        case 1:
                                            tipoE="Entrenador Principal";
                                            
                                            equipo.add(new Principal(salario, Fue, tipoE, nombrePer, apellido, años));
                                            break;
                                        case 2:
                                            tipoE="Asistente de entrenador";
                                            equipo.add(new Principal(salario, Fue, tipoE, nombrePer, apellido, años));
                                            break;
                                        case 3:
                                            tipoE="Preparador fisico";
                                            equipo.add(new Principal(salario, Fue, tipoE, nombrePer, apellido, años));
                                            break;
                                        default:
                                            System.out.println("Opcion no valida.");
                                            flag = true;
                                            break;
                                    }
                                    break;

                                }
                                
                                break;
                            case 4://crear medico
                                System.out.print("Ingrese el colegio donde estudió el medico: ");
                                colegioMed = lea.next();

                                System.out.println("Tipos de medicos");
                                System.out.println("1) Medico general");
                                System.out.println("2) Cirujano");
                                System.out.println("3) Terapeuta");
                                System.out.print("Ingrese la opcion que desea: ");
                                int opc = lea.nextInt();

                                flag = true;
                                while (flag == true) {
                                    flag = false;
                                    String tp="";
                                    switch (opc) {
                                        case 1://general
                                            System.out.print("Ingrese el numero de enfermedades curadas");
                                            cantEnf = lea.nextInt();
                                            tp="Medico General";
                                            equipo.add(new General(cantEnf, tp,colegioMed, nombrePer, apellido, años, salario));
                                            break;
                                        case 2://cirujano
                                            System.out.print("Ingrese el numero de cirugías: ");
                                            cantCiru = lea.nextInt();
                                            tp="Cirujano";
                                            equipo.add(new Cirujano(cantCiru, tp,colegioMed, nombrePer, apellido, años, salario));

                                        case 3://terapeuta
                                            System.out.print("Ingrese el numero de terapias: ");
                                            cantTer = lea.nextInt();
                                            tp="Terapeuta";
                                            equipo.add(new Terapeuta(cantTer, tp,colegioMed, nombrePer, apellido, años, salario));

                                        default:
                                            System.out.println("Opcion incorrecta");
                                            flag = true;
                                            break;

                                    }
                                    
                                }
                                break;
                            
                            default:
                                throw new AssertionError();
                        }

                    
                    break;
                case 2:
                    //imprimir arraylist de equipos
                    System.out.print("Ingrese el indice de equipo que desea despedir: ");
                    int despequipo = lea.nextInt();
                    
                    //imprimir arraylist de personal
                    System.out.print("Indice de quien desea despedir: ");
                    int despemleado = lea.nextInt();
                    
                    //agenteLibre.add(/*el get del personal*/);
                    
                    
                    break;
                case 3:
                                System.out.println("Eliminar personal");
                                for (int i = 0; i < equipo.size(); i++) {
                                    System.out.println(equipo.get(i));
                                }
                                System.out.println("Ingrese la posicion que desea eliminar");
                                int el=lea.nextInt();
                                equipo.remove(el-1);
                                break;
                case 4:
                    resp='n';
                    break;
                default:

                    break;

            }

        }
    }

}
