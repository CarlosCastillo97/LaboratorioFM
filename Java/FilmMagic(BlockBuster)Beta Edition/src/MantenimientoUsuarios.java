/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SOPORTE
 */
public class MantenimientoUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoAlumnos
     */
    public MantenimientoUsuarios() {
        initComponents();
    }
    
public void generar(String nombre) throws FileNotFoundException, DocumentException {
        if(!(txtNombre.getText().isEmpty() || (txtDire.getText().isEmpty()) || (txtMem.getText().isEmpty()) || (txtNum.getText().isEmpty()) || (txtDPI.getText().isEmpty()))){

        FileOutputStream archivo = new FileOutputStream(nombre + ".pdf");
        Document documento = new Document();
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        
        Paragraph parrafo = new Paragraph("BIENVENIDO A LA MEMBRESIA FILM MAGIC");
        Paragraph parrafo1 = new Paragraph("DATOS DE MEMBRESIA: ");
        parrafo.setAlignment(1);
        documento.add(parrafo);
        documento.add(parrafo1);
        
        documento.add(new Paragraph("Nombre: " + txtNombre.getText()));
        documento.add(new Paragraph("Direccion: " + txtDire.getText()));
        documento.add(new Paragraph("Numero Telefonico: " + txtNum.getText()));
        documento.add(new Paragraph("DPI: " + txtDPI.getText()));
        documento.add(new Paragraph("Membresia: " + txtMem.getText()));
        documento.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        documento.close();
        JOptionPane.showMessageDialog(null, "Archivo PDF creado correctamente","Información",1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","Atención",2);
        }
    }

    public void abrir(String nombre) {
        try {
            File path = new File(nombre + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex,"Atención",2);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDire = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        lblEstatus = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDPI = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtMem = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Mantenimiento Usuarios");
        setVisible(true);

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Direccion");

        jLabel3.setText("Buscar Usuario");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jButton5.setText("Generar Membresia");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero Tel");

        jLabel7.setText("DPI");

        jButton6.setText("Imprimir Membresia");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel11.setText("Membresia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(txtDire, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                        .addComponent(txtNombre)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDPI, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMem, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/filmmagic", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into Usuarios values(?,?,?,?,?)");
           
           if(txtNombre.getText().length()==0){
           JOptionPane.showMessageDialog(null, "Para continuar con el Registro Llene los campos solicitados");
           txtNombre.requestFocus(); //Si algunos de los campos están vacios, el foco apunta al primer campo.......
}else{
            pst.setString(1, txtMem.getText().trim());
            pst.setString(2, txtNombre.getText().trim());
            pst.setString(3, txtDire.getText().trim());
            pst.setString(4, txtNum.getText().trim());
            pst.setString(5, txtDPI.getText().trim());
            pst.executeUpdate();
            
     
}
            
            txtNombre.setText("");
            txtDire.setText("");
            txtMem.setText("");
            txtNum.setText("");
            txtDPI.setText("");
            lblEstatus.setText("Registro exitoso.");
        }catch (Exception e){
            
        }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txtBuscar.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/filmmagic", "root", "");
            PreparedStatement pst = cn.prepareStatement("update Usuarios set nombre_usuario = ?, direccion_usuario = ?, membresia_usuario = ?, numero_usuario = ?, DPI_usuario = ? where membresia_usuario = " + ID);
            
            pst.setString(1, txtNombre.getText().trim());
            pst.setString(3, txtDire.getText().trim());
            pst.setString(4, txtMem.getText().trim());
            pst.setString(5, txtDire.getText().trim());
            pst.setString(6, txtDPI.getText().trim());
            
            pst.executeUpdate();
            
            lblEstatus.setText("Modificación exitosa.");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                try {
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/filmmagic", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from Usuarios where membresia_usuario = ?");
            
            pst.setString(1, txtBuscar.getText().trim());
            pst.executeUpdate();
            
            txtNombre.setText("");
            txtDire.setText("");
            txtMem.setText("");
            txtDPI.setText("");
            txtNum.setText("");
            txtBuscar.setText("");
            
            lblEstatus.setText("Registro eliminado.");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/filmmagic", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from Usuarios where membresia_usuario = ?");
            pst.setString(1, txtBuscar.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txtNombre.setText(rs.getString("nombre_usuario"));
                txtDire.setText(rs.getString("direccion_usuario"));
                txtNum.setText(rs.getString("numero_usuario"));
                txtDPI.setText(rs.getString("DPI_usuario"));
                txtMem.setText(rs.getString("membresia_usuario"));
            } else {
            //    JOptionPane.showMessageDialog(null, "Usuario no registrado.");
               lblEstatus.setText("Usuario NO REGISTRADO");
            }
            
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
int[] numerosAleatorios = IntStream.rangeClosed(1, 1000).toArray();
//desordenando los elementos
Random r = new Random();
for (int i = numerosAleatorios.length; i > 0; i--) {
    int posicion = r.nextInt(i);
    int tmp = numerosAleatorios[i-1];
    numerosAleatorios[i - 1] = numerosAleatorios[posicion];
    numerosAleatorios[posicion] = tmp;
}
    //usa el valor de aleatorio...
    txtMem.setText(String.valueOf(numerosAleatorios));
    JOptionPane.showMessageDialog(null, "Su membresia fue copiada al portapapeles: "+numerosAleatorios);
    {String str3 = String.valueOf(numerosAleatorios); 
    Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
    StringSelection ss = new StringSelection(str3);
    cb.setContents(ss, ss);}

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     try {
            generar(txtNombre.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MantenimientoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(MantenimientoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblEstatus;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtDire;
    private javax.swing.JTextField txtMem;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
