/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaUniversitario;

/**
 *
 * @author Maquina 8
 */
public class Excecoes extends Exception{
    
     //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int codigoErro;
    private String mensagemErro;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Excecoes(int codigoErro, String mensagemErro) {
        super("Erro " + codigoErro + ".\n" + mensagemErro);
        this.codigoErro = codigoErro;
        this.mensagemErro = mensagemErro;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters (codigoerro; mensagemErro)">
    public int getCodigoErro() {
        return codigoErro;
    }
    
    public void setCodigoErro(int codigoErro) {
        this.codigoErro = codigoErro;
    }
    
    public String getMensagemErro() {
        return mensagemErro;
    }
    
    public void setMensagemErro(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }
    //</editor-fold>
    
    
}
