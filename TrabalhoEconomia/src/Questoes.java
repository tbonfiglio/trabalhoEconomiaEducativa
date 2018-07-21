/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago_NB
 */
public class Questoes {
    
    private String Titulo;
    private String Contexto;
    private String RespostaBaixo;
    private String RespostaCima;
    private String Detalhes;
    private boolean RespostaBaixoCerta;
    
    public Questoes(String Titulo, String Contexto, String RespostaBaixo, String RespostaCima, String Detalhes, boolean RespostaBaixoCerta) {
        this.Titulo = Titulo;
        this.Contexto = Contexto;
        this.RespostaBaixo = RespostaBaixo;
        this.RespostaCima = RespostaCima;
        this.Detalhes = Detalhes;
        this.RespostaBaixoCerta = RespostaBaixoCerta;
    }    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getContexto() {
        return Contexto;
    }

    public void setContexto(String Contexto) {
        this.Contexto = Contexto;
    }

    public String getRespostaBaixo() {
        return RespostaBaixo;
    }

    public void setRespostaBaixo(String RespostaBaixo) {
        this.RespostaBaixo = RespostaBaixo;
    }

    public String getRespostaCima() {
        return RespostaCima;
    }

    public void setRespostaCima(String RespostaCima) {
        this.RespostaCima = RespostaCima;
    }

    public String getDetalhes() {
        return Detalhes;
    }

    public void setDetalhes(String Detalhes) {
        this.Detalhes = Detalhes;
    }

    public boolean isRespostaBaixoCerta() {
        return RespostaBaixoCerta;
    }

    public void setRespostaBaixoCerta(boolean RespostaBaixoCerta) {
        this.RespostaBaixoCerta = RespostaBaixoCerta;
    }
}
