package counter;

import java.lang.*;
import bsh.Interpreter;
import bsh.EvalError;

public class CALCULATOR extends javax.swing.JFrame 
{
    double radianToDegreeConstant = 180/Math.PI;
    String inputString , outputString , oldString , newString , finalString;
    //angle type combo box item list
    String[] angleTypeItemList = new String[]{"Radian","Degree"};
   
    Interpreter interpreter = new Interpreter();
    //function to get numbers as string only including decimal point
    public double asinh(double x)
    {
    return Math.log(x + Math.sqrt(x*x + 1.0));
    }

    public double acosh(double x)
    {
        return Math.log(x + Math.sqrt(x*x - 1.0));
    }

    public double atanh(double x)
    {
        return 0.5*Math.log( (x + 1.0) / (x - 1.0) );
    } 
    
    public String captureNumber(String any)
    {
        String newString = "";
        char[] anyArray = new char[any.length()];
        anyArray=any.toCharArray();
        int i=anyArray.length;
        int d = i-1;
        while(d>=0)
        {
            if((anyArray[d]>='0'&&anyArray[d]<='9')||anyArray[d]=='.')
            {
                newString = newString + anyArray[d];
            }
            else
            {
                break;
            }
            d--;
        }
        return newString;
    }
    
    public void asinhInverseSet()
    {
        if(!calculatorInputTextField.getText().equals(""))
        {    
        //get input from text field
        inputString = calculatorInputTextField.getText();
        //capture the number reversely
        String s1 = captureNumber(inputString);
        //reverse the string
        String s2 = reverseString(s1);
        //parse string to double
        double x1 = Double.parseDouble(s2);
        //get the asinh to double
        double x2 = asinh(x1);
        //convert the number to string
        String s3 = ""+x2;
        //deference between the input string and captured string
        int difference = inputString.length()-s1.length();
        //make substring from old input string
        String s4 = inputString.substring(0, difference);
        //add input and new string to the string
        String s5 = s4+s3;
        //set it to the output textField
        calculatorInputTextField.setText(s5);
        }
    }
    public void acoshInverseSet()
    {
        if(!calculatorInputTextField.getText().equals(""))
        {    
        //get input from text field
        inputString = calculatorInputTextField.getText();
        //capture the number reversely
        String s1 = captureNumber(inputString);
        //reverse the string
        String s2 = reverseString(s1);
        //parse string to double
        double x1 = Double.parseDouble(s2);
        //get the asinh to double
        double x2 = acosh(x1);
        //convert the number to string
        String s3 = ""+x2;
        //deference between the input string and captured string
        int difference = inputString.length()-s1.length();
        //make substring from old input string
        String s4 = inputString.substring(0, difference);
        //add input and new string to the string
        String s5 = s4+s3;
        //set it to the output textField
        calculatorInputTextField.setText(s5);
        }
    }
    public void atanhInverseSet()
    {
        if(!calculatorInputTextField.getText().equals(""))
        {    
        //get input from text field
        inputString = calculatorInputTextField.getText();
        //capture the number reversely
        String s1 = captureNumber(inputString);
        //reverse the string
        String s2 = reverseString(s1);
        //parse string to double
        double x1 = Double.parseDouble(s2);
        //get the asinh to double
        double x2 = atanh(x1);
        //convert the number to string
        String s3 = ""+x2;
        //deference between the input string and captured string
        int difference = inputString.length()-s1.length();
        //make substring from old input string
        String s4 = inputString.substring(0, difference);
        //add input and new string to the string
        String s5 = s4+s3;
        //set it to the output textField
        calculatorInputTextField.setText(s5);
        }
    }
    
    
    //function to get numbers as string without decimal point
    public String captureNumberWithoutDecimal(String any)
    {
        String newString = "";
        char[] anyArray = new char[any.length()];
        anyArray=any.toCharArray();
        int i=anyArray.length;
        int d = i-1;
        while(d>=0)
        {
            if((anyArray[d]>='0'&&anyArray[d]<='9'))
            {
                newString = newString + anyArray[d];
            }
            else
            {
                break;
            }
            d--;
            
        }
        return newString;
    }
    //function to reverse a string
        public String reverseString(String anyString1)
    {        
        int anyString1Length = anyString1.length();
        int anyString1FinalIndex = anyString1Length-1;
        char[] anyString1Array = new char[anyString1Length];
        anyString1Array = anyString1.toCharArray();
        String finalString1 ="";
        for(int i=anyString1FinalIndex;i>=0;i--)
        {
            finalString1 = finalString1 + anyString1Array[i] ;
        }
        return finalString1;
    }
    //function to calculate factorial
    public int factorial(int x)
    {
        if(x==0)
        {
            return 1;
        }
        if(x==1)
        {
            return 1;
        }
        return x* factorial(x-1);
    }
    
    
    /**
     * Creates new form CALCULATOR
     */
    public CALCULATOR() 
    {
        initComponents();
        getContentPane().setBackground(java.awt.Color.gray);
        //Initialize the angle type combo box model list with constructor
        //It will help to initialize the value of model at the starting of converter JFrame

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculatorOneButton = new javax.swing.JButton();
        calculatorTwoButton = new javax.swing.JButton();
        calculatorThreeButton = new javax.swing.JButton();
        calculatorFourButton = new javax.swing.JButton();
        calculatorFiveButton = new javax.swing.JButton();
        calculatorSixButton = new javax.swing.JButton();
        calculatorSevenButton = new javax.swing.JButton();
        calculatorEightButton = new javax.swing.JButton();
        calculatorNineButton = new javax.swing.JButton();
        calculatorZeroButton = new javax.swing.JButton();
        calculatorDecimalPointButton = new javax.swing.JButton();
        calculatorInputTextField = new javax.swing.JTextField();
        calculatorEqualButton = new javax.swing.JButton();
        calculatorPlusButton = new javax.swing.JButton();
        calculatorMinusButton = new javax.swing.JButton();
        calculatorMultiplyButton = new javax.swing.JButton();
        calculatorDivideButton = new javax.swing.JButton();
        calculatorStartingBracketButton = new javax.swing.JButton();
        calculatorEndingBracketButton = new javax.swing.JButton();
        calculatorXToThePowerYButton = new javax.swing.JButton();
        calculatorEToThePowerYButton = new javax.swing.JButton();
        calculatorOutputTextField = new javax.swing.JTextField();
        calculatorCommaButton = new javax.swing.JButton();
        calculatorBackspaceButton = new javax.swing.JButton();
        calculatorClearButton = new javax.swing.JButton();
        calculatorLogBase10Button = new javax.swing.JButton();
        calculatorLogBaseEButton = new javax.swing.JButton();
        calculatorSineButton = new javax.swing.JButton();
        calculatorCosineButton = new javax.swing.JButton();
        calculatorTangentButton = new javax.swing.JButton();
        calculatorHyperbolicSineButton = new javax.swing.JButton();
        calculatorHyperbolicCosineButton = new javax.swing.JButton();
        calculatorHyperbolicTangentButton = new javax.swing.JButton();
        calculatorSineInverseButton = new javax.swing.JButton();
        calculatorCosineInverseButton = new javax.swing.JButton();
        calculatorTangentInverseButton = new javax.swing.JButton();
        calculatorRandomButton = new javax.swing.JButton();
        calculatorSquareRootButton = new javax.swing.JButton();
        calculatorCubicRootButton = new javax.swing.JButton();
        calculatorFactorialButton = new javax.swing.JButton();
        calculatorFloorButton = new javax.swing.JButton();
        calculatorCellingButton = new javax.swing.JButton();
        calculatorPiButton = new javax.swing.JButton();
        calculator10ToThePowerXButton = new javax.swing.JButton();
        calculatorAnswerButton = new javax.swing.JButton();
        calculatorBackToMenuButton = new javax.swing.JButton();
        calculatorHyperbolicSineInverseButton = new javax.swing.JButton();
        calculatorHyperbolicCosineInverseButton = new javax.swing.JButton();
        calculatorHyperbolicTangentInverseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setName("CALCULATOR_Frame"); // NOI18N

        calculatorOneButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorOneButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorOneButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorOneButton.setText("1");
        calculatorOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorOneButtonActionPerformed(evt);
            }
        });

        calculatorTwoButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorTwoButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorTwoButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorTwoButton.setText("2");
        calculatorTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorTwoButtonActionPerformed(evt);
            }
        });

        calculatorThreeButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorThreeButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorThreeButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorThreeButton.setText("3");
        calculatorThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorThreeButtonActionPerformed(evt);
            }
        });

        calculatorFourButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorFourButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorFourButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorFourButton.setText("4");
        calculatorFourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorFourButtonActionPerformed(evt);
            }
        });

        calculatorFiveButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorFiveButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorFiveButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorFiveButton.setText("5");
        calculatorFiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorFiveButtonActionPerformed(evt);
            }
        });

        calculatorSixButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorSixButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorSixButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorSixButton.setText("6");
        calculatorSixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorSixButtonActionPerformed(evt);
            }
        });

        calculatorSevenButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorSevenButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorSevenButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorSevenButton.setText("7");
        calculatorSevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorSevenButtonActionPerformed(evt);
            }
        });

        calculatorEightButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorEightButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorEightButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorEightButton.setText("8");
        calculatorEightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorEightButtonActionPerformed(evt);
            }
        });

        calculatorNineButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorNineButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorNineButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorNineButton.setText("9");
        calculatorNineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorNineButtonActionPerformed(evt);
            }
        });

        calculatorZeroButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorZeroButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorZeroButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorZeroButton.setText("0");
        calculatorZeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorZeroButtonActionPerformed(evt);
            }
        });

        calculatorDecimalPointButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorDecimalPointButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorDecimalPointButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorDecimalPointButton.setText(".");
        calculatorDecimalPointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorDecimalPointButtonActionPerformed(evt);
            }
        });

        calculatorInputTextField.setEditable(false);
        calculatorInputTextField.setBackground(new java.awt.Color(0, 0, 0));
        calculatorInputTextField.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorInputTextField.setForeground(new java.awt.Color(0, 255, 0));

        calculatorEqualButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorEqualButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorEqualButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorEqualButton.setText("=");
        calculatorEqualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorEqualButtonActionPerformed(evt);
            }
        });

        calculatorPlusButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorPlusButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorPlusButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorPlusButton.setText("+");
        calculatorPlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorPlusButtonActionPerformed(evt);
            }
        });

        calculatorMinusButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorMinusButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorMinusButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorMinusButton.setText("-");
        calculatorMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorMinusButtonActionPerformed(evt);
            }
        });

        calculatorMultiplyButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorMultiplyButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorMultiplyButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorMultiplyButton.setText("*");
        calculatorMultiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorMultiplyButtonActionPerformed(evt);
            }
        });

        calculatorDivideButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorDivideButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorDivideButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorDivideButton.setText("/");
        calculatorDivideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorDivideButtonActionPerformed(evt);
            }
        });

        calculatorStartingBracketButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorStartingBracketButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorStartingBracketButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorStartingBracketButton.setText("(");
        calculatorStartingBracketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorStartingBracketButtonActionPerformed(evt);
            }
        });

        calculatorEndingBracketButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorEndingBracketButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorEndingBracketButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorEndingBracketButton.setText(")");
        calculatorEndingBracketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorEndingBracketButtonActionPerformed(evt);
            }
        });

        calculatorXToThePowerYButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorXToThePowerYButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorXToThePowerYButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorXToThePowerYButton.setText("x^y");
        calculatorXToThePowerYButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorXToThePowerYButtonActionPerformed(evt);
            }
        });

        calculatorEToThePowerYButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorEToThePowerYButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorEToThePowerYButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorEToThePowerYButton.setText(" e^x");
        calculatorEToThePowerYButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorEToThePowerYButtonActionPerformed(evt);
            }
        });

        calculatorOutputTextField.setEditable(false);
        calculatorOutputTextField.setBackground(new java.awt.Color(0, 0, 0));
        calculatorOutputTextField.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorOutputTextField.setForeground(new java.awt.Color(0, 255, 0));

        calculatorCommaButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorCommaButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorCommaButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorCommaButton.setText(",");
        calculatorCommaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorCommaButtonActionPerformed(evt);
            }
        });

        calculatorBackspaceButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorBackspaceButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorBackspaceButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorBackspaceButton.setText("BACKSPACE");
        calculatorBackspaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorBackspaceButtonActionPerformed(evt);
            }
        });

        calculatorClearButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorClearButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorClearButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorClearButton.setText("CLEAR");
        calculatorClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorClearButtonActionPerformed(evt);
            }
        });

        calculatorLogBase10Button.setBackground(new java.awt.Color(0, 0, 0));
        calculatorLogBase10Button.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorLogBase10Button.setForeground(new java.awt.Color(0, 255, 0));
        calculatorLogBase10Button.setText("log");
        calculatorLogBase10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorLogBase10ButtonActionPerformed(evt);
            }
        });

        calculatorLogBaseEButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorLogBaseEButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorLogBaseEButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorLogBaseEButton.setText("ln");
        calculatorLogBaseEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorLogBaseEButtonActionPerformed(evt);
            }
        });

        calculatorSineButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorSineButton.setFont(new java.awt.Font("Lucida Console", 1, 13)); // NOI18N
        calculatorSineButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorSineButton.setText("sin");
        calculatorSineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorSineButtonActionPerformed(evt);
            }
        });

        calculatorCosineButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorCosineButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorCosineButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorCosineButton.setText("cos");
        calculatorCosineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorCosineButtonActionPerformed(evt);
            }
        });

        calculatorTangentButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorTangentButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorTangentButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorTangentButton.setText("tan");
        calculatorTangentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorTangentButtonActionPerformed(evt);
            }
        });

        calculatorHyperbolicSineButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorHyperbolicSineButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorHyperbolicSineButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorHyperbolicSineButton.setText("sinh");
        calculatorHyperbolicSineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorHyperbolicSineButtonActionPerformed(evt);
            }
        });

        calculatorHyperbolicCosineButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorHyperbolicCosineButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorHyperbolicCosineButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorHyperbolicCosineButton.setText("cosh");
        calculatorHyperbolicCosineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorHyperbolicCosineButtonActionPerformed(evt);
            }
        });

        calculatorHyperbolicTangentButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorHyperbolicTangentButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorHyperbolicTangentButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorHyperbolicTangentButton.setText("tanh");
        calculatorHyperbolicTangentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorHyperbolicTangentButtonActionPerformed(evt);
            }
        });

        calculatorSineInverseButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorSineInverseButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorSineInverseButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorSineInverseButton.setText("sin-1");
        calculatorSineInverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorSineInverseButtonActionPerformed(evt);
            }
        });

        calculatorCosineInverseButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorCosineInverseButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorCosineInverseButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorCosineInverseButton.setText("cos-1");
        calculatorCosineInverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorCosineInverseButtonActionPerformed(evt);
            }
        });

        calculatorTangentInverseButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorTangentInverseButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorTangentInverseButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorTangentInverseButton.setText("tan-1");
        calculatorTangentInverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorTangentInverseButtonActionPerformed(evt);
            }
        });

        calculatorRandomButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorRandomButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorRandomButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorRandomButton.setText("RANDOM");
        calculatorRandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorRandomButtonActionPerformed(evt);
            }
        });

        calculatorSquareRootButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorSquareRootButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorSquareRootButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorSquareRootButton.setText("√");
        calculatorSquareRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorSquareRootButtonActionPerformed(evt);
            }
        });

        calculatorCubicRootButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorCubicRootButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorCubicRootButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorCubicRootButton.setText("3√");
        calculatorCubicRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorCubicRootButtonActionPerformed(evt);
            }
        });

        calculatorFactorialButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorFactorialButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorFactorialButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorFactorialButton.setText("!");
        calculatorFactorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorFactorialButtonActionPerformed(evt);
            }
        });

        calculatorFloorButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorFloorButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorFloorButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorFloorButton.setText("FLOOR");
        calculatorFloorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorFloorButtonActionPerformed(evt);
            }
        });

        calculatorCellingButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorCellingButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorCellingButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorCellingButton.setText("CEILLING");
        calculatorCellingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorCellingButtonActionPerformed(evt);
            }
        });

        calculatorPiButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorPiButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorPiButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorPiButton.setText("PI(π)");
        calculatorPiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorPiButtonActionPerformed(evt);
            }
        });

        calculator10ToThePowerXButton.setBackground(new java.awt.Color(0, 0, 0));
        calculator10ToThePowerXButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculator10ToThePowerXButton.setForeground(new java.awt.Color(0, 255, 0));
        calculator10ToThePowerXButton.setText("10^x");
        calculator10ToThePowerXButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculator10ToThePowerXButtonActionPerformed(evt);
            }
        });

        calculatorAnswerButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorAnswerButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorAnswerButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorAnswerButton.setText("ANSWER");
        calculatorAnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorAnswerButtonActionPerformed(evt);
            }
        });

        calculatorBackToMenuButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorBackToMenuButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorBackToMenuButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorBackToMenuButton.setText("MENU");
        calculatorBackToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorBackToMenuButtonActionPerformed(evt);
            }
        });

        calculatorHyperbolicSineInverseButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorHyperbolicSineInverseButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorHyperbolicSineInverseButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorHyperbolicSineInverseButton.setText("sinh-1");
        calculatorHyperbolicSineInverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorHyperbolicSineInverseButtonActionPerformed(evt);
            }
        });

        calculatorHyperbolicCosineInverseButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorHyperbolicCosineInverseButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorHyperbolicCosineInverseButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorHyperbolicCosineInverseButton.setText("cosh-1");
        calculatorHyperbolicCosineInverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorHyperbolicCosineInverseButtonActionPerformed(evt);
            }
        });

        calculatorHyperbolicTangentInverseButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatorHyperbolicTangentInverseButton.setFont(new java.awt.Font("Lucida Console", 1, 15)); // NOI18N
        calculatorHyperbolicTangentInverseButton.setForeground(new java.awt.Color(0, 255, 0));
        calculatorHyperbolicTangentInverseButton.setText("tanh-1");
        calculatorHyperbolicTangentInverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorHyperbolicTangentInverseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(calculatorOutputTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(calculatorTwoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(calculatorFourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(calculatorSixButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(calculatorEightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calculatorCommaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calculatorZeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(calculatorThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calculatorOneButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculatorEqualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calculatorFiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calculatorSevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(calculatorMultiplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calculatorCubicRootButton, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(calculatorEndingBracketButton, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(calculatorMinusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(calculatorDivideButton, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(calculatorSquareRootButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(calculatorNineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calculatorDecimalPointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calculatorPlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calculatorStartingBracketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calculatorPiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorSineButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorCosineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorTangentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorLogBase10Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorXToThePowerYButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(calculatorTangentInverseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calculatorLogBaseEButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calculatorHyperbolicTangentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(calculatorFloorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(calculatorSineInverseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(calculatorCosineInverseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calculatorHyperbolicSineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calculatorHyperbolicCosineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calculatorEToThePowerYButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculator10ToThePowerXButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(calculatorBackspaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calculatorCellingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorAnswerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorHyperbolicTangentInverseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorHyperbolicCosineInverseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorHyperbolicSineInverseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calculatorRandomButton, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(calculatorClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorBackToMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorFactorialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(calculatorInputTextField))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calculatorInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculatorOutputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculatorStartingBracketButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorEndingBracketButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorSineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorHyperbolicSineButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(calculatorSineInverseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calculatorHyperbolicSineInverseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(calculatorCommaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calculatorDecimalPointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculatorPlusButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorMinusButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorCosineInverseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorHyperbolicCosineButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculatorHyperbolicCosineInverseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(calculatorCosineButton)
                                .addComponent(calculatorEightButton)
                                .addComponent(calculatorNineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(calculatorBackToMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculatorMultiplyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculatorDivideButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculatorTangentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculatorTangentInverseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculatorHyperbolicTangentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculatorHyperbolicTangentInverseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calculatorFactorialButton)
                        .addComponent(calculatorSixButton)
                        .addComponent(calculatorSevenButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculatorCubicRootButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculatorSquareRootButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculatorLogBase10Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculatorLogBaseEButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calculatorFloorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculatorCellingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculatorRandomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculatorFourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculatorFiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(calculatorClearButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addComponent(calculatorAnswerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(calculatorEqualButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(calculatorPiButton)
                                .addComponent(calculatorBackspaceButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(calculatorTwoButton)
                                .addComponent(calculatorThreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(calculatorOneButton)
                                    .addComponent(calculatorZeroButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(calculatorXToThePowerYButton)
                                    .addComponent(calculatorEToThePowerYButton)
                                    .addComponent(calculator10ToThePowerXButton))))))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(842, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calculatorThreeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorThreeButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorThreeButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorThreeButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorThreeButtonActionPerformed

    private void calculatorEightButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorEightButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorEightButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorEightButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorEightButtonActionPerformed

    private void calculatorFiveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorFiveButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorFiveButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorFiveButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorFiveButtonActionPerformed

    private void calculatorStartingBracketButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorStartingBracketButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorStartingBracketButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorStartingBracketButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorStartingBracketButtonActionPerformed

    private void calculatorOneButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorOneButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorOneButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorOneButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorOneButtonActionPerformed

    private void calculatorTwoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorTwoButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorTwoButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorTwoButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorTwoButtonActionPerformed
    
    private void calculatorXToThePowerYButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorXToThePowerYButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorXToThePowerYButtonActionPerformed
        /* if(!calculatorInputTextField.getText().equals(""))
        {
            
        //get input from text field
        inputString = calculatorInputTextField.getText();
        //capture the number reversely
        String s1 = captureNumber(inputString);
        //reverse the string
        String s2 = reverseString(s1);
        //parse string to double
        double x1 = Double.parseDouble(s2);
        //convert the number to string
        String s3 = ""+x1;
        //create math.pow string
        String s4 = "Math.pow(";
        //input the number in pow
        String s5 = s4+s3+",";
        //deference between the input string and captured string
        int difference = inputString.length()-s1.length();
        //make substring from old input string
        String s6 = inputString.substring(0, difference);
        //add input and new string to the string
        String s7 = s6+s5;
        //set it to the output textField
        calculatorInputTextField.setText(s7);
        
        }
        */
            
            String s1 = calculatorInputTextField.getText();
            String s2 = "(Math.pow(";
            String s3 = s1+s2;
            calculatorInputTextField.setText(s3);
            
        
    }//GEN-LAST:event_calculatorXToThePowerYButtonActionPerformed

    private void calculatorFourButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorFourButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorFourButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorFourButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorFourButtonActionPerformed

    private void calculatorSixButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorSixButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorSixButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorSixButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorSixButtonActionPerformed

    private void calculatorSevenButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorSevenButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorSevenButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorSevenButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorSevenButtonActionPerformed

    private void calculatorNineButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorNineButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorNineButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorNineButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorNineButtonActionPerformed

    private void calculatorZeroButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorZeroButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorZeroButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorZeroButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorZeroButtonActionPerformed

    private void calculatorPlusButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorPlusButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorPlusButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorPlusButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorPlusButtonActionPerformed

    private void calculatorMinusButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorMinusButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorMinusButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorMinusButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorMinusButtonActionPerformed

    private void calculatorMultiplyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorMultiplyButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorMultiplyButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorMultiplyButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorMultiplyButtonActionPerformed

    private void calculatorDivideButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorDivideButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorDivideButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorDivideButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorDivideButtonActionPerformed

    private void calculatorEndingBracketButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorEndingBracketButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorEndingBracketButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorEndingBracketButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorEndingBracketButtonActionPerformed

    private void calculatorCommaButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorCommaButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorCommaButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorCommaButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorCommaButtonActionPerformed

    private void calculatorDecimalPointButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorDecimalPointButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorDecimalPointButtonActionPerformed
        // TODO add your handling code here:
        String s1 , s2 , s3 ;
        s1=calculatorInputTextField.getText();
        s2=calculatorDecimalPointButton.getText();
        s3=s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorDecimalPointButtonActionPerformed

    private void calculatorBackspaceButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorBackspaceButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorBackspaceButtonActionPerformed
        // TODO add your handling code here:
        int isInputEmptyFlag=0;
        String s0 = calculatorInputTextField.getText();
        if(s0.equals(""))
        {
            isInputEmptyFlag=1;
        }
        if(isInputEmptyFlag==0)
        {
            String oldString,newString;
            oldString=calculatorInputTextField.getText();
            int oldStringLength = oldString.length();
            int index = oldStringLength-1;
            newString=oldString.substring(0,index);
            calculatorInputTextField.setText(newString);
        }        
    }//GEN-LAST:event_calculatorBackspaceButtonActionPerformed

    private void calculatorClearButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorClearButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorClearButtonActionPerformed
        // TODO add your handling code here:
        String s1="";
        calculatorInputTextField.setText(s1);
        calculatorOutputTextField.setText(s1);        
    }//GEN-LAST:event_calculatorClearButtonActionPerformed

    private void calculatorEqualButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorEqualButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorEqualButtonActionPerformed
        // TODO add your handling code here:
        String inputString = "1.0*"+calculatorInputTextField.getText();
        try
        {

            Object result = interpreter.eval(inputString);
            String outputString = result.toString();
            calculatorOutputTextField.setText(outputString);
        
        } 
        catch (EvalError ex)
        {
            //String message = ex.getMessage();
            //calculatorOutputTextField.setText(message);
        }
        
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_calculatorEqualButtonActionPerformed

    private void calculatorEToThePowerYButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorEToThePowerYButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorEToThePowerYButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "(Math.pow("+Math.E+",";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorEToThePowerYButtonActionPerformed

    private void calculatorLogBase10ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorLogBase10ButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorLogBase10ButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.log10(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorLogBase10ButtonActionPerformed

    private void calculatorLogBaseEButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorLogBaseEButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorLogBaseEButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.log(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorLogBaseEButtonActionPerformed

    private void calculatorSineButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorSineButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorSineButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.sin(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorSineButtonActionPerformed

    private void calculatorCosineButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorCosineButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorCosineButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.cos(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorCosineButtonActionPerformed

    private void calculatorTangentButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorTangentButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorTangentButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.tan(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorTangentButtonActionPerformed

    private void calculatorHyperbolicSineButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorHyperbolicSineButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorHyperbolicSineButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.sinh(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorHyperbolicSineButtonActionPerformed

    private void calculatorHyperbolicCosineButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorHyperbolicCosineButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorHyperbolicCosineButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.cosh(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorHyperbolicCosineButtonActionPerformed

    private void calculatorHyperbolicTangentButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorHyperbolicTangentButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorHyperbolicTangentButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.tanh(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorHyperbolicTangentButtonActionPerformed

    private void calculatorSineInverseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorSineInverseButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorSineInverseButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.asin(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorSineInverseButtonActionPerformed

    private void calculatorCosineInverseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorCosineInverseButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorCosineInverseButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.acos(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorCosineInverseButtonActionPerformed

    private void calculatorTangentInverseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorTangentInverseButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorTangentInverseButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.atan(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorTangentInverseButtonActionPerformed

    private void calculatorRandomButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorRandomButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorRandomButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.random()";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorRandomButtonActionPerformed

    private void calculatorSquareRootButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorSquareRootButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorSquareRootButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.sqrt(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorSquareRootButtonActionPerformed

    private void calculatorCubicRootButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorCubicRootButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorCubicRootButtonActionPerformed
        // TODO add your handling code here:        
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.cbrt(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
        
    }//GEN-LAST:event_calculatorCubicRootButtonActionPerformed

    private void calculatorFactorialButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorFactorialButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorFactorialButtonActionPerformed
        // TODO add your handling code here:
        try
        {
        //get input from text field
        inputString = calculatorInputTextField.getText();
        //capture the number reversely
        String s1 = captureNumber(inputString);
        //reverse the string
        String s2 = reverseString(s1);
        //parse string to integer
        int x1 = Integer.parseInt(s2);
        //calculate the factorial
        int x2 = factorial(x1);
        //convert the factorial to string
        String s3 = ""+x2;
        //deference between the input string and captured string
        int difference = inputString.length()-s1.length();
        //make substring from old input string
        String s4 = inputString.substring(0, difference);
        //add factorial to the string
        String s5 = s4+s3;
        //set it to the output textField
        calculatorInputTextField.setText(s5);
        }
        catch(Exception e)
        {
            //String message = e.getMessage();
            //calculatorOutputTextField.setText(message);        
        }
    }//GEN-LAST:event_calculatorFactorialButtonActionPerformed

    private void calculatorFloorButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorFloorButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorFloorButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.floor(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorFloorButtonActionPerformed

    private void calculatorCellingButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorCellingButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorCellingButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.ceil(";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorCellingButtonActionPerformed

    private void calculatorPiButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorPiButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorPiButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.PI";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorPiButtonActionPerformed

    private void calculator10ToThePowerXButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculator10ToThePowerXButtonActionPerformed
    {//GEN-HEADEREND:event_calculator10ToThePowerXButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = "Math.pow(10,";
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculator10ToThePowerXButtonActionPerformed

    private void calculatorAnswerButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorAnswerButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorAnswerButtonActionPerformed
        // TODO add your handling code here:
        String s1 = calculatorInputTextField.getText();
        String s2 = calculatorOutputTextField.getText();
        String s3 = s1+s2;
        calculatorInputTextField.setText(s3);
    }//GEN-LAST:event_calculatorAnswerButtonActionPerformed

    private void calculatorBackToMenuButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorBackToMenuButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorBackToMenuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu object = new Menu();
        object.setVisible(true);
    }//GEN-LAST:event_calculatorBackToMenuButtonActionPerformed

    private void calculatorHyperbolicSineInverseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorHyperbolicSineInverseButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorHyperbolicSineInverseButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            asinhInverseSet();
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_calculatorHyperbolicSineInverseButtonActionPerformed

    private void calculatorHyperbolicCosineInverseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorHyperbolicCosineInverseButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorHyperbolicCosineInverseButtonActionPerformed
        // TODO add your handling code here:
                try
        {
            acoshInverseSet();
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_calculatorHyperbolicCosineInverseButtonActionPerformed

    private void calculatorHyperbolicTangentInverseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculatorHyperbolicTangentInverseButtonActionPerformed
    {//GEN-HEADEREND:event_calculatorHyperbolicTangentInverseButtonActionPerformed
        // TODO add your handling code here:
                try
        {
            atanhInverseSet();
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_calculatorHyperbolicTangentInverseButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CALCULATOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculator10ToThePowerXButton;
    private javax.swing.JButton calculatorAnswerButton;
    private javax.swing.JButton calculatorBackToMenuButton;
    private javax.swing.JButton calculatorBackspaceButton;
    private javax.swing.JButton calculatorCellingButton;
    private javax.swing.JButton calculatorClearButton;
    private javax.swing.JButton calculatorCommaButton;
    private javax.swing.JButton calculatorCosineButton;
    private javax.swing.JButton calculatorCosineInverseButton;
    private javax.swing.JButton calculatorCubicRootButton;
    private javax.swing.JButton calculatorDecimalPointButton;
    private javax.swing.JButton calculatorDivideButton;
    private javax.swing.JButton calculatorEToThePowerYButton;
    private javax.swing.JButton calculatorEightButton;
    private javax.swing.JButton calculatorEndingBracketButton;
    private javax.swing.JButton calculatorEqualButton;
    private javax.swing.JButton calculatorFactorialButton;
    private javax.swing.JButton calculatorFiveButton;
    private javax.swing.JButton calculatorFloorButton;
    private javax.swing.JButton calculatorFourButton;
    private javax.swing.JButton calculatorHyperbolicCosineButton;
    private javax.swing.JButton calculatorHyperbolicCosineInverseButton;
    private javax.swing.JButton calculatorHyperbolicSineButton;
    private javax.swing.JButton calculatorHyperbolicSineInverseButton;
    private javax.swing.JButton calculatorHyperbolicTangentButton;
    private javax.swing.JButton calculatorHyperbolicTangentInverseButton;
    private javax.swing.JTextField calculatorInputTextField;
    private javax.swing.JButton calculatorLogBase10Button;
    private javax.swing.JButton calculatorLogBaseEButton;
    private javax.swing.JButton calculatorMinusButton;
    private javax.swing.JButton calculatorMultiplyButton;
    private javax.swing.JButton calculatorNineButton;
    private javax.swing.JButton calculatorOneButton;
    private javax.swing.JTextField calculatorOutputTextField;
    private javax.swing.JButton calculatorPiButton;
    private javax.swing.JButton calculatorPlusButton;
    private javax.swing.JButton calculatorRandomButton;
    private javax.swing.JButton calculatorSevenButton;
    private javax.swing.JButton calculatorSineButton;
    private javax.swing.JButton calculatorSineInverseButton;
    private javax.swing.JButton calculatorSixButton;
    private javax.swing.JButton calculatorSquareRootButton;
    private javax.swing.JButton calculatorStartingBracketButton;
    private javax.swing.JButton calculatorTangentButton;
    private javax.swing.JButton calculatorTangentInverseButton;
    private javax.swing.JButton calculatorThreeButton;
    private javax.swing.JButton calculatorTwoButton;
    private javax.swing.JButton calculatorXToThePowerYButton;
    private javax.swing.JButton calculatorZeroButton;
    // End of variables declaration//GEN-END:variables
}
