package javaswingtutorial1;

/**
import java.awt.EventQueue;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TooltipEx extends JFrame{
    
    public TooltipEx() {
        initUI();
    }
    
    private void initUI() {
        
        JButton btn = new JButton("Button");
        btn.setToolTipText("A button component");
        
        createLayout(btn);
        
        setTitle("Tooltip");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void createLayout(JComponent... arg) {
        
        JPanel pane = (JPanel) getContentPane();
        GroupLayout g1 = new GroupLayout(pane);
        pane.setLayout(g1);
        
        pane.setToolTipText("Content pane");
        
        g1.setAutoCreateContainerGaps(true);
        g1.setHorizontalGroup(g1.createSequentialGroup().addComponent(arg[0]).addGap(200));
        g1.setVerticalGroup(g1.createSequentialGroup().addComponent(arg[0]).addGap(200));
        pack();
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() ->{
            TooltipEx ex = new TooltipEx();
            ex.setVisible(true);
        });
    }
}
*/


// Swing tooltip