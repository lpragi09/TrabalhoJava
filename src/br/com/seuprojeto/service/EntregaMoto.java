package br.com.seuprojeto.service;

public class EntregaMoto implements Entregavel {
    @Override
    public void realizarEntrega() {
        System.out.println("Entrega rápida motorizada realizada com sucesso!");
    }
}

