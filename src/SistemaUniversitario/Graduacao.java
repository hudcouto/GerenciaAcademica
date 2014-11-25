package SistemaUniversitario;

public class Graduacao extends Curso {
    
    //<editor-fold defaultstate="collapsed" desc="Atributo">
    private String turno;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Graduacao(String turno, String codCurso, String departamento, String nome, String coordenador){
        super(codCurso, departamento, nome, coordenador);
        this.turno = turno;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get e set do turno">
    public String getTurno() {
        return turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos listaExtensaoPeriodo">
    public Periodo isOnListaExtensaoperiodo (int numero){
        for (Object o : super.listaExtensaoPeriodo){
            if (o instanceof Periodo){
                Periodo p = (Periodo) o; //cast
                if (p.getNumero() == numero){
                    return p;
                }
            }
        }
        return null;
    }
    
    public TurmaExtensao isOnListaExtensaoperiodo (String nome){
        for (Object o : super.listaExtensaoPeriodo){
            if (o instanceof TurmaExtensao){
                TurmaExtensao t = (TurmaExtensao) o; //cast
                if (t.getLocal() == nome){          //verificar "nome" na classe TurmaExtensao se é compatível com "local"
                    return t;
                }
            }
        }
        return null;
    }
    //</editor-fold>
   
}
