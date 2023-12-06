package com.BeactEat.demo

import jakarta.persistence.*

@Entity
@Table(name = "app_USer",schema = "public")
data class UserProfile(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    @Column(name = "username")
    val username: String  ,

    @Column(name = "lastname")
    val lastName: String ,

    @Column(name = "firstname")
    val firstName: String ,

    @Column(name = "dob")
    val dob: Int ,
) {
    // Explicit no-argument constructor for JPA
    public constructor() : this(id = 0, username = "", lastName = "", firstName = "", dob = 0)
}