package br.edu.univas.si.ejb.beans;

import java.util.Date;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.si.ejb.dao.Pedidodao;
import br.edu.univas.si.ejb.entities.Pedido;
import br.edu.univas.si.ejb.shopping.interfaces.PedidoLocal;
import br.edu.univas.si.ejb.shopping.interfaces.PedidoRemote;


@Stateless
@Local(PedidoLocal.class)
@Remote(PedidoRemote.class)
public class PedidoBean implements PedidoLocal, PedidoRemote {
	
	@EJB
	private Pedidodao dao;

	@Override
	public void createNewPedido(String description) {
		Pedido pedido = new Pedido();
		pedido.setDescription(description);
		pedido.setOrder_time(new Date());
		dao.insert(pedido);
		
	}

	@Override
	public String[] listPedidoCompra() {
		return dao.listAll().stream().map(Pedido::getDescription).collect(Collectors.toList()).toArray(new String[0]);
	}

}
