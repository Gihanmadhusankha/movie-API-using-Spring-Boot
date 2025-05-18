package com.projects.movieApi.dto;

import java.util.List;

public record MoviePageResponse (List<MovieDto> movieDtos,
                                 Integer pageNumber,
                                 Integer pageSize,
                                 Integer totalPages,

                                 long totalElements, boolean isLast){

}
