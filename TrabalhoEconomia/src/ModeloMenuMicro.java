import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago_NB
 */
public class ModeloMenuMicro extends javax.swing.JFrame {

    private String[] listaAssuntos;
    /**
     * Creates new form JanelaInicial
     */
    public ModeloMenuMicro(ArrayList<String> listaAssuntos ) {
        this.listaAssuntos = new String[listaAssuntos.size()];
        this.listaAssuntos = listaAssuntos.toArray(this.listaAssuntos);
        
        initComponents();
    }
                         
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cboQuestoes = new javax.swing.JComboBox<>();
        btnIrQuestao = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(300, 300));
        setMinimumSize(null);
        setSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assuntos microeconomia");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cboQuestoes.setModel(new DefaultComboBoxModel<>(listaAssuntos));
        
        btnIrQuestao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIrQuestao.setText("Ir para questão");
        btnIrQuestao.setMaximumSize(new java.awt.Dimension(150, 30));
        btnIrQuestao.setName("micro"); // NOI18N
        btnIrQuestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrQuestaoActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(150, 30));
        btnVoltar.setName("micro"); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboQuestoes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIrQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboQuestoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIrQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }                       

    private void btnIrQuestaoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
        String titulo = cboQuestoes.getSelectedItem().toString();
        if (TrabalhoEconomia.questoesMicro.containsKey(titulo)){
            Questoes q = TrabalhoEconomia.questoesMicro.get(titulo);
            ModeloQuestoes questoes = new ModeloQuestoes(q.getTitulo(),
                q.getContexto(), q.getRespostaBaixo(), q.getRespostaCima(), 
                q.getDetalhes(), q.isRespostaBaixoCerta());
            questoes.setVisible(true);
        
            this.dispose();
        } else {
            new Avisos("Erro ao abrir questão. Questão não encontrada nos registros.")
                    .setVisible(true);
            
            this.dispose();
        }
    }                                        

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JanelaInicial a = new JanelaInicial();
        a.setVisible(true);
        
        this.dispose();
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnIrQuestao;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cboQuestoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration                   
}
