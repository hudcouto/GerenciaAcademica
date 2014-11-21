/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaUniversitario;

import java.util.ArrayList;

/**
 *
 * @author Maquina 8
 */
public abstract class Turma {
    
     //<editor-fold defaultstate="collapsed" desc="Atributos">
    private static int codigoSequencia = 1;
    private int codigo;
    private String professor;
    protected ArrayList<Aluno> listaAlunos;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Turma(String professor, ArrayList<Aluno> listaAlunos) throws Excecoes {
        if (listaAlunos.size() < 5){
            throw new Excecoes(1001,
                                "Número insuficiente de alunos para formar a turma: "
                                + listaAlunos.size()
                                + ".\nMínimo necessário: 5 alunos."
                                + ".\nDeseja inserir novos alunos à turma?");
        }
        //throw p
        this.codigo = this.codigoSequencia;
        this.codigoSequencia++;
        this.professor = professor;
        this.listaAlunos = listaAlunos;

    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters e setters (codigo, professor)">
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
     //throw exception pra controlar CodigoSequencia e manipular o codigo adequadamente
        this.codigo = codigo;
    }
    
    public String getProfessor() {
        return professor;
    }
    
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos da listaAlunos">
    public void insertAlunoIntoTurma(Aluno a){
        //if (a.)
        this.listaAlunos.add(a);
    }
    
    public void deleteAlunoFromTurma(int matricula){
        for(Aluno a: this.listaAlunos){
            if (a.getMatricula() == matricula){
                this.listaAlunos.remove(a);
                return;
            }
        }
    }
    
    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
    //</editor-fold>
    
}
