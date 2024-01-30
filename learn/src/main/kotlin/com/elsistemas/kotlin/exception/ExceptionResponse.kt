package com.elsistemas.kotlin.exception

import java.util.Date

class ExceptionResponse (
        var timestamp: Date,
        var message: String?,
        var details: String,
)