package com.demo.retrofitwithpost

data class VOICEMAIL(
    val FORWARDED_count: Int,
    val FORWARDED_cre_date: String,
    val FORWARDED_mod_date: String,
    val LIVE_ANSWER_count: Int,
    val LIVE_ANSWER_cre_date: String,
    val LIVE_ANSWER_mod_date: String,
    val MISSED_CALL_count: Int,
    val MISSED_CALL_cre_date: String,
    val MISSED_CALL_mod_date: String,
    val OUTBOUND_CALL_count: Int,
    val OUTBOUND_CALL_cre_date: String,
    val OUTBOUND_CALL_mod_date: String
)