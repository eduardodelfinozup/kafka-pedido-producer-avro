package com.zupfood.pedido;


import com.zupfood.item.Item;
import com.zupfood.item.ItemRequest;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class PedidoRequest {

    @NotNull
    private Long idCliente;

    @NotNull
    private Long idRestaurante;

    @NotEmpty
    private List<ItemRequest> items;

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdRestaurante(Long idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public void setItems(List<ItemRequest> items) {
        this.items = items;
    }

    public List<ItemRequest> getItems() {
        return items;
    }

    public Pedido getPedido() {
        return new Pedido(this.idCliente, this.idRestaurante);
    }

    public List<Item> getItens(Pedido pedido){
        return ItemRequest.getItems(this.getItems(), pedido);
    }
}