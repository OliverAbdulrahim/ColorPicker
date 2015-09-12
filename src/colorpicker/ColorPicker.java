package colorpicker;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;

/**
 * The {@code ColorPicker} class contains a simple user interface that can 
 * preview and modify RGB-composed colors. This is an introductory user 
 * interface that is simple to use and understand.
 * 
 * @author Oliver Abdulrahim
 */
public class ColorPicker extends JFrame {
    
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
    
// GUI elements
    private JLabel aboutLabel;
    private JPanel aboutPanel;
    private JLabel blueLabel;
    private JSlider blueSlider;
    private JSpinner blueSpinner;
    private JLabel colorLabel;
    private JMenuItem fileCopyMenuItem;
    private JMenuItem fileExitItem;
    private JMenu fileMenu;
    private JPopupMenu.Separator fileSeparator;
    private JLabel greenLabel;
    private JSlider greenSlider;
    private JSpinner greenSpinner;
    private JPanel previewPanel;
    private JLabel redLabel;
    private JSlider redSlider;
    private JSpinner redSpinner;
    private JPanel settingsPanel;
    private JMenuBar topMenuBar;
    
    /**
     * Creates new {@code ColorPicker} form.
     */
    public ColorPicker() {
        red = DEFAULT_COLOR_VALUE;
        green = DEFAULT_COLOR_VALUE;
        blue = DEFAULT_COLOR_VALUE;
        initComponents();
        updateColorPreview();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        settingsPanel = new JPanel();
        redLabel = new JLabel();
        greenLabel = new JLabel();
        blueLabel = new JLabel();
        redSlider = new JSlider();
        greenSlider = new JSlider();
        blueSlider = new JSlider();
        redSpinner = new JSpinner();
        greenSpinner = new JSpinner();
        blueSpinner = new JSpinner();
        previewPanel = new JPanel();
        colorLabel = new JLabel();
        aboutPanel = new JPanel();
        aboutLabel = new JLabel();
        topMenuBar = new JMenuBar();
        fileMenu = new JMenu();
        fileCopyMenuItem = new JMenuItem();
        fileSeparator = new JPopupMenu.Separator();
        fileExitItem = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        settingsPanel.setBorder(BorderFactory.createTitledBorder("Color Settings"));

        redLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        redLabel.setText("R");

        greenLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        greenLabel.setText("G");

        blueLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        blueLabel.setText("B");

        redSlider.setMaximum(MAX_COLOR_VALUE);
        redSlider.setMinorTickSpacing(1);
        redSlider.setValue(DEFAULT_COLOR_VALUE);
        redSlider.setPreferredSize(new Dimension(255, 26));
        redSlider.addChangeListener(this :: redSliderStateChanged);

        greenSlider.setMaximum(MAX_COLOR_VALUE);
        greenSlider.setValue(DEFAULT_COLOR_VALUE);
        greenSlider.addChangeListener(this :: greenSliderStateChanged);

        blueSlider.setMaximum(MAX_COLOR_VALUE);
        blueSlider.setValue(DEFAULT_COLOR_VALUE);
        blueSlider.addChangeListener(this :: blueSliderStateChanged);

        redSpinner.setModel(new SpinnerNumberModel(DEFAULT_COLOR_VALUE, MIN_COLOR_VALUE, MAX_COLOR_VALUE, 1));
        redSpinner.setRequestFocusEnabled(false);
        redSpinner.setValue(DEFAULT_COLOR_VALUE);
        redSpinner.addChangeListener(this :: redSpinnerStateChanged);

        greenSpinner.setModel(new SpinnerNumberModel(DEFAULT_COLOR_VALUE, MIN_COLOR_VALUE, MAX_COLOR_VALUE, 1));
        greenSpinner.setRequestFocusEnabled(false);
        greenSpinner.setValue(DEFAULT_COLOR_VALUE);
        greenSpinner.addChangeListener(this :: greenSpinnerStateChanged);

        blueSpinner.setModel(new SpinnerNumberModel(DEFAULT_COLOR_VALUE, MIN_COLOR_VALUE, MAX_COLOR_VALUE, 1));
        blueSpinner.setRequestFocusEnabled(false);
        blueSpinner.setValue(DEFAULT_COLOR_VALUE);
        blueSpinner.addChangeListener(this :: blueSpinnerStateChanged);

        GroupLayout settingsPanelLayout = new GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(redLabel)
                    .addComponent(blueLabel)
                    .addComponent(greenLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(redSpinner, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        .addComponent(blueSpinner, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                    .addComponent(greenSpinner, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(blueSlider, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                    .addComponent(redSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenSlider, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingsPanelLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {blueLabel, greenLabel, redLabel});

        settingsPanelLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {blueSlider, greenSlider, redSlider});

        settingsPanelLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {blueSpinner, greenSpinner, redSpinner});

        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addComponent(redSlider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greenSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blueSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(redLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(greenLabel)
                            .addComponent(greenSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(blueLabel)
                            .addComponent(blueSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingsPanelLayout.linkSize(SwingConstants.VERTICAL, new Component[] {blueLabel, blueSlider, greenLabel, greenSlider, redLabel, redSlider});

        settingsPanelLayout.linkSize(SwingConstants.VERTICAL, new Component[] {blueSpinner, greenSpinner, redSpinner});

        previewPanel.setBorder(BorderFactory.createTitledBorder("Color Preview"));

        colorLabel.setToolTipText("Currently " + red + " red, " + green + " green, " + blue + " blue.");
        colorLabel.setOpaque(true);
        colorLabel.setPreferredSize(new Dimension(211, 211));
        colorLabel.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent evt) {
                colorLabelMouseClicked(evt);
            }
            
        });

        GroupLayout previewPanelLayout = new GroupLayout(previewPanel);
        previewPanel.setLayout(previewPanelLayout);
        previewPanelLayout.setHorizontalGroup(
            previewPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(previewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorLabel, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        previewPanelLayout.setVerticalGroup(
            previewPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(previewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorLabel, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aboutPanel.setBorder(BorderFactory.createTitledBorder("About"));

        aboutLabel.setText("<html><p>This is a simple demonstrative GUI. To change the color of the preview, modify the desired component slider.</p><br><p>Once you get a color you like, double-click the color preview to add the color to your clipboard.</html>");

        GroupLayout aboutPanelLayout = new GroupLayout(aboutPanel);
        aboutPanel.setLayout(aboutPanelLayout);
        aboutPanelLayout.setHorizontalGroup(
            aboutPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutLabel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        aboutPanelLayout.setVerticalGroup(
            aboutPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        fileCopyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
        fileCopyMenuItem.setText("Copy Current Color");
        fileCopyMenuItem.addActionListener(this :: fileCopyMenuItemActionPerformed);
        fileMenu.add(fileCopyMenuItem);
        fileMenu.add(fileSeparator);

        fileExitItem.setText("Exit");
        fileExitItem.addActionListener(this :: fileExitItemItemActionPerformed);
        fileMenu.add(fileExitItem);

        topMenuBar.add(fileMenu);

        setJMenuBar(topMenuBar);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(settingsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aboutPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previewPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(previewPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aboutPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settingsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pack();
    }
    
    /**
     * If the user double-clicks on the label, then copy the current color as 
     * hex to their clipboard.
     * 
     * @param evt Contains the amount of user mouse clicks associated with this 
     *            
     */
    private void colorLabelMouseClicked(MouseEvent evt) {                                        
        if (evt.getClickCount() == 2) {
            addColorToClipboard();
        }
    }

    private void fileExitItemItemActionPerformed(ActionEvent evt) {                                                 
        System.exit(0);
    }
    
    private void fileCopyMenuItemActionPerformed(ActionEvent evt) {                                                 
        addColorToClipboard();
    }

    private void redSpinnerStateChanged(ChangeEvent evt) {                                        
        spinnerInputReceived(evt, redSlider);
    }

    private void greenSpinnerStateChanged(ChangeEvent evt) {                                          
        spinnerInputReceived(evt, greenSlider);
    }
    
    private void blueSpinnerStateChanged(ChangeEvent evt) {                                         
        spinnerInputReceived(evt, blueSlider);
    }

    private void redSliderStateChanged(ChangeEvent evt) {                                       
        sliderInputReceived(evt, redSpinner);
    }

    private void greenSliderStateChanged(ChangeEvent evt) {                                         
        sliderInputReceived(evt, greenSpinner);
    }

    private void blueSliderStateChanged(ChangeEvent evt) {                                        
        sliderInputReceived(evt, blueSpinner);
    }
    
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
    
}
