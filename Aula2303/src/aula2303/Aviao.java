package aula2303;

import java.util.List;

public class Aviao {
    private int codigo;
    private String nome;
    private String modelo;
    private int capacidade;

 
    public int getCodigo() {
        return codigo;
    }

   
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getModelo() {
        return modelo;
    }

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public int getCapacidade() {
        return capacidade;
    }

    void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public void listaAviao(List<Aviao> lista){
        if(!lista.isEmpty()){
         for (Aviao av : lista){
             System.out.println(av.getNome());
             System.out.println(av.getModelo());
             System.out.println(av.getCapacidade());
             System.out.println("##############");
             
            }
         }else{
            System.out.println("Lista Vazia");
        }
    }
}
