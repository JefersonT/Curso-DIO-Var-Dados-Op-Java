package com.dio;

public class Main {

    public static void main(String[] args) {
        System.out.println("AULA 01");
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
        System.out.println("AULA 02");
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


        System.out.println("Aula 03");
        System.out.println("prePos");
        prePos();
        System.out.println("Aritimético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedencia");
        precedencia();

        System.out.println("AULA 04");
        aula04();


    }
    //Aula 03
    private static void prePos(){
        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i: "+ i);
        System.out.println("j: "+ j);
        System.out.println("x: "+ x);

    }

    private static void aritmetico(){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%d;

        System.out.println("r1:"+r1);
        System.out.println("r2:"+r2);
        System.out.println("r3:"+r3);
        System.out.println("r4:"+r4);
        System.out.println("r5:"+r5);
    }

    private static void atribuicao(){
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d: " + d);

        i += 5; //i = 1+5
        j -= 3; //j = j-3
        d /= 2.7d; //d = d/2.7d
        l *=3; // l = l*3
        k %= 2; //k = k%2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;

        System.out.println("k: " + k);
        System.out.println("i: " + i);
    }

    private static void precedencia(){
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; //10 + 19 * 30 -> 10 + 570 -> 580

        System.out.println("i++ + --j * k: " + a);

        System.out.println("i: " + i);

        int b = a / --i % 3 * 1;// 30 / 10 % 3 * 1 -> 1

        System.out.println("a / --i % 3 * 1: " + b);

        int c = 2;

        c *= i += 5; //c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 + %; -> c = 2 * 15 -> c = 30

        System.out.println("c: " + c);
    }

    private static void aula04(){

        byte b1;
        short s1 = 1000;

        b1 = (byte) s1;

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 37929472983498l;
        i2 = (int) l2;

        int i3;
        long l3 = 100000l;
        i3 = (int) l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 100000.58d;
        f2 = (float) d2;
        double d3 = 10000.4835798277598234985793487598274987985423d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.23423f;
        i4 = (int) f4;

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3;

        System.out.println("b1: " + b1);
    }
}
