package de.konqi.roborockbridge.roborockbridge.persistence.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Home(
    @Id
    @Column(name = "home_id")
    var homeId: Int,
    @Column(nullable = false)
    var name: String
)