package br.edu.univas.si.core.impl;

import javax.enterprise.context.RequestScoped;


import br.edu.univas.si8.rest.api.ShoppingService;
import br.edu.univas.si.ejb.shopping.interfaces.Pedido;

@RequestScoped
public class ShoppingServiceImpl implements ShoppingService {
    private Pedido pedido;

	@Override
	public String saveNewPedido(String description, String order_time) {
		pedido.createNewPedido(description, order_time);
		return "{\"message\": \"Success\"}";
	}

	@Override
	public String[] listPedidoCompra() {
		return pedido.listPedidoCompra();
	}

}
