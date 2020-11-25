import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MilanMadrid extends JFrame {

    JButton MilanBut = new JButton("AC Milan");//�������� ������
    JButton MadridBut = new JButton("Real Madrid");
    JLabel Result = new JLabel("Result: 0 X 0");//�������� ��������
    JLabel lastScore = new JLabel("Last Scorer: N/A");
    JLabel Winner = new JLabel("Winner: DRAW");

    MilanMadrid(Score score) 
    {
        super("Score");
        
        JPanel[] pnl = new JPanel[9];// �������� ������� ������ �� 9 ���������
        
        setLayout(new GridLayout(3, 3));//����� ��� ����������
        //GridLayout �������� ��� ������������ ����� � ���� �������

        for (int i = 0; i < pnl.length; i++) //���������� ��������
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        
        MilanBut.addActionListener(new ActionListener()//�� ��������� � ������ ����������
        {
            @Override
            public void actionPerformed(ActionEvent e) //�������� ������������ ��� ����������� ������� 
            {
                score.IncMilan();
                Result.setText(score.GetScore());
                lastScore.setText(score.GetLast());
                Winner.setText(score.GetWinner());

            }
        });
        
        MadridBut.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                score.IncMadrid();
                Result.setText(score.GetScore());
                lastScore.setText(score.GetLast());
                Winner.setText(score.GetWinner());
            }
        });

        setSize(400, 300);//��������� ��������
        
        pnl[0].add(MilanBut);//���������� ������ � �������� �� ������
        pnl[2].add(MadridBut);
        pnl[4].add(Result);
        pnl[6].add(lastScore);
        pnl[8].add(Winner);
        
        setVisible(true);
    }
}