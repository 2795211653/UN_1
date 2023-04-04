package TEST;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Test_2 extends JFrame implements ActionListener {

    //创建一个按钮对象
    JButton bt1 = new JButton("按钮");
    JButton bt2 = new JButton("都开始了");


    //创建界面
    public Test_2(){
    JFrame jFrame = new JFrame();
        jFrame.setSize(603,680);
        jFrame.setTitle("小游戏");
        jFrame.setAlwaysOnTop(true);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);



        bt1.setBounds(0,0,150,100);
        bt2.setBounds(100,150,100,100);
        bt1.addActionListener(this);
        bt2.addActionListener(this);

    //bt.setBounds(50,50,100,50);
    //bt.addActionListener(new MyActionListener());
        /*bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("肯定是开发领导方式");
            }
        });*/

        jFrame.getContentPane().

    add(bt1);
        jFrame.getContentPane().

    add(bt2);
        jFrame.setVisible(true);
}


    public void actionPerformed(ActionEvent e){
            Object source= e.getSource();
            if(source==bt1)
            {
                bt1.setSize(150,60);
            } else if (source==bt2) {
                Random ra=new Random();
                bt2.setBounds(ra.nextInt(500),ra.nextInt(400),100,100);
            }
    }
}
