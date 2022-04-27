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
public class JFrame2 {
    
    private JFrame frame;
    
    public JFrame2(){
        
    }
    public void initialize(){
        frame = new JFrame();
        this.frame.setTitle("JFrame2");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);
        this.frame.setVisible(true);
    }
    
}
