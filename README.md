# Variáveis, Tipos de Dados e Operadores Matemáticos em Java

- **CONCEITUAÇÃO E CRIAÇÃO**
    
    Variável →  "Um espaço na memória do computador, onde se pode guardar valores."
    
    Existem 4 tipos:
    
    - Instância: objeto
    - Classe: classe
    - Local: dentro de métodos
    - Parâmetro: Na assinatura do método.
    
    Padrão de definição:
    
    `<?visibilidade?> <?modificador?> tipo nome <?=valorInicial?>;`
    
    o que está entre <??> é opocional
    
    Visibilidade: public, protected e private
    
    Modificador:  static e final
    
    Tipo: tipo de dado Integer, String e outros
    
    Nome: nome que é fornecido a variável
    
    Valor: um valor inicial, caso se deseja
    
    Convenções e regras:
    
    - Não devem começar com números;
    - Embora permitido, "$" e "_" devem ser evitados;
    - São case-sensitive;
    - Não pode ser as palavra reservadas do Java:
    
    Exemplos:
    
    - int i;
    - int I;
    - Int 1a;
    - int _1a;
    - int _1a;
    - int $aq;
    - int I = 10;
    - final int  j = 10;
    - int asrn24678md;
    - int asrn246 78md;
    - int asrn2$4678_md = 10;
    - Int asrn2$46%78_md = 10;
    
    Boas Práticas
    
    - Sempre começar com letra minúscula;
    - Nomes expressivos;
    - Notação Camelo;
    - Quando constante(final) maiúscula e separada por "_";
    
    Exemplos:
    
    - int quantidadeProduto;
    - **int QuantidadeProduto;**
    - final int NUMERO_TENTATIVAS = 5;
    - **final int numeroTentativas = 5;**
    - **int NUMERO_TENTATIVAS = 5;**
    - **int qtdProd;**
    - int i;
    
    **EXERCÍTANDO**
    
    1. Criar um simples projeto no IntelliJ e criar as variáveis exemplificadas anteriormente.
- **TIPOS DE DADOS**
    
    Tipos de dados são os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamentes.
    
    Tipificação:
    
    - Estática (forte) vs Dinâmica(fraco)
        - Estático (forte) é quando vc deve declara o tipo da variável para que no momento da compilação ja seja identificado
        - Dinâmica (Fraco), você pode declarar a variável sem definir o tipo, na compilação irá identificar o tipo de acordo com o que ela armazena
    - Primitivo vs Composto
        - Primitivos: dados atômicos e homogênicos, dados numéricos e textual
        - Composto: ligado a Orientação a Objeto, Struct é um exemplo, é heterogêncio composto por outros dados.
    - Tipos de dados
        - Textual
        - Numeral
        - Lógico
        - Objeto
    - Exemplos numeral:
        - byte: -128 até 127 →byte b=15;
        - short: -32.768 até 32.767 →short s = -15785;
        - int: -2.147.483.648 até 2.147.483.647 → int i = 8515785;
        - long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 → long l =5938515785L;
        - float: +-1.7976913486231570E+308 → double d = 3.14...(d);
    - Exemplos Textual
        - char: caracteres de 16-bit unicode → char c = '\u0084'; ou char c = 'T';
        - String: um tipo "especial" → String s = "T";
    - Exemplos Lógico:
        - boolean: true e false → boolean s = false;
    
    Utilização
    
    ![Untitled](Varia%CC%81veis,%20Tipos%20de%20Dados%20e%20Operadores%20Matema%CC%81tic%207587707cfe1744d4b6db210354ada6b9/Untitled.png)
    
    Usar de forma adequada cada tipo de dado para cada informação.
    
    **EXERCITANDO**
    
    Criar um simples projeto no IntelliJ e criar duas variáveis para cada tipo de dado apresentado.
    
- **OPERADORES ARITMÉTICOS**
    
    São símbolos especiais quais são capazes de realizar ações específicas em um, dois ou mais operadores e, em seguida, retornar um resultado.
    
    Tipos:
    
    - pós-fixado: exp++ ou exp- -
    - pré-fixado: ++exp ou - -exp
    - aritmético: +, -, *, / e %
    - atribuição: =, +=, -=, *=, /= e %=
    
    ![Untitled](Varia%CC%81veis,%20Tipos%20de%20Dados%20e%20Operadores%20Matema%CC%81tic%207587707cfe1744d4b6db210354ada6b9/Untitled%201.png)
    
    ![Untitled](Varia%CC%81veis,%20Tipos%20de%20Dados%20e%20Operadores%20Matema%CC%81tic%207587707cfe1744d4b6db210354ada6b9/Untitled%202.png)
    
    **EXERCITANDO**
    
    Criar um simples projeto no IntelliJ e as variáveis e operações apresentadas. 
    
    Crie expressões em que as precedências influenciem nos resultados.
    
- **CONVERSÕES (CASTING)**
    
    É a transformação de uma determinada variável de tipo menos específico para um tipo mais específico ou vice-versa.
    
    Tipos:
    
    - Upcast (implícito)
        - promoção de um dado menor para um dado maior;
    - Downcast (explícito)
        - rebaixar variável de tipo de dado maior para um tipo de dado menor; possíveis perdas de dados;
    
    ![Untitled](Varia%CC%81veis,%20Tipos%20de%20Dados%20e%20Operadores%20Matema%CC%81tic%207587707cfe1744d4b6db210354ada6b9/Untitled%203.png)
    
    Exemplos:
    
    - long I; int i = 10; I = i;
    - int i; long I = 100; i = (int) I;
    - double d; float f = 10.5f; d = f;
    - float f; double d = 10.5d; f = (float) d;
    - int i; float f = 10.5f; i = (int) f;
    
    **EXERCITANDO**
    
    Criar um simples projeto no IntelliJ e criar variáveis de vários tipos diferente para assim realizar casting.
