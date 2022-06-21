package com.example.convertoforleroy.model.nal

data class NalichkaItem(
    val currencyCodeA: Int,
    val currencyCodeB: Int,
    val date: Int,
    val rateBuy: Double,
    val rateCross: Double,
    val rateSell: Double
)