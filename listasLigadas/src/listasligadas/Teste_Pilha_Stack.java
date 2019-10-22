/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasligadas;

/**
 *
 * @author Aluno03
 */
public class Teste_Pilha_Stack {
    
    public static void main(String[] args) {
        
        Pilha_Stack pilha = new Pilha_Stack ();
        
        pilha.insere("Mario");
        pilha.insere("Joao");
        pilha.insere("Maria");
        pilha.insere("José");
        
        Object Jose = pilha.remove();
        Object Maria = pilha.remove();
        Object Joao = pilha.remove();
        Object Mario = pilha.remove();
        
        System.out.println(Jose);
        System.out.println(Maria);
        System.out.println(Joao);
        System.out.println(Mario);
        
        if (pilha.vazia()){
            System.out.println("A pilha está vazia");
            System.out.println(pilha.tamanho());}
        else { System.out.println("A pilha não está vazia");
            System.out.println(pilha.tamanho());
            
        }
        
        
         
    }
     
    
}
