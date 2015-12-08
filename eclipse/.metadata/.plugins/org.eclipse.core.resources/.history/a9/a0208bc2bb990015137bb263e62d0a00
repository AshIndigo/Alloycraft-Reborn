package com.ashindigo.test;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorMain extends JFrame {
	public CalculatorMain() {
		
	}
	
	/*
	 * Variables for storing numbers and mode
	 */
    public static boolean continuee;
	static int number1 = 0;
	static int number2 = 0;
	static int mode = -1;
	static Scanner scanner = new Scanner(System.in);
	static int result = 0;
	private static String contiinue = "If you are seeing this then something broke. gj m8";
	private static int number3;
	static ArrayList numb = new ArrayList();
	static JTextField magic = new JTextField();
	static JTextField mainText = new JTextField();
	static boolean enabled;
	static int modegui = -1;
	private static ArrayList numb2 = new ArrayList();
	static int answer;

	public static void main(String[] args) {
		
		System.out.println("Would you like to enable gui mode?");
		System.out.println("No = 0");
		System.out.println("Anything other number is yes.");
		if (scanner.nextInt() == 0){
		run();
		} else {
			System.out.println("Initilizing Gui");
			runGUI();
			System.out.println("Done");
		}
	}

	// Method called at the start of the program
	public static void run() {
		
		// Asks for the 2 numbers
		contiinue = null;
		System.out.println("1st Number?");
		number1 = scanner.nextInt();
		System.out.println("2nd Number?");
		number2 = scanner.nextInt();
		// Asks for the type of equation.
		System.out.println("Mode?");
		System.out.println("Addition = 0");
		System.out.println("Subtraction = 1");
		System.out.println("Multiplication = 2");
		System.out.println("Division = 3");
		mode = scanner.nextInt();
		// If and Switch statement to complete the equation.
		if(mode < 4){
		switch (mode){
		case 0: result = number1 + number2; break;
		case 1: result = number1 - number2; break;
		case 2: result = number1 * number2; break;
		case 3: result = number1 / number2; break;
		}
		}
		else {
			// If the mode is invalid
			System.out.println("Invalid Mode");
			run();
		}
		System.out.println(result);
		// Ask the user if they would like to continue
		System.out.println("Continue?");
		System.out.println("Yes = y");
		System.out.println("No = n");
		contiinue = scanner.next();
		switch (contiinue){
		case "y": runcontinue(); break;
		case "n": exit(); break;
		}
		
	}

	// Continue the equation. See the run method for more details
	public static void runcontinue() {
		
		number3 = 0;
		System.out.println("Next Number?");
		number3 = scanner.nextInt();
		System.out.println("Mode?");
		System.out.println("Addition = 0");
		System.out.println("Subtraction = 1");
		System.out.println("Multiplication = 2");
		System.out.println("Division = 3");
		mode = scanner.nextInt();
		if(mode < 4){
		switch (mode){
		case 0: result = result + number3; break;
		case 1: result = result - number3; break;
		case 2: result = result * number3; break;
		case 3: result = result / number3; break;
		}
		}
		else {
			System.out.println("Invalid Mode");
			run();
		}
		System.out.println(result);
		System.out.println("Continue?");
		System.out.println("Yes = y");
		System.out.println("No = n");
		contiinue = scanner.next();
		switch (contiinue){
		case "y": runcontinue(); break;
		case "n": exit(); break;
		}
		
	}

	private static void exit() {
		System.out.println("Goodbye!");
		System.exit(0); 
		
	}
	
	// Don't try to understand this code
	private static void runGUI() {
		JFrame main = new JFrame();
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton bPlus = new JButton("+");
		JButton bMinus = new JButton("-");
		JButton bMultiply = new JButton("*");
		JButton bDivide = new JButton("/");
		JButton bEqual = new JButton("=");
		JButton bClear = new JButton("C");
		main.getContentPane().add(b0);
		main.getContentPane().add(b1);
		main.getContentPane().add(b2);
		main.getContentPane().add(b3);
		main.getContentPane().add(b4);
		main.getContentPane().add(b5);
		main.getContentPane().add(b6);
		main.getContentPane().add(b7);
		main.getContentPane().add(b8);
		main.getContentPane().add(b9);
		main.getContentPane().add(bPlus);
		main.getContentPane().add(bMinus);
		main.getContentPane().add(bMultiply);
		main.getContentPane().add(bDivide);
		main.getContentPane().add(bEqual);
		main.getContentPane().add(mainText);
		main.getContentPane().add(bClear);
		// Pure magic
		main.getContentPane().add(magic);
		b0.setSize(new Dimension(50, 50));
		b1.setSize(new Dimension(50, 50));
		b2.setSize(new Dimension(50, 50));
		b3.setSize(new Dimension(50, 50));
		b4.setSize(new Dimension(50, 50));
		b5.setSize(new Dimension(50, 50));
		b6.setSize(new Dimension(50, 50));
		b7.setSize(new Dimension(50, 50));
		b8.setSize(new Dimension(50, 50));
		b9.setSize(new Dimension(50, 50));
		bPlus.setSize(new Dimension(50, 50));
		bMinus.setSize(new Dimension(50, 50));
		bMultiply.setSize(new Dimension(50, 50));
		bDivide.setSize(new Dimension(50, 50));
		bEqual.setSize(new Dimension(50, 50));
		bClear.setSize(new Dimension(50, 50));
		b1.setLocation(0, 50);
		b2.setLocation(50, 50);
		b3.setLocation(100, 50);
		bPlus.setLocation(150, 50);
		b4.setLocation(0, 100);
		b5.setLocation(50, 100);
		b6.setLocation(100, 100);
		bMinus.setLocation(150, 100);
		b7.setLocation(0, 150);		
		b8.setLocation(50, 150);	
		b9.setLocation(100, 150);	
		bMultiply.setLocation(150, 150);		
		main.setVisible(true);
		main.setSize(200, 300);
		b0.setLocation(0, 200);
		bEqual.setLocation(50, 200);
		bDivide.setLocation(150, 200);
		bClear.setLocation(100, 200);
		magic.setVisible(false);
		mainText.setLocation(0, 0);
		mainText.setSize(new Dimension(200,50));
		mainText.setEditable(false);
		// Button listeners to get numbers
		b1.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  if(!enabled){
		    	  numb.add(1);
		    	  textSync();
		    	  }
		    	  else {
		    		  numb2.add(1);
		    		  textSync();
		    	  }
		      }
		    });
		b2.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  if(!enabled){
			    	  numb.add(2);
			    	  textSync();
			    	  }
			    	  else {
			    		  numb2.add(2);
			    		  textSync();
			    	  }
		      }
		    });
		b3.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  if(!enabled){
			    	  numb.add(3);
			    	  textSync();
			    	  }
			    	  else {
			    		  numb2.add(3);
			    		  textSync();
			    	  }
		      }
		    });
		b4.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  if(!enabled){
			    	  numb.add(4);
			    	  textSync();
			    	  }
			    	  else {
			    		  numb2.add(4);
			    		  textSync();
			    	  }
		      }
		    });
		b5.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  if(!enabled){
			    	  numb.add(5);
			    	  textSync();
			    	  }
			    	  else {
			    		  numb2.add(5);
			    		  textSync();
			    	  }
		      }
		    });
		b6.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  if(!enabled){
			    	  numb.add(6);
			    	  textSync();
			    	  }
			    	  else {
			    		  numb2.add(6);
			    		  textSync();
			    	  }
		      }
		    });
		b7.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  if(!enabled){
			    	  numb.add(7);
			    	  textSync();
			    	  }
			    	  else {
			    		  numb2.add(7);
			    		  textSync();
			    	  }
		      }
		    });
		b8.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  if(!enabled){
			    	  numb.add(8);
			    	  textSync();
			    	  }
			    	  else {
			    		  numb2.add(8);
			    		  textSync();
			    	  }
		      }
		    });
		b9.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  if(!enabled){
			    	  numb.add(9);
			    	  textSync();
			    	  }
			    	  else {
			    		  numb2.add(9);
			    		  textSync();
			    	  }
		      }
		    });
		b0.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  if(!enabled){
			    	  numb.add(0);
			    	  textSync();
			    	  }
			    	  else {
			    		  numb2.add(0);
			    		  textSync();
			    	  }
		      }
		    });
		bPlus.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  modegui = 0;
		    	  enabled = true;
		      }
		    });
		bMinus.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  modegui = 1;
		    	  enabled = true;
		      }
		    });
		bMultiply.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  modegui = 2;
		    	  enabled = true;
		      }
		    });
		bDivide.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  modegui = 3;
		    	  enabled = true;
		      }
		    });
		// Clear button to reset values
		bClear.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  numb.clear();
		    	  numb2.clear();
		    	  mode = -1;
		    	  enabled = false;
		    	  mainText.setText("");
		    	  continuee = false;
		      }
		    });
		// No
	      bEqual.addActionListener(new ActionListener()
	    {
			public void actionPerformed(ActionEvent e)
		      {
		    	  // What did I tell you
		    	  String numbb = null;
		    	  String numbb2 = null;
		    	  Long numb1 = null;
		    	  Long numb22 = null;
			      numbb2 = numb2.toString().replaceAll("\\D","");
			      numbb = numb.toString().replaceAll("\\D","");
			      numb1 = numb1.parseLong(numbb);
			      numb22 = numb22.parseLong(numbb2);
			      final int numb11 = numb1.intValue();
			      final int numb222 = numb22.intValue();
			      // Stop
			      if (!continuee){
				      numb2.clear();
		      switch (modegui) {
		      case 0: answer = numb11 + numb222; break;
		      case 1: answer = numb11 - numb222; break;
		      case 2: answer = numb11 * numb222; break;
		      case 3: answer = numb11 / numb222; break;
		      }
		      mainText.setText(Long.toString(answer));
		      continuee = true;
		      } else {
		    	  Integer answer2 = -1;
				switch (modegui) {
		    	  case 0: answer2 = answer + numb222; break;
				  case 1: answer2 = answer - numb222; break;
				  case 2: answer2 = answer * numb222; break;
				  case 3: answer2 = answer / numb222; break;
		    	  }
				answer = answer2;
				mainText.setText(answer2.toString());
		    	numb2.clear();
		      }
		      }
		    });
	}
	// Method to resync the text box
	public static void textSync() {
		
		if (!enabled){
		    String numbb = numb.toString().replaceAll("\\D","");
		    Long.parseLong(numbb);
			mainText.setText(numbb);
		} else {
			String numbb = numb2.toString().replaceAll("\\D","");
		    Long.parseLong(numbb);
			mainText.setText(numbb);
		}
	}
}
