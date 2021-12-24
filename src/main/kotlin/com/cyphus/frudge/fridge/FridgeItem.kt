package com.cyphus.frudge.fridge

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("fridge")
data class FridgeItem(
    @Id val id: String?,
    val name: String,
    val quantity: Int = 0,
    val cost: Float = 0F,  // this should be per serving
    val servings: Int = 0,
    val shelf_life: Int = 3,  // defaults to 3 days because why not
    val bought_at: String = "today",
    val expired: Boolean = false,
)