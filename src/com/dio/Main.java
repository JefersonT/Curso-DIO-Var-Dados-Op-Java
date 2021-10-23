package com.dio;

public class Main {

    public static void main(String[] args) {
	// Converções e regras:
        int i;//ok
        //int i; //variável com mesmo nome
        int I;//ok
        //int 1a;//não podem começar com números
        int _1a;//ok, mas não é boa prática
        int $aq;//ok, mas não é boa prática
        //int I = 10;//ok, mas variável já existe
        final int j = 10;//ok, j sempre terá seu valor 10, pois é uma variárl constante
        //j = 15;//erro pois a variável é constante
        int asrn24678md;//ok
        //int asrn246 78md; //Erro, não pode ter espaço
        int asrn2$4678_md = 10;//ok, não é boa prática usar "_" ou "$"
        //Int asrn2$46%78_md = 10;//Erro, pois não é aceito "%", caracteres especias causam erros

        //definindo valores para as variáveis
        i = 5;
        I = 10;
        _1a = 10;
        $aq = 7;
        asrn24678md = 35;

        //Boas práticas
        int quantidadeProduto = 50;//OK
        int QuantidadeProduto = 87;//OK, mas a boa prática não deve começar com letra maiuscula
        final int NUMERO_TENTATIVAS = 5;//ok
        final int numeroTentativas = 5;//ok, mas não é boa prática
        int NUMERO_OPCOES = 5;//OK, Mas não foi definica como final
        int qtdProd;//ok, mas não é boa prática


        //Exibição de Variáveis
        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(NUMERO_OPCOES);

    }
}
