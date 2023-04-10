package edu.vando.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");

        final String BR = "Brasil";// Usamos "final" para tornar a variável constante
        System.out.println(BR);

        String primeiroNome = "Vando";
        String sobreNome = "Rocha";

        String nomeCompleto = nomeCompleto(primeiroNome, sobreNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String sobreNome) {
        return "Meu nome é " + primeiroNome.concat(" ").concat(sobreNome);

    }
}

/*
 * Estrutura de declaração da variável: Tipo NomeVariavel = Atribuição
 * Exemplo:
 * 
 * int idade = 25;
 * double preco = 10.55;
 * 
 * string nome = "Vando"
 */

/*
 * Para declarar métodos usamos a estrutura: TipoRetorno NomeMetodoNoInfinitivo
 * Paraemtro(s)
 * Exemplo:
 * 
 * int somar (int numero1, int numero2)
 */

/*
 * PADRÕES DE ESCRITA DE VARIÁVEL
 * 
 * 1 - Nomes de classe deve começar com letra maiuscula. Se for nome composto
 * cada palavra começa com letra miuscula. Exemplo: MinhaClasse.java.
 * 
 * 2 - O nome da classe deve ser o mesmo do arquivo
 * 
 * 3 - Nomes de variáveis devem começar com letra minúscula. Se for composta, a
 * segunda palavra em diante começa com variável. Exemplo: minhVariavel
 * 
 * 4 - Quando uma variável não deve ter seu valor alterado, ou seja, corresponde
 * a uma constante, deve ser nomeada com letras em caixa alta. Exemplo: PI, BR,
 * SP, ESTADOS_BRASILEIROS
 * 
 * 5 - Para nomear pode-se usar letras, _(underline), $ ou números
 * 
 * 6 - Deve-se iniciar obrigatoriamente com letras
 * 
 * 7 - Não pode conter espaços
 * 
 * 8 - Não pode-se musar palavras reservadas
 * 
 * 9 -O nome deve ser único dentro do contexto
 */

/*
 
 */