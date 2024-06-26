package Items;

import java.util.HashMap;



public class Transcript {
	
    private HashMap<Subject, Mark> pair = new HashMap<Subject, Mark>();
    
   
    public Transcript() {}
    
    
    
    public void addTranscript(Subject subject, Mark mark) {
    	pair.put(subject, mark);
    }
	
    /**
	* Method showing GPA
	*/
    public String showGPA() {
	    System.out.println(" ");

	    System.out.println("---------------|TOTAL GPA|-----------------");

		double sum = 0;
		int cnt = 0;
        for (HashMap.Entry<Subject, Mark> i: pair.entrySet())
        {
			Mark mark = i.getValue();
			sum += mark.getGPA();
			cnt++;
		}
        return "-------------------" + (sum / cnt) + "-------------------";

    }

	public double showDoubleGPA() {
		double sum = 0;
		int cnt = 0;
		for (HashMap.Entry<Subject, Mark> i: pair.entrySet())
		{
			Mark mark = i.getValue();
			sum += mark.getGPA();
			cnt++;
		}
		return (sum / cnt);
	}
    

	public String toString()
	{
	    System.out.println("---------------|TRANSCRIPT|-----------------");

		StringBuilder str = new StringBuilder();
		for (HashMap.Entry<Subject, Mark> i: pair.entrySet())
		{
			Mark mark = i.getValue();
			Subject subject = i.getKey();
            str.append(subject.toString()).append(mark.toString()).append("\n");
		}
		return str.toString();
	}
	
}
