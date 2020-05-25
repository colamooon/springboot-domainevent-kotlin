package com.colamooon.kotlin.event.reward


import com.colamooon.app.api.common.model.BaseEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "rewards")
class Reward(postId: Long?, memberId: Long?) : BaseEntity() {

    var postId: Long? = postId
    var memberId: Long? = memberId


}
