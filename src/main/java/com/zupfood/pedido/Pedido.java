package com.zupfood.pedido;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idCliente;

    private Long idRestaurante;

    private LocalDateTime dataCriado;

    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;


    public Pedido() {
    }

    public Pedido(Long idCliente, Long idRestaurante) {
        this.idCliente = idCliente;
        this.idRestaurante = idRestaurante;
        this.statusPedido = StatusPedido.SOLICITADO;
        this.dataCriado = LocalDateTime.now();
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

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", idCliente=" + idCliente +
                ", idRestaurante=" + idRestaurante +
                ", dataCriado=" + dataCriado +
                '}';
    }

    public void cancelar() {
        this.statusPedido = StatusPedido.CANCELADO;
    }
}