import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AvatarGame extends JPanel implements ActionListener {

    private int x = 150;
    private int y = 150;
    private int speed = 5;

    private boolean leftPressed = false;
    private boolean rightPressed = false;
    private boolean upPressed = false;
    private boolean downPressed = false;

    // Khai báo biến chứa hình ảnh nhân vật
    private Image playerImage;

    public AvatarGame() {
        // Tải hình ảnh từ file player.png
        // Nếu ảnh không hiển thị, hãy kiểm tra lại vị trí đặt file ảnh nhé!
        ImageIcon icon = new ImageIcon("player.png");
        playerImage = icon.getImage();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT) leftPressed = true;
                if (key == KeyEvent.VK_RIGHT) rightPressed = true;
                if (key == KeyEvent.VK_UP) upPressed = true;
                if (key == KeyEvent.VK_DOWN) downPressed = true;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT) leftPressed = false;
                if (key == KeyEvent.VK_RIGHT) rightPressed = false;
                if (key == KeyEvent.VK_UP) upPressed = false;
                if (key == KeyEvent.VK_DOWN) downPressed = false;
            }
        });

        setFocusable(true);
        Timer timer = new Timer(16, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.decode("#90EE90"));

        // Vẽ ảnh nhân vật thay cho hình tròn
        // g.drawImage cần truyền vào: Ảnh, tọa độ X, tọa độ Y, và bộ quan sát (cứ để null)
        if (playerImage != null) {
            g.drawImage(playerImage, x, y, null);
        } else {
            // Nếu không tìm thấy ảnh, vẽ tạm hình vuông báo lỗi
            g.setColor(Color.BLACK);
            g.fillRect(x, y, 40, 40);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (leftPressed) x -= speed;
        if (rightPressed) x += speed;
        if (upPressed) y -= speed;
        if (downPressed) y += speed;

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Avatar 2D - Hiển thị Nhân vật");
        AvatarGame gamePanel = new AvatarGame();
        frame.add(gamePanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        gamePanel.requestFocusInWindow();
    }
}