import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.HeadlessException;
import java.net.*;
import java.util.*;
import java.net.InetAddress;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class FileShare extends javax.swing.JFrame {

    public FileShare() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        btnChkIP = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnChooseFile = new javax.swing.JButton();
        sendFileName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfSend = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnReceive = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(503, 424));
        setMinimumSize(new java.awt.Dimension(503, 424));
        setPreferredSize(new java.awt.Dimension(503, 424));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("FileShare");
        getContentPane().add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnChkIP.setText("Check your Local IP Address");
        btnChkIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkIPActionPerformed(evt);
            }
        });
        getContentPane().add(btnChkIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        btnChooseFile.setText("Choose a File to send");
        btnChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileActionPerformed(evt);
            }
        });

        sendFileName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setText("Enter Receiver's Local IP Address ");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnChooseFile)
                        .addGap(18, 18, 18)
                        .addComponent(sendFileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSend, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSend))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChooseFile)
                    .addComponent(sendFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSend)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Send File", jPanel1);

        btnReceive.setText("Start Receiving");
        btnReceive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReceive)
                .addGap(0, 345, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnReceive)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Receive File", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 480, 180));

        btnExit.setText("Cancel & Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 160, -1));

        btnInfo.setBackground(new java.awt.Color(242, 242, 242));
        btnInfo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnInfo.setText("i");
        btnInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));
        btnInfo.getAccessibleContext().setAccessibleName("Info");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        if (fileToSend == null) {
            sendFileName.setText("No file is selected.");
        }
        else if (tfSend.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Receiver not entered.");
        }
        else {
            Socket socket = new Socket();            
            try {
                socket.connect(new InetSocketAddress(tfSend.getText(), 1050), 5000);
                FileInputStream fileInputStream = new FileInputStream(fileToSend.getAbsolutePath());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                
                byte[] fileNameBytes = (fileToSend.getName()).getBytes();
                byte[] fileContentBytes = new byte[(int)fileToSend.length()];
                
                fileInputStream.read(fileContentBytes);
                dataOutputStream.writeInt(fileNameBytes.length);
                dataOutputStream.write(fileNameBytes);
                dataOutputStream.writeInt(fileContentBytes.length);
                dataOutputStream.write(fileContentBytes);
                
                JOptionPane.showMessageDialog(this, fileToSend.getName() + " sent to " + tfSend.getText() + ".");
            } catch (HeadlessException | IOException e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
    }//GEN-LAST:event_btnSendActionPerformed
   
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnChkIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChkIPActionPerformed
        try {
            String ip, ipMessage = "Interface - IP Address\n\n";
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
		NetworkInterface iface = interfaces.nextElement();
                if (iface.isLoopback() || !iface.isUp())
                    continue;
	
                Enumeration<InetAddress> addresses = iface.getInetAddresses();
		while(addresses.hasMoreElements()) {
                    InetAddress addr = addresses.nextElement();
                    ip = addr.getHostAddress();
                    ipMessage = ipMessage.concat(iface.getDisplayName() + " - " + ip + "\n");
		}
            }
            JOptionPane.showMessageDialog(this, ipMessage);
        } catch (SocketException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_btnChkIPActionPerformed

    private void btnReceiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiveActionPerformed
        Thread t = new Thread() {
            @Override
            public void run() {
                downloadFile();
            }
        };
        if (btnReceive.isSelected() == true) {
            try {
                serverSocket = new ServerSocket(1050);
                t.start();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
        else {
            try {
                t.interrupt();
                serverSocket.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
    }//GEN-LAST:event_btnReceiveActionPerformed
 
    private void downloadFile() {
        try {
            try (Socket socket = serverSocket.accept()) {
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                int fileNameLength = dataInputStream.readInt();
                if (fileNameLength > 0) {
                    byte[] fileNameBytes = new byte[fileNameLength];
                    dataInputStream.readFully(fileNameBytes, 0, fileNameLength);
                    String fileName = new String(fileNameBytes);
                    int fileContentLength = dataInputStream.readInt();
                    if (fileContentLength > 0) {
                        byte[] fileContentBytes = new byte[fileContentLength];
                        dataInputStream.readFully(fileContentBytes, 0, fileContentLength);
                        Files.createDirectories(Paths.get("FileShare-Downloads/"));
                        File fileToDownload = new File("FileShare-Downloads/" + fileName);
                        try {
                            try (FileOutputStream fileOutputStream = new FileOutputStream(fileToDownload)) {
                                fileOutputStream.write(fileContentBytes);
                            }
                            JOptionPane.showMessageDialog(this, fileName + " received and stored in FileShare-Downloads folder.");
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(this, e.toString());
                        }
                    }
                }
                socket.close();
            }
            serverSocket.close();
            btnReceive.setSelected(false);            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Server stopped.\n");
        }
    }
    
    private void btnChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose the file to send");
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            fileToSend = fileChooser.getSelectedFile();
            sendFileName.setText(fileToSend.getName() + " is selected.");
        }
    }//GEN-LAST:event_btnChooseFileActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JLabel label = new JLabel();
        Font font = label.getFont();
        StringBuffer style = new StringBuffer("font-family:" + font.getFamily() + ";");
        style.append("font-weight:").append(font.isBold() ? "bold" : "normal").append(";");
        style.append("font-size:").append(font.getSize()).append("pt;");
        JEditorPane ep = new JEditorPane("text/html", "<html><body style=\"" + style + "\">" //
            + "This application can send and receive files across a Local Area Network (LAN).<br><br>Author: <a href=\"https://github.com/AbinashChetia\">Abinash Chetia</a>" //
            + "</body></html>");
        ep.addHyperlinkListener((HyperlinkEvent e) -> {
            if (e.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED))
                try {
                    Desktop.getDesktop().browse(e.getURL().toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(FileShare.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FileShare.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        ep.setEditable(false);
        ep.setBackground(label.getBackground());
        JOptionPane.showMessageDialog(this, ep);
    }//GEN-LAST:event_btnInfoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold> */
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileShare().setVisible(true);
            }
        });
    }

    private File fileToSend;
    private ServerSocket serverSocket;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChkIP;
    private javax.swing.JButton btnChooseFile;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInfo;
    private javax.swing.JToggleButton btnReceive;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel sendFileName;
    private javax.swing.JTextField tfSend;
    // End of variables declaration//GEN-END:variables
}
