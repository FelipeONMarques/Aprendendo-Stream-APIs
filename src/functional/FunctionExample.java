package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

    /*
    * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
    *É utilizado para transformar ou mapear os elementos do Stream em outros valores ou tipos.
    * */


    public static void main(String[] args) {
    //Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

    //Usar a Function com expressão Lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero*2;

    //Usar a função para dobrar todos os números no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n*2)
                .toList();

        numerosDobrados.forEach(System.out::println);
    }
}
