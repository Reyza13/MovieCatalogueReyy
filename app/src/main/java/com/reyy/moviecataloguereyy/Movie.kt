package com.reyy.moviecataloguereyy

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    @SerializedName("id")
    val id : String ?,

    @SerializedName("title")
    val title : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("release_date")
    val release : String?,

    @SerializedName("overview")
    val overview : String?,

    @SerializedName("original_language")
    val originallanguage : String?,

    @SerializedName("popularity")
    val popularity : String?,

    @SerializedName("vote_count")
    val votecount : String?

    ) : Parcelable {
    constructor() : this("", "", "", "","","","","")
}
