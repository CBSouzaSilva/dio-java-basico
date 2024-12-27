import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DroneController {

    // Estado atual do drone
    private int x = 0;
    private int y = 0;
    private int altitude = 0;

    // Move o drone em uma direção específica
    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                altitude += 1;
                break;
            case "down":
                if (altitude > 0) {
                    altitude -= 1;
                }
                break;
            case "forward":
                y += 1;
                break;
            case "backward":
                y -= 1;
                break;
            case "left":
                x -= 1;
                break;
            case "right":
                x += 1;
                break;
        }
    }

    // Exibe o estado atual do drone
    public String getStatus() {
        return "Posição: (" + x + ", " + y + ")\nAltitude: " + altitude;
    }

    public static void main(String[] args) {
        DroneController drone = new DroneController();

        // Cria a interface gráfica
        JFrame frame = new JFrame("Controlador de Drone");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Área de status
        JTextArea statusArea = new JTextArea();
        statusArea.setEditable(false);
        statusArea.setText(drone.getStatus());
        frame.add(new JScrollPane(statusArea), BorderLayout.CENTER);

        // Painel de botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));

        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton forwardButton = new JButton("Forward");
        JButton backwardButton = new JButton("Backward");
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        JButton statusButton = new JButton("Status");

        buttonPanel.add(new JLabel(""));
        buttonPanel.add(upButton);
        buttonPanel.add(new JLabel(""));
        buttonPanel.add(leftButton);
        buttonPanel.add(statusButton);
        buttonPanel.add(rightButton);
        buttonPanel.add(new JLabel(""));
        buttonPanel.add(downButton);
        buttonPanel.add(new JLabel(""));

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Ações dos botões
        upButton.addActionListener(e -> {
            drone.move("up");
            statusArea.setText(drone.getStatus());
        });

        downButton.addActionListener(e -> {
            drone.move("down");
            statusArea.setText(drone.getStatus());
        });

        forwardButton.addActionListener(e -> {
            drone.move("forward");
            statusArea.setText(drone.getStatus());
        });

        backwardButton.addActionListener(e -> {
            drone.move("backward");
            statusArea.setText(drone.getStatus());
        });

        leftButton.addActionListener(e -> {
            drone.move("left");
            statusArea.setText(drone.getStatus());
        });

        rightButton.addActionListener(e -> {
            drone.move("right");
            statusArea.setText(drone.getStatus());
        });

        statusButton.addActionListener(e -> statusArea.setText(drone.getStatus()));

        frame.setVisible(true);
    }
}
