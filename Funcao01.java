public class Funcao01
{
    static int caixaPreta(int a, int b){
        return a*a + b;
    }
    public static void main(String []args) {
        int resposta;
        resposta = caixaPreta(3, 5);
        System.out.println(resposta);
    }
}

/*1.O objetivo do código é definir a classe Funcao01 que contém um método "caixaPreta.",
que aceita dois argumentos inteiros a e b, e calcula o quadrado de a e soma b a ele, e
retorna o resultado. No 'main', "caixaPreta" é chamado com os valores 3 e 5, e o output
é o resultado da substituição de a e b por por 3 e 5, que é 14.

2.1 - O modificador identificado é 'static', que é usado para declarar um método de classe.

2.2 - O tipo de retorno identificado é 'int', que indica que o método retorna um valor inteiro.

2.3 - O método "caixaPreta" é um método de classe (estático) porque é declarado com o
modificador'static'. Não há função definida neste código, apenas métodos.

3 - O método "caixaPreta" está sendo invocado no método 'main' da classe "Funcao01".
A origem do método "caixaPreta" é a classe "Funcao01", pois está definido
na mesma classe onde está sendo chamado.*/ 