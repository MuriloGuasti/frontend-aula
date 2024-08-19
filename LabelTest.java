/**
 * import: Importa a biblioteca
 * javax: Biblioteca virtual
 * swing: metodo
 * JFrame: Componente
 * public: Cria classe publica para poderem modificar ou visualizar
 * class: mostra que é uma classe
 * LabelTest: nome da classe
 */
 import javax.swing.JFrame; 

public class LabelTest 
{
   /**
    * static: objeto estatico, texto e etc
    * void: sem retorno
    * main: método de execução
    * String: texto ou frase
    * args: objeto
    */
   public static void main(String[] args)
   { 
      /**
       * LabelFrame: Nome
       * labelFrame: Variavel
       * LabelFrame(): Construtor
       * setDefaultCloseOperation: define qual o procedimento que ao fechar irá acontecer
       * ( parênteses ): Definir parâmetros
       * . : invocar método
       * setSize: Descrever caracteristicas de tamanho
       * setVisible: decifrara se é visivel ou não
       * true: verdadeiro
       * ; : finalizar linha de código
       * width: largura
       * height: tamanho
       */
      LabelFrame labelFrame = new LabelFrame(); 
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      labelFrame.setSize(360, 280); 
      labelFrame.setVisible(true); 
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
