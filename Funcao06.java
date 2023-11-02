public class Funcao06
{
    static void algumasOperacoes(int a, int b, int c) {
        int t;
        
        imprimeValores(a, b, c);
        
        t = a;
        a = b;
        b = c;
        c = t;
        
        imprimeValores(a, b, c);
    }
    static void imprimeValores(int a, int b, int c){
        System.out.println("A="+a+", B="+b+", C="+c);
    }
    public static void main(String []args){
        algumasOperacoes(10, 20, 30);
    }
}

/*1 - O objetivo do código é definir uma classe chamada "Funcao06"
que contém dois métodos de classe (estáticos): "algumasOperacoes"
e "imprimeValores." O método "algumasOperacoes" aceita três
argumentos inteiros (a, b e c), realiza uma troca de valores entre
esses argumentos e imprime os valores antes e depois da troca usando
o método "imprimeValores." No método 'main', o método "algumasOperacoes"
é chamado com os valores 10, 20 e 30.

2.1 - Os modificadores identificados são 'static', que são usados para declarar métodos de classe.

2.2 - Os métodos não possuem um tipo de retorno específico (void), o que
significa que eles não retornam valores, mas executam ações no código.

2.3 - Não há funções definidas neste código, apenas métodos de classe que realizam operações.

3 - O método "imprimeValores" está sendo invocado dentro do método
"algumasOperacoes" para imprimir os valores das variáveis 'a', 'b' e 'c'
antes e depois da troca de valores. O método "algumasOperacoes" é chamado
no método 'main' da classe "Funcao06" para realizar as operações de troca
de valores e impressão. Ambos os métodos têm origem na própria classe "Funcao06".*/ 