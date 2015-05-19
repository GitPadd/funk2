package de.dhbw.vs.fpr.register;

public class Entry {

	private String notiz;
	private String datum;
	private String IDofPupil;
	
	public Entry(String n, String date, String ID){
		notiz = n;
		datum = date;
		IDofPupil = ID;
	}

	public String getNotiz() {
		return notiz;
	}

	public void setNotiz(String notiz) {
		this.notiz = notiz;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getIDofPupil() {
		return IDofPupil;
	}

	public void setIDofPupil(String iDofPupil) {
		IDofPupil = iDofPupil;
	}
	
}
