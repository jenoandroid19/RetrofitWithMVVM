package com.demo.retrofitwithpost

data class Contact(
    val accountId: String,
    val androidAppVersion: Any,
    val androidDevice: Any,
    val androidOSVersion: Any,
    val androidWebSessions: Int,
    val avatarColor: String,
    val broadcastId: Any,
    val browserLanguage: String,
    val browserName: String,
    val browserVersion: String,
    val campaignMedium: String,
    val campaignName: Any,
    val campaignSource: String,
    val campaignUrl: Any,
    val companyIndustry: String,
    val companyKey: Any,
    val companyName: Any,
    val companySize: Int,
    val contact: Any,
    val contactId: String,
    val country: String,
    val createdDate: Long,
    val csKey: Any,
    val currentIndex: String,
    val currentUrl: Any,
    val customFields: Any,
    val deleted: Boolean,
    val deviceHeight: Int,
    val deviceWidth: Int,
    val displayPhoneNumber: Any,
    val email: String,
    val emailId: List<String>,
    val esonly: Boolean,
    val event: Event,
    val existingContact: Boolean,
    val firstContacted: Long,
    val firstName: String,
    val fullName: String,
    val integrationUserId: Any,
    val iosAppVersion: String,
    val iosDevice: String,
    val iosOsVersion: String,
    val iosWebSessions: Int,
    val ip: String,
    val isDeleted: Boolean,
    val isESOnly: Boolean,
    val isExistingContact: Boolean,
    val isLogin: Boolean,
    val isOwner: Any,
    val key: String,
    val lastContacted: Long,
    val lastName: String,
    val lastPageTitle: String,
    val lastPageUrl: Any,
    val lastSeenOnAndroid: Any,
    val lastSeenOnIos: Any,
    val lastSeenTime: Long,
    val last_seen_user_agent: Any,
    val latitude: String,
    val linkedAccount: String,
    val longitude: String,
    val modifiedDate: Long,
    val originalAccountId: Any,
    val os: String,
    val ownerId: String,
    val pageTitle: String,
    val phone: List<String>,
    val phoneNumber: String,
    val profileImage: String,
    val projectId: String,
    val sourceUrl: Any,
    val state: String,
    val status: String,
    val syncInDCM: Boolean,
    val syncInDatastore: Boolean,
    val tags: List<String>,
    val totalVisit: Int,
    val type: String,
    val userId: String,
    val viewportHeight: Int,
    val viewportWidth: Int,
    val visitorAvailabilityStatus: String,
    val visitorSource: String,
    val webSessions: Int
)