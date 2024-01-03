package oops.java.program;

public class LearnStatickeyword2 {
    static int totalProfe = 0 ;
    static String univName = "AKTU";
    
    int profeID;
    String subject;
    
    static {
    	System.out.println("Total Number OF Professor " +totalProfe);
    }
    
    {
    	totalProfe+=1;
    	profeID = totalProfe;
    	System.out.println("Hiring a new Professor");
    }
    
    public static int getTotalProfe() {
    	return totalProfe;
    }
	
    public void teach() {
    	System.out.println("Professor ID " +profeID +" teaching Subject "+subject);
    }
    
    public LearnStatickeyword2(String subject) {
    	this.subject = subject; 
    }
    
	public static void main(String[] args) {
		System.out.println("Total Professor "+LearnStatickeyword2.getTotalProfe());
		System.out.println("---------------------------------");
		LearnStatickeyword2 profess = new LearnStatickeyword2("Java");
		profess.teach();
		LearnStatickeyword2 profess2 = new LearnStatickeyword2("SQL");
		profess2.teach();
		System.out.println("===================================");
		System.out.println("Total Professor "+LearnStatickeyword2.getTotalProfe());
	}

}
