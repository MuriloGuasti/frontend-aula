import java.awt.*;
import javax.swing.*;

public class LoginJFrame extends JFrame
{
    private final JLabel labelLogin;
    private final JLabel labelSenha;
    private final JLabel labelNot;
    private final JTextField textFieldLogin;
    private final JPasswordField textFieldSenha;
    private final JButton btnEnter;

    public LoginJFrame()
    {
        super("Tela de Login");
        setLayout(new FlowLayout());

        labelLogin = new JLabel("Digite Seu Login: ", SwingConstants.CENTER);
        labelLogin.setToolTipText("Login");
        add(labelLogin);

        textFieldLogin = new JTextField(10);
        add(textFieldLogin);

        labelSenha = new JLabel("Digite Sua Senha: ", SwingConstants.CENTER);
        add(labelSenha);

        textFieldSenha = new JPasswordField(10);
        add(textFieldSenha);

        btnEnter = new JButton("Entrar");
        add(btnEnter);

        labelNot = new JLabel("Notificação", SwingConstants.CENTER);
        add(labelNot);

        MySQLConnector.conectar();
    }
    public static void main(String[] args) {
        LoginJFrame loginJFrame = new LoginJFrame();
        loginJFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}