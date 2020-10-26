// Allan Matheus Chueiri Sklarow
package com.utfpr;

public class Teste {

    public static void main(String[] args) {
        Veiculo v = new Veiculo();

        v.setMarca("VW");
	    v.setModelo("Fusca");
	    v.setPlaca("ABC-123");
        v.setVelocMax(120);
        v.getMotor().setPotencia(1300);
        v.getMotor().setQtdPist(2);

        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());
        System.out.println("Placa: " + v.getPlaca());
        System.out.println("Velocidade Máxima: " + v.getVelocMax());
        System.out.println("Potência Motor: " + v.getMotor().getPotencia());
        System.out.println("Quantidade pistões do Motor: " + v.getMotor().getQtdPist());

    }
}
