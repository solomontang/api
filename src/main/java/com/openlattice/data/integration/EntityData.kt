package com.openlattice.data.integration

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

/* Contains entity set id and entity key id of a given entity
* and a map of property type id to properties that belong to that entity
*/

data class EntityData(
        @JsonProperty val entitySetId: UUID,
        @JsonProperty val entityKeyId: UUID,
        @JsonProperty val properties: Map<UUID, Set<Any>>)