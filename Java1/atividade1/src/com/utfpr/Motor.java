// Allan Matheus Chueiri Sklarow
package com.utfpr;

public class Motor {
    private int qtdPist;
    private int potencia;

    public Motor(){
        qtdPist = 0;
        potencia = 0;
    }

    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
