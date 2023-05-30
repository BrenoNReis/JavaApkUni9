package cleancodeppl;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class DashboardFormAbout extends javax.swing.JFrame {

    public DashboardFormAbout() {
        initComponents();
        this.setLocationRelativeTo(null);//Center Form in the screen
        this.setBackground(new Color(30,75,112));
        
        jPanel1.setBackground(new Color(30,75,112));
        jPanel1.setOpaque(true);
        
        jPanel3.setBackground(new Color(30,75,112));
        jPanel3.setOpaque(true);
        
        jLabelAboutPage.setBackground(new Color(255,255,255,230));
        jLabelAboutPage.setOpaque(true);
        
        jLabelJudulHome.setBackground(new Color(30,75,112));
        jLabelJudulHome.setOpaque(true);
        
        jButtonLogOut.setBorder(new LineBorder(Color.WHITE));
        jButtonLogOut.setBorder(new RoundedBorder(30));
        jButtonLogOut.setContentAreaFilled(false);
        
        //Load Icon untuk jLabelHome
        ImageIcon iconHome = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Home_white.png")));
        Image homeImage = iconHome.getImage();
        Image homeScaledImage = homeImage.getScaledInstance(jLabelImageHome.getWidth(), jLabelImageHome.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalIconHome = new ImageIcon(homeScaledImage);
        jLabelImageHome.setIcon(finalIconHome);
        
        //Load Icon untuk jLabelPerson
        ImageIcon iconPerson = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Person_white.png")));
        Image personImage = iconPerson.getImage();
        Image personScaledImage = personImage.getScaledInstance(jLabelImagePerson.getWidth(), jLabelImagePerson.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalIconPerson = new ImageIcon(personScaledImage);
        jLabelImagePerson.setIcon(finalIconPerson);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelJudulHome = new javax.swing.JLabel();
        jLabelAboutPage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButtonLogOut = new javax.swing.JButton();
        jLabelHome = new javax.swing.JLabel();
        jLabelAbout = new javax.swing.JLabel();
        jLabelImagePerson = new javax.swing.JLabel();
        jLabelImageHome = new javax.swing.JLabel();
        jLabelAbout1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 75, 112));
        setMinimumSize(new java.awt.Dimension(720, 490));
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(720, 490));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 490));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(30, 75, 112));
        jPanel2.setMaximumSize(new java.awt.Dimension(470, 470));
        jPanel2.setMinimumSize(new java.awt.Dimension(470, 470));

        jLabelJudulHome.setBackground(new java.awt.Color(30, 75, 112));
        jLabelJudulHome.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabelJudulHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJudulHome.setText("  Sobre");
        jLabelJudulHome.setMaximumSize(new java.awt.Dimension(480, 60));
        jLabelJudulHome.setMinimumSize(new java.awt.Dimension(480, 60));
        jLabelJudulHome.setPreferredSize(new java.awt.Dimension(480, 60));

        jLabelAboutPage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAboutPage.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelAboutPage.setForeground(new java.awt.Color(30, 75, 112));
        jLabelAboutPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAboutPage.setText("Saiba mais sobre nós");

        jButton1.setText("Contato");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("#Descrição:\n\nBem-vindo ao nosso aplicativo de dashboard em Java! Somos uma equipe dedicada de desenvolvedores apaixonados pela criação de soluções eficientes para a gestão de dados e visualização de informações. Combinando nossa experiência em programação e design, buscamos fornecer uma experiência única e intuitiva aos usuários, ajudando-os a tomar decisões informadas.\n\nNossa missão é simplificar a análise de dados complexos, tornando-a acessível a todos, desde empresas até indivíduos. Acreditamos que a informação é poder, e nosso aplicativo foi projetado para capacitar os usuários a extrair conhecimentos valiosos de seus dados, permitindo que eles tomem decisões estratégicas com base em informações precisas e atualizadas.\n\nContatos:\n\nE-mail: info@dashboardjavaapp.com\nTelefone: +1 123-456-7890\nEndereço: Rua Fictícia, 123 - Cidade Imaginária, Estado dos Sonhos, País Sem Limites\nWebsite: www.dashboardjavaapp.com\n\nObservação: Todos os dados e contatos acima são fictícios e não correspondem a informações reais.\n\nColaboradores:\n\nGustavo Xavier Rodrigues RA:3022106333\n\nVitor Brandão RA: 3020107817\n\nMatheus Fernandes Cesare RA: 3022104773\n\nFernando Domingos D'Oliveira R.A: 3021201976\n\nLeonardo Vieira Ramos RA:919104012 \n\nBreno Nunes dos Reis Ra: 3022104686 \n\nAnderson Ferreira Machado Ra: 3022200639\n\nMatheus Borges De Oliveira - RA: 3022106331\n\nRafael Alleo Jasunaitis RA 3019111892\n\nAlysson Soares de sousa -RA: 3022104772\n\nWillian Silva de Carvalho RA:3022102758");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelJudulHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(744, 744, 744)
                .addComponent(jLabelAboutPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelJudulHome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(16, 16, 16))
                    .addComponent(jLabelAboutPage, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 480, 490));

        jButtonLogOut.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogOut.setText("LogOut");
        jButtonLogOut.setMaximumSize(new java.awt.Dimension(66, 30));
        jButtonLogOut.setMinimumSize(new java.awt.Dimension(66, 30));
        jButtonLogOut.setPreferredSize(new java.awt.Dimension(66, 30));
        jButtonLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogOutMouseClicked(evt);
            }
        });

        jLabelHome.setBackground(new java.awt.Color(30, 75, 112));
        jLabelHome.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setText("Home");
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
        });

        jLabelAbout.setBackground(new java.awt.Color(30, 75, 112));
        jLabelAbout.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelAbout.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAbout.setText("Sobre");
        jLabelAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAboutMouseClicked(evt);
            }
        });

        jLabelImagePerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagePersonMouseClicked(evt);
            }
        });

        jLabelImageHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageHomeMouseClicked(evt);
            }
        });

        jLabelAbout1.setBackground(new java.awt.Color(30, 75, 112));
        jLabelAbout1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelAbout1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAbout1.setText("Projeto Aplicação JAVA");
        jLabelAbout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAbout1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAbout1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelImagePerson, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                    .addComponent(jLabelImageHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelImageHome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelImagePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(jLabelAbout1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 490));

        jLabel1.setMaximumSize(new java.awt.Dimension(720, 490));
        jLabel1.setMinimumSize(new java.awt.Dimension(720, 490));
        jLabel1.setPreferredSize(new java.awt.Dimension(720, 490));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogOutMouseClicked
        new LandingPageForm().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogOutMouseClicked

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        new DashboardFormHome().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelImageHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageHomeMouseClicked
        new DashboardFormHome().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelImageHomeMouseClicked

    private void jLabelImagePersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagePersonMouseClicked
        new DashboardFormAbout().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagePersonMouseClicked

    private void jLabelAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutMouseClicked
        new DashboardFormAbout().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelAboutMouseClicked

    private void jLabelAbout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAbout1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAbout1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardFormAbout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAbout;
    private javax.swing.JLabel jLabelAbout1;
    private javax.swing.JLabel jLabelAboutPage;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelImageHome;
    private javax.swing.JLabel jLabelImagePerson;
    private javax.swing.JLabel jLabelJudulHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
