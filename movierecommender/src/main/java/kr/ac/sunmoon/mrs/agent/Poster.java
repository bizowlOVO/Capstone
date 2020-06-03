package kr.ac.sunmoon.mrs.agent;

public class Poster {
	private int posterSeq;
	private int movieSeq;
	private String savedRoute;
	private String physicalFileName;
	private String logicalFileName;
	
	public int getPosterSeq() {
		return posterSeq;
	}
	
	public void setPosterSeq(int posterSeq) {
		this.posterSeq = posterSeq;
	}
	
	public int getMovieSeq() {
		return movieSeq;
	}
	
	public void setMovieSeq(int movieSeq) {
		this.movieSeq = movieSeq;
	}
	
	public String getSavedRoute() {
		return savedRoute;
	}
	
	public void setSavedRoute(String savedRoute) {
		this.savedRoute = savedRoute;
	}
	
	public String getPhysicalFileName() {
		return physicalFileName;
	}
	
	public void setPhysicalFileName(String physicalFileName) {
		this.physicalFileName = physicalFileName;
	}
	
	public String getLogicalFileName() {
		return logicalFileName;
	}
	
	public void setLogicalFileName(String logicalFileName) {
		this.logicalFileName = logicalFileName;
	}
}
