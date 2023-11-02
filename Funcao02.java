public class Funcao02
{
    static double calcular(double a, double b){
        double x;
        
        x = a*a + 2*a*b + b*b;
        
        return x;
        
    }
    public static void main(String []args) {
        double resposta;
        resposta = calcular(2, 3);
        System.out.println(resposta);
    }
}

/*1 - O objetivo do código é definir uma classe chamada "Funcao02" que contém um método
estático chamado "calcular." Este método aceita dois argumentos do tipo double (a e b),
calcula a expressão (a^2 + 2ab + b^2) e retorna o resultado. Em seguida, no método 'main',
o método "calcular" é chamado com os valores 2 e 3, e o resultado é impresso na saída padrão.

2.1 - O modificador identificado é 'static', que é usado para declarar um método de classe.

2.2 - O tipo de retorno é 'double', que indica que o método retorna um valor em double.

2.3 - O método "calcular" é um método de classe (estático) porque é declarado com o modificador
'static'. Não há função definida neste código, apenas métodos.

3 - O método "calcular" está sendo invocado no método 'main' da classe "Funcao02". A origem
do método "calcular" é a própria classe "Funcao02", pois ele está definido na mesma classe
onde está sendo chamado.*/ 