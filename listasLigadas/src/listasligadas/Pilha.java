package listasligadas;


import java.util.LinkedList;

public class Pilha {

    private LinkedList<Object> objetos = new LinkedList<Object>();
    
    public void insere (Object objeto){
        this.objetos.add(objeto);
    }
        
            public Object remove (){
                return this.objetos.remove (this.objetos.size()-1);
          
            }
            public boolean vazia (){
                return this.objetos.size()== 0;
                
    }
    }
        

