package com.reyy.moviecataloguereyy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_movie.*
import kotlinx.android.synthetic.main.activity_detail_movie.movie_overview
import kotlinx.android.synthetic.main.movie_item.*

class DetailMovieActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    var movies: Movie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        movies = intent.getParcelableExtra(EXTRA_DATA)

        tv_title.text = movies?.title
        movie_overview.text = movies?.overview
        movie_overview.text = movies?.overview
        movie_popularity.text = movies?.popularity
        movie_vote_count.text = movies?.votecount
        movie_language.text = movies?.originallanguage
        release_date.text = movies?.release
        Glide.with(img_poster).load(IMAGE_BASE + movies!!.poster).into(img_poster)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
