/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ufuacademi;

import interfacegrafica.TelaLogin;

/**
 * Classe Principal
 */
public class UFUAcademi {
    public static GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    public static GerenciadorAtividades gerenciadorAtividades = new GerenciadorAtividades();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gerenciadorAtividades.importar("src/dados/ListaDeAtividades.csv");
        gerenciadorAlunos.importar("src/dados/ListaDeAlunos.csv");
        gerenciadorAtividades.importar("src/dados/ListaDeAtividades.csv");

        new TelaLogin().setVisible(true);
    } 
}
