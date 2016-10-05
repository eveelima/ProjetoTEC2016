/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Teste;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author alexandrelerario
 */
public class CrudTeste extends AbstractCrud<br.data.entity.Teste> {

    private EntityManager em;

    private static final String PU = EMNames.EMN1;

    public CrudTeste() {
        super(Teste.class);
    }

    public List<br.data.entity.Teste> SelectByNome(String nome) {
        try {
            return getEntityManager().createNamedQuery("Teste.findByNome").setParameter("nome", "%" + nome + "%").getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }

}
