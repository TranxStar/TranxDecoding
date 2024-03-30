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

        logger.info(NAME + " " + VERSION + " ���ڼ��أ��� " + OWNER + " ����. ");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();


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
        // ���ô��ڴ�С
        TD.setSize((int) width, (int) height);
        //����
        TD.setLayout(null);
        //label
        JLabel lpath = new JLabel("������Ҫת��Ϊmp4���ļ�·��:");
        lpath.setBounds(50,50,190,30);

        //text1
        JTextField jtf1 = new JTextField();
        jtf1.setBounds(250,50,50,30);

        //ͼ��
        //ImageIcon image = new ImageIcon(icon[i]);
        //JButton jbcode = new JButton("����");
        //jbcode.setIcon(new ImageIcon(getClass().getResource("/image/icon.png")));
        //��ӿؼ�
        TD.add(lpath);
        TD.add(jtf1);


        ImageIcon icon=new ImageIcon("/resources/icon.png");  //xxx����ͼƬ���·����2.pngͼƬ���Ƽ���ʽ
        TD.setIconImage(icon.getImage());
        //�������ڴ�С
        TD.setResizable(false);
        //TD.setUndecorated(true);ֽ��
        //���ô��ڿ��ӻ���رշ�ʽ
        TD.setVisible(true);
        TD.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        TD.setLocationRelativeTo(null);





    }
    }
