package Gestion;

public class CompDNI{
    public static boolean comprobar(String DNI){
        char[] array = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int modulo,num;
        boolean bueno = false;
        
        num = pasar(DNI); //Recibimos el DNI y los descomponemos en solo los numeros sin la letra del DNI

        while(num != 0){ //Mientras que el DNI no sea cero, se repite todo el proceso

            modulo = num % 23; //Calculamos la posición del Array para comprobar la letra y ver si es correcto el DNI
            char letra = DNI.charAt(8); //Pasamos la letra del DNI a una variable
            letra = Character.toUpperCase(letra); //Pasamos esa letra a Mayúsculas por si la que se da es minúscula

            //Si la letra es igual a la de la posición del Array ponemos el mensaje de que es correcto
            if(array[modulo] == letra){
                bueno = true;
                return bueno;
            }else{  
                System.out.print("DNI Incorrecto\n");
                bueno = false;
                return bueno;
            }
        }
        return bueno;
    }

    //Este método lo usamos para extraer la parte numérica del DNI
    public static int pasar(String DNI){ 
        String n;    
        int num, t;
        t = DNI.length();

        if(t == 9){
            t = 8;
        }else{
            t = 1;
        }

        n = DNI.substring(0,t);
        num = Integer.parseInt(n); //Usamos parseInt para pasar a numero todo lo que hemos cogido del DNI

        return num;
    }
}