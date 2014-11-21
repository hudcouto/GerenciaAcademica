/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaUniversitario;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Extensao extends Curso{
    
    //<editor-fold defaultstate="collapsed" desc="Atributo">
    private int cargaHoraria;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Extensao(int cargaHoraria, String codCurso, String departamento, String nome, String coordenador) {
        super(codCurso, departamento, nome, coordenador);
        this.cargaHoraria = cargaHoraria;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get e set da cargaHoraria">
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
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
