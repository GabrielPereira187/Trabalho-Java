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
public class Cliente extends Pessoa {
    private double limiteDisponivel;
    private double limiteCredito;
    private ArrayList<Pedido> pedidos;
    private Pedido pedido;
    private String tipo;

    public Cliente( String cpf, String nome, double limiteCredito) {
        super(cpf, nome);
        this.limiteCredito = limiteCredito;
        limiteDisponivel = limiteCredito;
        pedidos = new ArrayList<>();
    }


    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    public void addPedido(Pedido p){
        pedidos.add(p);
        p.setCliente(this);
    }
    public void removePedido(Pedido p){
        pedidos.remove(p);
        p.setCliente(null);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
