package game;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.event.MouseAdapter;
import java.lang.NullPointerException;

public class Board extends JPanel {
    private static final int N =3;
    private static final int M = 3;

    private Image imgX ;
    private Image imgO ;
    private Cell matrix[][] = new Cell [N][M]  ;
    private String currentPlayer = Cell.EMPTY_VALUE;

    public Board(String player)
    {
        this();
        this.currentPlayer = player;
    }
    public Board()
    {
        this.iniMatrix();
       
        addMouseListener((MouseAdapter) mousePressed(e) -> {
            
                super.mousePressed(e);
                int x = e.getX();
                int y = e.getY();
                soundClick();
                if(currentPlayer.equals(Cell.EMPTY_VALUE))
                {
                    return;
                }
               
                //phat ra am thanh
                

                for(int i =0 ;i<N;i++)
            {
                     for(int j =0;j<M;j++)
                {
                    Cell cell = matrix[i][j];

                    int cXStart = cell.getX();
                    int cYStart = cell.getY();

                    int cXEnd = cXStart + cell.getW();
                    int cYEnd = cYStart + cell.getH();
                    if((x>=cXStart && x<=cXEnd) && (y>=cYStart && y<=cYEnd))
                    {
                        if(cell.getValue().equals(Cell.EMPTY_VALUE))
                        {
                            
                            cell.setValue(currentPlayer);
                            repaint();
                            currentPlayer = currentPlayer.equals(Cell.O_VALUE)? Cell.X_VALUE : Cell.O_VALUE; 
                            
                        }
                        
                    }

                    
                    
                 }
             }
            
        });
    

        try{
            imgO = ImageIO.read(getClass().getResource("o.png"));
            imgX = ImageIO.read(getClass().getResource("x.png"));

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    private void iniMatrix()
    {
         //khoi tao matrix
         for(int i =0 ;i<N;i++)
         {
             for(int j =0;j<M;j++)
             {
                 Cell cell = new  Cell();
                 matrix[i][j] = cell;

                 
             }
         }

    }
    public void seCurrentPlayer(String currentPlayer)
    {
        this.currentPlayer = currentPlayer;
    }

    private synchronized void  soundClick()
    {
        Thread thread = new Thread(new Runnable(){
        @Override
        public void run(){
            try{
            Clip clip = AudioSystem.getClip();
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("Mousclik.wav"));
            clip.open(audioInputStream);
            clip.start();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        }
        
    });
    thread.start();
}


    @Override
    public void paint(Graphics g) {
        int w = getWidth() / 3;
        int h = getHeight() / 3;
        
        
        Graphics2D graphic2d = (Graphics2D) g;
        int k =0;
        for (int i =0; i<N ; i++)
        {
            for(int j =0 ; j<M ; j++)
            {
                int x = j*w;
                int y = i*h;

                
                Cell cell = matrix[i][j];
                cell.setY(y);
                cell.setX(x);
                cell.setH(h);
                cell.setW(w);


                Color color = k%2 == 0 ? Color.WHITE : Color.PINK;
                graphic2d.setColor(color);
                graphic2d.fillRect(x, y, w, h);

               if(cell.getValue().equals(Cell.X_VALUE))
               {
                   Image img = imgX;
                    graphic2d.drawImage(img, x, y, w, h, this);

               }
               else if(cell.getValue().equals(Cell. O_VALUE))
               {
                Image img = imgO;
                graphic2d.drawImage(img, x, y, w, h, this);

               }

                //Image img = k%2 ==0 ? imgX : imgO;
                //graphic2d.drawImage(img, x, y, w, h, this);
                k++;
            }
        }
    }
   
}
