package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.support.v4.content.ContextCompat
import com.raywenderlich.rocketlauncher.R

class ColorAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    //calling object animator giving some arguments
    val objectAnimator = ObjectAnimator.ofObject(
            frameLayout,
            "backgroundColor",
            ArgbEvaluator(),
            //Start and end color values making use of contextcompat.. getting id from xml
            ContextCompat.getColor(this, R.color.background_from),
            ContextCompat.getColor(this, R.color.background_to)
    )
    //number of times the animation will repeat
    objectAnimator.repeatCount = 1
    //what it does when reach the end
    objectAnimator.repeatMode = ValueAnimator.REVERSE

    objectAnimator.duration = DEFAULT_ANIMATION_DURATION
    objectAnimator.start()
  }
}
