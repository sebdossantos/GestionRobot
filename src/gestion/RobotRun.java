package gestion;
/**
 * 
 */


import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionListener;

import javax.swing.UIManager;

/**
 * @author b.christol
 *
 */
public class RobotRun {

	
	/**
	 * Launch the application.
	 */
	/**
	 * @param args
	 * @return none
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
			//"javax.swing.plaf.nimbus.NimbusLookAndFeel"
			//"com.seaglasslookandfeel.SeaGlassLookAndFeel"
			//"com.alee.laf.WebLookAndFeel"
			//"com.pagosoft.plaf.PgsLookAndFeel"
			//"com.oyoaha.swing.plaf.oyoaha.OyoahaLookAndFeel"
			//"com.birosoft.liquid.LiquidLookAndFeel" 
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					//RobotController rC = new RobotController();
					//rC.start();
					
				     TrayIcon trayIcon = null;
				     System.out.println(SystemTray.isSupported());
		
					
					//System.out.println(java.lang.Runtime.getRuntime().maxMemory());
					//RobotView frame = new RobotView();
					//frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
