package kr.ac.sunmoon.mrs.genre;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.sunmoon.mrs.agent.Genre;

@Mapper
public interface GenreMapper {
	public List<Genre> selectGenreAll();
}
