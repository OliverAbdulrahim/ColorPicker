package colorpicker;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * The {@code ColorPicker} class contains a simple user interface that can 
 * preview and modify RGB-composed colors. This is an introductory user 
 * interface that is simple to use and understand.
 * 
 * @author Oliver Abdulrahim
 */
public class ColorPicker extends javax.swing.JFrame {
    
    private static final long serialVersionUID = 7345693780L;
    
    /**
     * Stores the current red component of the {@code colorLabel}.
     */
    private int red;
    
    /**
     * Stores the current green component of the {@code colorLabel}.
     */    
    private int green;
    
    /**
     * Stores the current blue component of the {@code colorLabel}.
     */
    private int blue;
    
    /**
     * Stores the default color value of the red, green, and blue components.
     */
    public static final int DEFAULT_COLOR_VALUE = 0;

    /**
     * Creates new, default {@code ColorPicker_GUI} form.
     */
    public ColorPicker() {
        red = DEFAULT_COLOR_VALUE;
        green = DEFAULT_COLOR_VALUE;
        blue = DEFAULT_COLOR_VALUE;
        initComponents();
        updateLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutFrame = new javax.swing.JFrame();
        aboutContainer = new javax.swing.JPanel();
        aboutLabel = new javax.swing.JLabel();
        aboutExitButton = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        redLabel = new javax.swing.JLabel();
        greenLabel = new javax.swing.JLabel();
        blueLabel = new javax.swing.JLabel();
        redSlider = new javax.swing.JSlider();
        greenSlider = new javax.swing.JSlider();
        blueSlider = new javax.swing.JSlider();
        previewPanel = new javax.swing.JPanel();
        colorLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuBarFile = new javax.swing.JMenu();
        menuBarFile_New = new javax.swing.JMenuItem();
        menuBarFile_Separator = new javax.swing.JPopupMenu.Separator();
        menuBarFile_Exit = new javax.swing.JMenuItem();
        menuBarEdit = new javax.swing.JMenu();
        menuBarEdit_Settings = new javax.swing.JMenuItem();
        menuBarHelp = new javax.swing.JMenu();
        menuBarHelp_About = new javax.swing.JMenuItem();

        aboutFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        aboutFrame.setTitle("About");
        aboutFrame.setAlwaysOnTop(true);
        aboutFrame.setLocationByPlatform(true);
        aboutFrame.setResizable(false);

        aboutContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("About This Program"));
        aboutContainer.setToolTipText("");

        aboutLabel.setText("<html><p>This program was written by Oliver Abdulrahim for AP Computer Science class.<br><br>To report a bug, email <u>n.2147483648@gmail.com</u> with steps to reproduce it.</p></html>");

        aboutExitButton.setText("OK");
        aboutExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                aboutExitButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout aboutContainerLayout = new javax.swing.GroupLayout(aboutContainer);
        aboutContainer.setLayout(aboutContainerLayout);
        aboutContainerLayout.setHorizontalGroup(
            aboutContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(aboutContainerLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(aboutExitButton)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        aboutContainerLayout.setVerticalGroup(
            aboutContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aboutExitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout aboutFrameLayout = new javax.swing.GroupLayout(aboutFrame.getContentPane());
        aboutFrame.getContentPane().setLayout(aboutFrameLayout);
        aboutFrameLayout.setHorizontalGroup(
            aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        aboutFrameLayout.setVerticalGroup(
            aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        settingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Color Settings"));

        redLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        redLabel.setText("Red");

        greenLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        greenLabel.setText("Green");

        blueLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        blueLabel.setText("Blue");

        redSlider.setMaximum(255);
        redSlider.setValue(0);
        redSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderStateChanged(evt);
            }
        });

        greenSlider.setMaximum(255);
        greenSlider.setValue(0);
        greenSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenSliderStateChanged(evt);
            }
        });

        blueSlider.setMaximum(255);
        blueSlider.setValue(0);
        blueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addComponent(greenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addComponent(redLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addComponent(blueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {blueLabel, greenLabel, redLabel});

        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(redSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(greenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {blueLabel, blueSlider, greenLabel, redLabel});

        previewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Color Preview"));

        colorLabel.setToolTipText("Currently " + red + " red, " + green + " green, " + blue + " blue.");
        colorLabel.setOpaque(true);

        javax.swing.GroupLayout previewPanelLayout = new javax.swing.GroupLayout(previewPanel);
        previewPanel.setLayout(previewPanelLayout);
        previewPanelLayout.setHorizontalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        previewPanelLayout.setVerticalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuBarFile.setText("File");

        menuBarFile_New.setText("New");
        menuBarFile_New.setEnabled(false);
        menuBarFile.add(menuBarFile_New);
        menuBarFile.add(menuBarFile_Separator);

        menuBarFile_Exit.setText("Exit");
        menuBarFile_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarFile_ExitActionPerformed(evt);
            }
        });
        menuBarFile.add(menuBarFile_Exit);

        menuBar.add(menuBarFile);

        menuBarEdit.setText("Edit");

        menuBarEdit_Settings.setText("Settings");
        menuBarEdit_Settings.setEnabled(false);
        menuBarEdit.add(menuBarEdit_Settings);

        menuBar.add(menuBarEdit);

        menuBarHelp.setText("Help");

        menuBarHelp_About.setText("About");
        menuBarHelp_About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarHelp_AboutActionPerformed(evt);
            }
        });
        menuBarHelp.add(menuBarHelp_About);

        menuBar.add(menuBarHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(previewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exits the program when invoked.
     */
    private void menuBarFile_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarFile_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuBarFile_ExitActionPerformed

    /**
     * Displays an informative window about this program.
     */
    private void menuBarHelp_AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarHelp_AboutActionPerformed
        showAboutFrame();
    }//GEN-LAST:event_menuBarHelp_AboutActionPerformed

    /**
     * Exits the informative program window.
     */
    private void aboutExitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutExitButtonMouseReleased
        aboutFrame.dispose();
    }//GEN-LAST:event_aboutExitButtonMouseReleased

    /**
     * Updates the red component of {@link #colorLabel}.
     */
    private void redSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSliderStateChanged
        colorSliderChanged();
    }//GEN-LAST:event_redSliderStateChanged

    /**
     * Updates the green component of {@link #colorLabel}.
     */
    private void greenSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenSliderStateChanged
        colorSliderChanged();
    }//GEN-LAST:event_greenSliderStateChanged

    /**
     * Updates the blue component of {@link #colorLabel}.
     */
    private void blueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueSliderStateChanged
        colorSliderChanged();
    }//GEN-LAST:event_blueSliderStateChanged
    
    /**
     * Delegates the operations that should occur when a value changes in any of
     * the {@code JSliders} associated to the color picker.
     */
    private void colorSliderChanged() {
        updateValues();
        updateLabel();
    }
    
    /**
     * Updates this object's {@link #red}, {@link #green}, and {@link #blue} 
     * attributes.
     */
    private void updateValues() {
        red = redSlider.getValue();
        green = greenSlider.getValue();
        blue = blueSlider.getValue();
    }
    
    /**
     * Updates this object's {@code colorLabel} using this object's 
     * {@link #red}, {@link #green}, and {@link #blue} attributes.
     */
    private void updateLabel() {
        colorLabel.setBackground(new Color(red, green, blue));
        colorLabel.setToolTipText("Currently " + red   + " red, " 
                                               + green + " green, " 
                                               + blue  + " blue.");
    }
    
    /**
     * Displays an informative window about this program.
     */
    private void showAboutFrame() {
        // Should let the operating system decide where to put the window, but
        // it defaults to the center on Windows, which can be jarring.
        aboutFrame.setBounds(getX() + 10, getY() + 10, 300, 200);
        aboutFrame.setVisible(true);
    }
    
    /**
     * Creates and displays an instance of this class.
     * 
     * @param args The command-line arguments.
     */
    public static void main(String args[]) {
        // Sets the Windows look and feel
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException 
               | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ColorPicker.class.getName())
                    .log(Level.SEVERE, 
                            "Error with look and feel settings. "
                          + "Check if look and feels are installed correctly",
                            ex);
        }
        EventQueue.invokeLater(() -> {
            new ColorPicker().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutContainer;
    private javax.swing.JButton aboutExitButton;
    private javax.swing.JFrame aboutFrame;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel blueLabel;
    private javax.swing.JSlider blueSlider;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JSlider greenSlider;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBarEdit;
    private javax.swing.JMenuItem menuBarEdit_Settings;
    private javax.swing.JMenu menuBarFile;
    private javax.swing.JMenuItem menuBarFile_Exit;
    private javax.swing.JMenuItem menuBarFile_New;
    private javax.swing.JPopupMenu.Separator menuBarFile_Separator;
    private javax.swing.JMenu menuBarHelp;
    private javax.swing.JMenuItem menuBarHelp_About;
    private javax.swing.JPanel previewPanel;
    private javax.swing.JLabel redLabel;
    private javax.swing.JSlider redSlider;
    private javax.swing.JPanel settingsPanel;
    // End of variables declaration//GEN-END:variables
    
}
