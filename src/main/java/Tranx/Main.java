package Tranx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
//dialog�޷�����1111111111111111

public class  Main {
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
        ImageIcon icon=new ImageIcon("src/main/java/resources/icon.png");  //xxx?????????��????2.png??????????
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
        JLabel lwarning = new JLabel("��Ч��ָ��·��");
        lwarning.setBounds(75,25,60,30);
        //filechooser
        JFileChooser fc = new JFileChooser();

        //button
        JButton fmb = new JButton("�ļ�תmp4");
        fmb.setBounds(iwidth/4-60,200,120,50);
        JButton mfb = new JButton("mp4ת�ļ�");
        mfb.setBounds((iwidth/4)*3-60,200,120,50);
        JButton enter = new JButton();
        enter.setBounds(380,50,18,20);
        //button appearance
        fmb.setBackground(Color.GRAY);
        mfb.setBackground(Color.GRAY);
        enter.setBackground(Color.GRAY);
        Icon  et = new ImageIcon("src/main/java/resources/f.jpg");
        enter.setIcon(et);
        //text1
        JTextField jtf1 = new JTextField();
        jtf1.setBounds(250,50,100,30);
        //dialog
        JDialog jd = new JDialog(TD,"warning",true);
        jd.add(lwarning);
        jd.setSize(200, 100);//�������С
        //jd.setLocation(100,100);//������λ��
        jd.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

        //???
        //ImageIcon image = new ImageIcon(icon[i]);
        //JButton jbcode = new JButton("????");
        //jbcode.setIcon(new ImageIcon(getClass().getResource("/image/icon.png"))); java��ť��Ŀʵ��
        //?????
        TD.add(lpath);
        TD.add(jtf1);

        TD.add(fmb);
        TD.add(mfb);
        TD.add(enter);

        //?????????��
        TD.setResizable(false);
        //TD.setUndecorated(true);???
        //?????????????????
        TD.setVisible(true);
        TD.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        TD.setLocationRelativeTo(null);

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resl = fc.showOpenDialog(null);

                if (resl == JFileChooser.APPROVE_OPTION) {
                    String luj = fc.getSelectedFile().getAbsolutePath();
                    System.out.println(luj);
                    jtf1.setText(luj);
                }
            }
        });
        mfb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    jd.setVisible(true);


            }
        });






    }
    }
