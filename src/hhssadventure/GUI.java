/*
 * The GUI class allows for the buttons, the display of the direction, 
 * and if the front is blocked display to function within the interface. The GUI class is interconnected 
 * to the controller, which the controller is interconnected with the location, map, and screen class.
 */
package hhssadventure;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author richj0985, starwarslover1998, and tatad6701
 */
public class GUI extends javax.swing.JFrame {

    // Create the constant to be used
    private Controller controller;

    /**
     * Creating a new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * Method that connects the controller to the GUI
     *
     * @param c The physical controller that is being interconnected
     */
    public void setController(Controller c) {
        controller = c;
    }

    /**
     * Method that sets the images
     *
     * @param img Grabbing the physical image
     */
    public void setImage(BufferedImage img) {
        // The image panel sets its image
        imagePanel.setImage(img);
    }

    /**
     * Method that sets the location and direction of the user interface
     */
    public void setScreenLabel() {
        // Imports the direction into the GUI
        // Displays the text corresponding to the direction of the user
        if (controller.getDirection().equals("N")) {
            labelScreen.setText( controller.getLocation().toUpperCase() +": NORTH");
        } else if (controller.getDirection().equals("S")) {
            labelScreen.setText( controller.getLocation().toUpperCase() + ": SOUTH");
        } else if (controller.getDirection().equals("E")) {
            labelScreen.setText( controller.getLocation().toUpperCase() + ": EAST");
        } else if (controller.getDirection().equals("W")) {
            labelScreen.setText( controller.getLocation().toUpperCase() + ": WEST");
        }
    }

    /**
     * Method that sets if blocked or not to the interface
     *
     * @param blocked whether the user is blocked or not is then to be printed
     * on the interface
     */
    public void setBlocked(boolean blocked) {
        // Imports if the current direction is blocked or not into the GUI
        // Diplays the text corresponding to if the front is blocked or not
        if (blocked) {
            buttonForward.setText("BLOCKED!");
            buttonForward.setBackground( Color.RED );
        } else {
            buttonForward.setText("MOVE FORWARD");
            buttonForward.setBackground( Color.GREEN );
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. ;)
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonForward = new javax.swing.JButton();
        buttonLeft = new javax.swing.JButton();
        buttonRight = new javax.swing.JButton();
        buttonBackwards = new javax.swing.JButton();
        imagePanel = new hhssadventure.ImageComponent();
        labelScreen = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonForward.setBackground(new java.awt.Color(0, 0, 0));
        buttonForward.setForeground(new java.awt.Color(255, 255, 255));
        buttonForward.setText("MOVE FORWARD");
        buttonForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForwardActionPerformed(evt);
            }
        });

        buttonLeft.setBackground(new java.awt.Color(0, 0, 0));
        buttonLeft.setForeground(new java.awt.Color(255, 255, 255));
        buttonLeft.setText("TURN LEFT");
        buttonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLeftActionPerformed(evt);
            }
        });

        buttonRight.setBackground(new java.awt.Color(0, 0, 0));
        buttonRight.setForeground(new java.awt.Color(255, 255, 255));
        buttonRight.setText("TURN RIGHT");
        buttonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRightActionPerformed(evt);
            }
        });

        buttonBackwards.setBackground(new java.awt.Color(0, 0, 0));
        buttonBackwards.setForeground(new java.awt.Color(255, 255, 255));
        buttonBackwards.setText("TURN BACKWARDS");
        buttonBackwards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackwardsActionPerformed(evt);
            }
        });

        imagePanel.setToolTipText("");

        labelScreen.setEditable(false);
        labelScreen.setBackground(new java.awt.Color(204, 0, 204));
        labelScreen.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        labelScreen.setForeground(new java.awt.Color(255, 255, 255));
        labelScreen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelScreenActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 0, 204));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("HHSS ADVENTURE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(imagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelScreen))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(buttonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addComponent(buttonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonBackwards, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(buttonForward, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonForward, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLeft)
                    .addComponent(buttonRight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBackwards)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Button to Move Forward
     * @param evt Action Performed
     */
    private void buttonForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForwardActionPerformed
        // Go forward!
        controller.goForward();
    }//GEN-LAST:event_buttonForwardActionPerformed
    
    /**
     * Button to Turn Right
     * @param evt Action Performed
     */
    private void buttonRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRightActionPerformed
        // If the user is facing North, its right direction is East
        if (controller.getDirection().equals("N")) {
            controller.turnEast();
            // If the user is facing South, the direction to the right is West
        } else if (controller.getDirection().equals("S")) {
            controller.turnWest();
            // If the user is facing East, the direction to the right is South
        } else if (controller.getDirection().equals("E")) {
            controller.turnSouth();
            // If the user is facing West, the direction to the right is North
        } else if (controller.getDirection().equals("W")) {
            controller.turnNorth();
        }
    }//GEN-LAST:event_buttonRightActionPerformed
    
    /**
     * Button to Turn Backwards
     * @param evt Action Performed
     */
    private void buttonBackwardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackwardsActionPerformed
        // If the user is facing North, its opposite (bottom) direction is South
        if (controller.getDirection().equals("N")) {
            controller.turnSouth();
            // If the user is facing South, its opposite (bottom) direction is North
        } else if (controller.getDirection().equals("S")) {
            controller.turnNorth();
            // If the user is facing East, its opposite (bottom) direction is West
        } else if (controller.getDirection().equals("E")) {
            controller.turnWest();
            // If the user is facing West, its opposite (bottom) direction is East
        } else if (controller.getDirection().equals("W")) {
            controller.turnEast();
        }
    }//GEN-LAST:event_buttonBackwardsActionPerformed

    /**
     * Button to Turn Left
     * @param evt Action Performed
     */
    private void buttonLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLeftActionPerformed
        // If the user is facing North, its left direction is West
        if (controller.getDirection().equals("N")) {
            controller.turnWest();
            // If the user is facing South, its left direction is East
        } else if (controller.getDirection().equals("S")) {
            controller.turnEast();
            // If the user is facing East, its left direction is North
        } else if (controller.getDirection().equals("E")) {
            controller.turnNorth();
            // If the user is facing West, its left direction is South
        } else if (controller.getDirection().equals("W")) {
            controller.turnSouth();
        }
    }//GEN-LAST:event_buttonLeftActionPerformed

    /**
     * Label for the direction the user is facing
     *
     * @param evt Action Performed
     */
    private void labelScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelScreenActionPerformed
    }//GEN-LAST:event_labelScreenActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBackwards;
    private javax.swing.JButton buttonForward;
    private javax.swing.JButton buttonLeft;
    private javax.swing.JButton buttonRight;
    private hhssadventure.ImageComponent imagePanel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField labelScreen;
    // End of variables declaration//GEN-END:variables
}
