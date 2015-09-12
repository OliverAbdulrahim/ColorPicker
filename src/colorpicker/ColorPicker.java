package colorpicker;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;

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
     * Stores the default color value of the red, green, and blue components.
     */
    public static final int DEFAULT_COLOR_VALUE = 0;
    
    /**
     * Stores the minimum value for a color component.
     */
    public static final int MIN_COLOR_VALUE = 0;
    
    /**
     * Stores the maximum value for a color component.
     */
    public static final int MAX_COLOR_VALUE = 255;
    
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
     * Creates new, default {@code ColorPicker} form.
     */
    public ColorPicker() {
        red = DEFAULT_COLOR_VALUE;
        green = DEFAULT_COLOR_VALUE;
        blue = DEFAULT_COLOR_VALUE;
        initComponents();
        updateColorPreview();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsPanel = new javax.swing.JPanel();
        redLabel = new javax.swing.JLabel();
        greenLabel = new javax.swing.JLabel();
        blueLabel = new javax.swing.JLabel();
        redSlider = new javax.swing.JSlider();
        greenSlider = new javax.swing.JSlider();
        blueSlider = new javax.swing.JSlider();
        redSpinner = new javax.swing.JSpinner();
        greenSpinner = new javax.swing.JSpinner();
        blueSpinner = new javax.swing.JSpinner();
        previewPanel = new javax.swing.JPanel();
        colorLabel = new javax.swing.JLabel();
        aboutPanel = new javax.swing.JPanel();
        aboutLabel = new javax.swing.JLabel();
        topMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileCopyMenuItem = new javax.swing.JMenuItem();
        fileSeparator = new javax.swing.JPopupMenu.Separator();
        fileExitItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        settingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Color Settings"));

        redLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        redLabel.setText("R");

        greenLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        greenLabel.setText("G");

        blueLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        blueLabel.setText("B");

        redSlider.setMaximum(255);
        redSlider.setMinorTickSpacing(1);
        redSlider.setValue(0);
        redSlider.setPreferredSize(new java.awt.Dimension(255, 26));
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

        redSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        redSpinner.setRequestFocusEnabled(false);
        redSpinner.setValue(DEFAULT_COLOR_VALUE);
        redSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSpinnerStateChanged(evt);
            }
        });

        greenSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        greenSpinner.setRequestFocusEnabled(false);
        greenSpinner.setValue(DEFAULT_COLOR_VALUE);
        greenSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenSpinnerStateChanged(evt);
            }
        });

        blueSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        blueSpinner.setRequestFocusEnabled(false);
        blueSpinner.setValue(DEFAULT_COLOR_VALUE);
        blueSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueSpinnerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redLabel)
                    .addComponent(blueLabel)
                    .addComponent(greenLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(redSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(blueSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(greenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {blueLabel, greenLabel, redLabel});

        settingsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {blueSlider, greenSlider, redSlider});

        settingsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {blueSpinner, greenSpinner, redSpinner});

        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addComponent(redSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(redLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(greenLabel)
                            .addComponent(greenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueLabel)
                            .addComponent(blueSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {blueLabel, blueSlider, greenLabel, greenSlider, redLabel, redSlider});

        settingsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {blueSpinner, greenSpinner, redSpinner});

        previewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Color Preview"));

        colorLabel.setToolTipText("Currently " + red + " red, " + green + " green, " + blue + " blue.");
        colorLabel.setOpaque(true);
        colorLabel.setPreferredSize(new java.awt.Dimension(211, 211));
        colorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout previewPanelLayout = new javax.swing.GroupLayout(previewPanel);
        previewPanel.setLayout(previewPanelLayout);
        previewPanelLayout.setHorizontalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        previewPanelLayout.setVerticalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aboutPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("About"));

        aboutLabel.setText("<html><p>This is a simple demonstrative GUI. To change the color of the preview, modify the desired component slider.</p><br><p>Once you get a color you like, double-click the color preview to add the color to your clipboard.</html>");

        javax.swing.GroupLayout aboutPanelLayout = new javax.swing.GroupLayout(aboutPanel);
        aboutPanel.setLayout(aboutPanelLayout);
        aboutPanelLayout.setHorizontalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        aboutPanelLayout.setVerticalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        fileCopyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        fileCopyMenuItem.setText("Copy Current Color");
        fileCopyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileCopyMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(fileCopyMenuItem);
        fileMenu.add(fileSeparator);

        fileExitItem.setText("Exit");
        fileExitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExitItemItemActionPerformed(evt);
            }
        });
        fileMenu.add(fileExitItem);

        topMenuBar.add(fileMenu);

        setJMenuBar(topMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void fileExitItemItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExitItemItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fileExitItemItemActionPerformed
    
    /**
     * If the user double-clicks on the label, then copy the current color as 
     * hex to their clipboard.
     * 
     * @param evt Contains the amount of user mouse clicks associated with this 
     *            event.
     */
    private void colorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorLabelMouseClicked
        if (evt.getClickCount() == 2) {
            addColorToClipboard();
        }
    }//GEN-LAST:event_colorLabelMouseClicked
    
    private void fileCopyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileCopyMenuItemActionPerformed
        addColorToClipboard();
    }//GEN-LAST:event_fileCopyMenuItemActionPerformed

    private void redSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSpinnerStateChanged
        spinnerInputReceived(evt, redSlider);
    }//GEN-LAST:event_redSpinnerStateChanged

    private void greenSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenSpinnerStateChanged
        spinnerInputReceived(evt, greenSlider);
    }//GEN-LAST:event_greenSpinnerStateChanged

    private void blueSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueSpinnerStateChanged
        spinnerInputReceived(evt, blueSlider);
    }//GEN-LAST:event_blueSpinnerStateChanged

    private void redSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSliderStateChanged
        sliderInputReceived(evt, redSpinner);
    }//GEN-LAST:event_redSliderStateChanged

    private void greenSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenSliderStateChanged
        sliderInputReceived(evt, greenSpinner);
    }//GEN-LAST:event_greenSliderStateChanged

    private void blueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueSliderStateChanged
        sliderInputReceived(evt, blueSpinner);
    }//GEN-LAST:event_blueSliderStateChanged
    
    /**
     * Delegates updates from a slider to the color preview and the respective
     * spinner.
     */
    private void sliderInputReceived(ChangeEvent evt, JSpinner dest) {
        JSlider spinner = ((JSlider) evt.getSource());
        dest.setValue(spinner.getValue());
        updateColorPreview();
    }
    
    /**
     * Delegates updates from a spinner to the color preview and the respective
     * slider.
     */
    private void spinnerInputReceived(ChangeEvent evt, JSlider dest) {
        JSpinner slider = ((JSpinner) evt.getSource());
        dest.setValue((Integer) slider.getValue());
        updateColorPreview();
    }
    
    /**
     * Returns a hex representation of the given color with zero-padding.
     * 
     * @param c The color to process.
     * @return A padded {@code String} hex representation of the given color.
     */
    private static String colorToHexString(Color c) {
        return String.format("#%06X", (0xFFFFFF & c.hashCode()));
    }
    
    /**
     * Adds the color currently represented by this object to the user's 
     * clipboard in hex.
     */
    private void addColorToClipboard() {
        Color preview = new Color(red, green, blue);
        StringSelection hexColor = new StringSelection(colorToHexString(preview));
        Clipboard userClip = Toolkit.getDefaultToolkit().getSystemClipboard();
        userClip.setContents(hexColor, null);
    }
    
    /**
     * Updates this object's {@link #red}, {@link #green}, and {@link #blue} 
     * attributes.
     */
    private void updateValues() {
        red = (Integer) redSpinner.getValue();
        green = (Integer) greenSpinner.getValue();
        blue = (Integer) blueSpinner.getValue();
    }
    
    /**
     * Updates this object's {@code colorLabel} using this object's 
     * {@link #red}, {@link #green}, and {@link #blue} attributes. Also updates
     * the tooltip for the preview to contain a hex representation of the 
     * current color.
     */
    private void updateColorPreview() {
        updateValues();
        Color c = new Color(red, green, blue);
        colorLabel.setBackground(c);
        colorLabel.setToolTipText(colorToHexString(c));
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
        SwingUtilities.invokeLater(() -> {
            new ColorPicker().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JLabel blueLabel;
    private javax.swing.JSlider blueSlider;
    private javax.swing.JSpinner blueSpinner;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JMenuItem fileCopyMenuItem;
    private javax.swing.JMenuItem fileExitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPopupMenu.Separator fileSeparator;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JSlider greenSlider;
    private javax.swing.JSpinner greenSpinner;
    private javax.swing.JPanel previewPanel;
    private javax.swing.JLabel redLabel;
    private javax.swing.JSlider redSlider;
    private javax.swing.JSpinner redSpinner;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JMenuBar topMenuBar;
    // End of variables declaration//GEN-END:variables
    
}
