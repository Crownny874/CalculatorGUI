/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author leonovo
 */
public class CalculatorProgram implements ActionListener  {
                JButton button1;
	        JButton button2;
	        JButton button3;
	        JButton button4;
	        JButton button5;
	        JButton button6;
	        JButton button7;
	        JButton button8;
	        JButton button9;
	        JButton button0;
                
                JRadioButton SWITCH_ON;
                JRadioButton SWITCH_OFF;
               
                JFrame calculatorFrame;
                JPanel CALCULATOR_PANEL;  
                
                JTextField CALCULATOR_INPUT;
                
                //OPERATIONAL BUTTON
                JButton addButton;
                JButton multiplyButton;
                JButton minusButton;
                JButton divideButton;
                JButton equalsButton;
                JButton dotButton;
                JButton moduloButton;
                
                private static String GET_CLICKED_TEXT = "";
                private static String GET_OPERATION_TEXT = "";
                private static String GET_NEXT_CLICKED_TEXT = "";
                private static String LOOKUP = "";
                private static boolean check;
                private static boolean recheck = false;
                private static boolean isDot = false;
                private static int SUM = 0;
                private static int SUM_NUM = 0;
                private static int NEXT_NUM = 0;
                private static int MULTIPLY = 0;
                private static int MINUS = 0;
                private static int DIVIDE =0;
                private static int NUM2 = 0;
                
                private static double a;
                private static double b;
                
                private static double x;
                private static double y;
                
                private static double i;
                private static double j;
                
                private static double m;
                private static double n;
                
                private static double mod1;
                private static double mod2;
                
                private static int SUBTRACT_NUM;
                private static int MULTIPLY_NUM;
                
                private static int DIVIDE_NUM;
                private static int DIVIDE_NUM2;
                
                private static int MOD_NUM;
                private static int MOD_NUM2;
                private static int FINAL_MOD;
                JButton AC;
                JButton DELETE;
      public CalculatorProgram() {
                //(WHERE USER INPUT IS BEEN DISPLAYED)
                CALCULATOR_INPUT = new JTextField();
                CALCULATOR_INPUT.setBounds(0, 0, 515, 100);
                CALCULATOR_INPUT.setVisible(true);
                CALCULATOR_INPUT.setFont(new Font(Font.SANS_SERIF,10,20));
               
                //INITIALIZING NUMBER BUTTONS (0 - 9)
	        button0 = new JButton("0");
	        button0.setBounds(300, 200, 100, 50);
                button0.setFocusable(false);
	        button0.addActionListener(this);
                
                button1 = new JButton("1");
	        button1.setBounds(0, 100, 100, 50);
                button1.setFocusable(false);
	        button1.addActionListener(this);
	   
	        
	        button2 = new JButton("2");
	        button2.setBounds(100, 100, 100, 50);
                button2.setFocusable(false);
	        button2.addActionListener(this);
	   
	        
	        button3 = new JButton("3");
	        button3.setBounds(200, 100, 100, 50);
                button3.setFocusable(false);
	        button3.addActionListener(this);
	   
	        
	        button4 = new JButton("4");
	        button4.setBounds(0, 150, 100, 50);
                button4.setFocusable(false);
	        button4.addActionListener(this);
	   
	        
	        button5 = new JButton("5");
	        button5.setBounds(100, 150, 100, 50);
                button5.setFocusable(false);
	        button5.addActionListener(this);
	   
	        
	        button6 = new JButton("6");
	        button6.setBounds(200, 150, 100, 50);
                button6.setFocusable(false);
	        button6.addActionListener(this);
	   
	        
	        button7 = new JButton("7");
	        button7.setBounds(0, 200, 100, 50);
                button7.setFocusable(false);
	        button7.addActionListener(this);
	   
	        
	        button8 = new JButton("8");
	        button8.setBounds(100, 200, 100, 50);
                button8.setFocusable(false);
	        button8.addActionListener(this);
	   
	        
	        button9 = new JButton("9");
	        button9.setBounds(200, 200, 100, 50);
                button9.setFocusable(false);
	        button9.addActionListener(this);
	   
                                
                /*INITIALIZING RADIO BUTTONS FOR ON AND OFF*/
                //ON RADIO-BUTTON
                SWITCH_ON = new JRadioButton("On");
	        SWITCH_ON.setBounds(0, 250, 50, 50);
	        SWITCH_ON.setFocusable(false);
	        SWITCH_ON.setVisible(true);
                SWITCH_ON.setBackground(Color.WHITE);
	        SWITCH_ON.addActionListener(this);
	        
	        //OFF RADIO-BUTTON
	        SWITCH_OFF = new JRadioButton("0ff");
	        SWITCH_OFF.setBounds(50,250, 50, 50);
	        SWITCH_OFF.setFocusable(false);
	        SWITCH_OFF.setVisible(true);
                SWITCH_OFF.setBackground(Color.WHITE);
	        SWITCH_OFF.addActionListener(this);
	        
	        //GROUPING RADIO BUTTONS
	        ButtonGroup bg = new ButtonGroup();
	        bg.add(SWITCH_ON);
	        bg.add(SWITCH_OFF);
                
                //INITIALIZING OPERATIONAL BUTTON
                  //(ADDITION BUTTON)
                addButton = new JButton("+");
	        addButton.setBounds(300, 100, 100, 50);
                addButton.setFocusable(false);
	        addButton.addActionListener(this);
                
                //(MULTIPLICATION BUTTON)
                multiplyButton = new JButton("*");
	        multiplyButton.setBounds(400, 100, 100, 50);
                multiplyButton.setFocusable(false);
	        multiplyButton.addActionListener(this);
	   
	        //(SUBTRACTION BUTTON)
	        minusButton = new JButton("-");
	        minusButton.setBounds(300, 150, 100, 50);
                minusButton.setFocusable(false);
	        minusButton.addActionListener(this);
	   
	        //(DIVISION BUTTON)
	        divideButton = new JButton("/");
	        divideButton.setBounds(400, 150, 100, 50);
                divideButton.setFocusable(false);
	        divideButton.addActionListener(this);
	   
	        //(EQUALS TO BUTTON)
	        equalsButton = new JButton("=");
	        equalsButton.setBounds(400, 200, 100, 50);
                equalsButton.setFocusable(false);
	        equalsButton.addActionListener(this);
	   
                //(DOT BUTTON)
                dotButton = new JButton(".");
	        dotButton.setBounds(300, 250, 100, 50);
                dotButton.setFocusable(false);
	        dotButton.addActionListener(this);
                
                //(MODULO BUTTON)
                moduloButton = new JButton("%");
	        moduloButton.setBounds(400, 250, 100, 50);
                moduloButton.setFocusable(false);
	        moduloButton.addActionListener(this);
                
	        //OTHER OPERATIONAL BUTTON
                AC = new JButton("AC");
	        AC.setBounds(100, 250, 100, 50);
                AC.setFocusable(false);
	        AC.addActionListener(this);
                
                //BUTTON USED TO REMOVE USERS INPUT
                DELETE = new JButton("DELETE");
	        DELETE.setBounds(200, 250, 100, 50);
                DELETE.setFocusable(false);
	        DELETE.addActionListener(this);

                 //CALCULATOR PANEL TO ADD OTHER FUNCTIONS
                CALCULATOR_PANEL = new JPanel();
	        CALCULATOR_PANEL.setSize(515, 339);
	        CALCULATOR_PANEL.setVisible(true);
                CALCULATOR_PANEL.setOpaque(true);
                CALCULATOR_PANEL.setLayout(null);
	        CALCULATOR_PANEL.add(button0);
                CALCULATOR_PANEL.add(button1);
                CALCULATOR_PANEL.add(button2);
                CALCULATOR_PANEL.setBackground(Color.DARK_GRAY);
                CALCULATOR_PANEL.add(button3);
                CALCULATOR_PANEL.add(button4);
                CALCULATOR_PANEL.add(button5);
                CALCULATOR_PANEL.add(button6);
                CALCULATOR_PANEL.add(button7);
                CALCULATOR_PANEL.add(button8);
                CALCULATOR_PANEL.add(button9);
                CALCULATOR_PANEL.add(SWITCH_ON);
                CALCULATOR_PANEL.add(SWITCH_OFF);
                CALCULATOR_PANEL.add(CALCULATOR_INPUT);
                CALCULATOR_PANEL.add(addButton);
                CALCULATOR_PANEL.add(multiplyButton);
                CALCULATOR_PANEL.add(minusButton);
                CALCULATOR_PANEL.add(divideButton);
                CALCULATOR_PANEL.add(equalsButton);
                CALCULATOR_PANEL.add(dotButton);
                CALCULATOR_PANEL.add(moduloButton);
                CALCULATOR_PANEL.add(AC);
                CALCULATOR_PANEL.add(DELETE);
              
               
	        //CALCULATOR FRAME TO ADD CALCULATOR PANEL
	        calculatorFrame = new JFrame("Calculator");
	        calculatorFrame.setSize(515, 339);
	        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                calculatorFrame.setVisible(true);
	        calculatorFrame.setLayout(null);
	        calculatorFrame.add(CALCULATOR_PANEL);
                calculatorFrame.setResizable(false);
	        
      }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(recheck == false && isClicked(e)) {
     CALCULATOR_INPUT.setText(GET_CLICKED_TEXT);
      }
     if(isOperationClicked(e)) {
     CALCULATOR_INPUT.setText(GET_OPERATION_TEXT); 
     }
     isNull(e);
         
    System.out.println("TEXT1 "+GET_CLICKED_TEXT);
    System.out.println("TEXT2 "+GET_NEXT_CLICKED_TEXT);
    System.out.println(recheck);
         
        
        try {
         //USING SWICH CASE TO PERFORM USER INPUT
        switch(GET_OPERATION_TEXT) {
           
            //CONVERT STRING TO INTEGER
            case "+":
                
             if(GET_CLICKED_TEXT.contains(".") || GET_NEXT_CLICKED_TEXT.contains(".")) {
                  a = Double.parseDouble(GET_CLICKED_TEXT);
                     
                 if(!GET_NEXT_CLICKED_TEXT.equals("")) 
                 b = Double.parseDouble(GET_NEXT_CLICKED_TEXT);
                   isDot = true;
              }
             
             else {
                  SUM_NUM = Integer.parseInt(GET_CLICKED_TEXT);  
                      
                   if(!GET_NEXT_CLICKED_TEXT.equals("")) {
                    NEXT_NUM = Integer.parseInt(GET_NEXT_CLICKED_TEXT);
                      isDot =false;
                 }
              }
                
          if(e.getSource() == equalsButton) {
 
              if(isDot) {
                 double ans = a + b;
                 CALCULATOR_INPUT.setText(a+" "+GET_OPERATION_TEXT+" "+b+" = "+ans);        
                 GET_CLICKED_TEXT  =  ""+ans;
                 GET_OPERATION_TEXT = "";
              }
             else {
                SUM = SUM_NUM + NEXT_NUM;
                CALCULATOR_INPUT.setText(SUM_NUM+" "+GET_OPERATION_TEXT+" "+NEXT_NUM+" = "+SUM);        
                GET_CLICKED_TEXT  =  ""+SUM;
                GET_OPERATION_TEXT = "";
              }
           }
          break;
          
        case "-":
            
          if(GET_CLICKED_TEXT.contains(".") || GET_NEXT_CLICKED_TEXT.contains(".")) {
                      x = Double.parseDouble(GET_CLICKED_TEXT);
              if(!GET_NEXT_CLICKED_TEXT.equals("")) 
                       y = Double.parseDouble(GET_NEXT_CLICKED_TEXT);
                        isDot = true;
              }
          else {
    
               SUBTRACT_NUM = Integer.parseInt(GET_CLICKED_TEXT);
          
                 if(!GET_NEXT_CLICKED_TEXT.equals("")) {
                      NUM2 = Integer.parseInt(GET_NEXT_CLICKED_TEXT);
                      isDot = false;
                }
           }
            
          if(e.getSource() == equalsButton) {
              
                if(isDot) {
                   double ans = x - y;
                   CALCULATOR_INPUT.setText(x+" "+GET_OPERATION_TEXT+" "+y+" = "+ans);        
                   GET_CLICKED_TEXT  =  ""+ans;
                   GET_OPERATION_TEXT = "";
           }   
             else {   
                   MINUS = SUBTRACT_NUM - NUM2;
                   CALCULATOR_INPUT.setText(SUBTRACT_NUM+" "+GET_OPERATION_TEXT+" "+NUM2+" = "+MINUS);
                   GET_CLICKED_TEXT  =  ""+MINUS;
                   GET_OPERATION_TEXT = "";
              }
          }
          break;
          
          
          
        case "*":
              if(GET_CLICKED_TEXT.contains(".") || GET_NEXT_CLICKED_TEXT.contains(".")) {
                         i = Double.parseDouble(GET_CLICKED_TEXT);
                 if(!GET_NEXT_CLICKED_TEXT.equals("")) 
                       j = Double.parseDouble(GET_NEXT_CLICKED_TEXT); 
                          isDot = true;
                 }
              
            else {
                   MULTIPLY_NUM = Integer.parseInt(GET_CLICKED_TEXT);
                   
                      if(!GET_NEXT_CLICKED_TEXT.equals("")) {
                   NEXT_NUM = Integer.parseInt(GET_NEXT_CLICKED_TEXT);
                         isDot = false;
               }
            }
              
           if(e.getSource() == equalsButton) {
               
                if(isDot) {
                    double ans = i * j;
                    CALCULATOR_INPUT.setText(i+" "+GET_OPERATION_TEXT+" "+j+" = "+ans);        
                    GET_CLICKED_TEXT  =  ""+ans;
                    GET_OPERATION_TEXT = "";
               }  
                
            else  {
                  MULTIPLY = MULTIPLY_NUM * NEXT_NUM;
                  CALCULATOR_INPUT.setText(MULTIPLY_NUM+" "+GET_OPERATION_TEXT+" "+NEXT_NUM+" = "+MULTIPLY);
                  GET_CLICKED_TEXT  =  ""+MULTIPLY;
                  GET_OPERATION_TEXT = "";
               }
           }
          break;
          
          
        case "/":
           if(GET_CLICKED_TEXT.contains(".") || GET_NEXT_CLICKED_TEXT.contains(".")) {       
                     m = Double.parseDouble(GET_CLICKED_TEXT);
               if(!GET_NEXT_CLICKED_TEXT.equals("")) 
                     n = Double.parseDouble(GET_NEXT_CLICKED_TEXT); 
                        isDot = true;
               } 
           else  {
                  DIVIDE_NUM = Integer.parseInt(GET_CLICKED_TEXT);
               if(!GET_NEXT_CLICKED_TEXT.equals("")) {
                   DIVIDE_NUM2 = Integer.parseInt(GET_NEXT_CLICKED_TEXT);
                      isDot= false;
                  }
               }
          
          if(e.getSource() == equalsButton) {
              
               if(isDot) {
                    double ans = m / n;
                    CALCULATOR_INPUT.setText(m+" "+GET_OPERATION_TEXT+" "+n+" = "+ans);        
                    GET_CLICKED_TEXT  =  ""+ans;
                    GET_OPERATION_TEXT = "";
             }  
             else {
               
                if(DIVIDE_NUM%DIVIDE_NUM2 == 0) {
                  DIVIDE = DIVIDE_NUM /     DIVIDE_NUM2;
                  CALCULATOR_INPUT.setText(DIVIDE_NUM+" "+GET_OPERATION_TEXT+" "+DIVIDE_NUM2+" = "+DIVIDE);
                  GET_CLICKED_TEXT  =  ""+DIVIDE;
                 GET_OPERATION_TEXT = "";
            }
            else {
                 m = DIVIDE_NUM;
                 n = DIVIDE_NUM2;
                  double ans = m / n;
                  CALCULATOR_INPUT.setText(DIVIDE_NUM+" "+GET_OPERATION_TEXT+" "+DIVIDE_NUM2+" = "+ans);        
                  GET_CLICKED_TEXT  =  ""+ans;
                  GET_OPERATION_TEXT = "";
                }
             }
          }
          break;
         
        case "%":
         if(GET_CLICKED_TEXT.contains(".") || GET_NEXT_CLICKED_TEXT.contains(".")) {   
                    mod1 = Double.parseDouble(GET_CLICKED_TEXT);     
                 if(!GET_NEXT_CLICKED_TEXT.equals("")) 
                    mod2 = Double.parseDouble(GET_NEXT_CLICKED_TEXT); 
                       isDot = true;
            }
          else {
                  MOD_NUM = Integer.parseInt(GET_CLICKED_TEXT);
                     if(!GET_NEXT_CLICKED_TEXT.equals("")) {
                  MOD_NUM2 = Integer.parseInt(GET_NEXT_CLICKED_TEXT);
                       isDot = false;
               }
           }
           
          if(e.getSource() == equalsButton) {
              if(isDot) {
                 double ans = mod1 / mod2;
                 CALCULATOR_INPUT.setText(mod1+" "+GET_OPERATION_TEXT+" "+mod2+" = "+ans);        
                 GET_CLICKED_TEXT  =  ""+ans;
                 GET_OPERATION_TEXT = "";
             }
          else {
             if(mod1%mod2 == 0) {
                   FINAL_MOD = MOD_NUM /     MOD_NUM2;
                   CALCULATOR_INPUT.setText(MOD_NUM+" "+GET_OPERATION_TEXT+" "+MOD_NUM2+" = "+FINAL_MOD);
                   GET_CLICKED_TEXT  =  ""+FINAL_MOD;
                   GET_OPERATION_TEXT = "";
            }
            else {
                   mod1 = MOD_NUM;
                   mod2 = MOD_NUM2;
                   double ans = mod1 / mod2;
                   CALCULATOR_INPUT.setText(MOD_NUM+" "+GET_OPERATION_TEXT+" "+MOD_NUM2+" = "+ans);        
                   GET_CLICKED_TEXT  =  ""+ans;
                   GET_OPERATION_TEXT = "";
                  }
                 }
          break;
             }
          }
        } catch(Exception ex)  {
         CALCULATOR_INPUT.setText("MATH ERROR: "+ex.getMessage());       
        }  
     //CALLING NECESSARY FUNCTIONS
        AC(e);
        DELETE(e);
        enable(e);
        disable(e);
        dot(e);
}
   
    
    //RETURNS TRUE AND ASSIGN IT TO A STRING IF NUMBER BUTTON IS CLICKED (0 - 9)
    public boolean isClicked(ActionEvent e) {
      if(e.getSource() == button0) {
      GET_CLICKED_TEXT += 0;
      check = true;
      return check;
     }
     if(e.getSource() == button1) {
      GET_CLICKED_TEXT += 1;
      check = true;
      return check;
     }
     if(e.getSource() == button2) {
      GET_CLICKED_TEXT += 2;
      check = true;
      return check;
     }
     if(e.getSource() == button3) {
      GET_CLICKED_TEXT += 3;
      check = true;
      return check;
     }
     if(e.getSource() == button4) {
      GET_CLICKED_TEXT += 4;
      check = true;
      return check;
     }
     if(e.getSource() == button5) {
      GET_CLICKED_TEXT += 5;
      check = true;
      return check;
     }
     if(e.getSource() == button6) {
      GET_CLICKED_TEXT += 6;
      check = true;
      return check;
     }
     if(e.getSource() == button7) {
      GET_CLICKED_TEXT += 7;
      check = true;
      return check;
     }
     if(e.getSource() == button8) {
      GET_CLICKED_TEXT += 8;
      check = true;
      return check;
     }
     if(e.getSource() == button9) {
      GET_CLICKED_TEXT += 9;
      check = true;
      return check;
     }
     return false;
    }
    //RETURNS TRUE AND ASSIGN IT TO A  STRING IF OPERATIONAL BUTTON IS CLCIKED(+, *, -, /)
  public boolean isOperationClicked(ActionEvent e) {
      if(e.getSource() == addButton) {
          //sets operation 
         GET_OPERATION_TEXT = "+";
         recheck = true;
         
          //sets second text to null each time operatonal button is clicked
         GET_NEXT_CLICKED_TEXT = "";
         return true;
      }
      if(e.getSource() == multiplyButton) {
          //sets operation 
         GET_OPERATION_TEXT = "*";
         recheck = true;
         
          //sets second text to null each time operatonal button is clicked
         GET_NEXT_CLICKED_TEXT = "";
         return recheck;
      }
     if(e.getSource() == minusButton) {
         //sets operation 
         GET_OPERATION_TEXT = "-";
         recheck = true;
         
          //sets second text to null each time operatonal button is clicked
         GET_NEXT_CLICKED_TEXT = "";
         return recheck;
      }
     if(e.getSource() == divideButton) {
         //sets operation 
         GET_OPERATION_TEXT = "/";
         recheck = true;
         
         //sets second text to null each time operatonal button is clicked
         GET_NEXT_CLICKED_TEXT = "";
         
         return recheck;
      }
     if(e.getSource() == moduloButton) {
         //sets operation 
        GET_OPERATION_TEXT = "%";
        recheck= true;
        
        //sets second text to null each time operatonal button is clicked
        GET_NEXT_CLICKED_TEXT = "";
        
        return recheck;
     }
     return false;
  }
  
  //RESET USER INPUT TEXT IF OPERATIONAL BUTTON IS CLICKED
  public void isNull(ActionEvent e) {
      if(recheck && e.getSource() == button0) {
         GET_NEXT_CLICKED_TEXT += 0;
         CALCULATOR_INPUT.setText(GET_NEXT_CLICKED_TEXT);
      }
      if(recheck && e.getSource() == button1) {
         GET_NEXT_CLICKED_TEXT += 1;
         CALCULATOR_INPUT.setText(GET_NEXT_CLICKED_TEXT);
      }
 
      if(recheck && e.getSource() == button2) {
         
         GET_NEXT_CLICKED_TEXT += 2;
         CALCULATOR_INPUT.setText(GET_NEXT_CLICKED_TEXT);
      }
 
      if(recheck && e.getSource() == button3) {
          
         GET_NEXT_CLICKED_TEXT += 3;
         CALCULATOR_INPUT.setText(GET_NEXT_CLICKED_TEXT);
      }
 
      if(recheck && e.getSource() == button4) {
          
         GET_NEXT_CLICKED_TEXT += 4;
         CALCULATOR_INPUT.setText(GET_NEXT_CLICKED_TEXT);
      }
 
      if(recheck && e.getSource() == button5) {
          
         GET_NEXT_CLICKED_TEXT += 5;
         CALCULATOR_INPUT.setText(GET_NEXT_CLICKED_TEXT);
      }
 
      if(recheck && e.getSource() == button6) {
          
         GET_NEXT_CLICKED_TEXT += 6;
         CALCULATOR_INPUT.setText(GET_NEXT_CLICKED_TEXT);
      }
 
      if(recheck && e.getSource() == button7) {
        
         GET_NEXT_CLICKED_TEXT += 7;
         CALCULATOR_INPUT.setText(GET_NEXT_CLICKED_TEXT);
      }
 
      if(recheck && e.getSource() == button8) {
        
         GET_NEXT_CLICKED_TEXT += 8;
         CALCULATOR_INPUT.setText(GET_NEXT_CLICKED_TEXT);
      }
     if(recheck && e.getSource() == button9) {
         
         GET_NEXT_CLICKED_TEXT += 9;
         CALCULATOR_INPUT.setText(GET_NEXT_CLICKED_TEXT);
      }
      }
  //CLEARS AND SETS ALL INPUT TO NULL
  public void AC(ActionEvent e) {
     if(e.getSource() == AC) {
         //REASSIGNING VALUES TO NULL
          recheck = false;
         GET_CLICKED_TEXT = "";
         GET_OPERATION_TEXT = "";
         GET_NEXT_CLICKED_TEXT = "";
      
         CALCULATOR_INPUT.setText("");
         
         
         //ENTERING NEW INPUT TO REASSIGNED VALUES
         if(check && isClicked(e)) {
         CALCULATOR_INPUT.setText(GET_CLICKED_TEXT);
        }
         if(isOperationClicked(e)) {
       CALCULATOR_INPUT.setText(GET_OPERATION_TEXT); 
       }
       isNull(e);
       
        System.out.println("TEXT1 "+GET_CLICKED_TEXT);
        System.out.println("TEXT2 "+GET_NEXT_CLICKED_TEXT);
        System.out.println(recheck);
        
     }
  }
  //DELETES LAST INDEX OF USER INPUT
     public void DELETE(ActionEvent e)  {
               if(e.getSource() == DELETE) {
           if(!GET_CLICKED_TEXT.equals("") && GET_NEXT_CLICKED_TEXT.equals("")) {
         StringBuilder builder = new StringBuilder(GET_CLICKED_TEXT);
         int len = GET_CLICKED_TEXT.length();
         int lastIndex = (len%10)-1;
         builder.deleteCharAt(lastIndex);
         
         System.out.println("f "+lastIndex);
         String NEW_TEXT =  builder.toString();
         CALCULATOR_INPUT.setText(NEW_TEXT); 
         GET_CLICKED_TEXT = NEW_TEXT;
           }
           
         if(!GET_NEXT_CLICKED_TEXT.equals("")) {
         StringBuilder builder = new StringBuilder(GET_NEXT_CLICKED_TEXT);
         int len = GET_NEXT_CLICKED_TEXT.length();
         int lastIndex = (len%10)-1;
         builder.deleteCharAt(lastIndex);
         
         System.out.println("f "+lastIndex);
         String NEW_TEXT =  builder.toString();
         CALCULATOR_INPUT.setText(NEW_TEXT); 
         GET_NEXT_CLICKED_TEXT = NEW_TEXT;
           }
           
        }
     }
     //ENABLES ALL COONTAINERS ON CALCULATOR PANEL
     public void enable(ActionEvent e) {
         if(e.getSource() == SWITCH_ON)  {
                button1.setEnabled(true);
	        button2.setEnabled(true);
	        button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
                button0.setEnabled(true);
                addButton.setEnabled(true);
                multiplyButton.setEnabled(true);
                minusButton.setEnabled(true);
                divideButton.setEnabled(true);
                equalsButton.setEnabled(true);
                dotButton.setEnabled(true);
                AC.setEnabled(true);
                DELETE.setEnabled(true);
                refresh(e);
                CALCULATOR_INPUT.setEnabled(true);
                moduloButton.setEnabled(true);
                

         }
     }
     //DISABLES ALL CONTAINERS ON CALCULATOR PANEL
         public void disable(ActionEvent e) {
         if(e.getSource() == SWITCH_OFF)  {
                button1.setEnabled(false);
	        button2.setEnabled(false);
	        button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button0.setEnabled(false);
                addButton.setEnabled(false);
                multiplyButton.setEnabled(false);
                minusButton.setEnabled(false);
                divideButton.setEnabled(false);
                equalsButton.setEnabled(false);
                dotButton.setEnabled(false);
                AC.setEnabled(false);
                DELETE.setEnabled(false);
                refresh(e);
                CALCULATOR_INPUT.setEnabled(false);
                moduloButton.setEnabled(false);

         }
     }   
      //REASSIGNING ALL VALUES TO NULL AND SET IT BACK TO NEW INPUTS 
  public void refresh(ActionEvent e) {
            recheck = false;
         GET_CLICKED_TEXT = "";
         GET_OPERATION_TEXT = "";
         GET_NEXT_CLICKED_TEXT = "";
      
         CALCULATOR_INPUT.setText("");
         
         
         //ENTERING USER INPUT INTO RESETED VALUE
         if(check && isClicked(e)) {
         CALCULATOR_INPUT.setText(GET_CLICKED_TEXT);
        }
         if(isOperationClicked(e)) {
       CALCULATOR_INPUT.setText(GET_OPERATION_TEXT); 
       }
       isNull(e);
       
   }
  
  //SET DOT VALUE TO A STRING WHEN IT IS CLCIKED
 public void dot(ActionEvent e) {
     if(e.getSource() ==  dotButton) {
        LOOKUP = GET_CLICKED_TEXT;
        
        //CHECKS IF TEXT IS EQUAL TO . IN ORDER NOT TO ALLOW MULTIPLE POINTS
       if(GET_CLICKED_TEXT.contains(".")) {
           GET_CLICKED_TEXT += "";
       }
       else {
           GET_CLICKED_TEXT +=".";
       }
     }
    if(recheck && e.getSource() == dotButton) {
        GET_CLICKED_TEXT = "";
        GET_CLICKED_TEXT = LOOKUP;
        
        //CHECKS IF TEXT IS EQUAL TO . IN ORDER NOT TO ALLOW MULTIPLE POINTS
        if(GET_NEXT_CLICKED_TEXT.contains(".")) {
           GET_NEXT_CLICKED_TEXT += "";
       }
        //CHECKS IF TEXT IS NOT EQUAL TO . AND ASSIGNS IT TO TEXT  
       else {
           GET_NEXT_CLICKED_TEXT +=".";
           }
        }
    }
}

