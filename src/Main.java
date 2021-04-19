import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
    Andrea Lam, 20102
    Fecha de Creación: 09/04/21
    Java
    Programa para simular un diccionario traductor

    Ereferencias:
    https://www.geeksforgeeks.org/binary-tree-data-structure/
    https://stackoverflow.com/questions/5868369/how-to-read-a-large-text-file-line-by-line-using-java
    https://www.youtube.com/watch?v=22AE6WklXBg
    https://www.youtube.com/watch?v=X2XcDn8TPwU

 */
public class Main {
    public static void main(String[] args) {
        boolean todobien = true;
        boolean selogro = false;
        Node<Association<String,String>> palabrasNuevas = new Node<>();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Quiero aclarar que solo pude realizar español ingles :c");
            System.out.print("Al final no pude hacerlo de frances tambien me trabe y confundi mucho");
            System.out.print("y tenia ganas de llorar y me quiero mucho TnT, entonces asi lo deje");
            System.out.print("Prometo a la siguiente hacerlo mejor");
            System.out.print("Ahora si");
            System.out.print("Bienvenido a la simulación de un diccionario, porfavor ingrese dirección del archivo DEL DICCIONARIO:");
            System.out.println("\n");
            String archivo = scan.nextLine();
            if (!archivo.equals("2")) {
                File archivoUsuarios = new File(archivo);

                try (BufferedReader br = new BufferedReader(new FileReader(archivoUsuarios))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] parts = line.split(Pattern.quote(","));
                        String paretes = parts[0];
                        String part1 = parts[0];
                        String part2 = parts[1];
                        //se quitan los parentesis para que solo queden las palabras
                        part1 = part1.replace("(", "");
                        part2 = part2.replace(")", "");
                        //agregar las palabras a un arbol la palabra en ingles se va a agregar como el key y la palabra en espanol se va a agregar como el value.
                        Association palabrota = new Association(part1,part2);
                        palabrasNuevas.insert(palabrota);
                        String listo = palabrota.toString();
                        String[] party = line.split(Pattern.quote(","));
                        String parte = party[0];
                        String parti = party[1];
                        Object palab = palabrota.theKey;
                        String kr = palab.toString();
                        Object pelab =  palabrota.theValue;
                        String yep = pelab.toString();



                    }


                } catch (Exception e) {
                    System.out.println("Error, no se encontro el archivo");
                }
            }

            System.out.print("Diccionario en orden: \n");
            palabrasNuevas.inorder();
            selogro = true;
            do {
                // PEDIR EL ARCHIVO QUE SE QUIERE LEER
                System.out.println("Porfavor ingrese la dirección del archivo que SE DESEA LEER: ");
                System.out.println("\n");
                String ingles = scan.nextLine();
                if (!archivo.equals("2")) {
                    File archivoUsuarios = new File(ingles);
                    try (BufferedReader br = new BufferedReader(new FileReader(archivoUsuarios))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String english = line;
                            System.out.print("Traducción del archivo :");
                            System.out.println(english);
                            ArrayList<String> hacer = new ArrayList<>(Arrays.asList(line.split(" ")));
                            System.out.print(hacer);
                        }
                    }catch (Exception e) {
                        System.out.println("Error, no se encontro archivo");
                    }
                    selogro = false;
                    todobien = false;


                }

            }while (selogro);

        } while (todobien);

    }
}