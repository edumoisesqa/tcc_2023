package io.github.tcc_2023.clientes.model.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class ServicosPrestados {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private  Integer Id;
    @Column(nullable = false, length = 255
)
    private String descricao;

   @ManyToOne

    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

@Column
private BigDecimal valor;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
