import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Interface Gráfica");
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Olá, mundo!");
        JButton button = new JButton("Clique Aqui");

        button.addActionListener(e -> {
            label.setText("Botão clicado!");
        });

        panel.add(label);
        panel.add(button);
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
