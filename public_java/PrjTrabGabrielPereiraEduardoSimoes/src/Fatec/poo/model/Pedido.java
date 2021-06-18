/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fatec.poo.model;
import Fatec.poo.View.GuiEmitirPedido;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel de Barros e Eduardo Simões
 */
public class Pedido {
    private String numeroPedido;
    private String dataEmissao;
    private String dataPagamento;
    private boolean formaPagamento;
    private boolean situacao;
    private Cliente cliente;
    private Produto produto;
    private ItemPedido itempedido;
    private ArrayList<ItemPedido>itens_pedidos;
    private Vendedor vendedor;
    private GuiEmitirPedido view;

    
    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setFormaPagamento(boolean formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public boolean isFormaPagamento() {
        return formaPagamento;
    }

    public boolean isSituacao() {
        return situacao;
    }
    
    
    public ItemPedido getItempedido() {
        return itempedido;
    }

    public void setItempedido(ItemPedido itempedido) {
        this.itempedido = itempedido;
    }

    public Pedido(String numeroPedido, String dataEmissao) {
        this.numeroPedido = numeroPedido;
        this.dataEmissao = dataEmissao;
        itens_pedidos = new ArrayList<>();
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void addItem(ItemPedido i){
        itens_pedidos.add(i);
        i.setPedido(this);
    }

    public void removeItem(ItemPedido i){
        itens_pedidos.remove(i);
        i.setPedido(null);
    }

    public ArrayList<ItemPedido> getItens_pedidos() {
        return itens_pedidos;
    }

    public void setItens_pedidos(ArrayList<ItemPedido> itens_pedidos) {
        this.itens_pedidos = itens_pedidos;
    }
    
    
    
    
    
    
    
}
