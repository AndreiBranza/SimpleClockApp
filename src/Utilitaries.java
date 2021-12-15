import javax.swing.*;
import java.awt.*;

public class Utilitaries {

    /**
     * In case you want to change the top left image with one of your own
     * @param jFrame
     * @param iconPath
     */
    static void setIcon(JFrame jFrame, String iconPath)
    {
        ImageIcon image = new ImageIcon(iconPath);
        jFrame.setIconImage(image.getImage());
    }

    /**
     * Sets the look and feel of the frame to the Windows option.
     */
    static void setLookAndFeelWindows()
    {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    /**
     * Creates a new JFrame with some standard dimensions.
     * @param jFrame - the desired instance of jFrame
     * @param frameTitle - it appears at the top, left hand side, next to the icon above the menus.
     * @param DefaultCloseOperation - should the program close when you close the frame?
     * @param isResizable - adds or removes the possibility for fullscreen or resize of frame.
     * @param frameWidth
     * @param frameHeight
     * @param isVisible
     * @param bckGrdRed - if you want to change the background values for RGB
     * @param bckGrdGreen
     * @param bckGrdBlue
     */
    static void createNewJFrame(JFrame jFrame, String frameTitle, int DefaultCloseOperation, boolean isResizable, int frameWidth, int frameHeight, boolean isVisible, int bckGrdRed, int bckGrdGreen, int bckGrdBlue)
    {
        jFrame.setTitle(frameTitle);
        jFrame.setDefaultCloseOperation(DefaultCloseOperation);
        jFrame.setResizable(isResizable);
        jFrame.setSize(frameWidth, frameHeight);
        jFrame.setVisible(isVisible);
        jFrame.getContentPane().setBackground(new Color(bckGrdRed,bckGrdGreen,bckGrdBlue));
    }


}
