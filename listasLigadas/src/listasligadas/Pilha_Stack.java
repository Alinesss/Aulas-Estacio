package listasligadas;


import java.util.Stack;

public class Pilha_Stack {

    private int totalDeElementos;

    private Stack<Object> objetos = new Stack<Object>();

    public void insere(Object objeto) {
        this.objetos.push(objeto);
        this.totalDeElementos++;

    }

    public Object remove() {
        this.totalDeElementos--;
        return this.objetos.pop();

    }

    public boolean vazia() {
        return this.objetos.size() == 0;

    }

    public int tamanho() {
        return this.totalDeElementos;
    }
}
