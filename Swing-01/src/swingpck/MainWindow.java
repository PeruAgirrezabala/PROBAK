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
public class MainWindow {
    
    private JFrame window;
    
    public MainWindow(){
        window = new JFrame();
        window.setTitle("Hello world!");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800,500);
        window.setLocationRelativeTo(null);
    }
    public void show(){
        window.setVisible(true);
    }
}
