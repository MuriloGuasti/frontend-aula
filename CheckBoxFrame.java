import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.font.*;
import java.util.*;

public class CheckBoxFrame extends JFrame 
{
   private final JTextField textField; 
   private final JCheckBox boldJCheckBox; 
   private final JCheckBox italicJCheckBox; 
   private final JCheckBox underlineJCheckBox;

   public CheckBoxFrame()
   {
      super("JCheckBox Test");
      setLayout(new FlowLayout());

      textField = new JTextField("Watch the font style change", 20);
      textField.setFont(new Font("Serif", Font.PLAIN, 14));
      add(textField);

      boldJCheckBox = new JCheckBox("Bold"); 
      italicJCheckBox = new JCheckBox("Italic"); 
      underlineJCheckBox = new JCheckBox("Under Line");
      add(boldJCheckBox);
      add(italicJCheckBox);
      add(underlineJCheckBox);

      CheckBoxHandler handler = new CheckBoxHandler();
      boldJCheckBox.addItemListener(handler);
      italicJCheckBox.addItemListener(handler);
      underlineJCheckBox.addItemListener(handler);
   } 

   private class CheckBoxHandler implements ItemListener 
   {
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         Font font = null; {

         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
         else if (boldJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD, 14);
         else if (italicJCheckBox.isSelected())
            font = new Font("Serif", Font.ITALIC, 14);
         else
            font = new Font("Serif", Font.PLAIN, 14);
      }
      if (underlineJCheckBox.isSelected()) {
         font = textField.getFont();
         Map attributes = font.getAttributes();
         attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
         textField.setFont(font.deriveFont(attributes));
         font = new Font(attributes);
      }
         textField.setFont(font); 
      } 
   }
}