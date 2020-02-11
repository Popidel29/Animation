package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator

class FlyThereAndBackAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {

    val animator = ValueAnimator.ofFloat(0f, -screenHeight)

    animator.addUpdateListener {
      val value = it.animatedValue as Float
      rocket.translationY = value
      doge.translationY = value
    }

    animator.repeatMode = ValueAnimator.RESTART
    animator.repeatCount = 3
// setting duration and starting the animation
    animator.duration = 500L
    animator.start()
  }
}