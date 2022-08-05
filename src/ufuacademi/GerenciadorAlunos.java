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
 * Classe Gerenciadora de Alunos
 */
public class GerenciadorAlunos {
    private ArrayList<Aluno> listaAlunos = new ArrayList();

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    /**
     * Cadastrar um novo aluno
     * @param novoAluno
     * @return boolean foiCadastrado
     */    
    public boolean novo(Aluno novoAluno){
        boolean foiCadastrado = false;
        //Não aceita CPFs duplicados
        for (Aluno aluno: listaAlunos){
            if(aluno.getCpf().equals(novoAluno.getCpf())){
                JOptionPane.showMessageDialog(null,"Este CPF já foi cadastrado.","Erro no cadastro.",JOptionPane.ERROR_MESSAGE);
                foiCadastrado = true;
                break;
            }
        }
        if (!foiCadastrado) {
            listaAlunos.add(novoAluno);
            listaAlunos.sort((aluno1,aluno2)->aluno1.getNome().compareTo(aluno2.getNome()));
            exportar("src/dados/ListaDeAlunos.csv");
            return true;
        }
        return false;
    }
    /**
     * Editar um Aluno já Existente
     * @param indiceAlunoEscolhido
     * @param nome
     * @param dataNascimento
     * @param cpf
     * @param endereco
     * @param sexo 
     */
    public void editar(int indiceAlunoEscolhido, String nome, String dataNascimento, String cpf, String endereco, String sexo){
            Aluno alunoEscolhido = listaAlunos.get(indiceAlunoEscolhido); 
           
            alunoEscolhido.setDataNascimento(dataNascimento);
            alunoEscolhido.setCpf(cpf);
            alunoEscolhido.setEndereco(endereco);
            alunoEscolhido.setSexo(sexo);
            //Se o nome for editado será reordenada a lista de Alunos
            if (!nome.equals(alunoEscolhido.getNome())) {
                alunoEscolhido.setNome(nome);
                listaAlunos.sort((aluno1,aluno2)->aluno1.getNome().compareTo(aluno2.getNome()));
            };
            exportar("src/dados/ListaDeAlunos.csv");
    }
    /**
     * Deletar um Aluno
     * @param indiceAlunoEscolhido 
     */
    public void deletar(int indiceAlunoEscolhido){
        listaAlunos.remove(indiceAlunoEscolhido);
        exportar("src/dados/ListaDeAlunos.csv");
    }
    /**
     * Importar os dados de um arquivo
     * @param nomeArquivo 
     */
    public void importar(String nomeArquivo){
        listaAlunos = new ArrayList();
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader entrada = new BufferedReader(arquivo);
            while (entrada.ready()){
                String linha = entrada.readLine();
                String[] valoresDaLinha = linha.split(";");
                if (valoresDaLinha.length>=5){
                    Aluno aluno = new Aluno(valoresDaLinha[0], valoresDaLinha[1], valoresDaLinha[2], valoresDaLinha[3], valoresDaLinha[4]);
                    ArrayList<Atividade> listaAtividades = new ArrayList();
                    for (int i = 5; i<valoresDaLinha.length;i++){
                        for (Atividade atividade: UFUAcademi.gerenciadorAtividades.getListaAtividades()){
                            if  (atividade.getCodigo().equals(valoresDaLinha[i])){
                                listaAtividades.add(atividade);
                            }
                        }
                        aluno.setListaAtividades(listaAtividades);
                    }
                    listaAlunos.add(aluno);
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
        for (Aluno aluno : listaAlunos){
           conteudo += aluno.toCSV()+ "\n";
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
