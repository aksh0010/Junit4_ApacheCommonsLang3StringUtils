package comp2800_lab3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChooser extends JPanel  {
	// creating private instances of components for our applications 
	 private JSlider red_slider, green_slider, blue_slider;
	 private JTextField red_text_number, green_text_number, blue_text_number;
	 private JPanel colorPanel;
	 private Color color ; // Creating color object for RGB effect in colorPanel
	 private int red_Value=0; // for storing red slider's value
	 private int green_Value=0;//for storing green slider's value
	 private int blue_Value=0;// for storing blue slider's value
	 
	public ColorChooser () {
		initialize(); 
	}
	private void initialize() {
			
			//Setting layout for our JPanel
		 	setLayout(new GridLayout(4, 2));

		 	//initializing the sliders with values from 0 to 255
		 	red_slider = new JSlider(0, 255, 0);
	        green_slider = new JSlider(0, 255, 0);
	        blue_slider = new JSlider(0, 255, 0);

	        //Default slider text Value is 0
	        red_text_number = new JTextField("0");
	        green_text_number = new JTextField("0");
	        blue_text_number = new JTextField("0");
	        
	        //Initializing the Color panel
	        colorPanel = new JPanel(); 
	        
	        //Now creating change listener on the red_slider
	        red_slider.addChangeListener(new ChangeListener() {
	        	
	        	//in this method updating the red_value and 
	        	//passing it along side other 
	        	//green value and blue value to color object
	        	//In the end simply setting background to the color object
				public void stateChanged(ChangeEvent e) {
					// TODO Auto-generated method stub
					 red_Value = red_slider.getValue();
					 color = new Color(red_Value,green_Value,blue_Value);
					 red_text_number.setText(String.valueOf(red_Value));
					 colorPanel.setBackground(color);
				}
			});
	        green_slider.addChangeListener(new ChangeListener() {
	        	//in this method updating the green_value and 
	        	//passing it along side other 
	        	//red value and blue value to color object
	        	//In the end simply setting background to the color object
				public void stateChanged(ChangeEvent e) {
					 green_Value = green_slider.getValue();
					 color = new Color(red_Value,green_Value,blue_Value);
					 green_text_number.setText(String.valueOf(green_Value));
					 colorPanel.setBackground(color);
				}
			});
	        blue_slider.addChangeListener(new ChangeListener() {
	        	//in this method updating the blue_value and 
	        	//passing it along side other 
	        	//green value and red value to color object
	        	//In the end simply setting background to the color object
				public void stateChanged(ChangeEvent e) {
					// TODO Auto-generated method stub
					blue_Value = blue_slider.getValue();
					color = new Color(red_Value,green_Value,blue_Value);
					blue_text_number.setText(String.valueOf(blue_Value));
					colorPanel.setBackground(color);
				}
			});

	        add(new JLabel("Red"));
	        add(red_slider);
	        add(red_text_number);

	        add(new JLabel("Green"));
	        add(green_slider);
	        add(green_text_number);

	        add(new JLabel("Blue"));
	        add(blue_slider);
	        add(blue_text_number);

	        colorPanel.setPreferredSize(new Dimension(200, 200));
	        add(colorPanel);
		
	
	}
}