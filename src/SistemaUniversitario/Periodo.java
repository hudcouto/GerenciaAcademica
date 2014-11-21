/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaUniversitario;

import java.util.ArrayList;

public class Periodo {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int numero;
    private int quantidadeCreditos;
    private ArrayList<Disciplina> listaDisciplinas;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Periodo(int numero, int quantidadeCreditos) {
        this.numero = numero;
        this.quantidadeCreditos = quantidadeCreditos;
        this.listaDisciplinas = new ArrayList<Disciplina>();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters(numero; quantidadeCreditos)">
    public int getNumero() {
        return numero;
    }
    
    /*public void setNumero(int numero) {
    this.numero = numero;
    }*/
    
    public int getQuantidadeCreditos() {
        return quantidadeCreditos;
    }
    
    /*public void setQuantidadeCreditos(int quantidadeCreditos) {
    this.quantidadeCreditos = quantidadeCreditos;
    }*/
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos listaDisciplinas">
    public ArrayList<Disciplina> getListaDisciplinas(){
        return this.listaDisciplinas;
    }
    
    public Disciplina getDisciplinaFromLista(String nome, int cargaHoraria, int quantCreditos){
        for (Disciplina d: this.listaDisciplinas){
            if (d.getNome().equals(nome) && d.getCargaHoraria() == cargaHoraria && d.getQuantCreditos() == quantCreditos)
                return d;
        }
        return null;
    }
    
    public void insertIntoListaDisciplinas(int cod, String nome, int cargaHoraria, int quantCreditos, int quantMinCreditos){
        Disciplina d = new Disciplina(cod, nome, cargaHoraria, quantCreditos, quantMinCreditos);
        this.listaDisciplinas.add(d);
    }
    
    public boolean deleteFromListaDisciplinas(int cod){
        for (Disciplina d: this.listaDisciplinas){
            if (d.getCod() == cod){
                this.listaDisciplinas.remove(d);
                return true;
            }
        }
        return false;
    }
//</editor-fold>
}
