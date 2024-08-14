/**
 * import: traz da biblioteca 
 * public: exporta para que todos possam ver e usar como objeto/variação e etc
 * class: nomeia o objeto
 * Addition: nome da public class
 */
import javax.swing.JOptionPane;  // javax: biblioteca visual
                                 // swing: modulo
                                 // JOptionPane: componente
public class Addition 
{ 
   public static void main(String[] args)
   /**  (abrir chave): serve para iniciar uma ação/comando/tarefa (no caso a Addition)
   * static: algo que serve só pra leitura
   * void: algo que n vai ser valor
   * main: inicia o comando
   * args: objeto
   * String: texto
   * firstNumber: nome da Variavel onde terá um espaço para digitar algo
   * JOptionPane: nome da biblioteca importada
   * . (ponto): invocar o método
   * showinputDialog: função qual irá mostrar um uma caixa para receber dados
   * ( ("abrir" parênteses): Declara o inicio do parâmetro
   * ) ("fechar" parênteses): Declara o fechamento do parâmetro 
   * message: serve para escolher oq quer mostrar, no caso uma mensagem na tela
   * secondNumber: nome da Variavel onde terá um espaço para digitar algo
   * ; (ponto e vírgula): finalizar a linha de comando
   */
   { // Esse abrir chave é para iniciar a ação/comando da: public class Addition
      String firstNumber = 
         JOptionPane.showInputDialog("Enter first integer");
      String secondNumber =
         JOptionPane.showInputDialog("Enter second integer");
      /**
       * int: como vai ser a variavel, no caso int = numero inteiro 
       * number1: espaço onde oque for digitado no firstNumber sera guardado, igual uma prateleira
       * Interger: vai ver se o numero digitado é inteiro
       * parseInt: interpreta o valor inteiro
       * number2: espaço onde oque for digitado no secondNumber sera guardado, igual uma prateleira
       */ 
      int number1 = Integer.parseInt(firstNumber); 
      int number2 = Integer.parseInt(secondNumber);
      /**
       * sum: soma dois valores
       * +: fica entre os dois valores onde quer ser somados
       */ 
      int sum = number1 + number2;
      /**
       * showMassageDialog: uma mensagem da escolha do Dev ira aparecer na tela
       * parentComponent: orienta o dialogo sequente para qual "caixa" ele ira aparacer
       * null: sem nada no espaço
       * , (vírgula): senão...
       * "(Aspas)": texto que quer ser mostrado
       * + sum: quando colocado fora das "Aspas", ira aparecer como texto o resultado da sum 
       */
      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
         /**
          * title: define qual o titulo do programa
          * PLAIN_MESSAGE: tipo de caixa onde irá ter os espaços para digitar, textos, botões e etc
          */
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
