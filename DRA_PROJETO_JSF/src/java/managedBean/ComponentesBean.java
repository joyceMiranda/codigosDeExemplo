/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ComponentesBean {
    
    private boolean exAluno;
    private long cursosEscolhidos;
    private String genero;
    private String mensagem;
    private List<Curso> cursos = new ArrayList<Curso>();
        
    public ComponentesBean() {
       cursos.add(new Curso(0L, "POO - Dinâmico"));
       cursos.add(new Curso(1L, "DRA - Dinâmico"));
    }

    public long getCursosEscolhidos() {
        return cursosEscolhidos;
    }

    public void setCursosEscolhidos(long cursosEscolhidos) {
        this.cursosEscolhidos = cursosEscolhidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public boolean isExAluno() {
        return exAluno;
    }
    
    public void setExAluno(boolean exAluno) {
        this.exAluno = exAluno;
    }
    
     public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    
    public List<Curso> getCursos(){
        return cursos;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public void sayHello(){
        this.mensagem = "Hello!!";
    }
    
    public String adicionarTurma(Curso curso){
        return "index";
    }

}
