/*
 * All different ways to use JOption Pane
 * 
 */

package joptionpane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class joptionpane {

    public static void main(String[] args) {
	ImageIcon icon=new ImageIcon("image1.png");
	// "null is where you can set parent component
	// then message you want to display
	// then title of the dialogue box you want to set
	// then message type choose one of the defaults
	//JOptionPane.showMessageDialog(null,"this is some message","title of the pane dialogue box", JOptionPane.INFORMATION_MESSAGE);
	//JOptionPane.showMessageDialog(null,"This is Warning","Warning", JOptionPane.WARNING_MESSAGE);
	//JOptionPane.showMessageDialog(null,"This is Error","ERROR", JOptionPane.ERROR_MESSAGE);
	
	int answer = JOptionPane.showConfirmDialog(null, "Do You Want to Continue","Select", JOptionPane.YES_NO_CANCEL_OPTION);
	
    //System.out.println(answer); // 0 for yes 1 for no and -1 for cancel
	//String userinput=JOptionPane.showInputDialog(null, "Enter your name");
	//System.out.println(userinput);
    
	String[] myoptions= {"Hero", "Idiot", "Stupid"};
	/*
	 * below null is parent component, message , title of the box, options which you want to show, message type, icon you want to display(can be null),
	 *  options you want to show, initial value (0 as the first choice and then onwards
	 */
	int userchoice=JOptionPane.showOptionDialog(null, "Your Options","OptionTitle", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,icon, myoptions,0);
	System.out.println(userchoice);
    }
}