package com.colamooon.kotlin.event.Post


import com.colamooon.kotlin.event.common.model.AggregateRoot
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table


@Entity
@Table(name = "posts")
class Post : AggregateRoot<Post>() {

    var title = ""
    var content = ""
    var memberId: Long? = null

    @Enumerated(EnumType.STRING)
    private var rewardStatus = RewardStatus.INIT

    fun rewarded() {
        this.rewardStatus = RewardStatus.DOING
        registerEvent(PostRewardEvent(this))
    }

    enum class RewardStatus {
        INIT, DOING, DONE
    }


}
