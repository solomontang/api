package com.openlattice.codex

import java.util.*

data class MessageRequest (
        val organizationId: UUID,
        val messageEntitySetId : UUID,
        val messageContents: String,
        val phoneNumber: String
)