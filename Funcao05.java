public class Funcao05
{
    static boolean nao(boolean p){
        return !p;
    }
    public static void main(String []args) {
        boolean var;
        
        var = true;
        System.out.println(var);
        System.out.println(nao(var));
        System.out.println(nao(nao(var)));
    }
}

/*1 - O objetivo do código é definir uma classe chamada "Funcao05"
que contém um método estático chamado "nao." Este método aceita um
argumento booleano (p) e retorna o valor oposto, ou seja, nega o
valor de 'p'. No método 'main', a variável booleana 'var' é definida
como verdadeira (true), e em seguida, o método "nao" é usado para
inverter o valor de 'var' e imprimir o resultado. O método "nao" é
chamado novamente para inverter o valor duas vezes consecutivas e
imprimir os resultados.

2.1 - O modificador identificado é 'static', que é usado para declarar um método de classe.

2.2 - O tipo de retorno é 'boolean', indicando que o método retorna um valor booleano (true ou false).

2.3 - O método "nao" é um método de classe (estático). Não há função
definida neste código, apenas um método que inverte valores booleanos.

3 - O método "nao" está sendo invocado no método 'main' da classe "Funcao05".
A origem do método "nao" é a própria classe "Funcao05", pois ele está definido
na mesma classe onde está sendo chamado.*/ 