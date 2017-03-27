/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportcard;
/**
 *
 * @author Noura
 */
public class ReportCard{
	
    private int mathGrade; 
    private int englishGrade;
    private int historyGrade; 
    private int geographyGrade; 
    private int physicsGrade;
    private int chemistryGrade;
    private int biologyGrade;
    private String Name ; 
    private String Section ; 
    private int Sum ; 
    private int fullTotal ;
    private double Percentage ;
/*-----------------Constructor-----------------*/
    public ReportCard (int math , int english , int history , int physics , int geography ,  
    int chemistry , int biology , String name , String section , int total ) 
	{
        mathGrade = math; 
        englishGrade = english;
        historyGrade = history; 
        geographyGrade = geography; 
        physicsGrade = physics;
        chemistryGrade = chemistry;
        biologyGrade = biology;
        Name = name; 
        Section = section; 
        Sum = 0 ; 
        fullTotal = total; 
        Percentage = 0.0; 		
    }
/*-----------------Gets methods-----------------*/
    public int getMathGrade(){
        return mathGrade; 
    }

    public int getEnglishGrade(){
        return englishGrade; 
    }

    public int getHistoryGrade(){
        return historyGrade; 
    }
 
    public int getGeographyGrade(){
        return geographyGrade;
    }

    public int getPhysicsGrade(){
        return physicsGrade;
    }

    public int getChemistryGrade(){
        return chemistryGrade;
    }

    public int getBiologyGrade(){
        return biologyGrade;  
    }

    public String getName(){
        return Name;   
    }

    public String getSection(){
        return Section;   
    }

    public double getSum(){
        Sum = mathGrade + physicsGrade + biologyGrade + englishGrade + 
		chemistryGrade + historyGrade + geographyGrade ; 
		return Sum;   
    }

    public int getFullTotal(){
		return fullTotal;  
	}
	
	public double getPercentage(){
		Percentage = (Sum / fullTotal) * 100; 
		return Percentage;  
	}
	
    public void setMathGrade(int math){
        mathGrade = math; 	
    }

    public void setEnglishGrade(int english){
		englishGrade = english;
	}

	public void setHistoryGrade(int history){
	historyGrade = history; 	
	}
	
	public void setGeographyGrade(int geography){
		geographyGrade = geography; 
	}
	
	public void setPhysicsGrade(int physics){
		physicsGrade = physics;		
	}

	public void setChemistryGrade(int chemistry){
		chemistryGrade = chemistry;	
    }

	public void setBiologyGrade(int biology){
		biologyGrade = biology;
	}
	
	public void setName(String name){
		Name = name; 	  
	}

	public void setSection(String section){
		Section = section;   
	}

	public void setFullTotal(int total){
		fullTotal = total; 		   
	}

	@Override 
	public String toString() { 
	    return "ReportCard" + 
	    "Math = " + mathGrade +
	    "History = " + historyGrade + "\n" +
	    "Physics = " + physicsGrade + "\n" +
	    "Biology = " + biologyGrade + "\n" +
	    "Chemistry = " + chemistryGrade + "\n" +
	    "Geography = " + geographyGrade + "\n" +
	    "English = " + englishGrade + "\n" +
	    "Name = " + Name + "\n" + 
        "Section = " + Section + "\n" + 
        "Percentage = " + Percentage + "\n"; 
	}
}