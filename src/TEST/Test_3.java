package TEST;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test_3 extends JFrame implements MouseListener {

    JButton bt=new JButton("点击我");

    public Test_3(){
        JFrame jFrame=new JFrame();
        jFrame.setTitle("小游戏");
        jFrame.setSize(603,680);
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(3);

        //按钮
        bt.setBounds(50,50,100,50);

        //添加鼠标点击事件
        bt.addMouseListener(this);

        jFrame.getContentPane().add(bt);

        jFrame.setVisible(true);








    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击事件");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按压事件");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开事件");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入事件");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出事件");
    }
}
