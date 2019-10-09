package aulajava.flavio;

public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adiciona(0, "Rafael");
        lista.adiciona(1, "Paulo");
        lista.adiciona(2, "Camila");
        lista.adiciona(3, "TESTE");
        
        //lista.removeDoComeco(); // NOVO
        lista.remove(2);
        
        System.out.println(lista.tamanho());
        
    }
}
