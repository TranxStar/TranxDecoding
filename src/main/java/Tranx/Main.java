package Tranx;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

public class Main {
    public static final String NAME = "Tranx-DeCoding";
    public static final String VERSION = "v1.0";
    public static final String OWNER = "ShadowTranX-Team";


    public static Logger logger = Logger.getLogger("TDC");
    public static void main(String[] args) {

        logger.info(NAME + " " + VERSION + " 正在加载，由 " + OWNER + " 驱动. ");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();


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
        // 设置窗口大小
        TD.setSize((int) width, (int) height);
        //布局
        TD.setLayout(null);
        //label
        JLabel lpath = new JLabel("请输入要转换为mp4的文件路径:");
        lpath.setBounds(50,50,190,30);

        //text1
        JTextField jtf1 = new JTextField();
        jtf1.setBounds(250,50,50,30);

        //图标
        //ImageIcon image = new ImageIcon(icon[i]);
        //JButton jbcode = new JButton("编码");
        //jbcode.setIcon(new ImageIcon(getClass().getResource("/image/icon.png")));
        //添加控件
        TD.add(lpath);
        TD.add(jtf1);


        ImageIcon icon=new ImageIcon("/resources/icon.png");  //xxx代表图片存放路径，2.png图片名称及格式
        TD.setIconImage(icon.getImage());
        //锁死窗口大小
        TD.setResizable(false);
        //TD.setUndecorated(true);纸张
        //设置窗口可视化与关闭方式
        TD.setVisible(true);
        TD.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        TD.setLocationRelativeTo(null);





    }
    }
