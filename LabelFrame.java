/**
 * import: trazer biblioteca virtual
 * carrega todos os componentes de módulo swing da biblioteca javax
 */
import java.awt.*;
import javax.swing.*; //.*: carrega todos os componentes de módulo swing da biblioteca javax

// extends: herdou um componente
public class LabelFrame extends JFrame 
{
   // private: variavel privada
   // final: somente leitura
   private final JLabel label1;
   private final JLabel label2;
   private final JLabel label3; 

    // LabelFrame(): construtor
    public LabelFrame()
   {
      super("Testing JLabel");
      setLayout(new FlowLayout()); 
      /** super: titulo superior
      * setLayout: metodo do JFrame para definir o Layout para...
      * new: para receber um parametro de objeto
      * FlowLayout(): o estilo do Layout livre (do jeito que a gente quer)
      * = : Atribuindo
      * setToolTipText: ao passar o mouse em cima ira aparecer algo
      * add: adiciona variavel 
      */
      label1 = new JLabel("Label with text");
      label1.setToolTipText("This is label1");
      add(label1);

      /**
       * Icon: definição de tipo icone
       * getClass: invoca a classe do JFrame
       * getResource: pega um recurso: foto, video, icone e etc (no caso o "bug1.png")
       * SwingConstants: Define o estilo de onde ira aparecer na linha, (Formatação)
       */
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
      label2 = new JLabel("Label with text and icon", bug, 
         SwingConstants.LEFT);
      label2.setToolTipText("This is label2");
      add(label2);

      /**
       * setText: define como texto
       * setIcon: define como icon
       * setHorizontalTextPosition: define a posição horizontal
       * setVerticalTextPosition: define a posição Vertical 
       */
      label3 = new JLabel();
      label3.setText("Label with icon and text at bottom");
      label3.setIcon(bug);
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      label3.setToolTipText("This is label3");
      add(label3);
   } 
}


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
