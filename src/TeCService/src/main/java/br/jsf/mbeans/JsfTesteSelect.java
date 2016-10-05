/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf.mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author admin
 */
@ManagedBean
@SessionScoped
public class JsfTesteSelect  {

    /**
     * Creates a new instance of JsfTesteSelect
     */
    public JsfTesteSelect() {
    }
    
    private int codigo;
    private String nome;
    
    public java.util.Collection<br.data.entity.Teste> getSelect(){
            return new br.data.crud.CrudTeste().SelectByNome(this.nome);
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
