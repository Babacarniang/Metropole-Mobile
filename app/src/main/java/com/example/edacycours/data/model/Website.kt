package com.example.edacycours.data.model

import android.annotation.SuppressLint
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
@Entity(tableName = "websites")
data class Website(

    @PrimaryKey(autoGenerate = true)
    var id: Long?,

    var name: String?,

    var url: String?
) : Parcelable {

    @Ignore
    constructor() : this(
        null,
        null,
        null

    )
}