// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota1 = 6;

        if (nota1 >= 7)
            System.out.println("Aprovado");
        else if (nota1 >= 5 && nota1 < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
        
        int nota2 = 6;

        String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

    }

    
}