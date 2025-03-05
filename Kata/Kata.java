public class Kata {
    public static int sum(int[] numeros){
    /* Para guardar los valores mínimos y máximos del array. */
        
    int min = numeros[0] , max = numeros[0];
    int suma = 0;

    for(int numero: numeros){
        if(min > numero)
            min = numero;
        if (max < numero) 
            max = numero;

            suma += numero;
    }
    return (suma - min) - max;

    }
    
}