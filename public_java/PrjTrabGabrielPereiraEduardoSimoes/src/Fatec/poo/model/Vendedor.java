/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author Gabriel de Barros e Eduardo Simões
 */
public class Vendedor extends Pessoa {
    private double salBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos;

    public Vendedor( String cpf, String nome, double salBase) {
        super(cpf, nome);
        this.salBase = salBase;
        pedidos = new ArrayList<>();
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p);
        p.setVendedor(this);
    }
    public void removePedido(Pedido p){
        pedidos.remove(p);
        p.setVendedor(null);
    }
    
}
