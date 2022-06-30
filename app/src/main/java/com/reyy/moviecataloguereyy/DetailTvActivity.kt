package com.reyy.moviecataloguereyy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_movie.*
import kotlinx.android.synthetic.main.activity_detail_movie.img_poster
import kotlinx.android.synthetic.main.activity_detail_movie.movie_overview
import kotlinx.android.synthetic.main.activity_detail_tv.*
import kotlinx.android.synthetic.main.movie_item.*
import kotlinx.android.synthetic.main.tv_item.*
import kotlinx.android.synthetic.main.tv_item.tv_overview

class DetailTvActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    var tv: Tv? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tv)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        tv = intent.getParcelableExtra(EXTRA_DATA)

        name.text = tv?.name
        tv_overview.text = tv?.overview
        tv_overview.text = tv?.overview
        tv_popularity.text = tv?.popularity
        tv_vote.text = tv?.vote
        tv_language.text = tv?.originallanguage
        first_air_date.text = tv?.firstairdate
        Glide.with(img_poster).load(IMAGE_BASE + tv!!.poster).into(img_poster)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
