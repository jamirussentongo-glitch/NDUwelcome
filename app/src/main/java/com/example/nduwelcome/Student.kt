package com.example.nduwelcome

/**
 * MODULE 3: THE DATA MODEL
 * We move from hardcoding strings to using a structured object.
 * This allows us to handle hundreds of students using a single layout template.
 */
data class Student(
    val id: Int,
    val name: String,
    val regNumber: String,
    val programme: String,
    val profileImageId: Int, // Resource ID (e.g., R.drawable.female_student)
    val isVerified: Boolean = false
)
