import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // Importação de biblioteca

public class MouseTrackerFrame extends JFrame //Craição de classe
{
   private final JPanel mousePanel;
   private final JLabel statusBar; // Variaveis

   public MouseTrackerFrame() //Método
   {
      super("Demonstrating Mouse Events"); //Titulo

      mousePanel = new JPanel(); 
      mousePanel.setBackground(Color.WHITE); //Cor do Background
      add(mousePanel, BorderLayout.CENTER); //Add Mouse panel

      statusBar = new JLabel("Mouse outside JPanel"); //Novo Método
      add(statusBar, BorderLayout.SOUTH); //Add Barra de Status

      MouseHandler handler = new MouseHandler();  //Adiciona uma ação
      mousePanel.addMouseListener(handler); 
      mousePanel.addMouseMotionListener(handler); 
   } 

   private class MouseHandler implements MouseListener, 
      MouseMotionListener  //Implementação de biblioteca
   {
      @Override
      public void mouseClicked(MouseEvent event)
      {
         statusBar.setText(String.format("Clicked at [%d, %d]", 
            event.getX(), event.getY())); //Ao ser clicado mostra XY
      } 

      @Override
      public void mousePressed(MouseEvent event)
      {
         statusBar.setText(String.format("Pressed at [%d, %d]", 
            event.getX(), event.getY()));//Foi pressionado, mostra XY
      }

      @Override
      public void mouseReleased(MouseEvent event)
      {
         statusBar.setText(String.format("Released at [%d, %d]", 
            event.getX(), event.getY())); //Foi soltado, mostra XY
      }

      @Override
      public void mouseEntered(MouseEvent event)
      {
         statusBar.setText(String.format("Mouse entered at [%d, %d]", 
            event.getX(), event.getY()));
         mousePanel.setBackground(Color.GREEN); //Entrou no Panel, mostra XY e fica Verde o fundo
      }

      @Override
      public void mouseExited(MouseEvent event)
      {
         statusBar.setText("Mouse outside JPanel");
         mousePanel.setBackground(Color.WHITE); // Mouse saiu, fica branco e n mostra XY
      }

      @Override
      public void mouseDragged(MouseEvent event)
      {
         statusBar.setText(String.format("Dragged at [%d, %d]", 
            event.getX(), event.getY())); //Pressionado arrastado mostra XY
      } 

      @Override
      public void mouseMoved(MouseEvent event)
      {
         statusBar.setText(String.format("Moved at [%d, %d]", 
            event.getX(), event.getY())); //Mouse mecheu, mostra XY
      } 
   }
}