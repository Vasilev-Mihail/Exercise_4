public class Score 
{
    private int ScoreMilan;//переменная счета милан
    private int ScoreMadrid;//переменная счета мадрид
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

    public void IncMadrid() //для прибавления к счету и присваения переменной имени последней забившей команды команды 
    {
        this.ScoreMadrid++;
        this.last = "Madrid";
    }

    public void IncMilan() 
    {
        this.ScoreMilan++;
        this.last = "Milan";
    }
    
    public String GetWinner() //для определения кто победитель или ничьей
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
        return "Last Scorer: " + this.last;// вывод последней забившей команды
    }

    public String GetScore() 
    {
        return "Result: " + this.ScoreMilan + " X " + this.ScoreMadrid;//вывод счета команд
    }
}