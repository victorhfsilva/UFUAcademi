/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufuacademi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe Gerenciadora de Atividades
 */
public class GerenciadorAtividades {
    private ArrayList<Atividade> listaAtividades = new ArrayList();

    public ArrayList<Atividade> getListaAtividades() {
        return listaAtividades;
    }

    public void setListaAtividades(ArrayList<Atividade> listaAtividades) {
        this.listaAtividades = listaAtividades;
    }
    /**
     * Cadastrar uma nova atividade
     * @param novaAtividade
     * @return boolean foiCadastrado
     */
    public boolean novo(Atividade novaAtividade){
        boolean foiCadastrada = false;
        for (Atividade atividade: listaAtividades){
            if(atividade.getCodigo().equals(novaAtividade.getCodigo())){
                JOptionPane.showMessageDialog(null,"O código desta atividade não é único.","Erro no cadastro.",JOptionPane.ERROR_MESSAGE);
                foiCadastrada = true;
                break;
            }
        }
        if (!foiCadastrada) {
            listaAtividades.add(novaAtividade);
            listaAtividades.sort((aluno1,aluno2)->(aluno1.getCategoria()+": "+aluno1.getNome()).compareTo((aluno2.getCategoria()+": "+aluno2.getNome())));
            exportar("src/dados/ListaDeAtividades.csv");
            return true;
        }
        return false;
    }
    
    /**
     * Editar uma atividade já existente
     * @param indiceAtividadeEscolhida
     * @param codigo
     * @param nome
     * @param descricao
     * @param categoria 
     */
    public void editar(int indiceAtividadeEscolhida, String codigo, String nome, String descricao, String categoria){
        Atividade atividadeEscolhida = listaAtividades.get(indiceAtividadeEscolhida);    
        atividadeEscolhida.setCodigo(codigo);
        atividadeEscolhida.setDescricao(descricao);
        boolean categoriaOuNomeFoiAlterado = !(nome.equals(atividadeEscolhida.getNome()) && categoria.equals(atividadeEscolhida.getCategoria()));
        if (categoriaOuNomeFoiAlterado){
            atividadeEscolhida.setCategoria(categoria);
            atividadeEscolhida.setNome(nome);
            listaAtividades.sort((aluno1,aluno2)->(aluno1.getCategoria()+": "+aluno1.getNome()).compareTo((aluno2.getCategoria()+": "+aluno2.getNome())));
        }
        exportar("src/dados/ListaDeAtividades.csv");
    }
    
    /**
     * Deletar uma atividade
     * @param indiceAtividadeEscolhida 
     */
    public void deletar(int indiceAtividadeEscolhida){
        listaAtividades.remove(indiceAtividadeEscolhida);
        exportar("src/dados/ListaDeAtividades.csv");
    }
    
    /**
     * Importar os dados de um arquivo
     * @param nomeArquivo
     */
    public void importar(String nomeArquivo){
        listaAtividades = new ArrayList();
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader entrada = new BufferedReader(arquivo);
            while (entrada.ready()){
                String linha = entrada.readLine();
                String[] valoresDaLinha = linha.split(";");
                if (valoresDaLinha.length >= 4){
                    Atividade atividade = new Atividade(valoresDaLinha[0], valoresDaLinha[1], valoresDaLinha[2], valoresDaLinha[3]);
                    ArrayList<Aluno> listaAlunos = new ArrayList();
                    for (int i = 4; i<valoresDaLinha.length;i++){
                        for (Aluno aluno: UFUAcademi.gerenciadorAlunos.getListaAlunos()){
                            if  (aluno.getCpf().equals(valoresDaLinha[i])){
                                listaAlunos.add(aluno);
                            } 
                        }
                        atividade.setListaAlunos(listaAlunos);
                    }
                    listaAtividades.add(atividade);
                }
                
            }  
        }
        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Arquivo não encontrado.","Erro na importação.",JOptionPane.ERROR_MESSAGE);
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null,"Problema na leitura do arquivo.","Erro na importação.",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Exportar os dados para um arquivo
     * @param nomeArquivo 
     */
    public void exportar(String nomeArquivo){
        String conteudo = "";
        for (Atividade atividade : listaAtividades){
           conteudo += atividade.toCSV()+ "\n";
        }
        try{
            FileWriter arquivo = new FileWriter(nomeArquivo);
            arquivo.write(conteudo);
            arquivo.flush();
            arquivo.close();
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null,"Erro na escrita do arquivo.","Erro na exportação.",JOptionPane.ERROR_MESSAGE);
        }
    }
}
