import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
 

        Scanner scanner = new Scanner(System.in);


        String palabraSecreta = "sorpresa";
        int intentoMaxim = 6;
        int intentos = 0;
        boolean palabraCorrecta = false;


        //Arreglos
        char[] letraAdivinadas = new char[palabraSecreta.length()];


        //Estructura de control: Bucle
        for (int i = 0; i < letraAdivinadas.length; i++) {
            letraAdivinadas[i] = '*';
            System.out.println(letraAdivinadas[i]);
        }

        while (!palabraCorrecta && intentos <  intentoMaxim) {

            System.out.println("PALABRA A ADIVINAR: " + String.valueOf(letraAdivinadas));

            System.out.println("introduce una letra por favor: ");

            char letra = Character.toLowerCase(scanner.next().charAt(0));
            
            boolean letraCorrecta = false;
            
        for (int i = 0; i < palabraSecreta.length(); i++) {
                
                if (palabraSecreta.charAt(i) == letra) {

                    letraAdivinadas[i] = letra;
                    letraCorrecta = true;
                    
                }
        }

            if (letraCorrecta) {
                intentoMaxim--;
                System.out.println("vas bien! te quedan " + (intentoMaxim-intentos));
            }

           

            if (String.valueOf(letraAdivinadas).equals(palabraSecreta)) {
                palabraCorrecta = true;
                System.out.println("¡Felicidades, has adivinado la palabra: !" + palabraSecreta);

                
            }
            
            if (!palabraCorrecta) {
                intentoMaxim--;
                System.out.println("¡Que pena, no adivinaste! te quedan : " + (intentoMaxim-intentos));

                
            }

    
        }



 

        scanner.close();
    } 
}

