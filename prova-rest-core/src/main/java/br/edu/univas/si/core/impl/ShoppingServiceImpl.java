package br.edu.univas.si.core.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;


import br.edu.univas.si8.rest.api.ShoppingService;
import br.edu.univas.si.ejb.shopping.interfaces.Pedido;

@RequestScoped
public class ShoppingServiceImpl implements ShoppingService {
	@EJB(mappedName = "java:app/prova-rest-ejb-0.1-SNAPSHOT/PedidoBean!br.edu.univas.si.ejb.shopping.interfaces.PedidoRemote")
    private Pedido pedido;

	@Override
	public String saveNewPedido(String description) {
		pedido.createNewPedido(description);
		return "{\"message\": \"Success\"}";
	}

	@Override
	public String[] listPedidoCompra() {
		return pedido.listPedidoCompra();
	}

}
