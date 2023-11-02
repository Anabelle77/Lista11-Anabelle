import java.math.*;
public class Funcao03
{
    static double calcular(double a, double b){
        double x;
        
        x = Math.pow(a, 2) + 2a*b + Math.pow(b, 2)
        
        return x;
        
    }
    public static void main(String []args) {
        double resposta;
        resposta = calcular(2, 3);
        System.out.println(resposta);
    }
}

/*1 - O objetivo do código é definir uma classe chamada "Funcao03" que
contém um método estático chamado "calcular." Este método aceita dois
argumentos do tipo double, calcula a expressão usando funções da classe
Math e retorna o resultado. No método 'main', o método "calcular" é chamado
com os valores 2 e 3, e o resultado é impresso na saída padrão.

2.1 - Não há modificadores especificados, mas o método é um método de classe
(estático) por padrão.

2.2 - O tipo de retorno identificado é 'double', que indica que o método
retorna um valor em ponto flutuante (double).

2.3 - O método "calcular" é um método de classe (estático) por padrão.
Não há função definida neste código, apenas métodos.

3 - O método "calcular" está sendo invocado no método 'main' da classe
"Funcao03". A origem do método "calcular" é a própria classe "Funcao03",
pois ele está definido na mesma classe onde está sendo chamado.*/ 