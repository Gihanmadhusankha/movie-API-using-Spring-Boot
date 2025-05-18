package com.projects.movieApi.service;

import com.projects.movieApi.dto.MovieDto;
import com.projects.movieApi.dto.MoviePageResponse;
import com.projects.movieApi.entities.Movie;
import org.hibernate.Internal;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface MovieService {
    MovieDto addMovie(MovieDto movieDto, MultipartFile file) throws IOException;
    MovieDto getMovie(Integer movieId);

    List<MovieDto> getAllMovies();

    MovieDto updateMovie(Integer movieId, MovieDto movieDto,MultipartFile file)throws IOException;

    String deleteMovie(Integer movieId) throws IOException;

    MoviePageResponse getAllMoviesWithPagination(Integer pageNumber ,Integer pageSize);

    MoviePageResponse getAllMoviesWithPaginationAndSorting(Integer pageNumber ,Integer pageSize, String sortBy ,String dir);
}
