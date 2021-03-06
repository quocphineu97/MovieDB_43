package com.asterisk.tuandao.themoviedb.data.source.repository

import com.asterisk.tuandao.themoviedb.data.source.MoviesDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MoviesRepository @Inject constructor(val moviesRemoteDataSource: MoviesDataSource.Remote)
    : MoviesDataSource.Local, MoviesDataSource.Remote{

    override fun getMovies(page: Int) = moviesRemoteDataSource.getMovies(page)

    override fun getGenres() = moviesRemoteDataSource.getGenres()

    override fun getMoviesByGenre(page: Int, genreId: String) = moviesRemoteDataSource.getMoviesByGenre(page, genreId)

    override fun getMoviesById(page: Int, append: String) = moviesRemoteDataSource.getMoviesById(page, append)
}
