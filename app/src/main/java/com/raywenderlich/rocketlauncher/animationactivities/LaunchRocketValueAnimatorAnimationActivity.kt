package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class LaunchRocketValueAnimatorAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    //instance of value animator
    val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
    //calls listener with every update to the animated value
    valueAnimator.addUpdateListener {
      //get current value from animator and cast it
      val value = it.animatedValue as Float
      //changing position
      rocket.translationY = value
    }
    valueAnimator.interpolator = LinearInterpolator()
    //setting the animation duration(default 10ms)
    valueAnimator.duration = DEFAULT_ANIMATION_DURATION
    valueAnimator.start()


  }
}
