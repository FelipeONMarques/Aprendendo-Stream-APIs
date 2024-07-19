package functional;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
/*
* Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
*É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
* */
    public static void main(String[] args) {
    //Usar o Supplier com expressões Lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

    //Usar supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)!")

                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
