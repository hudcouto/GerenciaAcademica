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
public abstract class Curso {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String codCurso;
    private String departamento;
    private String nome;
    private String coordenador;
    protected ArrayList listaExtensaoPeriodo; 
    private ArrayList <Aluno> listaAlunos;
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Método construtor da classe">
    public Curso(String codCurso, String departamento, String nome, String coordenador) {
        this.codCurso = codCurso;
        this.departamento = departamento;
        this.nome = nome;
        this.coordenador = coordenador;
        this.listaExtensaoPeriodo = new ArrayList();
        this.listaAlunos = new ArrayList<Aluno>();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters dos atributos">
    public String getCodCurso() {
        return codCurso;
    }
    
    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCoordenador() {
        return coordenador;
    }
    
    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public ArrayList getListaExtensaoPeriodo() {
        return listaExtensaoPeriodo;
    }

    public void setListaExtensaoPeriodo(ArrayList listaExtensaoPeriodo) {
        this.listaExtensaoPeriodo = listaExtensaoPeriodo;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos da listaExtensaoPeriodo">
    public void insertExtensaoPeriodo(String local, String dataInicio, String dataFim, String professor, ArrayList<Aluno> listaAlunos) throws Excecoes{
        TurmaExtensao t = new TurmaExtensao(local, dataInicio, dataFim, professor, listaAlunos);
        this.listaExtensaoPeriodo.add(t);
    }
    
    public void insertExtensaoPeriodo(int numero, int quantidadeCreditos){
        Periodo p = new Periodo(numero, quantidadeCreditos);
        this.listaExtensaoPeriodo.add(p);
    }
    
    public void deleteExtensaoPeriodo(Turma t){
        this.listaExtensaoPeriodo.remove(t);
    }
    
    public void deleteExtensaoPeriodo(Periodo p){
        this.listaExtensaoPeriodo.remove(p);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos da listaAlunos">
    public void insertAlunoIntoCurso(Aluno a){
        this.listaAlunos.add(a);
    }
    
    public void deleteAlunoFromCurso(Aluno a){
        this.listaAlunos.remove(a);
    }
    //</editor-fold>
    
}
