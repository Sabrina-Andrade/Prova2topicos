package br.edu.univas.si.ejb.shopping.interfaces;

public interface Pedido {

	void createNewPedido(String description);
	
	String[] listPedidoCompra();
	
}
