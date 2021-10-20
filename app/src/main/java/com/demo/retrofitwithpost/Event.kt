package com.demo.retrofitwithpost

data class Event(
    val Chat_Initiated: ChatInitiated,
    val FORWARDED: FORWARDED,
    val INBOUND_CALL: INBOUNDCALL,
    val INBOUND_SMS: INBOUNDSMS,
    val LIVE_ANSWER: LIVEANSWER,
    val MISSED_CALL: MISSEDCALL,
    val OUTBOUND_CALL: OUTBOUNDCALL,
    val OUTBOUND_SMS: OUTBOUNDSMS,
    val VOICEMAIL: VOICEMAIL
)