import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Importa a biblioteca

public class RadioButtonFrame extends JFrame //cria a classe
{
   //cria as variaveis
   private JTextField textField; 
   private Font plainFont; 
   private Font boldFont; 
   private Font italicFont; 
   private Font boldItalicFont; 

   private Color blueColor; 
   private Color redColor; 
   private Color yellowColor; 
   private Color blackColor; 

   private JRadioButton plainJRadioButton;    
   private JRadioButton boldJRadioButton; 
   private JRadioButton italicJRadioButton;
   private JRadioButton boldItalicJRadioButton;
   private ButtonGroup radioGroup; 

   private JRadioButton blueJRadioButton; 
   private JRadioButton redJRadioButton; 
   private JRadioButton yellowJRadioButton;
   private JRadioButton blackJRadioButton;
   private ButtonGroup colorRadioGroup; 

   public RadioButtonFrame() //inicia um método do construtor
   {
      super("RadioButton Test"); //titulo
      setLayout(new FlowLayout()); //Layout Flow

      textField = new JTextField("Watch the font style change", 25); //Campo de digitação e tamanho do mesmo (25)
      add(textField);

      plainJRadioButton = new JRadioButton("Plain", true); //Botão para deixar normal
      boldJRadioButton = new JRadioButton("Bold", false); //Botão para deixar Bold / Negrito
      italicJRadioButton = new JRadioButton("Italic", false); //Botão para deixar Italic / Italico
      boldItalicJRadioButton = new JRadioButton("Bold/Italic", false); //Botão para deixar Bold e Italic
      add(plainJRadioButton); //add eles
      add(boldJRadioButton);  // =
      add(italicJRadioButton); // =
      add(boldItalicJRadioButton); // =

      radioGroup = new ButtonGroup(); // deixa marcar apenas 1
      radioGroup.add(plainJRadioButton);
      radioGroup.add(boldJRadioButton);
      radioGroup.add(italicJRadioButton); 
      radioGroup.add(boldItalicJRadioButton); 

      blueJRadioButton = new JRadioButton("Blue", true); //Botão para Azul
      redJRadioButton = new JRadioButton("Red", false); //Botão para deixar Vermelho
      yellowJRadioButton = new JRadioButton("Yellow", false); //Botão para deixar Amarelo
      blackJRadioButton = new JRadioButton("Black", false); //Botão para deixar Preto
      add(blueJRadioButton); //add eles
      add(redJRadioButton);  // =
      add(yellowJRadioButton); // =
      add(blackJRadioButton); // =

      colorRadioGroup = new ButtonGroup(); // deixa marcar apenas 1
      colorRadioGroup.add(blueJRadioButton);
      colorRadioGroup.add(redJRadioButton);
      colorRadioGroup.add(yellowJRadioButton); 
      colorRadioGroup.add(blackJRadioButton); 

      plainFont = new Font("Serif", Font.PLAIN, 14);
      boldFont = new Font("Serif", Font.BOLD, 14);
      italicFont = new Font("Serif", Font.ITALIC, 14);
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      textField.setFont(plainFont); // define as fontes

      blueColor = new Color(0,0,255);
      redColor = new Color(255,0,0);
      yellowColor = new Color(255,255,0);
      blackColor = new Color(0,0,0);

      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont)); // deixa eles serem Manipulados

      blueJRadioButton.addItemListener(
         new ColorRadioButtonHandler(blueColor));
      redJRadioButton.addItemListener(
         new ColorRadioButtonHandler(redColor));
      yellowJRadioButton.addItemListener(
         new ColorRadioButtonHandler(yellowColor));
      blackJRadioButton.addItemListener(
         new ColorRadioButtonHandler(blackColor));
   }

   private class RadioButtonHandler implements ItemListener //leva paa o construtor qual vai ser a fonte que ele quer usar
   {
      private Font font;

      public RadioButtonHandler(Font f)
      {
         font = f; 
      }

      @Override
      public void itemStateChanged(ItemEvent event) // usa a fonte
      {
         textField.setFont(font); 
      } 
   }    
      private class ColorRadioButtonHandler implements ItemListener //leva paa o construtor qual vai ser a fonte que ele quer usar
   {
      private Color color;

      public ColorRadioButtonHandler(Color c)
      {
         color = c;
      }
      @Override
      public void itemStateChanged(ItemEvent event) // usa a fonte
      {
         textField.setForeground(color); 
      }
   } 
}   