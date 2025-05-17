package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Status
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Status(
    @SerialName("elapsed")
    val elapsed: Int?,
    @SerialName("extra")
    val extra: Int?,
    @SerialName("long")
    val long: String?,
    @SerialName("short")
    val short: String?,
) {
    fun toDomain() =
        Status(
            elapsed = elapsed,
            extra = extra,
            long = long,
            short = short,
        )
}
