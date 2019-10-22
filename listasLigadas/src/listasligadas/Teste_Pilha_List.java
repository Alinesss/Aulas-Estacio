package listasligadas;



public class Teste_Pilha_List {
    
    public static void main(String[] args) {
        Pilha pilha = new Pilha ();
        
        pilha.insere("Joao");
        pilha.insere("Maria");
        pilha.insere("José");
        
        Object Jose = pilha.remove();
        Object Maria = pilha.remove();
        Object Joao = pilha.remove();
        
        System.out.println(Jose);
        System.out.println(Maria);
        System.out.println(Joao);
        
        
        if (pilha.vazia()){
            System.out.println("A pilha está vazia");
            
            
            } else {System.out.println("A pilha não está vazia");
                    }
            
                    }
        }
    
    
