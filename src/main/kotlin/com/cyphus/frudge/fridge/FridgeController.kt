package com.cyphus.frudge.fridge

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class FridgeController(val fridgeService: FridgeService) {
    @GetMapping
    fun index(): List<FridgeItem> = listOf(FridgeItem("id", "malk"))

    @PostMapping
    fun post(@RequestBody item: FridgeItem) {
        fridgeService.saveFridgeItem(item)
    }
}