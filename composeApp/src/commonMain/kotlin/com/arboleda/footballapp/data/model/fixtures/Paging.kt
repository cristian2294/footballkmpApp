package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Paging
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Paging(
    @SerialName("current")
    val current: Int,
    @SerialName("total")
    val total: Int,
) {
    fun toDomain() =
        Paging(
            current = current,
            total = total,
        )
}
