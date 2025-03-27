package com.ilram.tiposvariaveis;

public class TiposVariaveis {
	
    public static void main(String[] args) {
        
        // TIPOS DE VARIÁVEIS
    	
        // Variáveis primitivas
        int numeroInteiro = 10; // Armazena números inteiros
        double numeroDecimal = 5.75; // Armazena números com casas decimais
        char letra = 'A'; // Armazena um único caractere
        boolean verdadeiroOuFalso = true; // Armazena valores lógicos (true ou false)
        
        // Variável de classe (também chamada de variável de instância)
        // Pertence a um objeto e pode ser acessada por métodos da classe.
        String texto = "Olá, eu sou uma variável de classe!";

             
        // Exibindo os valores das variáveis
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Letra: " + letra);
        System.out.println("Booleano: " + verdadeiroOuFalso);
        System.out.println(texto);
        
        // VARIÁVEIS DO TIPO CLASSE
        AulaJava objeto = new AulaJava(); // Criamos um objeto para acessar a variável de classe
        
        //Acessando método da classe
        System.out.println(objeto.mostrarMensagem());
        
        // CONSTANTES
        // Utilizamos 'final' para garantir que o valor não pode ser alterado
        final double PI = 3.14159;
        
        // Exibindo os valores
        System.out.println("Valor de PI: " + PI);
        
        // OPERADORES
        int soma = 5 + 3;
        int subtracao = 10 - 4;
        int multiplicacao = 6 * 2;
        double divisao = 9.0 / 2.0;
        int resto = 10 % 3;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + resto);
        
        //Incremento e Pós-incremento
        int numero = 5;
        System.out.println("Antes do incremento: " + numero); // Imprime 5
        System.out.println("Usando pós-incremento: " + (numero++)); // Imprime 5, mas agora num é 6
        System.out.println("Depois do incremento: " + numero); // Imprime 6
        
        
        // Operador ternário verifica se a idade é maior ou igual a 18
        int idade = 18;
        String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(mensagem); // Saída: Maior de idade
        
        //Operadores Relacionais ou de Comparação
        
        //Exemplo de maior que (>) e menor que (<)
        int a = 10, b = 20;

        System.out.println("Comparação de maior (>) e menor (<):");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a > b? " + (a > b)); // Operador "maior que" (>) - Falso, pois 10 não é maior que 20
        System.out.println("a < b? " + (a < b)); // Operador "menor que" (<) - Verdadeiro, pois 10 é menor que 20
        System.out.println("-------------------------------------");

        //Exemplo de igualdade (==) para tipos primitivos
        int numerox = 5, numeroy = 5;
        
        System.out.println("Comparação de igualdade (==) com números:");
        System.out.println("x = " + numerox + ", y = " + numeroy);
        System.out.println("x == y? " + (numerox == numeroy)); // Operador "igual a" (==) - Verdadeiro, pois ambos valem 5
        System.out.println("-------------------------------------");

        //Exemplo de diferente (!=)
        int idade1 = 30, idade2 = 25;

        System.out.println("Comparação de diferente (!=):");
        System.out.println("idade1 = " + idade1 + ", idade2 = " + idade2);
        System.out.println("idade1 != idade2? " + (idade1 != idade2)); // Operador "diferente de" (!=) - Verdadeiro, pois 30 é diferente de 25
        System.out.println("-------------------------------------");

        //Comparação de Strings usando == (referência) e .equals() (conteúdo)
        String nome1 = "Java";
        String nome2 = "Java";
        String nome3 = new String("Java"); // Criando um novo objeto String

        System.out.println("Comparação de Strings:");
        System.out.println("nome1 == nome2? " + (nome1 == nome2)); // Operador "igual a" (==) para referências - Verdadeiro, pois ambas apontam para o mesmo local na memória
        System.out.println("nome1 == nome3? " + (nome1 == nome3)); // Operador "igual a" (==) para referências - Falso, pois nome3 é um novo objeto
        System.out.println("nome1.equals(nome3)? " + (nome1.equals(nome3))); // Método .equals() - Verdadeiro, pois compara o conteúdo das Strings
        System.out.println("-------------------------------------");
        
        //Operadores Lógicos E e OU (&& e II)
        boolean cond1 = true;
        boolean cond2 = false;

        // Operador && (E lógico)
        System.out.println("cond1 && cond2: " + (cond1 && cond2)); // Retorna false, pois uma das condições é falsa

        // Operador || (OU lógico)
        System.out.println("cond1 || cond2: " + (cond1 || cond2)); // Retorna true, pois uma das condições é verdadeira
        
        // MÉTODOS
        AulaJava.saudacao(); // Chamando um método de instância estático
        bemVindo();// Chamando um método de instância
        objeto.mostrarMensagem(); // Chamando um método de instância
        
        
        // ESCOPO
        int x = 10; // Variável de escopo do método main
        if (x > 5) {
            int y = 20; // Variável de escopo do bloco IF
            System.out.println("Dentro do IF, y = " + y);
        }
        // System.out.println(y); // Isso geraria erro, pois 'y' só existe dentro do IF
    }
    
    // Método estático (não pertence a um objeto específico)
    public static void bemVindo() {
        System.out.println("Olá, seja bem-vindo ao mundo da programação em Java!");
    }
    

}
