package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.FixturesWrapper
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FixturesWrapper(
    @SerialName("errors")
    val errors: List<String>? = emptyList(),
    @SerialName("paging")
    val paging: Paging,
    @SerialName("parameters")
    val parameters: Parameters,
    @SerialName("response")
    val response: List<Response>,
    @SerialName("results")
    val results: Int,
) {
    fun toDomain() =
        FixturesWrapper(
            errors = errors,
            paging = paging.toDomain(),
            parameters = parameters.toDomain(),
            response = response.map { it.toDomain() },
            results = results,
        )
}
