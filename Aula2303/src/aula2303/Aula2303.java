package aula2303;

import java.util.ArrayList;
import java.util.List;

public class Aula2303 {

    public static void main(String[] args) {
       
        List<Aviao> lista = new ArrayList<Aviao>();
        
        //instanciando obj
        Aviao av = new Aviao();
        
        //setando valor
        av.setCodigo(1);
        av.setNome("Boing");
        av.setModelo("Boeing");
        av.setCapacidade(150);
        
        //add avião na lista
        lista.add(av);
        
        //novo objeto av
        av = new Aviao();
        av.setCodigo(2);
        av.setNome("Varing Air");
        av.setModelo("VR-291");
        av.setCapacidade(250);
        
        lista.add(av);
        
        av.listaAviao(lista) ;
    }
    
}
