package br.edu.univas.si.ejb.beans;

import java.util.stream.Collectors;

import javax.ejb.EJB;

import br.edu.univas.si.ejb.dao.Pedidodao;
import br.edu.univas.si.ejb.entities.Pedido;
import br.edu.univas.si.ejb.shopping.interfaces.PedidoLocal;
import br.edu.univas.si.ejb.shopping.interfaces.PedidoRemote;

public class PedidoBean implements PedidoLocal, PedidoRemote {
	
	@EJB
	private Pedidodao dao;

	@Override
	public void createNewPedido(String description, String order_time) {
		Pedido pedido = new Pedido();
		pedido.setDescription(description);
		pedido.setOrder_time(order_time);
		dao.insert(pedido);
		
	}

	@Override
	public String[] listPedidoCompra() {
		return dao.listAll().stream().map(Pedido::getDescription).collect(Collectors.toList()).toArray(new String[0]);
	}

}
