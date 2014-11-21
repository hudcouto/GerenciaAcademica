/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaUniversitario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TurmaExtensao extends Turma{
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String local;
    private Date dataInicio;
    private Date dataFim;
    //</editor-fold> 
   
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public TurmaExtensao(String local, String dataInicio, String dataFim, String professor, ArrayList<Aluno> listaAlunos) throws Excecoes{
        super(professor, listaAlunos);
        this.local = local;
                
        //Classe para conversão de String para Date.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            this.dataInicio = sdf.parse(dataInicio);
        } catch (ParseException ex) {
            //Logger.getLogger(TurmaExtensao.class.getName()).log(Level.SEVERE, null, ex);
            throw new Excecoes(1003, "Data de início inválida.");
        }
        try {
            this.dataFim = sdf.parse(dataFim);
        } catch (ParseException ex) {
            //Logger.getLogger(TurmaExtensao.class.getName()).log(Level.SEVERE, null, ex);
            throw new Excecoes(1004, "Data de término inválida.");
        }
        if (this.dataInicio.after(this.dataFim)){
            throw new Excecoes(1005, "A data de início deve preceder a data de término.");
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters e setters (local, dataInicio, dataFim)">
    public String getLocal() {
        return local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public Date getDataInicio() {
        return dataInicio;
    }
    
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public Date getDataFim() {
        return dataFim;
    }
    
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="isFromTurma (Verifica se o aluno pertence à turma)">
    // Método do tipo "Integer" ao invés de "int" pois o retorno deve ser "null" em caso negativo da verificação
    //(Considerando que o tipo primitivo "int" não é nullable.
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
