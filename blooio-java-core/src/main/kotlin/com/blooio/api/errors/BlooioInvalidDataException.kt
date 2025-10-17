package com.blooio.api.errors

class BlooioInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : BlooioException(message, cause)
