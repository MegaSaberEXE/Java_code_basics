package javaswingtutorial9;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextArea extends JFrame {
public TextArea() {
setTitle("JTextArea");
setDefaultCloseOperation(EXIT_ON_CLOSE);
JPanel panel = new JPanel();
panel.setLayout(new BorderLayout());
panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
JScrollPane pane = new JScrollPane();
JTextArea area = new JTextArea();
area.setLineWrap(true);
area.setWrapStyleWord(true);
area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
pane.getViewport().add(area);
panel.add(pane);
add(panel);
setSize(new Dimension(350, 300));
setLocationRelativeTo(null);
setVisible(true);
}
public static void main(String[] args) {
new TextArea();
}
}