package com.traffic.shimhg02.seniorcar

import com.google.gson.annotations.SerializedName

/**
 * Created by Kinetic on 2018-06-02.
 */

class LocationRepo {
    @SerializedName("lat")
    var lat = ""

    @SerializedName("lng")
    var lng = ""

    @SerializedName("placeName")
    var placeName = ""
}