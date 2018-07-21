
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago_NB
 */
public class ModeloQuestoes extends javax.swing.JFrame {
    
    private String titulo;
    private String contexto;
    private String respostaBaixo;
    private String respostaCima;
    private String detalhes;
    private boolean respostaEsquerdaCerta;
    /**
     * Creates new form JanelaInicial
     */
    public ModeloQuestoes(String titulo, String contexto, String respostaEsquerda, String respostaDireita, String detalhes, boolean respostaEsquerdaCerta) {
        this.titulo =  titulo;
        this.contexto = contexto;
        this.respostaBaixo = respostaEsquerda;
        this.respostaCima = respostaDireita;
        this.detalhes = detalhes;
        this.respostaEsquerdaCerta = respostaEsquerdaCerta;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRespCima = new javax.swing.JButton();
        btnRespBaixo = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblContexto = new javax.swing.JTextArea();
        btnVoltar = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();

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
        setMinimumSize(new java.awt.Dimension(400, 300));
        setSize(new java.awt.Dimension(600, 600));

        btnRespCima.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRespCima.setText(this.respostaCima);
        btnRespCima.setMaximumSize(new java.awt.Dimension(150, 30));
        btnRespCima.setName("btnRespCima"); // NOI18N
        btnRespCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnRespBaixo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRespBaixo.setText(this.respostaBaixo);
        btnRespBaixo.setMaximumSize(new java.awt.Dimension(150, 30));
        btnRespBaixo.setName("btnRespCima"); // NOI18N
        btnRespBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText(this.titulo);
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblContexto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblContexto.setText(this.contexto);
        lblContexto.setWrapStyleWord(true);
        lblContexto.setLineWrap(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblContexto, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(150, 30));
        btnVoltar.setName("btnVoltar"); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnDetalhes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDetalhes.setText("Detalhes");
        btnDetalhes.setMaximumSize(new java.awt.Dimension(150, 30));
        btnDetalhes.setName("btnDetalhes"); // NOI18N
        btnDetalhes.setEnabled(false);
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRespBaixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRespCima, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRespBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRespCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
        if (respostaEsquerdaCerta){
            btnRespBaixo.setBackground(Color.green);
            btnRespCima.setBackground(Color.red);
        }else{            
            btnRespBaixo.setBackground(Color.red);
            btnRespCima.setBackground(Color.green);
        }            
        btnDetalhes.setEnabled(true);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (respostaEsquerdaCerta){
            btnRespBaixo.setBackground(Color.green);
            btnRespCima.setBackground(Color.red);
        }else{            
            btnRespBaixo.setBackground(Color.red);
            btnRespCima.setBackground(Color.green);
        }
        btnDetalhes.setEnabled(true);
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        new JanelaInicial().setVisible(true);
        this.dispose();
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) { 
        new JanelaDetalhes(detalhes).setVisible(true);
    }      

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnRespCima;
    private javax.swing.JButton btnRespBaixo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea lblContexto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration          
    
}
