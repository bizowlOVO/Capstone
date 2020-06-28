package kr.ac.sunmoon.mrs.agent;

public class Movie {
	private int movieSeq;
	private String title;
	private String releaseDate;
	private String synopsis;
	private int filmAge;
	private String directCountry;
	private int runningTime;
	private String downloadLink;
	private String genreFirst;
	private String genreSecond;
	private int visitCount;
	private String director;
	private String poster;
	private String actor;
	private int avgGrade;
	
	public int getAvgGrade() {
		return avgGrade;
	}

	public void setAvgGrade(int avgGrade) {
		this.avgGrade = avgGrade;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getMovieSeq() {
		return movieSeq;
	}
	
	public void setMovieSeq(int movieSeq) {
		this.movieSeq = movieSeq;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	public int getFilmAge() {
		return filmAge;
	}
	
	public void setFilmAge(int filmAge) {
		this.filmAge = filmAge;
	}
	
	public String getDirectCountry() {
		return directCountry;
	}
	
	public void setDirectCountry(String directCountry) {
		this.directCountry = directCountry;
	}
	
	public int getRunningTime() {
		return runningTime;
	}
	
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	
	public String getDownloadLink() {
		return downloadLink;
	}
	
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
	
	public String getGenreFirst() {
		return genreFirst;
	}
	
	public void setGenreFirst(String genreFirst) {
		this.genreFirst = genreFirst;
	}
	
	public String getGenreSecond() {
		return genreSecond;
	}
	
	public void setGenreSecond(String genreSecond) {
		this.genreSecond = genreSecond;
	}
	
	public int getVisitCount() {
		return visitCount;
	}
	
	public void setVisitCount(int visitCount) {
		this.visitCount = visitCount;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}
