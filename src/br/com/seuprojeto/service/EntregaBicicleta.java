package br.com.seuprojeto.service;

public class EntregaBicicleta implements Entregavel {
    @Override
    public void realizarEntrega() {
        System.out.println("Entrega ecológica realizada com bicicleta!");
    }
}

