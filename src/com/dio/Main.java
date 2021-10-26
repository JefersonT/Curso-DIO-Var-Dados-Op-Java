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

        //AULA 02
        //Criar um simples projeto no IntelliJ e criar duas variáveis para cada tipo de dado apresentado.
        int i1 = 792378723;
//    int i2 = 3484738295298297;

        byte b1 = 15;
        byte b2 = 39;

//    short s1 = 84984;
        short s2 = 2432;

        long l1 = 8492889258284095639l;
        long l2 = 8037629042783487083l;

//    float f1 = 4.7;
        float f2 = 4.246839F;

        double d1 = 34.094;
        double d2 = 893.8483;

        char c1 = 'W';
//    char c2 = 'ed';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "sdflkasdj  falsdkj  dkakd la  alsdkf";
//    String st4 = "11/12/2021";

        boolean bol1 = true;
        boolean bol2 = false;

        System.out.println(i1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st3);
        System.out.println(st2);
        System.out.println(bol1);
        System.out.println(bol2);

    }
}
