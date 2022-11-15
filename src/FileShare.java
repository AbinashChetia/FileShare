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
import org.apache.commons.io.FilenameUtils;

public class FileShare extends javax.swing.JFrame {

    public FileShare() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInfo = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        btnChkIP = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnChooseFile = new javax.swing.JButton();
        sendFileName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfSend = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        lbSendStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLoc = new javax.swing.JButton();
        lbLoc = new javax.swing.JLabel();
        btnReceive = new javax.swing.JToggleButton();
        lbReceiveStatus = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FileShare");
        setBackground(new java.awt.Color(242, 231, 213));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(503, 400));
        setMinimumSize(new java.awt.Dimension(503, 400));
        setPreferredSize(new java.awt.Dimension(503, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInfo.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        btnInfo.setText("i");
        btnInfo.setToolTipText("Info");
        btnInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));
        btnInfo.getAccessibleContext().setAccessibleName("Info");

        lbTitle.setFont(new java.awt.Font("Yrsa", 1, 36)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle.setText("FileShare");
        lbTitle.setOpaque(true);
        getContentPane().add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 140, 40));

        btnChkIP.setFont(new java.awt.Font("Manjari", 1, 18)); // NOI18N
        btnChkIP.setText("Check Local IP");
        btnChkIP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChkIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkIPActionPerformed(evt);
            }
        });
        getContentPane().add(btnChkIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 50));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Manjari", 0, 18)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N

        btnChooseFile.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnChooseFile.setText("Choose File");
        btnChooseFile.setToolTipText("Choose a file to send");
        btnChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileActionPerformed(evt);
            }
        });

        sendFileName.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        sendFileName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Enter Receiver's Local IP ");

        tfSend.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        tfSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSendActionPerformed(evt);
            }
        });

        btnSend.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lbSendStatus.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSend, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSendStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnChooseFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendFileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnChooseFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendFileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend)
                    .addComponent(lbSendStatus))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSend, lbSendStatus});

        jTabbedPane1.addTab("SEND", jPanel1);

        btnLoc.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnLoc.setText("Choose Download Location");
        btnLoc.setToolTipText("Choose a folder to store downloaded file ");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        lbLoc.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbLoc.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnReceive.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnReceive.setText("Start Receiving");
        btnReceive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiveActionPerformed(evt);
            }
        });

        lbReceiveStatus.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbLoc, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLoc)
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnReceive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbReceiveStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReceive)
                    .addComponent(lbReceiveStatus))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnReceive, lbReceiveStatus});

        jTabbedPane1.addTab("RECEIVE", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 480, 140));

        btnExit.setFont(new java.awt.Font("Manjari", 1, 18)); // NOI18N
        btnExit.setText("Cancel && Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 170, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        lbSendStatus.setText("Sending...");
        if (fileToSend == null) {
            lbSendStatus.setText("");
            JOptionPane.showMessageDialog(this, "Error: No file is selected.", "Error", 0);
        }
        else if (tfSend.getText().equals("")) {
            lbSendStatus.setText("");
            JOptionPane.showMessageDialog(this, "Receiver's IP is not entered.", "Error", 0);
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
                lbSendStatus.setText("");
                JOptionPane.showMessageDialog(this, fileToSend.getName() + " sent to " + tfSend.getText() + ".", "Success", 1);
            } catch (HeadlessException | IOException e) {
                lbSendStatus.setText("");
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
            JOptionPane.showMessageDialog(this, ipMessage, "Network Info", 1);
        } catch (SocketException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error", 0);
        }
    }//GEN-LAST:event_btnChkIPActionPerformed

    private void btnReceiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiveActionPerformed
        if (btnReceive.isSelected() == true && (downloadLoc.isBlank() || downloadLoc.isEmpty())) {
            btnReceive.setSelected(false);
            btnReceive.setText("Start Receiving");
            JOptionPane.showMessageDialog(this, "No download location chosen. Please choose one and start again.", "Error", 0);
        } else {
            Thread t = new Thread() {
                @Override
                public void run() {
                    downloadFile();
                }
            };
            if (btnReceive.isSelected() == true) {
                try {
                    btnReceive.setText("Stop Receiving");
                    serverSocket = new ServerSocket(1050);
                    t.start();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, e.toString(), "Error", 0);
                }
            } else {
                try {
                    t.interrupt();
                    serverSocket.close();
                    btnReceive.setText("Start Receiving");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, e.toString(), "Error", 0);
                }
            }
        }
    }//GEN-LAST:event_btnReceiveActionPerformed
 
    private void downloadFile() {
        try {
            try (Socket socket = serverSocket.accept()) {
                lbReceiveStatus.setText("Receiving...");
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
                        Files.createDirectories(Paths.get(downloadLoc));
                        boolean check = new File(downloadLoc + "/" + fileName).exists();
                        while (check == true) {
                            String fileExtension = FilenameUtils.getExtension(fileName);
                            fileName = fileName.replace("." + fileExtension, "_." + fileExtension);
                            check = new File(downloadLoc + "/" + fileName).exists();
                        }
                        File fileToDownload = new File(downloadLoc + "/" + fileName);
                        try {
                            try (FileOutputStream fileOutputStream = new FileOutputStream(fileToDownload)) {
                                fileOutputStream.write(fileContentBytes);
                            }
                            lbReceiveStatus.setText("");
                            JOptionPane.showMessageDialog(this, fileName + " downloaded and stored in " + downloadLoc + " folder.", "Success", 1);
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(this, e.toString(), "Error", 0);
                        }
                    }
                }
                socket.close();
                lbReceiveStatus.setText("");
            }
            serverSocket.close();
            btnReceive.setSelected(false);
            btnReceive.setText("Start Receiving");
        } catch (IOException e) {
            lbReceiveStatus.setText("");
            JOptionPane.showMessageDialog(this, "Server stopped.\n", "Message", 2);
        }
    }
    
    private void btnChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose the file to send");
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            fileToSend = fileChooser.getSelectedFile();
            sendFileName.setText(fileToSend.getName());
        }
    }//GEN-LAST:event_btnChooseFileActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JLabel label = new JLabel();
        Font font = label.getFont();
        StringBuffer style = new StringBuffer("font-family:" + font.getFamily() + ";");
        style.append("font-weight:").append(font.isBold() ? "bold" : "normal").append(";");
        style.append("font-size:").append(font.getSize()).append("pt;");
        JEditorPane ep = new JEditorPane("text/html", "<html><body style=\"" + style + "\">" //
            + "This application can send and receive files across a Local Area Network (LAN).<br><br>Author: Abinash Chetia <br>Email: <a href=\"mailto:abinashdu2000@gmail.com\">abinashdu2000@gmail.com</a><br>GitHub: <a href=\"https://github.com/AbinashChetia\">AbinashChetia</a>" //
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
        JOptionPane.showMessageDialog(this, ep, "App Info", 1); ;
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        JFileChooser locChooser = new JFileChooser();
        locChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        locChooser.setDialogTitle("Choose the download location");
        if (locChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            downloadLoc = locChooser.getSelectedFile().toString();
            lbLoc.setText(downloadLoc);
        }
    }//GEN-LAST:event_btnLocActionPerformed

    private void tfSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSendActionPerformed

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
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileShare().setVisible(true);
            }
        });
    }

    private File fileToSend;
    private String downloadLoc = "";
    private ServerSocket serverSocket;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChkIP;
    private javax.swing.JButton btnChooseFile;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLoc;
    private javax.swing.JToggleButton btnReceive;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbLoc;
    private javax.swing.JLabel lbReceiveStatus;
    private javax.swing.JLabel lbSendStatus;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel sendFileName;
    private javax.swing.JTextField tfSend;
    // End of variables declaration//GEN-END:variables
}
