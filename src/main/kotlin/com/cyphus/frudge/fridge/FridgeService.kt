package com.cyphus.frudge.fridge

import org.springframework.stereotype.Service

@Service
class FridgeService(val db: FridgeRepository) {
    fun getAll(): List<FridgeItem> = db.getAll()

    fun saveFridgeItem(fridgeItem: FridgeItem) = db.save(fridgeItem)
}