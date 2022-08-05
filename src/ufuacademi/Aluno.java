/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufuacademi;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 * Classe dos Alunos
 */
public class Aluno {
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String endereco;
    private String sexo;
    private ArrayList<Atividade> listaAtividades = new ArrayList();
    
    /**
     * Calcular Idade
     * @return Integer Idade 
     */
    public Integer calcularIdade(){        
            LocalDate dataNascimentoLocalDate = LocalDate.parse(dataNascimento);
            Period periodo = Period.between(dataNascimentoLocalDate,LocalDate.now());
            return periodo.getYears();
    }
    /**
     * Construtor da Classe Aluno
     * @param nome
     * @param dataNascimento
     * @param cpf
     * @param endereco
     * @param sexo 
     */
    public Aluno(String nome, String dataNascimento, String cpf, String endereco, String sexo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public ArrayList getListaAtividades() {
        return listaAtividades;
    }

    public void setListaAtividades(ArrayList listaAtividades) {
        this.listaAtividades = listaAtividades;
    }
    /**
     * Inscrever Aluno em Atividade
     * @param atividadeEscolhida
     * @return boolean foiInscrito
     */
    public boolean inscrever(Atividade atividadeEscolhida){
        boolean foiInscrito = false;
        for(Atividade atividade: listaAtividades){
            if (atividadeEscolhida==atividade) {
                foiInscrito = true;
                JOptionPane.showMessageDialog(null,"Este aluno já foi inscrito nessa atividade.","Erro na inscrição.",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        listaAtividades.add(atividadeEscolhida);
        return true;
    }
    
    /**
     * Gera uma String com a Lista de Atividades separadas por ponto e vírgula
     * @return String listaAtividadesCSV
     */
    public String listaAtividadesCSV(){
        String listaAtividadesCSV = "";
        for (Atividade atividade: listaAtividades) listaAtividadesCSV +=atividade.getCodigo()+";";
        return listaAtividadesCSV;
    }
    
    /**
     * Gera uma String com a Lista de Atividades separadas por linha
     * @return String listaAtividades
     */
    public String listaAtividades(){
        String listaAtividades = "";
        for (Atividade atividade: this.listaAtividades) listaAtividades +="\n"+atividade.getNome()+":"+atividade.getCodigo();
        return listaAtividades;
    }
    
    @Override
    public String toString() {
        return "Aluno:\n" + "\nNome: " + nome + "\nData de Nascimento: " + dataNascimento + "\nIdade: " + calcularIdade() + "\nCpf: " + cpf + "\nEndereco: " + endereco + "\nSexo: " + sexo+"\n\nLista de Atividades:\n"+listaAtividades();
    }
    
    public String toCSV() {
        return nome + ";" + dataNascimento + ";" + cpf + ";" + endereco + ";" + sexo+";"+listaAtividadesCSV();
    }
    
}
