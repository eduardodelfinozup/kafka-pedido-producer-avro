package com.zupfood.pedido;


import com.zupfood.item.ItemResponse;
import com.zupfood.item.Item;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoResponse {

    private Long id;

    private Long idCliente;

    private Long idRestaurante;

    private LocalDateTime dataCriado;

    private List<ItemResponse> items;

    public PedidoResponse(Long id, Long idCliente,
                          Long idRestaurante, LocalDateTime dataCriado,
                          List<ItemResponse> items) {
        this.id = id;
        this.idCliente = idCliente;
        this.idRestaurante = idRestaurante;
        this.dataCriado = dataCriado;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public Long getIdRestaurante() {
        return idRestaurante;
    }

    public LocalDateTime getDataCriado() {
        return dataCriado;
    }

    public List<ItemResponse> getItems() {
        return items;
    }

    public static PedidoResponse of(Pedido pedido, List<Item> itens) {
        var itemsReponse = itens.stream()
                .map(i -> ItemResponse.of(i)).collect(Collectors.toList());
        return new PedidoResponse(pedido.getId(), pedido.getIdCliente(),
                pedido.getIdRestaurante(), pedido.getDataCriado(), itemsReponse);
    }
}
