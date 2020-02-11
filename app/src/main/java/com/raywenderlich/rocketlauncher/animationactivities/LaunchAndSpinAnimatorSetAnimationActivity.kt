package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator

class LaunchAndSpinAnimatorSetAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {

    val positionAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
    //attaching the animatorupdatelis to the valueanimator
    positionAnimator.addUpdateListener {
      val value = it.animatedValue as Float
      rocket.translationY = value
    }
    //creating object animator for updating
    val rotationAnimator = ObjectAnimator.ofFloat(rocket, "rotation", 0f, 180f)
    //creating a new instance of Animator.set
    val animatorSet = AnimatorSet()
    //specifying execution of position and rotator animator
    animatorSet.play(positionAnimator).with(rotationAnimator)

    animatorSet.duration = DEFAULT_ANIMATION_DURATION
    animatorSet.start()
  }
}
