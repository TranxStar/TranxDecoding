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

        logger.info(NAME + " " + VERSION + " �� " + OWNER + " ���� ");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();


        // ?????????????
        double width = screenSize.width;
        double height = screenSize.height;

        // ???????��
        width = width * 0.33333;
        height = height * 0.37037;
        width = Math.round(width);
        height = Math.round(height);
        int iheight = (int) height;
        int iwidth = (int) width;


        //make window
        JFrame TD = new JFrame(NAME + " " + VERSION);
        //set icon
        ImageIcon icon=new ImageIcon("/resources/icon.png");  //xxx?????????��????2.png??????????
        TD.setIconImage(icon.getImage());
        // ????????��
        TD.setSize((int) width, (int) height);
        //????
        TD.setLayout(null);
        //label
        JLabel lpath = new JLabel("������Ҫת��Ϊmp4���ļ�·��:");
        lpath.setBounds(50,50,190,30);
        JLabel lchose = new JLabel("��ѡ��");
        lchose.setBounds(iwidth/2,20,60,30);

        //button
        JButton fmb = new JButton("�ļ�תmp4");
        fmb.setBounds(iwidth/4-60,200,120,50);
        JButton mfb = new JButton("mp4ת�ļ�");
        mfb.setBounds((iwidth/4)*3-60,iheight/2 +50,120,50);
        //text1
        JTextField jtf1 = new JTextField();
        jtf1.setBounds(250,50,100,30);

        //???
        //ImageIcon image = new ImageIcon(icon[i]);
        //JButton jbcode = new JButton("????");
        //jbcode.setIcon(new ImageIcon(getClass().getResource("/image/icon.png"))); java��ť��Ŀʵ��
        //?????
        TD.add(lpath);
        TD.add(jtf1);

        TD.add(fmb);
        TD.add(mfb);

        //?????????��
        TD.setResizable(false);
        //TD.setUndecorated(true);???
        //?????????????????
        TD.setVisible(true);
        TD.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        TD.setLocationRelativeTo(null);





    }
    }
