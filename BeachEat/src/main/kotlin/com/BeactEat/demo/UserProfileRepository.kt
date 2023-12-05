package com.BeactEat.demo

import org.springframework.data.jpa.repository.JpaRepository

interface UserProfileRepository: JpaRepository<UserProfile, Long> {
}