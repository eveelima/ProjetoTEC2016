/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author alexandrelerario
 */
@ManagedBean
@RequestScoped
public class JsfTeste {

    /**
     * Creates a new instance of JsfTeste
     */
    private int codigo;
    private String nome;
  
    
    public JsfTeste() {
        
    }
    
   
    public void persist(){
       br.data.entity.Teste teste = new br.data.entity.Teste();
       teste.setCodigo(codigo);
       teste.setNome(nome);
       new br.data.crud.CrudTeste().persist(teste);
       this.codigo=0;
       this.nome="";
    }
    
    public void remove(br.data.entity.Teste teste){
        new br.data.crud.CrudTeste().remove(teste);
    }
    
    public java.util.Collection<br.data.entity.Teste> getAll(){
        return new br.data.crud.CrudTeste().getAll();
    }

    public String update(br.data.entity.Teste teste){
        this.codigo = teste.getCodigo();
        this.nome = teste.getNome();
        return "merge.xhtml";
    }
    
    public void merge(){
        br.data.entity.Teste teste;
        teste = new br.data.crud.CrudTeste().find(this.codigo);
        teste.setNome(this.nome);
        new br.data.crud.CrudTeste().merge(teste);
        this.nome="";
        this.codigo=0;  
    }
    
    
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
    
}
