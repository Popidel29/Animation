package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class RotateRocketAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    //chnage the vlue to create the curve
    val valueAnimator = ValueAnimator.ofFloat(0f, 360f)

    valueAnimator.addUpdateListener {
      val value = it.animatedValue as Float
      //setting rotation
      rocket.rotation = value
    }
    valueAnimator.interpolator = LinearInterpolator()
    valueAnimator.duration = DEFAULT_ANIMATION_DURATION
    valueAnimator.start()
  }
}
