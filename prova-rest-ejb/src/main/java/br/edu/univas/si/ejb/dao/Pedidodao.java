package br.edu.univas.si.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si.ejb.entities.Pedido;

@Stateless
public class Pedidodao {
	
	@PersistenceContext(unitName = "pedido")
	private EntityManager em;

	public void insert(Pedido pedido) {
		em.persist(pedido);
	}

	public List<Pedido> listAll() {
		return em.createQuery("from pedido p", Pedido.class).getResultList();
	}

	

}


