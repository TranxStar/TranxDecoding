package org.Tranx;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.logging.Logger;

public class Main {
    public static final String NAME = "Tranx-DeCoding";
    public static final String VERSION = "v1.0";
    public static final String OWNER = "ShadowTranX-Team";

    public static boolean looking = false;

    public static Logger logger = Logger.getLogger("TDC");
    public static void main(String[] args) {

        logger.info(NAME + " " + VERSION + " ���ڼ��أ��� " + OWNER + " ����. ");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();

        InputStream inputImage = Main.class.getResourceAsStream("/image/icon.png");

        // ��ȡ��ʾ���ֱ���
        double width = screenSize.width;
        double height = screenSize.height;

        // ���㴰�ڴ�С
        width = width * 0.33333;
        height = height * 0.37037;
        width = Math.round(width);
        height = Math.round(height);

        //make window
        JFrame TD = new JFrame(NAME + " " + VERSION);
        JLabel label = new JLabel();
        TD.add(label);
        TD.setLayout(null);
        //ͼ��
        //ImageIcon image = new ImageIcon(icon[i]);
        //JButton jbcode = new JButton("����");
        //jbcode.setIcon(new ImageIcon(getClass().getResource("/image/icon.png")));
        //icon(maybe?
        Path imageFilePath = null;
        try {
            imageFilePath = Files.createTempFile("icon", ".png");
            // ��ģ�͸��Ƶ�ϵͳ��ʱ�ļ���
            if (inputImage != null) {
                Files.copy(inputImage, imageFilePath, StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            logger.warning(e.getMessage());
        }

        TrayIcon trayIcon;
        if (imageFilePath != null) {
            TD.setIconImage(new ImageIcon(imageFilePath.toString()).getImage());
            trayIcon = new TrayIcon(new ImageIcon(imageFilePath.toString()).getImage(), NAME);
        } else {
            trayIcon = null;
        }

        SystemTray tray = SystemTray.getSystemTray();
        if (trayIcon != null) {
            trayIcon.setImageAutoSize(true);
            trayIcon.setToolTip(NAME);
        }


        //���ô��ڿ��ӻ���رշ�ʽ
        TD.setVisible(true);
        TD.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // ���ô��ڴ�С
        TD.setSize((int) width, (int) height);

        TD.setLocationRelativeTo(null);





    }
    }
