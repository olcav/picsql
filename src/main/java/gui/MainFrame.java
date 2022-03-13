package gui;

import parser.SqlPicQueryParser;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class MainFrame {

  public void show() {
    JFrame frame = new JFrame("PicSQL Editor");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(900, 700);

    GridLayout experimentLayout = new GridLayout(0, 2);
    frame.setLayout(experimentLayout);

    SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
    TextArea area = new TextArea();
    area.setFont(new Font("Monospace", Font.PLAIN, 20));

    JPanel imagePanel = new JPanel();

    area.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {}

          @Override
          public void keyPressed(KeyEvent e) {
              imagePanel.removeAll();
          }

          @Override
          public void keyReleased(KeyEvent e) {
            loadPicture(sqlPicQueryParser, area, imagePanel);
          }
        });

    frame.getContentPane().add(area);
    frame.getContentPane().add(imagePanel);
    frame.setVisible(true);
  }

  private String text;

  private void loadPicture(SqlPicQueryParser sqlPicQueryParser, TextArea area, JPanel imagePanel) {
    try {
      if (!Objects.equals(text, area.getText())) {
          new Thread(() -> {
              BufferedImage bufferedImage = sqlPicQueryParser.parseToImage(area.getText());
              imagePanel.getGraphics().drawImage(bufferedImage, 0, 0, null);
          }).start();
      }
      text = area.getText();
    } catch (Exception ignored) {

    }
  }
}
