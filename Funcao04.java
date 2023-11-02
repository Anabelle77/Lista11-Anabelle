import java.math.*;
public class Funcao04
{
    static void calcular(double a, double b){
        System.out.println(Math.floor(a/b));
        System.out.println(Math.ceil(a/b));
        
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        
        System.out.println(Math.pow(a,b));
        
        System.out.println(Math.sqrt(a+b));
        
        System.out.println(Math.abs(-a-b));
    }
    public static void main(String []args) {
        calcular(2, 3);
    }
}

/*1 - O objetivo do código é definir uma classe chamada Funcao04 que
contém um método estático chamado "calcular." Este método aceita dois
argumentos do tipo double (a e b) e realiza várias operações matemáticas
usando funções da classe Math. Os resultados dessas operações são impressos.

2.1 - O modificador identificado é 'static', que é usado para declarar um método de classe.

2.2 - Os métodos declarados não têm um tipo de retorno específico (void),
o que significa que eles não retornam valores, mas, em vez disso, realizam
operações e produzem saídas na forma de impressões na tela.

2.3 - O método "calcular" é um método de classe (estático). Não há função
definida neste código, apenas métodos que executam operações matemáticas.

3 - O método "calcular" está sendo invocado no método 'main' da classe "Funcao04".
A origem de todos os métodos utilizados dentro do método "calcular" é a classe Math
da biblioteca padrão do Java. Eles são métodos estáticos dessa classe e, portanto,
são chamados diretamente usando a notação "ClasseMae.metodo()".*/ 
