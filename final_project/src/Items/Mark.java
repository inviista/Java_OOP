package Items;

import Users.Teacher;

public class Mark {
    
    private Integer firstAttestation = 0;
    private Integer secondAttestation = 0;
    private Integer finalMark = 0;
    private Integer totalMark;
    private Teacher teacher;
    ///private Transcript transcript;
    private String letterMark;
    private double GPA;
    private String tradMark;

    public Mark(){}
    
    /**
     * @generated
     */
    public Mark(int firstAttestation) {
    	this.firstAttestation = firstAttestation;
        updateTotalMark();
    }

    /**
     * @generated
     */
    public Mark(int firstAttestation,  int secondAttestation) {
    	this(firstAttestation);
    	this.secondAttestation = secondAttestation;
        updateTotalMark();
    }
    
    /**
     * @generated
     */
    public Mark(int firstAttestation, int secondAttestation, int finalMark)    {
    	this(firstAttestation, secondAttestation);
    	this.finalMark = finalMark;
        updateTotalMark();
        setFinalMark(finalMark);
    }




	/**
	    * @generated
	    */
	public Integer getFirstAttestation() {
        return this.firstAttestation;
    }

	/**
	    * @generated
	    */
    public void setFirstAttestation(Integer firstAttestation) {
        this.firstAttestation = firstAttestation;
        updateTotalMark();
    }

    /**
     * @generated
     */
    public Integer getSecondAttestation() {
        return this.secondAttestation;
    }

    /**
     * @generated
     */
    public Integer getFinalMark() {
        return this.finalMark;
    }

    /**
     * @generated
     */
	public String getTradMark() {
		return tradMark;
	}

	/**
	    * @generated
	    */
	public double getGPA() {
		return GPA;
	}

	/**
	    * @generated
	    */
	public String getLetterMark() {
		return letterMark;
	}

	/**
	 * @generated
	 */
	
	public double getTotalMark() {
		return totalMark;
	}
    
	/**
     * Summarizes the grade for the 2 attestations and identifies if the student has a retake.
     */
    public void setSecondAttestation(Integer secondAttestation, int firstAttestation, String letterMark, double GPA, String tradMark) {
        this.secondAttestation = secondAttestation;
        this.firstAttestation = firstAttestation;
        updateTotalMark();
        if (totalMark < 30) {
            this.letterMark = "F";
            this.GPA = 0;
            this.tradMark = "Satisfactory";
        }

    }

    /**
     * Grades the final grade and converts the overall grade to a traditional, GPA, and letter grade.
     */
    public void setFinalMark(int finalMark) {
    	if (finalMark >= 9.5 && finalMark < 19.5){
    		this.letterMark = "FX";
    	}
    	else{
    		this.letterMark = convertToLetterMark(totalMark);
    		this.GPA = convertToGPA(totalMark);
			this.tradMark = convertToTradMark(totalMark);
    	}
    }
    
    /**
     * Updates the overall mark.
     */
    public void updateTotalMark() {
    	this.totalMark = firstAttestation + secondAttestation + finalMark;
    }
    
    
    /**
     * Method to convert mark in traditional.
     */
    public String convertToTradMark(int mark)  {
        if (mark >= 90) {
            return "Great";
        } else if (mark >= 70 && mark < 90) {
            return "Good";
        } else if (mark >= 50 && mark < 70) {
            return "Satisfactory";
        } else {
            return "Unsatisfactory";
        }
    }


    /**
     * Method to convert mark in a letter.
     */
    public String convertToLetterMark(int mark) {
        if (mark >= 95) {
            return "A";
        } else if (mark >= 90 && mark < 95) {
            return "A-";
        } else if (mark >= 85 && mark < 90) {
            return "B+";
        } else if (mark >= 80 && mark < 85) {
            return "B";
        } else if (mark >= 75 && mark < 80) {
            return "B-";
        } else if (mark >= 70 && mark < 75) {
            return "C+";
        } else if (mark >= 65 && mark < 70) {
            return "C";
        } else if (mark >= 60 && mark < 65) {
            return "C-";
        } else if (mark >= 55 && mark < 60) {
            return "D+";
        } else if (mark >= 50 && mark < 55) {
            return "D";
        } else if (mark >= 30 && mark < 50) {
            return "FX";
        } else {
            return "F";
        }
    }


    /**
     * Method to convert mark in GPA
     */
    public double convertToGPA(int mark) {
        if (mark >= 95) {
            return 4.0;
        } else if (mark >= 90 && mark < 95) {
            return 3.67;
        } else if (mark >= 85 && mark < 90) {
            return 3.33;
        } else if (mark >= 80 && mark < 85) {
            return 3.0;
        } else if (mark >= 75 && mark < 80) {
            return 2.67;
        } else if (mark >= 70 && mark < 75) {
            return 2.33;
        } else if (mark >= 65 && mark < 70) {
            return 2.0;
        } else if (mark >= 60 && mark < 65) {
            return 1.67;
        } else if (mark >= 55 && mark < 60) {
            return 1.33;
        } else if (mark >= 50 && mark < 55) {
            return 1.0;
        } else if (mark >= 30 && mark < 50) {
            return 0;
        } else {
            return 0;
        }
    }
    
    /**
     * Method toString for show all marks
     */
    public String toString() {
    	return  "totalMark: " + getTotalMark() + ", letter mark: " + getLetterMark() + ", GPA: " + getGPA() + ", traditional mark: " + getTradMark();
    }
}
