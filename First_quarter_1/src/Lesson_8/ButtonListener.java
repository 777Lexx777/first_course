package Lesson_8;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ButtonListener implements ActionListener{
    private final JTextField inputField;
    private final StringBuilder sb = new StringBuilder();

    public ButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }
@Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton)e.getSource();
        this.sb.append(this.inputField.getText()).append(jButton.getText());
        this.inputField.setText(this.sb.toString());
        this.sb.setLength(0);
    }
}
