package br.edu.univas.si.core.impl;

import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.rest.api.ShoppingService;

@RequestScoped
public class ShoppingServiceImpl implements ShoppingService {
    private Shopping shopping;

	@Override
	public String saveNewPedido(String description, String order_time) {
		shopping.createNewPedido(description, order_time);
		return "{\"message\": \"Success\"}";
	}

	@Override
	public String[] listPedidoCompra() {
		return shopping.listPedidoCompra();
	}

}
