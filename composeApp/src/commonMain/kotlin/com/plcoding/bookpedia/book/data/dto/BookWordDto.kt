package com.plcoding.bookpedia.book.data.dto

import kotlinx.serialization.Serializable

@Serializable(with = BookWorkDtoSerializer::class)
data class BookWordDto(
    val description: String? = null,
)
