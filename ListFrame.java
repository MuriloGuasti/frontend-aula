import java.awt.*;
import javax.swing.*;
import javax.swing.event.*; // bibliotecas

public class ListFrame extends JFrame //herança
{
   private final JList<String> colorJList; //Variaveis
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
      "Orange", "Pink", "Red", "White", "Yellow"}; //Matriz do nome das cores
   private static final Color[] colors = {Color.BLACK, Color.BLUE,
      Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, 
      Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
      Color.RED, Color.WHITE, Color.YELLOW}; //Matriz das cores

   private final JList<String> sizeJList;
   private static final String[] sizeNames = {"Small", "Medium", "Big",}; //Matriz dos Tamanhos

   public ListFrame()
   {
      super("List Test"); //titulo
      setLayout(new FlowLayout()); //Layout

      colorJList = new JList<String>(colorNames);
      colorJList.setVisibleRowCount(5); //Maximo de opçoes por Row / Scroll
      
      colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //Uma seleção apenas

      add(new JScrollPane(colorJList)); //Adicionar

      sizeJList = new JList<String>(sizeNames);
      sizeJList.setVisibleRowCount(5);
      sizeJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      add(new JScrollPane(sizeJList)); //Visivl os Rows (5)

      colorJList.addListSelectionListener(
         new ListSelectionListener()
         {   
            @Override
            public void valueChanged(ListSelectionEvent event)
            {
               getContentPane().setBackground(
                  colors[colorJList.getSelectedIndex()]); //Muda a cor do Background
            } 
         } 
      );
      
      sizeJList.addListSelectionListener(
         new ListSelectionListener()  //para mudar o tamnho
         {
            @Override
            public void valueChanged(ListSelectionEvent event)
            {
               switch (sizeJList.getSelectedIndex()) { //tamanhos ==
                  case 0:
                     setSize(350, 150);
                     break;
               
                  case 1:
                     setSize(550, 350);
                     break;
                  
                  case 2:
                     setSize(750, 550);
                     break;
                  
                  default:
                     setSize(350, 150);
                     break;
               }
            }
         }
      );
   }
}