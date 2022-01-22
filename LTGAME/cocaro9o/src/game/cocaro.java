package game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.NullPointerException;

public class cocaro {
    public static int sec =0;
    private static Timer  timer = new Timer();
    private static JLabel jbTime;
    private static Board board;
    private static JButton btnStart;
    public static void main(String[] args) {
        
        
        //int  choice = JOptionPane.showConfirmDialog(null,"Người chơi 0 đi trước đúng không " ,"Ai là người đi trước? " ,JOptionPane.YES_NO_OPTION );
        Board board = new Board();
        // if(choice==0)
        // {
        //     //no
        //     board = new Board(Cell.O_VALUE);
        // }
        // else{
        //     board = new Board(Cell.X_VALUE);

        // }
        
        
        JPanel jPanel = new JPanel();

        BoxLayout boxLayout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(boxLayout);

        board.setPreferredSize(new Dimension(300,300));

        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 0,0);

        JPanel bottomJPanel = new JPanel();
        bottomJPanel.setLayout(flowLayout);
        //bottomJPanel.setPreferredSize(new Dimension(300,50));
        

         btnStart = new JButton("Start");

        jbTime = new JLabel("0:0");
        bottomJPanel.add(jbTime);
        bottomJPanel.add(btnStart);

        btnStart.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                startGame();
            }
        });    
            


        jPanel.add(board);
        jPanel.add(bottomJPanel);
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame jFrame = new JFrame("cocaro");
        
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(true );
        jFrame.add(jPanel);

        int x = (int) dimension.getWidth() / 2-(jFrame.getWidth()/2);
        int y = (int) dimension.getHeight() / 2 -(jFrame.getHeight()/2);

        jFrame.setLocation(x, y);


        jFrame.pack();
        jFrame.setVisible(true);
    }

    private static void startGame()
    {
        //hoi ai di truoc 
        int  choice = JOptionPane.showConfirmDialog(null,"Người chơi 0 đi trước đúng không " ,"Ai là người đi trước? " ,JOptionPane.YES_NO_OPTION );
        String currentPlayer = (choice==0)? Cell.X_VALUE : Cell.O_VALUE;
        board.seCurrentPlayer(currentPlayer);


        //dem nguoc
        sec = 0;
        jbTime.setText("0:0");
        timer.cancel();
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()
         {
                       @Override
                        public void run() {
                            sec++;
                           String value = sec/60 +":"+ sec%60;
                           jbTime.setText(value);

                        }
         },1000,1000);

    }
}

    
    


