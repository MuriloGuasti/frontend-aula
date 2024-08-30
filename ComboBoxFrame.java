import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Importação de biblioteca

public class ComboBoxFrame extends JFrame //Declaração de classe com heranca do JFrame
{
   private final JComboBox<String> imagesJComboBox; // Criação de váriaveis na classe
   private final JLabel label;
   private static final String[] names = 
      {"bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif", "muahaha.jpg"};
   private final Icon[] icons = { 
      new ImageIcon(getClass().getResource(names[0])),
      new ImageIcon(getClass().getResource(names[1])), 
      new ImageIcon(getClass().getResource(names[2])),
      new ImageIcon(getClass().getResource(names[3])),
      new ImageIcon(getClass().getResource(names[4]))}; // Declaração de váriaveis, de acordo com a ordem adicionadas das imagens

   public ComboBoxFrame() //método
   {
      super("Testing JComboBox");
      setLayout(new FlowLayout()); 

      imagesJComboBox = new JComboBox<String>(names); //Criação da JComboBox com maximo 3 Opçoes por Row, e ira aparecer o nome de cada imagem no JComboBox
      imagesJComboBox.setMaximumRowCount(3); 

      imagesJComboBox.addItemListener( //Irá poder fazer uma ação com a JComboBox
         new ItemListener()
         {
            @Override
            public void itemStateChanged(ItemEvent event) // Colocara a foto selecionada no JCombobox
            {
               if (event.getStateChange() == ItemEvent.SELECTED)
                  label.setIcon(icons[
                     imagesJComboBox.getSelectedIndex()]);
            } 
         }
      );

      add(imagesJComboBox); // Adiciona a Imagem selecionada
      label = new JLabel(icons[0]);
      add(label);
   }
}