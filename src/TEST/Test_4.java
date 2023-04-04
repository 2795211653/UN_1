package TEST;


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Test_4 extends JFrame implements KeyListener {





    public Test_4(){
        JFrame jFrame=new JFrame();
        jFrame.setTitle("小游戏");
        jFrame.setSize(603,680);
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLayout(null);

        //键盘监听
        jFrame.addKeyListener(this);






        jFrame.setVisible(true);




    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");

       int code = e.getKeyCode();
        System.out.println(code);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
        int code=e.getKeyCode();
        if(code==89){

        }
    }
}
