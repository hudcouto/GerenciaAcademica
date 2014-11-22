package SistemaUniversitario;

public class Aluno {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int matricula;
    private String nome;
    private String endereco;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Aluno(int matricula, String nome, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e setters (matricula, nome, endereco)">
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
//</editor-fold>
   
}