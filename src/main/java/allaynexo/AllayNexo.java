/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package allaynexo;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author plobb
 */
public class AllayNexo {

    public static void main(String[] args) {
        //UI
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // AllayMain allay = new AllayMain();
        // allay.setVisible(true);
        
        AllayNexoLogin allay = new AllayNexoLogin();
        allay.setVisible(true);
    }
}
