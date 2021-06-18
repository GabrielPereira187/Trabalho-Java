/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fatec.poo.View;

import Fatec.poo.model.Cliente;
import Fatec.poo.model.Pessoa;
import com.sun.xml.internal.ws.util.StringUtils;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author gdeba
 */
public class GuiCliente extends javax.swing.JFrame {
    MaskFormatter mCEP;
    MaskFormatter mTEL;
    MaskFormatter mcpf;
    /**
     * Creates new form CadastroCliente
     */
    public GuiCliente(ArrayList<Pessoa> cadPessoas) throws ParseException {
        mCEP = new MaskFormatter("#####-###");
        mTEL = new MaskFormatter("####-####");
        mcpf = new MaskFormatter("###.###.###-##");
        initComponents();
        cadastro = cadPessoas;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlblmuda = new javax.swing.JLabel();
        jTextFieldnome = new javax.swing.JTextField();
        jTextFieldendereco = new javax.swing.JTextField();
        jTextFieldcidade = new javax.swing.JTextField();
        jTextFieldlimitecredito = new javax.swing.JTextField();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField(mCEP);
        jComboBoxestados = new javax.swing.JComboBox<>();
        jButtoninsert = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonconsulta = new javax.swing.JButton();
        jButtonalterar = new javax.swing.JButton();
        jButtonsair = new javax.swing.JButton();
        jComboBoxddds = new javax.swing.JComboBox<>();
        jFormattedTextFieldtel = new javax.swing.JFormattedTextField(mTEL);
        jFormattedTextFieldcpf = new javax.swing.JFormattedTextField(mcpf);
        jLabellimitedisponivel = new javax.swing.JLabel();
        jTextFieldlimite = new javax.swing.JTextField();
        jComboBoxtipoCliente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        btnConsultar.setText("Consultar");

        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);

        btnSair.setText("Sair");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");
        jLabel2.setEnabled(false);

        jLabel3.setText("Endereço");
        jLabel3.setEnabled(false);

        jLabel4.setText("CEP");
        jLabel4.setEnabled(false);

        jLabel5.setText("Cidade");
        jLabel5.setEnabled(false);

        jLabel8.setText("Telefone");
        jLabel8.setEnabled(false);

        jlblmuda.setText("Limite de Crédito");
        jlblmuda.setEnabled(false);

        jTextFieldnome.setEnabled(false);

        jTextFieldendereco.setEnabled(false);

        jTextFieldcidade.setEnabled(false);
        jTextFieldcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcidadeActionPerformed(evt);
            }
        });

        jTextFieldlimitecredito.setEnabled(false);

        jFormattedTextFieldCEP.setEnabled(false);
        jFormattedTextFieldCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCEPActionPerformed(evt);
            }
        });

        jComboBoxestados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jComboBoxestados.setEnabled(false);

        jButtoninsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon/Inserir.png"))); // NOI18N
        jButtoninsert.setText("Inserir");
        jButtoninsert.setEnabled(false);
        jButtoninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninsertActionPerformed(evt);
            }
        });

        jButtondelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon/Remover.png"))); // NOI18N
        jButtondelete.setText("Excluir");
        jButtondelete.setEnabled(false);
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });

        jButtonconsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon/Consultar.png"))); // NOI18N
        jButtonconsulta.setText("Consultar");
        jButtonconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonconsultaActionPerformed(evt);
            }
        });

        jButtonalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon/Alterar.png"))); // NOI18N
        jButtonalterar.setText("Alterar");
        jButtonalterar.setEnabled(false);
        jButtonalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonalterarActionPerformed(evt);
            }
        });

        jButtonsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon/Sair.png"))); // NOI18N
        jButtonsair.setText("Sair");
        jButtonsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsairActionPerformed(evt);
            }
        });

        jComboBoxddds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDD", "11", "12", "13", "14", "15", "16", "17", "18", "19", "21", "22", "24", "27", "28", "31", "32", "33", "34", "35", "37", "38", "41", "42", "43", "44", "45", "46", "47", "48", "49", "51", "53", "54", "55", "61", "62", "63", "64", "65", "66", "67", "68", "69", "71", "73", "74", "75", "77", "79", "81", "82", "83", "84", "85", "86", "87", "88", "89", "91", "92", "93", "94", "95", "96", "97", "98", "99", " " }));
        jComboBoxddds.setEnabled(false);
        jComboBoxddds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxdddsActionPerformed(evt);
            }
        });

        jFormattedTextFieldtel.setEnabled(false);

        jLabellimitedisponivel.setText("Limite Disponível");
        jLabellimitedisponivel.setEnabled(false);

        jTextFieldlimite.setEnabled(false);

        jComboBoxtipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum ", "Especial", " " }));
        jComboBoxtipoCliente.setEnabled(false);

        jLabel6.setText("Tipo");
        jLabel6.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtoninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonsair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(jFormattedTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)
                        .addComponent(jComboBoxtipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(jTextFieldendereco)
                                    .addComponent(jTextFieldcidade))
                                .addGap(29, 29, 29)
                                .addComponent(jComboBoxestados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel8)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabellimitedisponivel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldlimite, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxddds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(jFormattedTextFieldtel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblmuda)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldlimitecredito, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxtipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxestados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxddds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel8)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblmuda)
                            .addComponent(jTextFieldlimitecredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabellimitedisponivel)
                            .addComponent(jTextFieldlimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonconsulta)
                    .addComponent(jButtoninsert)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonalterar)
                        .addComponent(jButtondelete)
                        .addComponent(jButtonsair)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCEPActionPerformed

    private void jTextFieldcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcidadeActionPerformed

    private void jButtonsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonsairActionPerformed

    private void jButtoninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsertActionPerformed
        String ddd = (String)jComboBoxddds.getSelectedItem();
        String uf = (String) jComboBoxestados.getSelectedItem();
        String tipo = (String) jComboBoxtipoCliente.getSelectedItem();
        if(jTextFieldnome.getText().equals("") || jTextFieldcidade.getText().equals("") || jTextFieldendereco.getText().equals("") || 
                jTextFieldlimitecredito.getText().equals("") || jFormattedTextFieldCEP.getText().equals("     -   ")
                || jFormattedTextFieldtel.getText().equals("    -    ") || uf.equalsIgnoreCase("uf") || ddd.equals("DDD")){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos e um estado e um ddd devem ser selecionados");
        }
        else{
        Pessoa pessoa = null;
        Double limiteCred = Double.parseDouble(jTextFieldlimitecredito.getText().replace(',', '.'));
        
        pessoa = new Cliente(jFormattedTextFieldcpf.getText(),StringUtils.capitalize(jTextFieldnome.getText()),limiteCred);
        pessoa.setUf(String.valueOf(jComboBoxestados.getSelectedItem()));
        pessoa.setCep(jFormattedTextFieldCEP.getText());
        pessoa.setTelefone(jFormattedTextFieldtel.getText());
        pessoa.setCidade(StringUtils.capitalize(jTextFieldcidade.getText()));
        pessoa.setDdd(String.valueOf(jComboBoxddds.getSelectedItem()));
        pessoa.setEndereco(StringUtils.capitalize(jTextFieldendereco.getText()));
        ((Cliente)pessoa).setTipo(String.valueOf(jComboBoxtipoCliente.getSelectedItem()));
        cadastro.add(pessoa);
        alteracomponentes();
        }
    }//GEN-LAST:event_jButtoninsertActionPerformed

    private void jButtonalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonalterarActionPerformed
            jFormattedTextFieldcpf.setEnabled(false);
    
            String ddd = (String)jComboBoxddds.getSelectedItem();
            String uf = (String) jComboBoxestados.getSelectedItem();
            if(jTextFieldnome.getText().equals("") || jTextFieldcidade.getText().equals("") || jTextFieldendereco.getText().equals("") || 
                        jTextFieldlimitecredito.getText().equals("") || jFormattedTextFieldCEP.getText().equals("     -   ")
                        || jFormattedTextFieldtel.getText().equals("    -    ") || uf.equalsIgnoreCase("uf") || ddd.equals("DDD")){
                    JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos e um estado e um ddd devem ser selecionados");
            }
            else{
                cadastro.get(posCli).setNome(StringUtils.capitalize(jTextFieldnome.getText()));
                ((Cliente)cadastro.get(posCli)).setLimiteDisponivel(Double.parseDouble(jTextFieldlimite.getText().replace(',', '.')));
                ((Cliente)cadastro.get(posCli)).setLimiteCredito(Double.parseDouble(jTextFieldlimitecredito.getText().replace(',', '.')));
                cadastro.get(posCli).setCep(jFormattedTextFieldCEP.getText());
                cadastro.get(posCli).setCidade(StringUtils.capitalize(jTextFieldcidade.getText()));
                cadastro.get(posCli).setEndereco(StringUtils.capitalize(jTextFieldendereco.getText()));
                cadastro.get(posCli).setTelefone(jFormattedTextFieldtel.getText());
                cadastro.get(posCli).setUf(String.valueOf(jComboBoxestados.getSelectedItem()));
                cadastro.get(posCli).setDdd(String.valueOf(jComboBoxddds.getSelectedItem()));
                ((Cliente)cadastro.get(posCli)).setTipo(String.valueOf(jComboBoxtipoCliente.getSelectedItem()));
                alteracomponentes();
            }
    }//GEN-LAST:event_jButtonalterarActionPerformed

    private void jComboBoxdddsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxdddsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxdddsActionPerformed
    public void alteracomponentes(){
        jTextFieldendereco.setText(null);
        jFormattedTextFieldCEP.setText(null);
        jFormattedTextFieldtel.setText(null);
        jTextFieldcidade.setText(null);
        jFormattedTextFieldcpf.setText(null);
        jTextFieldnome.setText(null);
        jTextFieldlimite.setText(null);
        jTextFieldlimitecredito.setText(null);
        jComboBoxddds.setSelectedIndex(0);
        jComboBoxestados.setSelectedIndex(0);
        jComboBoxtipoCliente.setSelectedIndex(0);
        jButtonalterar.setEnabled(false);
        jButtondelete.setEnabled(false);
        jButtoninsert.setEnabled(false);
        jButtonconsulta.setEnabled(true);
        jFormattedTextFieldcpf.setEnabled(true);
        jTextFieldendereco.setText(null);
        jFormattedTextFieldCEP.setText(null);
        jFormattedTextFieldtel.setText(null);
        jTextFieldcidade.setEnabled(false);
        jTextFieldnome.setEnabled(false);
        jTextFieldlimite.setEnabled(false);
        jComboBoxddds.setEnabled(false);
        jComboBoxestados.setEnabled(false);
        jComboBoxtipoCliente.setEnabled(false);
        jFormattedTextFieldCEP.setEnabled(false);
        jFormattedTextFieldtel.setEnabled(false);
        jTextFieldendereco.setEnabled(false);
        jTextFieldlimitecredito.setEnabled(false);
        jFormattedTextFieldcpf.requestFocus();
    }

    private void jButtonconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonconsultaActionPerformed
        boolean existe = Pessoa.verificaCPF(jFormattedTextFieldcpf.getText());
        if(existe == false){
            JOptionPane.showMessageDialog(null, "CPF inválido");
            jFormattedTextFieldcpf.setText(null);
        }
        else{
            int x;
            for(x = 0; x < cadastro.size();x++){
                if(cadastro.get(x).getCpf().equals(jFormattedTextFieldcpf.getText()) && cadastro.get(x) instanceof Cliente){
                    break;
                }
            }
            if (x < cadastro.size()){
                posCli = x; 
            }else{
                posCli = -1;
            }
            
            if(posCli >= 0){
                jTextFieldnome.setEnabled(false);
                jButtonalterar.setEnabled(true);
                jButtondelete.setEnabled(true);
                jButtoninsert.setEnabled(false);
                jButtonconsulta.setEnabled(false);
                jTextFieldnome.setText(cadastro.get(posCli).getNome());
                jTextFieldendereco.setText(cadastro.get(posCli).getEndereco());
                jTextFieldcidade.setText(cadastro.get(posCli).getCidade());
                jFormattedTextFieldCEP.setText(cadastro.get(posCli).getCep());
                jFormattedTextFieldtel.setText(cadastro.get(posCli).getTelefone());
                jTextFieldlimite.setText(String.valueOf(((Cliente)cadastro.get(posCli)).getLimiteDisponivel()));
                jTextFieldlimitecredito.setText(String.valueOf(((Cliente)cadastro.get(posCli)).getLimiteCredito()));
                jComboBoxestados.getModel().setSelectedItem(cadastro.get(posCli).getUf());
                jComboBoxddds.getModel().setSelectedItem(cadastro.get(posCli).getDdd());
                jComboBoxtipoCliente.getModel().setSelectedItem(((Cliente)cadastro.get(posCli)).getTipo());
            }
            else{
                jButtonalterar.setEnabled(false);
                jButtondelete.setEnabled(false);
                jButtoninsert.setEnabled(true);
                jButtonconsulta.setEnabled(false);
                jTextFieldnome.requestFocus();
            }
            jTextFieldnome.setEnabled(true);
            jTextFieldlimitecredito.setEnabled(true);
            jFormattedTextFieldcpf.setEnabled(false);
            jTextFieldcidade.setEnabled(true);
            jTextFieldendereco.setEnabled(true);
            jFormattedTextFieldCEP.setEnabled(true);
            jFormattedTextFieldtel.setEnabled(true);
            jComboBoxestados.setEnabled(true);
            jComboBoxddds.setEnabled(true);
            jComboBoxtipoCliente.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonconsultaActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
         if(posCli >= 0){
            cadastro.remove(posCli);
            posCli--;
        }
        alteracomponentes();
    }//GEN-LAST:event_jButtondeleteActionPerformed

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
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButtonalterar;
    private javax.swing.JButton jButtonconsulta;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtoninsert;
    private javax.swing.JButton jButtonsair;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBoxddds;
    private javax.swing.JComboBox<String> jComboBoxestados;
    private javax.swing.JComboBox<String> jComboBoxtipoCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldcpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldtel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabellimitedisponivel;
    private javax.swing.JTextField jTextFieldcidade;
    private javax.swing.JTextField jTextFieldendereco;
    private javax.swing.JTextField jTextFieldlimite;
    private javax.swing.JTextField jTextFieldlimitecredito;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JLabel jlblmuda;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pessoa> cadastro;
    private int posCli;

}