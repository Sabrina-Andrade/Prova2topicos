package br.edu.univas.si8.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/shopping")
public interface ShoppingService {
	@GET
	@Path("/pedido/compra")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listPedidoCompra();

	@POST
	@Path("/pedido/{description}/{order_time}")
	@Produces(MediaType.APPLICATION_JSON)
	String saveNewPedido(@PathParam("description") String description, @PathParam("order_time") String order_time);

}


