package Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Desafios {
	public static void main(String[] args) {
		
	// Lista de números 
	List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
	
	// DESAFIO 01 - ORDENAR NÚMERO (MENOR PARA O MAIOR)
	List<Integer> numerosMenorParaMaior = numeros.stream()
		.sorted()
		.collect(Collectors.toList());
	System.out.println("DESAFIO 01: "+numerosMenorParaMaior);
	
	// DESAFIO 02 - SOMA DOS NÚMEROS PARES
	int somaNumerosPares = numeros.stream()
			.filter(n -> n % 2 == 0)
			.mapToInt(Integer::intValue)
			.sum();
	System.out.println("DESAFIO 02: Soma dos Pares: "+somaNumerosPares);
	
	// DESAFIO 03 - VERIFIQUE SE TODOS OS NUMEROS DA LISTA SÃO POSITIVOS
	boolean numerosPositivos = numeros.stream()
			.allMatch(n -> n > 0);
	String Resultado = numerosPositivos ? "Todos os números são positivos":"Existem números que são negativos!";
	System.out.println("DESAFIO 03: "+Resultado);
	
	// DESAFIO 04 - REMOVER TODOS OS VALORES ÍMPARES
	List<Integer> numerosImparParaRemover = numeros.stream()
			.filter(n -> n % 2 == 1)
			.sorted()
			.collect(Collectors.toList());
	System.out.println("DESAFIO 04: "+numerosImparParaRemover);
	
	// DESAFIO 05 - CALCULE A MÉDIA DOS NÚMEROS MAIORES QUE 5
	OptionalDouble mediaNumerosMaiores5 = numeros.stream()
			.filter(n -> n > 5)
			.mapToDouble(n -> n)
			.average();
	mediaNumerosMaiores5.ifPresentOrElse(
			media -> System.out.println("DESAFIO 05: Média = "+media),
			() -> System.out.println("Não há números maiores que 5"));
	
	// DESAFIO 06 - VERIFICAR SE A LISTA TEM ALGUM NÚMERO MAIOR QUE 10
	List<Integer> numeroMaior10 = numeros.stream()
			.filter(n -> n > 10)
			.collect(Collectors.toList());
	System.out.println("DESAFIO 06: "+numeroMaior10);
	
	// DESAFIO 07 - ENCONTRAR O SEGUNDO NÚMERO MAIOR DA LISTA
	Optional<Integer> segundoMaior = numeros.stream()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst();
	
	segundoMaior.ifPresentOrElse(
	        num -> System.out.println("DESAFIO 07: O segundo maior número na lista é: " + num),
	        () -> System.out.println("DESAFIO 07: Não há segundo maior número na lista.")
	);
	
	// DESAFIO 08 - SOMAR TODOS DA LISTA
	int somaTotal = numeros.stream()
			.mapToInt(Integer::intValue)
			.sum();
	System.out.println("DESAFIO 08: Soma Total é: "+somaTotal);
	
	// DESAFIO 09 - VERIFICAR SE OS NÚMEROS NÃO SE REPETEM
	boolean numerosRepetidos = numeros.size() != numeros.stream()
			.distinct()
			.count();
		if(numerosRepetidos) {
			System.out.println("DESAFIO 09: A lista tem números repetidos");
		}else {
			System.out.println("DESAFIO 09: A lista não tem números repetidos");
		}
		
	// DESAFIO 10 - AGRUPE OS VALORES ÍMPARES MULTIPLOS DE 3 OU 5
	Map<Integer, List<Integer>> multiplos = numeros.stream()
			.filter(n -> n % 2 != 0)
			.filter(n -> n % 3 == 0 || n % 5 == 0) 
			.collect(Collectors.groupingBy(n -> {
				if(n % 3 == 0) return 3;
				else return 5;
			}));
	System.out.println("DESAFIO 10: Valores ímpares multiplos de 3 e 5: "+multiplos);
	
	// DESAFIO 11 - ENCONTRE A SOMA DOS QUADRADOS DE TODOS OS NÚMEROS DA LISTA
	int somaDosQuadrados = numeros.stream()
			.mapToInt(n -> n * n)
			.sum();
	System.out.println("DESAFIO 11: A soma dos quadrados é: "+somaDosQuadrados);
	
	// DESAFIO 12 - ENCONTRE O PRODUTO DE TODOS DA LISTA		
	int produtoTotal = numeros.stream()
			.reduce(1, (a , b) -> a * b);
	System.out.println("DESAFIO 12: O produto de todos é: "+produtoTotal);		
			
	// DESAFIO 13 - FILTRAR OS NÚMEROS QUE ESTÃO DENTRO DE UM INTERVALO
	int inicio = 5;
	int fim = 10;
	long produtoEmIntervalo = LongStream.rangeClosed(inicio, fim)
			.reduce(1, (a,b) -> a*b);
	System.out.println("DESAFIO 13: O produto com base no intervalo de 5 a 10: "+produtoEmIntervalo);		
			
	/* DESAFIO 14 - ENCONTRE O MAIOR NÚMERO PRIMO DA LISTA		
	
	int maiorPrimo = numeros.stream()
			.filter(Desafios::ePrimo)
			.max(Integer::compareTo)
			.orElse(0);

	System.out.println("DESAFIO 14: O maior número primo na lista é: " + maiorPrimo);*/
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
