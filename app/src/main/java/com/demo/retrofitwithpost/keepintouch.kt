package com.demo.retrofitwithpost

data class keepintouch(
    val contacts: List<Contact>,
    val count: Int,
    val cursor: String,
    val success: Boolean
)