package com.example.repositoryinfotesttask.remote.github.api.repository

// Класс с данными лицензии репозитория ("users/{user}/repos")

data class License(
    val key: String,
    val name: String,
    val node_id: String,
    val spdx_id: String,
    val url: String
)