
package br.cesjf.lppo;

import java.util.Date;



public class Visitante {
  private long id;
  private String nome;
  private int idade;
  private Date entrada;
  private Date saida;
  
public Visitante(){

}

   
    public long getId() {
        return id;
    }

  
    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getIdade() {
        return idade;
    }

   
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public Date getEntrada() {
        return entrada;
    }

    
    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    
    public Date getSaida() {
        return saida;
    }

   
    public void setSaida(Date saida) {
        this.saida = saida;
    }
  
}
