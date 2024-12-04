package com.theandroidfactory.SeasonTwo

import java.io.Serializable

data class DistroTile(
    val id : String = "",
    val headerImgResId : Int = 0,
    val title : String = "",
    val description : String = "",
    val descriptionLong : String = "",
    val buttonText : String = "",
    val headerImageUrl : String ? = null
) : Serializable