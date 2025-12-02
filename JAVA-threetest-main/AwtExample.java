import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.FlowLayout;     // All of these classes are from java.awt
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtExample extends Frame {

    private Label label;
    private Button button;
    private int count = 0;

    public AwtExample() {
        super("AWT Window Example");

        // Set layout manager
        setLayout(new FlowLayout());

        label = new Label("Button clicked 0 times");
        button = new Button("Click Me");

        // Register button click event (lambda expression)
        button.addActionListener(e -> {
            count++;
            label.setText("Button clicked " + count + " times");
        });

        add(label);
        add(button);

        setSize(300, 150);
        setLocationRelativeTo(null); // Center window

        // Exit the program when window is closed
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AwtExample();
    }
}
