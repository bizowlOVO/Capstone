package kr.ac.sunmoon.mrs.genre;

import java.util.List;

import kr.ac.sunmoon.mrs.agent.Genre;

public interface GenreService {
	public Genre inquiryGenre(Genre genre);
	
	public List<Genre> inquiryGenreAll();
}
