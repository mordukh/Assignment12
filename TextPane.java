package application;

//Assignment #: 12
//Name: 
//StudentID:
//Lecture:
//Description: The TextControlPane class creates 4 buttons, 1 label, 1 textfield
//  and 1 sliders to to control the movement of words,
//  and also contains a panel displaying words.


import javafx.scene.layout.*;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.control.ColorPicker;

import javafx.scene.paint.Color;
import javafx.geometry.Orientation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class TextPane extends Pane
{

	private double x1 = 0.0, y1 = 0.0, stepX = 30.0, stepY = 30;
	private String string1;
	private Color currentColor;
	//private Timeline timeline = new Timeline()
	private Color backColor = Color.BLACK;
	
	public TextPane(Color color, String initialString)
	{
		currentColor = color;
		string1 = initialString;
		
	}
	
	public void resume()
	{
	}
	
	
	public void suspend()
	{
		
	}
	
	
	public void changeColor(Color anotherColor)
	{
		
	}
	
	
	public void clear()
	{
		
	}
	
	
	public void changeString(String string2)
	{

	}
	
	
	public void setRate(int rate1)
	{
		
	}
	
	private class TextHandler
	{
		public void handle(ActionEvent event)
		{
			
		}
	}
	
	} //End of class TextPane
