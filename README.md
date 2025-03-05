Kata: Suma de Números con Exclusión de Extremos

Descripción:
Este proyecto contiene una función Java llamada SUM que calcula la suma de los números en un array, excluyendo el valor mínimo y el valor máximo.

Código:
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

Uso:
Para utilizar la función SUM, sigue estos pasos:
1.  Crea una instancia de la clase Kata.
2.  Llama a la función Sum con un array de enteros como argumento.
3.  La función devolverá la suma de los números en el array, excluyendo los extremos.

Ejemplos:
int[] numeros = {1, 2, 3, 4, 5};
int resultado = Kata.sum(numeros); // resultado será 9 (2 + 3 + 4)

Contribución:
Si deseas contribuir a este proyecto, sigue estos pasos:
1.  Haz un fork ( crea una copia completa de este repositorio en tu propia cuenta de GitHub.) del repositorio.
2.  Crea una rama para tu contribución (git checkout -b mi-contribucion).
3.  Realiza tus cambios y haz commit (git commit -am 'Añade una nueva función).
4.  Haz push a la rama (git push origin mi-contribucion).

Licencia:
Este proyecto está bajo la licencia [De la Profesora: Noelia Pinto,del IES Lomo de la Herradura].
