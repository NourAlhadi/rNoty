package noty;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.event.KeyEvent.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
public class Noty extends javax.swing.JFrame {

    static Point mouseDownCompCoords = null;
    String addpath,delpath,lck1path,lck2path,closepath,colorpath,ltrpath,rtlpath;
    private int x = 0;
    
    public Noty() throws IOException {
        //String iconpath = "noty/icon.png";
        //ImageIcon icon = new ImageIcon (getClass().getClassLoader().getResource(iconpath));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("noty/icon.png")));
        this.setUndecorated(true);
        this.setTitle("مذكراتي");
        initComponents();
        jScrollPane1.getHorizontalScrollBar().setBackground(Color.BLACK);
        jScrollPane1.getVerticalScrollBar().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        makeItColored();
        Dimension d = new Dimension(300,200);
        this.setMinimumSize(d);
        addpath = "noty/add.png";
        delpath = "noty/delete.png";
        lck1path = "noty/lock.png";
        lck2path = "noty/unlock.png";
        closepath = "noty/close.png";
        colorpath = "noty/color.png";
        rtlpath = "noty/rtl.png";
        ltrpath = "noty/ltr.png";
        add_buttons();
        text.requestFocus();
        add.setToolTipText("مذكرة جديدة\n Ctrl+N");
        delete.setToolTipText("إغلاق المذكرة\n Ctrl+Q");
        lck.setToolTipText("قفل أو إلغاء قفل مذكرة\n Ctrl+K");
        clr.setToolTipText("تغيير اللون \n Ctrl+E");
        rtl.setToolTipText("الكتابة من اليمين لليسار \n Ctrl+R");
        ltr.setToolTipText("الكتابة من اليسار لليمين \n Ctrl+L");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        lck = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        ltr = new javax.swing.JButton();
        rtl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(216, 216, 216));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        add.setToolTipText("");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setToolTipText("");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        lck.setToolTipText("");
        lck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lckActionPerformed(evt);
            }
        });

        clr.setToolTipText("");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });

        ltr.setToolTipText("");
        ltr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltrActionPerformed(evt);
            }
        });

        rtl.setToolTipText("");
        rtl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lck)
                .addGap(18, 18, 18)
                .addComponent(clr)
                .addGap(18, 18, 18)
                .addComponent(ltr)
                .addGap(18, 18, 18)
                .addComponent(rtl)
                .addGap(18, 18, 18)
                .addComponent(delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add)
                    .addComponent(delete)
                    .addComponent(lck)
                    .addComponent(clr)
                    .addComponent(ltr)
                    .addComponent(rtl))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        text.setColumns(20);
        text.setRows(5);
        text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
                Point currCoords = evt.getLocationOnScreen();
                this.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
                text.requestFocus();
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mouseDownCompCoords = evt.getPoint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        mouseDownCompCoords = null;
    }//GEN-LAST:event_formMouseReleased

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {
            Noty n = new Noty();
            n.setTitle("مذكراتي");
            n.setVisible(true);
        } catch (IOException ex) {
        }
        text.requestFocus();
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (!text.getText().equals("")) {
            int ret =JOptionPane.showConfirmDialog(this, "هل أنت متاكد من رغبتك في إغلاق المذكرة؟؟", "أنت على وشك الإغلاق", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (ret == JOptionPane.NO_OPTION) return;
        }
        this.dispose();
    }//GEN-LAST:event_deleteActionPerformed

    private void lckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lckActionPerformed
        boolean state = text.isEditable();
        ImageIcon icon = null;
        if (state){
            text.setEditable(false);
            icon = new ImageIcon (getClass().getClassLoader().getResource(lck1path));
        }
        else {
            icon = new ImageIcon (getClass().getClassLoader().getResource(lck2path));
            text.setEditable(true);
        }
        lck.setIcon(icon);
        text.requestFocus();
    }//GEN-LAST:event_lckActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
       makeItColored();
       text.requestFocus();
    }//GEN-LAST:event_clrActionPerformed

    private void ltrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltrActionPerformed
       text.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);  
       jScrollPane1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
       text.requestFocus();
    }//GEN-LAST:event_ltrActionPerformed

    private void rtlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtlActionPerformed
        text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);    
        jScrollPane1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        text.requestFocus();
    }//GEN-LAST:event_rtlActionPerformed

    private void textKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyPressed
        if (!evt.isControlDown()) return;
        if (evt.getKeyCode()==VK_A || evt.getExtendedKeyCode()== 16778804) text.selectAll();
        if (evt.getKeyCode()==VK_C || evt.getExtendedKeyCode() == 16778788) text.copy();
        if (evt.getKeyCode()==VK_X || evt.getExtendedKeyCode() == 16778785) text.cut();
        if (evt.getKeyCode()==VK_V || evt.getExtendedKeyCode() == 16778801) text.paste();
        if (evt.getKeyCode()==VK_R || evt.getExtendedKeyCode() == 16778818) rtl.doClick();
        if (evt.getKeyCode()==VK_L || evt.getExtendedKeyCode() == 16778821) ltr.doClick();
        if (evt.getKeyCode()==VK_N || evt.getExtendedKeyCode() == 16778825) add.doClick();
        if (evt.getKeyCode()==VK_Q || evt.getExtendedKeyCode() == 16778806) delete.doClick();
        if (evt.getKeyCode()==VK_E || evt.getExtendedKeyCode() == 16778795) clr.doClick();
        if (evt.getKeyCode()==VK_K || evt.getExtendedKeyCode() == 16778822) lck.doClick();

    }//GEN-LAST:event_textKeyPressed

    public static void main(String args[]) throws IOException {
        
        new Noty().setVisible(true);
    }

    private void makeItColored() {
        Color[] c = {Color.CYAN,Color.MAGENTA,Color.ORANGE,Color.PINK,Color.YELLOW};
        if(x==c.length) x=0;
        getContentPane().setBackground(c[x]);
        panel.setBackground(c[x]);
        text.setBackground(c[x]);
        x++;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clr;
    private javax.swing.JButton delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lck;
    private javax.swing.JButton ltr;
    private javax.swing.JPanel panel;
    private javax.swing.JButton rtl;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables

    private void add_buttons() {
        
        ImageIcon icon = new ImageIcon (getClass().getClassLoader().getResource(addpath));
        ImageIcon icon2 = new ImageIcon (getClass().getClassLoader().getResource(delpath));
        ImageIcon icon3 = new ImageIcon (getClass().getClassLoader().getResource(lck2path));
        ImageIcon icon4 = new ImageIcon (getClass().getClassLoader().getResource(colorpath));
        ImageIcon icon6 = new ImageIcon (getClass().getClassLoader().getResource(ltrpath));
        ImageIcon icon7 = new ImageIcon (getClass().getClassLoader().getResource(rtlpath));
        
        add.setIcon(icon);add.setBorder(BorderFactory.createEmptyBorder());add.setContentAreaFilled(false);
        add.setSize(32, 32);
        delete.setIcon(icon2);delete.setBorder(BorderFactory.createEmptyBorder());
        delete.setContentAreaFilled(false);delete.setSize(32, 32);
        
        lck.setIcon(icon3);lck.setBorder(BorderFactory.createEmptyBorder());
        lck.setContentAreaFilled(false);lck.setSize(32, 32);
        
        clr.setIcon(icon4);clr.setBorder(BorderFactory.createEmptyBorder());
        clr.setContentAreaFilled(false);clr.setSize(32, 32);
        
        ltr.setIcon(icon6);ltr.setBorder(BorderFactory.createEmptyBorder());
        ltr.setContentAreaFilled(false);ltr.setSize(32, 32);
        
        rtl.setIcon(icon7);rtl.setBorder(BorderFactory.createEmptyBorder());
        rtl.setContentAreaFilled(false);rtl.setSize(32, 32);

        panel.add(add);
        panel.add(delete);
        panel.add(lck);
        panel.add(clr);
        panel.add(ltr);
        panel.add(rtl);
        
        
    }
}
