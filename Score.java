public class Score 
{
    private int ScoreMilan;//���������� ����� �����
    private int ScoreMadrid;//���������� ����� ������
    private String last = "DRAW";

    Score() 
    {
        this.ScoreMadrid = 0;
        this.ScoreMilan = 0;
    }

    public void SetMilan(int x) 
    {
        this.ScoreMilan = x;
    }

    public void SetMadrid(int x) 
    {
        this.ScoreMadrid = x;
    }

    public int GetMilan() 
    {
        return this.ScoreMilan;
    }

    public int GetMadrid() 
    {
        return this.ScoreMadrid;
    }

    public void IncMadrid() //��� ����������� � ����� � ���������� ���������� ����� ��������� �������� ������� ������� 
    {
        this.ScoreMadrid++;
        this.last = "Madrid";
    }

    public void IncMilan() 
    {
        this.ScoreMilan++;
        this.last = "Milan";
    }
    
    public String GetWinner() //��� ����������� ��� ���������� ��� ������
    {
        if (this.ScoreMilan > this.ScoreMadrid) 
        {
            return "Winner: Milan";
        }
        if (this.ScoreMilan < this.ScoreMadrid) 
        {
            return "Winner: Madrid";
        } else {
            return "Winner: DRAW";
        }
    }

    public String GetLast() 
    {
        return "Last Scorer: " + this.last;// ����� ��������� �������� �������
    }

    public String GetScore() 
    {
        return "Result: " + this.ScoreMilan + " X " + this.ScoreMadrid;//����� ����� ������
    }
}