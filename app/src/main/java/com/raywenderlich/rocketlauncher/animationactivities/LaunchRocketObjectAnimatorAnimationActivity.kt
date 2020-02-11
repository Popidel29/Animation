package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ObjectAnimator

class LaunchRocketObjectAnimatorAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    // Creating an instance of objectAnimator
    val objectAnimator = ObjectAnimator.ofFloat(rocket, "translationY", 0f, -screenHeight)

    objectAnimator.duration = DEFAULT_ANIMATION_DURATION
    objectAnimator.start()
  }
}
