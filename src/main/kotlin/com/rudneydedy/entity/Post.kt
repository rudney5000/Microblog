package com.rudneydedy.entity

import java.sql.Timestamp
import java.time.LocalDateTime

data class Post (
    var id: Long,
    var content: String,
    var userId: Long,
    var createAt: Timestamp = Timestamp.valueOf(LocalDateTime.now())
)