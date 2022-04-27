/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpck;

import javax.swing.JFrame;

/**
 *
 * @author agirrezabala.peru
 */
public class JFrame1 extends JFrame {
    
    public JFrame1(){
        initialize();
    }
    public void initialize(){
        setTitle("JFrame1");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
