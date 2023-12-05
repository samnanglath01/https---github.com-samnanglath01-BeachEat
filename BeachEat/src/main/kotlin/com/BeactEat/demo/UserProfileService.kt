package com.BeactEat.demo

import org.springframework.stereotype.Service

@Service
class UserProfileService(private val userProfileRepository: UserProfileRepository) {
    fun addUserProfile(userProfile: UserProfile): UserProfile {
        return userProfileRepository.save(userProfile)
    }

    fun getAllUserProfiles(): List<UserProfile> {
        return userProfileRepository.findAll()
    }
}