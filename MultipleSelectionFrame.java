import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // Importa a biblioteca

public class MultipleSelectionFrame extends JFrame //Criação de classe
{
   private final JList<String> colorJList; //Criação de Variaveis
   private final JList<String> copyJList; 
   private final JList<String> copyJList2; 
   private JButton copyJButton; 
   private JButton copyJButton2;
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"}; //Criação de Matriz

   public MultipleSelectionFrame() //Método
   {
      super("Multiple Selection Lists");
      setLayout(new FlowLayout()); //Layout

      colorJList = new JList<String>(colorNames);
      colorJList.setVisibleRowCount(5); // Maximo de opções visiveis por Row
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Modo de seleção
      add(new JScrollPane(colorJList));

      copyJButton = new JButton("Copy >>>"); 
      copyJButton.addActionListener(
         new ActionListener() //Vai ter alguma ação
         {
            @Override
            public void actionPerformed(ActionEvent event) 
            {
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0])); //Pega o valor selecionado
            }
         } 
      ); 

      add(copyJButton); //Adiciona o Botão

      copyJList = new JList<String>();
      copyJList.setVisibleRowCount(5); //Maximo de opções visiveis por Row
      copyJList.setFixedCellWidth(100); //Largura em Pixel
      copyJList.setFixedCellHeight(15); //Altura em Pixel
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION); // Mode de seleção
      add(new JScrollPane(copyJList)); //Adciona

      copyJButton2 = new JButton("Copy >>>"); 
      copyJButton2.addActionListener(
         new ActionListener() //Vai ter alguma ação
         {
            @Override
            public void actionPerformed(ActionEvent event) 
            {
               copyJList2.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0])); //Pega o valor selecionado
            }
         } 
      ); 

      add(copyJButton2); //Adiciona o Botão

      copyJList2 = new JList<String>();
      copyJList2.setVisibleRowCount(5); //Maximo de opções visiveis por Row
      copyJList2.setFixedCellWidth(100); //Largura em Pixel
      copyJList2.setFixedCellHeight(15); //Altura em Pixel
      copyJList2.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION); // Mode de seleção
      add(new JScrollPane(copyJList2)); //Adciona
   } 
}