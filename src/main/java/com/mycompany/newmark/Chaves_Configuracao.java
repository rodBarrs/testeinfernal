/**
 * @author Felipe Marques, João Paulo, Gabriel Ramos, Rafael Henrique
 * 
 * Reponsável por armazenar as configurações de triagem setadas pelo usuário
 */

package com.mycompany.newmark;

public class Chaves_Configuracao {
    private boolean TriarAntigo; 
    private String TipoTriagem = "";     //Varchar de 3 - COM (completa) - MOV (movimentação) - DOC (documento)
    private boolean JuntManual;
    private boolean LaudoPericial;
    private boolean PeticaoInicial;
        
    public boolean isTriarAntigo() {
        return TriarAntigo;
    }

    public void setTriarAntigo(boolean TriarAntigo) {
        this.TriarAntigo = TriarAntigo;
    }

    public String getTipoTriagem() {
        return TipoTriagem;
    }

    public void setTipoTriagem(String TipoTriagem) {
        this.TipoTriagem = TipoTriagem;
    }

    public boolean isJuntManual() {
        return JuntManual;
    }

    public void setJuntManual(boolean JuntManual) {
        this.JuntManual = JuntManual;
    }

    public boolean isLaudoPericial() {
        return LaudoPericial;
    }

    public void setLaudoPericial(boolean LaudoPericial) {
        this.LaudoPericial = LaudoPericial;
    }

    public boolean isPeticaoInicial() {
        return PeticaoInicial;
    }

    public void setPeticaoInicial(boolean PeticaoInicial) {
        this.PeticaoInicial = PeticaoInicial;
    }
    
    

    @Override
    public String toString() {
        return "Configuracao:"
                + "\nTriarAntigo: " + TriarAntigo
                + "\nTipoTriagem: " + TipoTriagem
                + "\nJuntManual: " + JuntManual
                + "\nLaudoPericial: " + LaudoPericial
                + "\nPetiçãoInicial: " + PeticaoInicial;
    }

}