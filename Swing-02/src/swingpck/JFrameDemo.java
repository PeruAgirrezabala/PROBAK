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
public class JFrameDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame1 frame1 = new JFrame1();
                JFrame2 frame2 = new JFrame2();
            }
        });
    }
}
