package com.cyphus.frudge.fridge

import org.springframework.data.repository.CrudRepository


interface FridgeRepository: CrudRepository<FridgeItem, String> {
    fun getAll(): List<FridgeItem>
    fun getAllByName(name: String): List<FridgeItem>
}