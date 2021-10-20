package com.demo.retrofitwithpost

data class INBOUNDCALL(
    val INBOUND_CALL_count: Int,
    val INBOUND_CALL_cre_date: String,
    val INBOUND_CALL_mod_date: String,
    val INBOUND_SMS_count: Int,
    val INBOUND_SMS_cre_date: String,
    val INBOUND_SMS_mod_date: String,
    val OUTBOUND_SMS_count: Int,
    val OUTBOUND_SMS_cre_date: String,
    val OUTBOUND_SMS_mod_date: String
)