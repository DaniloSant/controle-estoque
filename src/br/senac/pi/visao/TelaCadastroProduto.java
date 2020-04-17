/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi.visao;

import br.senac.pi.dao.ConectaDB;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TelaCadastroProduto extends javax.swing.JInternalFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    

    /**
     * Creates new form TelaCadastroProduto
     */
    public TelaCadastroProduto() throws ClassNotFoundException, SQLException {
        initComponents();
        this.conn = ConectaDB.conectaDB();
        preencheCBMarcaProduto();
        preencherCBEmpresaProduto();
        preencheCBTipoProduto();
        preencheCBUnidadeMedida();
        preencheCBStatusProduto();
    }
    
    
    private void preencheCBMarcaProduto() throws SQLException{
    
        List<String> listaMarcas = new ArrayList<String>();
String sql = "SELECT *FROM marca;";
pst = this.conn.prepareStatement(sql);
rs = pst.executeQuery();

while (rs.next()){
    listaMarcas.add(rs.getString("descricao"));


}
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(listaMarcas.toArray());
        cbMarcaCadastroProduto.setModel(defaultComboBoxModel);
        pst.close();

    
    }
    
    
    private void preencherCBEmpresaProduto() throws SQLException{
        List<String> listaEmpresas = new ArrayList<String>();
        String sql = "SELECT *FROM empresa;";
        pst = this.conn.prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()){
            listaEmpresas.add(rs.getString("razao_social"));
        
        }
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(listaEmpresas.toArray());
        cbEmpresaCadastroProduto.setModel(defaultComboBoxModel);
        pst.close();
    
    
    
    }
    
    
    private void preencheCBTipoProduto() throws SQLException{
        List<String>  listaTiposProdutos = new ArrayList<>();
        String sql = "SELECT *FROM tipo_produto;";
        pst = this.conn.prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()){
            listaTiposProdutos.add(rs.getString("descricao"));
        
        
        }DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(listaTiposProdutos.toArray());
        cbTipoProdutoCadastroProduto.setModel(defaultComboBoxModel);
        pst.close();
        
    
    }
    
    
    private void preencheCBUnidadeMedida() throws SQLException{
        List<String> listaUnidadeMedida = new ArrayList<>();
        String sql = "SELECT *FROM unidade_medida;";
        pst = this.conn.prepareStatement(sql);
        rs = pst.executeQuery();
        
        
        while(rs.next()){
            listaUnidadeMedida.add(rs.getString("descricao"));
        
        }DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(listaUnidadeMedida.toArray());
       cbUnidadeMedidaCadastroProduto.setModel(defaultComboBoxModel);
        pst.close();
    
    
    }
    
    
    private void preencheCBStatusProduto() throws SQLException{
        List<String> listaStatusProdutos = new ArrayList<>();
        String sql = "SELECT *FROM status_produto";
        pst = this.conn.prepareStatement(sql);
        rs = pst.executeQuery();
        
        
        while(rs.next()){
            listaStatusProdutos.add(rs.getString("descricao"));
            
        
        
        }DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(listaStatusProdutos.toArray());
        cbStatusProdutoCadastroProduto.setModel(defaultComboBoxModel);
        pst.close();
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmailEmpresa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNomeProdutoProduto = new javax.swing.JTextField();
        txtCodigoBarrasProduto = new javax.swing.JTextField();
        txtDataCadastroProduto = new javax.swing.JTextField();
        btnCadastrarProduto = new javax.swing.JButton();
        btnLimparCadastroProduto = new javax.swing.JButton();
        cbMarcaCadastroProduto = new javax.swing.JComboBox<>();
        cbTipoProdutoCadastroProduto = new javax.swing.JComboBox<>();
        cbUnidadeMedidaCadastroProduto = new javax.swing.JComboBox<>();
        cbStatusProdutoCadastroProduto = new javax.swing.JComboBox<>();
        cbEmpresaCadastroProduto = new javax.swing.JComboBox<>();

        txtEmailEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailEmpresaActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(153, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Produto");

        jLabel2.setText("Nome do Produto");

        jLabel3.setText("Codigo de Barras");

        jLabel4.setText("Data de Cadastro");

        jLabel5.setText(" Empresa");

        jLabel6.setText(" Marca");

        jLabel7.setText(" Tipo de Produdo");

        jLabel8.setText(" Unidade de Medida");

        jLabel9.setText(" Status do Produto");

        txtNomeProdutoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoProdutoActionPerformed(evt);
            }
        });

        txtCodigoBarrasProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarrasProdutoActionPerformed(evt);
            }
        });

        txtDataCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataCadastroProdutoActionPerformed(evt);
            }
        });

        btnCadastrarProduto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCadastrarProduto.setText("Cadastrar Produto");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });

        btnLimparCadastroProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimparCadastroProduto.setText("Limpar");
        btnLimparCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCadastroProdutoActionPerformed(evt);
            }
        });

        cbMarcaCadastroProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbTipoProdutoCadastroProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbUnidadeMedidaCadastroProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbStatusProdutoCadastroProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbEmpresaCadastroProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDataCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnCadastrarProduto)
                                            .addGap(57, 57, 57)
                                            .addComponent(btnLimparCadastroProduto))
                                        .addComponent(cbEmpresaCadastroProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtCodigoBarrasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(txtNomeProdutoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(cbMarcaCadastroProduto, 0, 361, Short.MAX_VALUE)
                            .addComponent(cbTipoProdutoCadastroProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbUnidadeMedidaCadastroProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbStatusProdutoCadastroProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(327, 327, 327)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProdutoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMarcaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoBarrasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoProdutoCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtDataCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbUnidadeMedidaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatusProdutoCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEmpresaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarProduto)
                    .addComponent(btnLimparCadastroProduto))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailEmpresaActionPerformed

    private void txtNomeProdutoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoProdutoActionPerformed

    private void txtCodigoBarrasProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarrasProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBarrasProdutoActionPerformed

    private void txtDataCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataCadastroProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataCadastroProdutoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT INTO produtos (descricao, codigo_barras, data) VALUES(?, ?, ?);";
        
        
        String nomeProduto = "";
        int codigoBarras = 0;
        String data = "";
        nomeProduto = txtNomeProdutoProduto.getText();
        codigoBarras = Integer.parseInt(txtCodigoBarrasProduto.getText());
        data = txtDataCadastroProduto.getText();
        
        
        
        
        
        
        try{
            pst = this.conn.prepareStatement(sql);
            pst.setString(1, nomeProduto);
            pst.setInt(2, codigoBarras);
            pst.setString(3,data );
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(this,"Produto cadastrado com sucesso!");
            btnLimparCadastroProdutoActionPerformed(evt);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar produto!");
            throw new RuntimeException(e);
        }
            
        
        
        
        
        
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnLimparCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCadastroProdutoActionPerformed
        // TODO add your handling code here:
        txtNomeProdutoProduto.setText("");
        txtCodigoBarrasProduto.setText("");
        txtDataCadastroProduto.setText("");
        txtNomeProdutoProduto.requestFocus();
        
    }//GEN-LAST:event_btnLimparCadastroProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnLimparCadastroProduto;
    private javax.swing.JComboBox<String> cbEmpresaCadastroProduto;
    private javax.swing.JComboBox<String> cbMarcaCadastroProduto;
    private javax.swing.JComboBox<String> cbStatusProdutoCadastroProduto;
    private javax.swing.JComboBox<String> cbTipoProdutoCadastroProduto;
    private javax.swing.JComboBox<String> cbUnidadeMedidaCadastroProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCodigoBarrasProduto;
    private javax.swing.JTextField txtDataCadastroProduto;
    private javax.swing.JTextField txtEmailEmpresa;
    private javax.swing.JTextField txtNomeProdutoProduto;
    // End of variables declaration//GEN-END:variables
}
