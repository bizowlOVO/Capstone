package kr.ac.sunmoon.mrs.genre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Genre;

@Service
public class GenreServiceImpl implements GenreService {
	@Autowired
	private GenreMapper genreMapper;

	public Genre inquiryGenre(Genre genre) {
		return genreMapper.selectGenre(genre);
	}

	public List<Genre> inquiryGenreAll() {
		List<Genre> genre = genreMapper.selectGenreAll();
		for (int i = 0; i < genre.size(); i++) {
			System.out.println(genre.get(i).getGenre());
		}
		return genreMapper.selectGenreAll();
	}
}
