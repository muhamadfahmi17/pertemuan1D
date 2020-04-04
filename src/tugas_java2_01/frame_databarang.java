import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;





public class frame_databarang extends javax.swing.JFrame {

   private Statement stat; 
   String objKategori[]={"Alat Tulis","Kertas","Buku","ATK"}; 
    public frame_databarang() {
        initComponents();
        for (String object : objKategori){
            cbkategori.addItem(object);
        }
    }
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtnamabarang = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        cbkategori = new javax.swing.JComboBox();
        rbpcs = new javax.swing.JRadioButton();
        rbbox = new javax.swing.JRadioButton();
        rbrim = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("FORM BARANG");

        jLabel2.setText("KODE BARANG :");

        jLabel3.setText("NAMA BARANG :");

        jLabel4.setText("SATUAN            :");

        jLabel5.setText("KATEGORI        :");

        jLabel6.setText("HARGA             :");

        jLabel7.setText("JUMLAH           :");

        txtharga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthargaKeyTyped(evt);
            }
        });

        txtjumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjumlahKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbpcs);
        rbpcs.setText("PCS");
        rbpcs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbpcsActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbbox);
        rbbox.setText("BOX");

        buttonGroup1.add(rbrim);
        rbrim.setText("RIM");

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BATAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(2, 2, 2))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButton1)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbkategori, 0, 189, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbpcs, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbbox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbrim, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtharga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnamabarang, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtkode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(txtjumlah)))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbpcs)
                    .addComponent(rbbox)
                    .addComponent(rbrim))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void rbpcsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbpcsActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_rbpcsActionPerformed

private void txthargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyTyped
char cDigit = evt.getKeyChar();
if(txtharga.getText().length()<10){
    if(!Character.isDigit(cDigit)){
        evt.consume();
    }
}else{
    evt.consume();
}
 
 // TODO add your handling code here:
}//GEN-LAST:event_txthargaKeyTyped

private void txtjumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahKeyTyped
char cDigit = evt.getKeyChar();
if(txtjumlah.getText().length()<5){
    if(!Character.isDigit(cDigit)){
        evt.consume();
    }
}else{
    evt.consume();
} 
 // TODO add your handling code here:

}//GEN-LAST:event_txtjumlahKeyTyped

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
String satuan; 
    if(rbpcs.isSelected()){
      satuan = "pcs";
     
}else if(rbbox.isSelected()){
    satuan = "box";
}else{
    satuan = "rim";
}
try{
    koneksi objkoneksi=new koneksi();
    Connection con=objkoneksi.bukakoneksi();
    String sql="INSERT INTO barang VALUES ('"+txtkode.getText()+"','"+txtnamabarang.getText()+"','"+cbkategori.getSelectedItem()+"','"+satuan+"','"+txtharga.getText()+"','"+txtjumlah.getText()+"')";
    stat = con.createStatement();
    stat.execute(sql);
    
    JOptionPane.showMessageDialog(null, "Data Berhasil di Input");
    txtkode.setText("");
    txtnamabarang.setText("");
    txtharga.setText("");
    txtjumlah.setText("");
    cbkategori.setSelectedIndex(0); 
      rbpcs.setSelected(false);
      rbbox.setSelected(false);
      rbrim.setSelected(false);
      txtkode.requestFocus();
}
catch (Exception e)
{
    System.out.println("gagal="+e.getMessage());


}
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  txtkode.setText("");
    txtnamabarang.setText("");
txtjumlah.setText("");
    cbkategori.setSelectedIndex(0); 
      rbpcs.setSelected(false);
      rbbox.setSelected(false);
      rbrim.setSelected(false);
      txtkode.requestFocus();
  
  
}//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frame_databarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_databarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_databarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_databarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frame_databarang().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cbkategori;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbbox;
    private javax.swing.JRadioButton rbpcs;
    private javax.swing.JRadioButton rbrim;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnamabarang;
    // End of variables declaration//GEN-END:variables
}
