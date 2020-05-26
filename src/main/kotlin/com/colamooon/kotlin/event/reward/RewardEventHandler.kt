package com.colamooon.kotlin.event.reward

import com.colamooon.kotlin.event.Post.PostRewardEvent
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class RewardEventHandler(private val rewardRepository: RewardRepository) {
    @Async
    @EventListener
    @Transactional
    fun handle(event: PostRewardEvent) {
        throw IllegalArgumentException("event transaction test")
//        try {
//            Thread.sleep(5000)
//        } catch (e: InterruptedException) {
//            e.printStackTrace()
//        }
        rewardRepository.save(Reward(event.postId, 1L))

    }
}