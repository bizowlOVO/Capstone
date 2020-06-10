package kr.ac.sunmoon.mrs.grade;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.sunmoon.mrs.agent.Movie;

@Mapper
public interface GradeMapper {
	public List<Movie> selectRankGrade();
}
