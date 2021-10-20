package com.demo.retrofitwithpost

data class ChatInitiated(
    val Chat_Initiated_count: Int,
    val Chat_Initiated_cre_date: String,
    val Chat_Initiated_mod_date: String,
    val INBOUND_SMS_count: Int,
    val INBOUND_SMS_cre_date: String,
    val INBOUND_SMS_mod_date: String,
    val OUTBOUND_CALL_count: Int,
    val OUTBOUND_CALL_cre_date: String,
    val OUTBOUND_CALL_mod_date: String
)