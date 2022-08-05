/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufuacademi;

import java.util.ArrayList;

/**
 * Classe das Atividades
 */
public class Atividade {
    private String codigo;
    private String nome;
    private String descricao;
    private String categoria;
    private ArrayList<Aluno> listaAlunos = new ArrayList();
    
    /**
     * Construtor da Classe Atividade
     * @param codigo
     * @param nome
     * @param descricao
     * @param categoria 
     */
    public Atividade(String codigo, String nome, String descricao, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    
    public void inscrever(Aluno aluno){
        listaAlunos.add(aluno);
    }
    /**
     * Gera uma String com a Lista de Alunos separadas por ponto e vírgula
     * @return String listaAlunosCSV
     */
    public String listaAlunosCSV(){
        String listaAlunosCSV = "";
        for (Aluno aluno: listaAlunos) listaAlunosCSV +=aluno.getCpf()+";";
        return listaAlunosCSV;
    }
    
    /**
     * Gera uma String com a Lista de Alunos separadas por linha
     * @return String listaAlunos
     */
    public String listaAlunos(){
        String listaAlunos = "";
        for (Aluno aluno: this.listaAlunos) listaAlunos +="\n"+aluno.getNome()+":"+aluno.getCpf();
        return listaAlunos;
    }    
    
    @Override
    public String toString() {
        return "Atividade:\n" + "\nCódigo: " + codigo + "\nNome: " + nome + "\nDescrição: " + descricao + "\nCategoria: " + categoria+"\n\nLista de Alunos:\n"+listaAlunos();
    }
    
    public String toCSV(){
        return codigo + ";" + nome + ";" + descricao + ";" + categoria+";"+listaAlunosCSV();
    }
    
}
