package com.example.thisrickandmorty.model

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("status")
    var status: String? = null,
    @SerializedName("species")
    var species: String? = null,
    @SerializedName("type")
    var type: String? = null,
    @SerializedName("gender")
    var gender: String? = null,
    @SerializedName("image")
    var image: String? = null,
    @SerializedName("episode")
    var episode: ArrayList<String> = arrayListOf(),
    @SerializedName("url")
    var url: String? = null,
    @SerializedName("created")
    var created: String? = null
)

data class CharacterResponse(
    @SerializedName("results") var results: ArrayList<Character> = arrayListOf()
)

