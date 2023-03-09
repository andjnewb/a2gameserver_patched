/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on Feb 3, 2009, 10:04:13 PM
 */
package ags.ui.host;

import ags.controller.Configurator;
import ags.controller.Launcher;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brobert
 */
public class Main extends javax.swing.JFrame {

    public static Main instance;

    /** Creates new form Main */
    public Main() {
        Configurator.loadValues();
        initComponents();
        initStarfield();
        instance = this;
        c = new ConfigPanel();
        Style.apply(logDisplay);
        Style.apply(logScroll);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        logScroll = new javax.swing.JScrollPane();
        logDisplay = new javax.swing.JTextArea();
        banner = new javax.swing.JLabel();
        settingsButton = new javax.swing.JButton();
        footer = new javax.swing.JLabel();
        startStopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apple Game Server 3.1");
        setBackground(java.awt.Color.black);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setForeground(java.awt.Color.black);

        panel1.setBackground(java.awt.Color.black);
        panel1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                resizeStarfield(evt);
            }
        });

        logScroll.setBackground(java.awt.Color.green);
        logScroll.setForeground(java.awt.Color.white);
        logScroll.setToolTipText("Double-click to clear");
        logScroll.setHorizontalScrollBar(null);

        logDisplay.setBackground(java.awt.Color.black);
        logDisplay.setLineWrap(true);
        logDisplay.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        logDisplay.setSelectionColor(java.awt.Color.orange);
        logDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logDisplayMouseClicked(evt);
            }
        });
        logScroll.setViewportView(logDisplay);

        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ags/resources/logo_banner.png"))); // NOI18N
        banner.setToolTipText("Apple Game Server v3");
        banner.setFocusable(false);
        banner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        banner.setIconTextGap(0);

        settingsButton.setBackground(new java.awt.Color(1, 1, 1));
        settingsButton.setFont(getAppleFont());
        settingsButton.setForeground(new java.awt.Color(254, 254, 254));
        settingsButton.setText("Edit Settings");
        settingsButton.setToolTipText("Edit settings and save new default settings before launching");
        settingsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(30, 255, 0), new java.awt.Color(255, 0, 251)));
        settingsButton.setContentAreaFilled(false);
        settingsButton.setDefaultCapable(false);
        settingsButton.setFocusable(false);
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ags/resources/credits.png"))); // NOI18N
        footer.setToolTipText("<html>Game descriptions provided mobygames.com<br>\nGreetings to the regulars on comp.sys.apple2 and<br>\nretro-computing enthusiasts everywhere!<br><br>\n][ INFINITUM!");
        footer.setFocusable(false);
        footer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        footer.setIconTextGap(0);

        startStopButton.setBackground(new java.awt.Color(1, 1, 1));
        startStopButton.setFont(getAppleFont());
        startStopButton.setForeground(new java.awt.Color(254, 254, 254));
        startStopButton.setText("Start Program");
        startStopButton.setToolTipText("Don't forget to get your Apple ][ ready first! :-)");
        startStopButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(30, 255, 0), new java.awt.Color(255, 0, 251)));
        startStopButton.setContentAreaFilled(false);
        startStopButton.setFocusPainted(false);
        startStopButton.setFocusable(false);
        startStopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startStopButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startStopButtonMouseExited(evt);
            }
        });
        startStopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startStopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logScroll)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startStopButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(startStopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initStarfieldImage() {
        if (panel1.getWidth() != 0 && panel1.getHeight() != 0)
        i = new BufferedImage(panel1.getWidth(), panel1.getHeight(), BufferedImage.TYPE_INT_RGB);
    }

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        settingsButton.setBackground(Color.WHITE);
        settingsButton.setForeground(Color.BLACK);
        settingsButton.setContentAreaFilled(true);
}//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        settingsButton.setBackground(Color.BLACK);
        settingsButton.setForeground(Color.WHITE);
        settingsButton.setContentAreaFilled(false);
}//GEN-LAST:event_settingsButtonMouseExited

    private void startStopButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startStopButtonMouseEntered
        startStopButton.setBackground(Color.WHITE);
        startStopButton.setForeground(Color.BLACK);
        startStopButton.setContentAreaFilled(true);
}//GEN-LAST:event_startStopButtonMouseEntered

    private void startStopButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startStopButtonMouseExited
        startStopButton.setBackground(Color.BLACK);
        startStopButton.setForeground(Color.WHITE);
        startStopButton.setContentAreaFilled(false);
}//GEN-LAST:event_startStopButtonMouseExited
    ConfigPanel c;
    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        c.setVisible(true);
}//GEN-LAST:event_settingsButtonActionPerformed

    private void startStopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startStopButtonActionPerformed
        Launcher.startStop();
}//GEN-LAST:event_startStopButtonActionPerformed

    private void resizeStarfield(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_resizeStarfield
        initStarfieldImage();
    }//GEN-LAST:event_resizeStarfield

    private void logDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logDisplayMouseClicked
        if (evt.getClickCount() > 1) {
            logDisplay.setText("");
        }
    }//GEN-LAST:event_logDisplayMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Style.applyDefaults();
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    static Font dialogFont = null;

    public static Font getAppleFont() {
        if (dialogFont == null) {
            try {
                InputStream fontInputStream = Main.class.getResourceAsStream("/ags/resources/a2like.ttf");
                Font base = Font.createFont(Font.TRUETYPE_FONT, fontInputStream);
                dialogFont = base.deriveFont(Font.PLAIN, 16f);
            } catch (FontFormatException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dialogFont;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel banner;
    public javax.swing.JLabel footer;
    public javax.swing.JTextArea logDisplay;
    public javax.swing.JScrollPane logScroll;
    public java.awt.Panel panel1;
    public javax.swing.JButton settingsButton;
    public javax.swing.JButton startStopButton;
    // End of variables declaration//GEN-END:variables

    private class Point {

        int x;
        double y;
        double speed;
        int color;

        public Point(int xSize) {
            randomize(xSize);
        }

        void randomize(int xSize) {
            y = 0;
            x = (int) (Math.random() * xSize);
            speed = (Math.random() * 10) + 0.5;
            color = (int) (Math.random() * 4);
        }
    }
    Point[] stars;
    BufferedImage i;

    private void moveStars() {
        for (Point star : stars) {
            star.y += star.speed;
            if (star.y > panel1.getHeight()) {
                star.randomize(panel1.getWidth());
            }
        }
    }

    private void initStarfield() {
        initStarfieldImage();
        stars = new Point[40];
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Point(panel1.getWidth());
        }
        for (int i = 0; i < 100; i++) {
            moveStars();
        }
        Thread t = new Thread(new Runnable() {

//            @Override
            public void run() {
                while (true) {
                    moveStars();
                    repaint();

                    try {
                        Thread.sleep(1000 / 30);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        t.setDaemon(true);
        t.start();
    }

    public void drawStars() {
//        Graphics g = panel1.getGraphics();
        Graphics g = i.getGraphics();
        g.clearRect(0, 0, panel1.getWidth(), panel1.getHeight());
        panel1.paint(g);
        for (Point star : stars) {
            switch (star.color) {
                case 0:
                    g.setColor(Color.WHITE);
                    break;
                case 1:
                    g.setColor(Color.BLUE);
                    break;
                case 2:
                    g.setColor(Color.ORANGE);
                    break;
                case 3:
                    g.setColor(Color.GREEN);
                    break;
            }
            g.drawRect(star.x, (int) star.y, 1, 1);
        }
        g.dispose();
        g = panel1.getGraphics();
        g.drawImage(i, 0, 0, null);
        g.dispose();
//        repaint();
    }

    public void repaint() {
        super.repaint();
        drawStars();
    }
}