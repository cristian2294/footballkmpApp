package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Periods
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Periods(
    @SerialName("first")
    val first: Int?,
    @SerialName("second")
    val second: Int?,
) {
    fun toDomain() = Periods(first = first, second = second)
}
