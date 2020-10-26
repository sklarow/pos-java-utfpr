// Allan Matheus Chueiri Sklarow
package com.utfpr;

public class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private float velocMax;
    private Motor motor = new Motor();

    public Veiculo(){
        placa = "";
        marca = "";
        modelo = "";
        velocMax = 0;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
