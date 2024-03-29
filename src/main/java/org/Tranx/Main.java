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

        logger.info(NAME + " " + VERSION + " 正在加载，由 " + OWNER + " 驱动. ");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();

        InputStream inputImage = Main.class.getResourceAsStream("/image/icon.png");

        // 获取显示器分辨率
        double width = screenSize.width;
        double height = screenSize.height;

        // 计算窗口大小
        width = width * 0.33333;
        height = height * 0.37037;
        width = Math.round(width);
        height = Math.round(height);

        //make window
        JFrame TD = new JFrame(NAME + " " + VERSION);
        JLabel label = new JLabel();
        TD.add(label);
        TD.setLayout(null);
        //图标
        //ImageIcon image = new ImageIcon(icon[i]);
        //JButton jbcode = new JButton("编码");
        //jbcode.setIcon(new ImageIcon(getClass().getResource("/image/icon.png")));
        //icon(maybe?
        Path imageFilePath = null;
        try {
            imageFilePath = Files.createTempFile("icon", ".png");
            // 将模型复制到系统临时文件夹
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


        //设置窗口可视化与关闭方式
        TD.setVisible(true);
        TD.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 设置窗口大小
        TD.setSize((int) width, (int) height);

        TD.setLocationRelativeTo(null);





    }
    }
