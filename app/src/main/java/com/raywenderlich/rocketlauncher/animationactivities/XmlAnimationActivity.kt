package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import com.raywenderlich.rocketlauncher.R

class XmlAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    // load the animator set from R.anim...
    val rocketAnimatorSet = AnimatorInflater.loadAnimator(this, R.animator.jump_and_blink) as AnimatorSet
    //setting rocket as target for loaded animator
    rocketAnimatorSet.setTarget(rocket)

    // load the animator from the same file
    val dogeAnimatorSet = AnimatorInflater.loadAnimator(this, R.animator.jump_and_blink) as AnimatorSet
    // repeat doge
    dogeAnimatorSet.setTarget(doge)

    // animator set
    val bothAnimatorSet = AnimatorSet()
    bothAnimatorSet.playTogether(rocketAnimatorSet, dogeAnimatorSet)

    bothAnimatorSet.duration = DEFAULT_ANIMATION_DURATION
    bothAnimatorSet.start()
  }
}
