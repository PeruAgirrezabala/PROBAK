/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpck;

import javax.swing.SwingUtilities;

/**
 *
 * @author agirrezabala.peru
 */
public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                MainWindow main = new MainWindow();
                main.show();
            }
                
           
        });
    }
}
