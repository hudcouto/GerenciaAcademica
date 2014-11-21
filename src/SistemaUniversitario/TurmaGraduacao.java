/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaUniversitario;

import java.util.ArrayList;

public class TurmaGraduacao extends Turma {
    
    //<editor-fold defaultstate="collapsed" desc="Atributo">
    private int semestre;
    private int ano;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Contrutor">
    public TurmaGraduacao(int semestre, int ano, String professor, ArrayList<Aluno> listaAlunos) throws Excecoes {
        super(professor, listaAlunos);
        this.semestre = semestre;
        this.ano = ano;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e setters (semestre, ano)">
    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="isFromTurma (Verifica se o aluno pertence à turma)">
    // Método do tipo "Integer" ao invés de "int" pois o retorno deve ser "null" em caso negativo da verificação.
    public Integer isFromTurma(String nome, String endereco){
        //For each percorrendo o ArrayList<Aluno>, propriedade da classe pai Turma (através do super).
        for (Aluno a: super.listaAlunos){
            //Caso nome e endereco do aluno sejam validados o metodo retornará a matricula do respectivo doidin.
            if (a.getNome().equals(nome) && a.getEndereco().equals(endereco)){
                return a.getMatricula();
            }
        }
         // como retornar null em método int?
        return null;
    }
    //</editor-fold>    

}