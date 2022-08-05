/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import java.awt.Color;

/**
 * JFrame da Tela Inicial
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        Color cinza = new Color(80, 80, 80);
        getContentPane().setBackground(cinza);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cadastrarAlunosButton = new javax.swing.JButton();
        cadastrarAtividadesButton = new javax.swing.JButton();
        inscreverAlunoButton = new javax.swing.JButton();
        gerenciarAlunosButton = new javax.swing.JButton();
        gerenciarAtividadesButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        arquivoMenu = new javax.swing.JMenu();
        sairMenuItem = new javax.swing.JMenuItem();
        alunosMenu = new javax.swing.JMenu();
        cadastrarAlunoMenuItem = new javax.swing.JMenuItem();
        gerenciarAlunosMenuItem = new javax.swing.JMenuItem();
        atividadeMenu = new javax.swing.JMenu();
        cadastrarAtividadeMenuItem = new javax.swing.JMenuItem();
        gerenciarAtividadeMenuItem = new javax.swing.JMenuItem();
        inscreverAlunoMenuItem = new javax.swing.JMenuItem();
        sobreMenu = new javax.swing.JMenu();
        sobreMenuItem = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        jMenu8.setText("jMenu8");

        jMenu10.setText("jMenu10");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(80, 80, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGO UFUACADEMI.png"))); // NOI18N

        cadastrarAlunosButton.setText("Cadastrar Alunos");
        cadastrarAlunosButton.setMaximumSize(new java.awt.Dimension(138, 22));
        cadastrarAlunosButton.setMinimumSize(new java.awt.Dimension(138, 22));
        cadastrarAlunosButton.setPreferredSize(new java.awt.Dimension(138, 22));
        cadastrarAlunosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlunosButtonActionPerformed(evt);
            }
        });

        cadastrarAtividadesButton.setText("Cadastrar Atividades");
        cadastrarAtividadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAtividadesButtonActionPerformed(evt);
            }
        });

        inscreverAlunoButton.setText("Inscrever Aluno");
        inscreverAlunoButton.setMaximumSize(new java.awt.Dimension(138, 22));
        inscreverAlunoButton.setMinimumSize(new java.awt.Dimension(138, 22));
        inscreverAlunoButton.setPreferredSize(new java.awt.Dimension(138, 22));
        inscreverAlunoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscreverAlunoButtonActionPerformed(evt);
            }
        });

        gerenciarAlunosButton.setText("Gerenciar Alunos");
        gerenciarAlunosButton.setMaximumSize(new java.awt.Dimension(138, 22));
        gerenciarAlunosButton.setMinimumSize(new java.awt.Dimension(138, 22));
        gerenciarAlunosButton.setPreferredSize(new java.awt.Dimension(138, 22));
        gerenciarAlunosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarAlunosButtonActionPerformed(evt);
            }
        });

        gerenciarAtividadesButton.setText("Gerenciar Atividades");
        gerenciarAtividadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarAtividadesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inscreverAlunoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrarAtividadesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrarAlunosButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gerenciarAtividadesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gerenciarAlunosButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cadastrarAlunosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerenciarAlunosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastrarAtividadesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerenciarAtividadesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inscreverAlunoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        arquivoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder.png"))); // NOI18N
        arquivoMenu.setText("Arquivo");

        sairMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sairMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/door_in.png"))); // NOI18N
        sairMenuItem.setText("Sair");
        sairMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuItemActionPerformed(evt);
            }
        });
        arquivoMenu.add(sairMenuItem);

        jMenuBar1.add(arquivoMenu);

        alunosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group.png"))); // NOI18N
        alunosMenu.setText("Alunos");
        alunosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunosMenuActionPerformed(evt);
            }
        });

        cadastrarAlunoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cadastrarAlunoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        cadastrarAlunoMenuItem.setText("Cadastrar");
        cadastrarAlunoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlunoMenuItemActionPerformed(evt);
            }
        });
        alunosMenu.add(cadastrarAlunoMenuItem);

        gerenciarAlunosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        gerenciarAlunosMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wrench_orange.png"))); // NOI18N
        gerenciarAlunosMenuItem.setText("Gerenciar");
        gerenciarAlunosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarAlunosMenuItemActionPerformed(evt);
            }
        });
        alunosMenu.add(gerenciarAlunosMenuItem);

        jMenuBar1.add(alunosMenu);

        atividadeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sport_soccer.png"))); // NOI18N
        atividadeMenu.setText("Atividades");

        cadastrarAtividadeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        cadastrarAtividadeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        cadastrarAtividadeMenuItem.setText("Cadastrar Atividade");
        cadastrarAtividadeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAtividadeMenuItemActionPerformed(evt);
            }
        });
        atividadeMenu.add(cadastrarAtividadeMenuItem);

        gerenciarAtividadeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        gerenciarAtividadeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wrench_orange.png"))); // NOI18N
        gerenciarAtividadeMenuItem.setText("Gerenciar Atividade");
        gerenciarAtividadeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarAtividadeMenuItemActionPerformed(evt);
            }
        });
        atividadeMenu.add(gerenciarAtividadeMenuItem);

        inscreverAlunoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        inscreverAlunoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group_add.png"))); // NOI18N
        inscreverAlunoMenuItem.setText("Inscrever Aluno");
        inscreverAlunoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscreverAlunoMenuItemActionPerformed(evt);
            }
        });
        atividadeMenu.add(inscreverAlunoMenuItem);

        jMenuBar1.add(atividadeMenu);

        sobreMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/help.png"))); // NOI18N
        sobreMenu.setText("Ajuda");
        sobreMenu.setFocusable(false);

        sobreMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sobreMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/information.png"))); // NOI18N
        sobreMenuItem.setText("Sobre");
        sobreMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreMenuItemActionPerformed(evt);
            }
        });
        sobreMenu.add(sobreMenuItem);

        jMenuBar1.add(sobreMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alunosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunosMenuActionPerformed
        
    }//GEN-LAST:event_alunosMenuActionPerformed

    private void cadastrarAtividadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAtividadesButtonActionPerformed
        new CadastrarAtividades().setVisible(true);
    }//GEN-LAST:event_cadastrarAtividadesButtonActionPerformed

    private void cadastrarAlunosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlunosButtonActionPerformed
        new CadastrarAlunos().setVisible(true);
    }//GEN-LAST:event_cadastrarAlunosButtonActionPerformed

    private void inscreverAlunoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscreverAlunoButtonActionPerformed
        Inscricao inscricao = new Inscricao();
        inscricao.setComboBoxes();
        inscricao.setVisible(true);
    }//GEN-LAST:event_inscreverAlunoButtonActionPerformed

    private void gerenciarAlunosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarAlunosButtonActionPerformed
        EscolherAluno escolherAluno = new EscolherAluno();
        escolherAluno.setAlunoComboBox();
        escolherAluno.setVisible(true);
    }//GEN-LAST:event_gerenciarAlunosButtonActionPerformed

    private void gerenciarAtividadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarAtividadesButtonActionPerformed
        EscolherAtividade escolherAtividade = new EscolherAtividade();
        escolherAtividade.setAtividadeComboBox();
        escolherAtividade.setVisible(true);
    }//GEN-LAST:event_gerenciarAtividadesButtonActionPerformed

    private void cadastrarAlunoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlunoMenuItemActionPerformed
        new CadastrarAlunos().setVisible(true);
    }//GEN-LAST:event_cadastrarAlunoMenuItemActionPerformed

    private void gerenciarAlunosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarAlunosMenuItemActionPerformed
        gerenciarAlunosButtonActionPerformed(evt);
    }//GEN-LAST:event_gerenciarAlunosMenuItemActionPerformed

    private void gerenciarAtividadeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarAtividadeMenuItemActionPerformed
        gerenciarAtividadesButtonActionPerformed(evt);
    }//GEN-LAST:event_gerenciarAtividadeMenuItemActionPerformed

    private void sobreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreMenuItemActionPerformed
        Sobre sobre = new Sobre();
        sobre.setTextArea("UFUAcademi v1.0\n\n"
                + "Programa criado criado como requisito da disciplina\n"
                + "Métodos e Técnicas de Programação, ministrada pela\n"
                + "professora Eliana Pantaleão.\n\n"
                + "Alunos:\n\nAdriel Henrique de Lima Silva\t41921ETE005\nThamara Oliveira Melo\t41921ETE004\nVictor Hugo Ferreira Silva\t42111ETE024");
        sobre.setVisible(true);
    }//GEN-LAST:event_sobreMenuItemActionPerformed

    private void sairMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuItemActionPerformed
        super.dispose();
    }//GEN-LAST:event_sairMenuItemActionPerformed

    private void cadastrarAtividadeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAtividadeMenuItemActionPerformed
        cadastrarAlunosButtonActionPerformed(evt);
    }//GEN-LAST:event_cadastrarAtividadeMenuItemActionPerformed

    private void inscreverAlunoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscreverAlunoMenuItemActionPerformed
        inscreverAlunoButtonActionPerformed(evt);
    }//GEN-LAST:event_inscreverAlunoMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alunosMenu;
    private javax.swing.JMenu arquivoMenu;
    private javax.swing.JMenu atividadeMenu;
    private javax.swing.JMenuItem cadastrarAlunoMenuItem;
    private javax.swing.JButton cadastrarAlunosButton;
    private javax.swing.JMenuItem cadastrarAtividadeMenuItem;
    private javax.swing.JButton cadastrarAtividadesButton;
    private javax.swing.JButton gerenciarAlunosButton;
    private javax.swing.JMenuItem gerenciarAlunosMenuItem;
    private javax.swing.JMenuItem gerenciarAtividadeMenuItem;
    private javax.swing.JButton gerenciarAtividadesButton;
    private javax.swing.JButton inscreverAlunoButton;
    private javax.swing.JMenuItem inscreverAlunoMenuItem;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem sairMenuItem;
    private javax.swing.JMenu sobreMenu;
    private javax.swing.JMenuItem sobreMenuItem;
    // End of variables declaration//GEN-END:variables
}
