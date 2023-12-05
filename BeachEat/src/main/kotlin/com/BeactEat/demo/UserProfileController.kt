package com.BeactEat.demo


import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/add")
class UserProfileController (private val userProfileService: UserProfileService) {

    @PostMapping
    fun addUserProfile(@RequestBody userProfileData: UserProfile): ResponseEntity<UserProfile> {
        val savedUserProfile = userProfileService.addUserProfile(userProfileData)
        return ResponseEntity.ok(savedUserProfile)
    }

    @GetMapping
    fun getAllUserProfiles(): ResponseEntity<List<UserProfile>> {
        val userProfiles = userProfileService.getAllUserProfiles()
        return ResponseEntity.ok(userProfiles)
    }
}