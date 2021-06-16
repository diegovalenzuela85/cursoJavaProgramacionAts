package cursojavaprogramacionats;

import javax.swing.*;
import java.util.Scanner;

public class CursoJavaProgramacionAts {
    public static void main(String[] args) {
        // System.out.println("Hola Desde Java Intellij"); // EJEMPLO - VIDEO 03
        // Los comentarios en JAVA los podemos hacer en bloque con /* */ y de linea con //

        // --------------------------------------------------------------------------------------------

        // Tipos de datos primitivos -> Existen variables de tipo entero, real, caracter, booleano
        /*
        Enteros ->
         | Nombre | Tamaño | Rango
         |  long  |   64   | -9223372036854775808 a 9223372036854775807
         |   int  |   32   | -2147483648 a 2147483647
         |  short |   16   | -32768 a 32767
         |  byte  |   8    | -128 a 127
         */
        // VIDEO-05 - EJEMPLO 1 byte

        // byte entero;
        // entero = 7;
        // System.out.println(entero);

        // byte entero = 17;
        // System.out.println(entero);
        // System.out.println("El numero entero guardado en byte Es: "+entero);

        // short entero = 31150;
        // System.out.println("El numero entero guardado en short es: "+entero);

        // int entero = 1568314;
        // System.out.println("El numero entero guardado en int es: "+entero);

        // long entero = 214748364;
        // System.out.println("El numero entero guardado en int es: "+entero);

        // -----------------------------------------------------------------------------------------------

        /*
        REALES ->
         | Nombre | Tamaño | Rango
         | double |   64   | ± 1.8x10-308 a ± 1.8x10308
         |  float |   32   | ± 3.4x10-38 a ± 3.4x1038
         */

        // double decimal = 0.454654645446546464;
        // System.out.println("El numero real guardado en double es: "+decimal);

        // float decimal = 3.45f;
        // System.out.println("El numero real guardado en float es: "+decimal);

        // -------------------------------------------------------------------------------------

        // CARACTER ->

        // char caracter = 'a';
        // System.out.println("El caracter guardado en char es: "+caracter);

        // -------------------------------------------------------------------------------------

        // BOOLEANOS ->

        // boolean estado = true;
        // System.out.println("El estado guardado en boolean es: "+estado);

        //--------------------------------------------------------------------------------------

        // Tipos de datos NO primitivos y Cadenas

        // Los datos NO primitivos almacenan un valor NULL y se caracterizan porque tienen metodos

        // Integer numero = null;
        // System.out.println("El numero guardado en la variable NO primitiva numero es: "+numero);

        // String cadena = "Hola soy Diego";
        // System.out.println("El dato guardado en la variable cadena es: "+cadena);

        //---------------------------------------------------------------------------------------

        // Constantes -> no se puede cambiar el valor asignado

        // EJEMPLO DE VARIABLE
        // int num = 10;
        // num += 12;
        // System.out.println("El numero guardado en la variable num es: "+num);

        // EJEMPLO DE CONSTANTE
        // final int num = 10;
        // System.out.println("El numero guardado en la costante num es: "+num);

        // ----------------------------------------------------------------------------------------

        // Entrada y salida de datos por consola:

        // Scanner entrada = new Scanner(System.in);
        // char caracter;
        // System.out.print("Por favor escribe un caracter: ");
        // caracter = entrada.next().charAt(0);
        // System.out.println("El caracter que ingresaste es: "+caracter);

        // Scanner entrada = new Scanner(System.in);
        // String nombre;
        // System.out.print("Por favor, escribe tu nombre: ");
        // nombre = entrada.next();
        // nombre = entrada.nextLine();
        // System.out.println("Hola, tu nombre es: "+nombre);

        // NOTA: En JAVA si queremos guardar una entrada tipo float debemos escribirla con coma (,) no punto (.)
        // Scanner entrada = new Scanner(System.in);
        // float estatura;
        // System.out.print("Por favor, escribe tu estatura: ");
        // estatura = entrada.nextFloat();
        // System.out.println("Hola, tu estatura es: "+estatura+" metros");

        // Scanner entrada = new Scanner(System.in);
        // double peso;
        // System.out.print("Por favor, escribe tu peso: ");
        // peso = entrada.nextDouble();
        // System.out.println("Hola, tu peso es: "+peso+" kilos");

        // Scanner entrada = new Scanner(System.in);
        // int numero;
        // System.out.print("Por favor, escribe tu edad: ");
        // numero = entrada.nextInt();
        // System.out.println("Hola, tu edad es: "+numero+" años");

        // -----------------------------------------------------------------------------------------

        // Entrada y salida de datos por JOptionPane - ventana pantalla

        String cadena;
        int entero;
        char caracter;
        double decimal;
        float flotante;

        cadena = JOptionPane.showInputDialog("Escribe tu nombre: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));
        caracter = JOptionPane.showInputDialog("Escribe la letra inicial de tu primer apellido: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto pesas? "));
        flotante = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto mides? "));

        // JOptionPane.showMessageDialog(null, "Tu nombre es: "+cadena);
        // JOptionPane.showMessageDialog(null, "Tu edad es: "+entero);
        // JOptionPane.showMessageDialog(null, "La inicial de tu primer apellido es: "+caracter);
        // JOptionPane.showMessageDialog(null, "Tu peso es: "+decimal);
        // JOptionPane.showMessageDialog(null, "Tu estatura es: "+flotante);

        // --------------------------------------------------------------------------------------------------

    }
}
