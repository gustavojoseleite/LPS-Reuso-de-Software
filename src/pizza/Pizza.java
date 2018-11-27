/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.regex.Pattern;

/**
 *
 * @author Gustavo
 */
public class Pizza extends javax.swing.JFrame {

    /**
     * Creates new form Pizza
     */
    public Pizza() {
        initComponents();
        descricao.setEditable(false);
        comum.setEditable(false);
        variavel.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comum = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        variavel = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saborField = new javax.swing.JTextField();
        adicionalField = new javax.swing.JTextField();
        bordaField = new javax.swing.JTextField();
        tamanhoField = new javax.swing.JTextField();
        corteField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Desenvolvido por"));

        jLabel6.setText("Gustavo José Pereira Leite");

        jLabel7.setText("Caio Henrique Correia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Comum")));

        comum.setColumns(20);
        comum.setRows(5);
        jScrollPane2.setViewportView(comum);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Variabilidades"));

        variavel.setColumns(20);
        variavel.setRows(5);
        jScrollPane3.setViewportView(variavel);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizza"));

        jLabel1.setText("Sabor:");

        jLabel2.setText("Adicionais:");

        jLabel3.setText("Borda:");

        jLabel4.setText("Tamanho:");

        jLabel5.setText("Corte:");

        saborField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saborFieldActionPerformed(evt);
            }
        });

        adicionalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionalFieldActionPerformed(evt);
            }
        });

        bordaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bordaFieldActionPerformed(evt);
            }
        });

        tamanhoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoFieldActionPerformed(evt);
            }
        });

        corteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corteFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saborField)
                    .addComponent(adicionalField)
                    .addComponent(bordaField)
                    .addComponent(tamanhoField)
                    .addComponent(corteField))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(saborField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(adicionalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bordaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tamanhoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(corteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionalFieldActionPerformed
        String splitAdd[]; 
        switch (saborField.getText().toLowerCase()) {
            case "banana":
                break;
            case "brigadeiro":
                splitAdd = brigadeiro.getAdicionais().split(Pattern.quote(","));
		for(String add : splitAdd){
			if(adicionalField.getText().toLowerCase().equals(add.toLowerCase()) && nadicional == 0){
                            descricao.append("Adicionais:");
                            descricao.append(add);
                            descricao.append("\n");
                            nadicional = 1;
                            break;
                        }
                        else{
                            descricao.setText(desc);
                        }
		}
                break;
            case "mussarela":
                splitAdd = mussarela.getAdicionais().split(Pattern.quote(","));
		for(String add : splitAdd){
			if(adicionalField.getText().toLowerCase().equals(add.toLowerCase()) && nadicional == 0){
                            descricao.append("Adicionais:");
                            descricao.append(add);
                            descricao.append("\n");
                            nadicional = 1;
                            break;
                        }
                        else{
                            descricao.setText(desc);
                        }
		}
                break;
            case "oregano":
                splitAdd = oregano.getAdicionais().split(Pattern.quote(","));
		for(String add : splitAdd){
			if(adicionalField.getText().toLowerCase().equals(add.toLowerCase()) && nadicional == 0){
                            descricao.append("Adicionais:");
                            descricao.append(add);
                            descricao.append("\n");
                            nadicional = 1;
                            break;
                        }
                        else{
                            descricao.setText(desc);
                        }
		}
                break;
            default:
         }
       desc = descricao.getText();
    }//GEN-LAST:event_adicionalFieldActionPerformed

    private void saborFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saborFieldActionPerformed
        switch (saborField.getText().toLowerCase()) {
            case "banana":
                descricao.setText(banana.getRecheio()+banana.getTemperatura()+banana.getTempo()+banana.getForno()+banana.getPreco()
                                    +banana.getAdicionais()+banana.getBorda()+banana.getTamanho()+banana.getCorte());
                comum.setText("Massa,Recheio,Temperatura,\nTempo de forno,Tamanho,\nCorte,Forno,Preço\n"
                        + "\nPizza Doce: Forno Industrial,\nTamanho Unico,Corte em 8 fatias,\n"
                        + "25 minutos para assar,massa doce,\nPreço de pizza doce");
                variavel.setText(banana.getAdicionais()+banana.getBorda()+banana.getTamanho()+banana.getCorte());
                adicionalField.setEditable(false);
                bordaField.setEditable(false);
                tamanhoField.setEditable(false);
                corteField.setEditable(false);
                break;
            case "brigadeiro":
                descricao.setText(brigadeiro.getRecheio()+brigadeiro.getTemperatura()+brigadeiro.getTempo()+brigadeiro.getForno()+brigadeiro.getPreco()
                                    +brigadeiro.getBorda()+brigadeiro.getTamanho()+brigadeiro.getCorte());
                comum.setText("Massa,Recheio,Temperatura,\nTempo de forno,Tamanho,\nCorte,Forno,Preço\n"
                        + "\nPizza Doce: Forno Industrial,\nTamanho Unico,Corte em 8 fatias,\n"
                        + "25 minutos para assar,massa doce,\nPreço de pizza doce");
                variavel.setText("Adicionais:"+brigadeiro.getAdicionais()+brigadeiro.getBorda()+brigadeiro.getTamanho()+brigadeiro.getCorte());
                adicionalField.setEditable(true);
                bordaField.setEditable(false);
                tamanhoField.setEditable(false);
                corteField.setEditable(false);
                break;
            case "mussarela":
                descricao.setText(mussarela.getRecheio()+mussarela.getTemperatura()+mussarela.getTempo()+mussarela.getForno()+mussarela.getPreco());
                comum.setText("Massa,Recheio,Temperatura,\nTempo de forno,Tamanho,\nCorte,Forno,Preço\n"
                        + "\nPizza Salgada: Forno a lenha,\nTamanho P,M,G, Corte em 6 ou 8 fatias,\n"
                        + "30 minutos para assar,massa salgada,\nPreço de pizza salgada");
                variavel.setText("Adicionais:"+mussarela.getAdicionais()+"Borda:"+mussarela.getBorda()+"Tamanho:"+mussarela.getTamanho()+"Corte:"+mussarela.getCorte());
                adicionalField.setEditable(true);
                bordaField.setEditable(true);
                tamanhoField.setEditable(true);
                corteField.setEditable(true);
                break;
            case "oregano":
                descricao.setText(oregano.getRecheio()+oregano.getTemperatura()+oregano.getTempo()+oregano.getForno()+oregano.getPreco());
                comum.setText("Massa,Recheio,Temperatura,\nTempo de forno,Tamanho,\nCorte,Forno,Preço\n"
                        + "\nPizza Salgada: Forno a lenha,\nTamanho P,M,G, Corte em 6 ou 8 fatias,\n"
                        + "30 minutos para assar,massa salgada,\nPreço de pizza salgada");
                variavel.setText("Adicionais:"+oregano.getAdicionais()+"Borda:"+oregano.getBorda()+"Tamanho:"+oregano.getTamanho()+"Corte:"+oregano.getCorte());
                adicionalField.setEditable(true);
                bordaField.setEditable(true);
                tamanhoField.setEditable(true);
                corteField.setEditable(true);
                break;
            default:
                descricao.setText("Monte sua pizza com as opções ao lado!");
                comum.setText("");
                variavel.setText("");
                adicionalField.setEditable(true);
                bordaField.setEditable(true);
                tamanhoField.setEditable(true);
                corteField.setEditable(true);

         }
        desc = descricao.getText();
        nadicional = 0;
        nborda = 0;
        ntamanho = 0;
        ncorte = 0;
        adicionalField.setText("");
        bordaField.setText("");
        tamanhoField.setText("");
        corteField.setText("");
    }//GEN-LAST:event_saborFieldActionPerformed

    private void bordaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bordaFieldActionPerformed
        String splitAdd[]; 
        switch (saborField.getText().toLowerCase()) {
            case "banana":
                break;
            case "brigadeiro":
                break;
            case "mussarela":
                splitAdd = mussarela.getBorda().split(Pattern.quote(","));
		for(String add : splitAdd){
			if(bordaField.getText().toLowerCase().equals(add.toLowerCase()) && nborda == 0){
                            descricao.append("Borda:");
                            descricao.append(add);
                            descricao.append("\n");
                            nborda = 1;
                            break;
                        }
                        else{
                            descricao.setText(desc);
                        }
		}
                break;
            case "oregano":
                splitAdd = oregano.getBorda().split(Pattern.quote(","));
		for(String add : splitAdd){
			if(bordaField.getText().toLowerCase().equals(add.toLowerCase()) && nborda == 0){
                            descricao.append("Borda:");
                            descricao.append(add);
                            descricao.append("\n");
                            nborda = 1;
                            break;
                        }
                        else{
                            descricao.setText(desc);
                        }
		}
                break;
            default:
         }
       desc = descricao.getText();
    }//GEN-LAST:event_bordaFieldActionPerformed

    private void tamanhoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoFieldActionPerformed
        String splitAdd[]; 
        switch (saborField.getText().toLowerCase()) {
            case "banana":
                break;
            case "brigadeiro":
                break;
            case "mussarela":
                splitAdd = mussarela.getTamanho().split(Pattern.quote(","));
		for(String add : splitAdd){
			if(tamanhoField.getText().toLowerCase().equals(add.toLowerCase()) && ntamanho == 0){
                            descricao.append("Tamanho:");
                            descricao.append(add);
                            descricao.append("\n");
                            ntamanho = 1;
                            break;
                        }
                        else{
                            descricao.setText(desc);
                        }
		}
                break;
            case "oregano":
                splitAdd = oregano.getTamanho().split(Pattern.quote(","));
		for(String add : splitAdd){
			if(tamanhoField.getText().toLowerCase().equals(add.toLowerCase()) && ntamanho == 0){
                            descricao.append("Tamanho:");
                            descricao.append(add);
                            descricao.append("\n");
                            ntamanho = 1;
                            break;
                        }
                        else{
                            descricao.setText(desc);
                        }
		}
                break;
            default:
         }
       desc = descricao.getText();
    }//GEN-LAST:event_tamanhoFieldActionPerformed

    private void corteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corteFieldActionPerformed
                String splitAdd[]; 
        switch (saborField.getText().toLowerCase()) {
            case "banana":
                break;
            case "brigadeiro":
                break;
            case "mussarela":
                splitAdd = mussarela.getCorte().split(Pattern.quote(","));
		for(String add : splitAdd){
			if(corteField.getText().toLowerCase().equals(add.toLowerCase()) && ncorte == 0){
                            descricao.append("Corte:");
                            descricao.append(add);
                            descricao.append("\n");
                            ncorte = 1;
                            break;
                        }
                        else{
                            descricao.setText(desc);
                        }
		}
                break;
            case "oregano":
                splitAdd = oregano.getCorte().split(Pattern.quote(","));
		for(String add : splitAdd){
			if(corteField.getText().toLowerCase().equals(add.toLowerCase()) && ncorte == 0){
                            descricao.append("Corte:");
                            descricao.append(add);
                            descricao.append("\n");
                            ncorte = 1;
                            break;
                        }
                        else{
                            descricao.setText(desc);
                        }
		}
                break;
            default:
         }
       desc = descricao.getText();
    }//GEN-LAST:event_corteFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adicionalField;
    private javax.swing.JTextField bordaField;
    private javax.swing.JTextArea comum;
    private javax.swing.JTextField corteField;
    private javax.swing.JTextArea descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField saborField;
    private javax.swing.JTextField tamanhoField;
    private javax.swing.JTextArea variavel;
    // End of variables declaration//GEN-END:variables
   
    String desc;
    int nadicional = 0;
    int nborda = 0;
    int ntamanho = 0;
    int ncorte = 0;
    //Pizzas disponíveis
    JPizza banana = new JPizza("Recheio:Banana,Canela\n","Temperatura:200ºC - Média\n","Tempo:25 minutos - Baixo\n",
                                "Adicionais:Não possui adicionais\n","Tamanho:Único\n","Borda:Não possui opção de borda\n",
                                "Corte:8 fatias\n","Forno:Industrial\n","Preço:Doce - 2\n");
    JPizza brigadeiro = new JPizza("Recheio:Chocolate,Granulado\n","Temperatura:200ºC - Média\n","Tempo:25 minutos - Baixo\n",
                                "Morango,Chantily,Leite Ninho,\n","Tamanho:Único\n","Borda:Não possui opção de borda\n",
                                "Corte:8 fatias\n","Forno:Industrial\n","Preço:Doce - 3\n");
    JPizza mussarela = new JPizza("Recheio:Mussarela,Calabresa,Bacon\n","Temperatura:250ºC - Alta\n","Tempo:30 minutos - Medio\n",
                                "Ovo,Milho,Provolone,Tomate,\n","Pequena,Media,Grande,\n","Catupiry,Cheddar,Presunto,\n",
                                "6,8,\n","Forno:A lenha\n","Preço:Salgada - 2\n");
    JPizza oregano = new JPizza("Recheio:Oregano,Mussarela,Tomate\n","Temperatura:250ºC - Alta\n","Tempo:30 minutos - Media\n",
                                "Bacon,Batata Palha,Calabresa,Queijo,\n","Pequena,Media,Grande,\n","Catupiry,Cheddar,Presunto,\n",
                                "6,8,\n","Forno:A lenha\n","Preço:Salgada - 1\n");
}
