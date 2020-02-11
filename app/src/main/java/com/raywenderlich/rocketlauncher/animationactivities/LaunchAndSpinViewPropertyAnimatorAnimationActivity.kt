package com.raywenderlich.rocketlauncher.animationactivities

class LaunchAndSpinViewPropertyAnimatorAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    //animate returns instance of ViewPropertyAnimator
    rocket.animate()
            .translationY(-screenHeight)
            .rotationBy(360f)
            .setDuration(DEFAULT_ANIMATION_DURATION)
            .start()
  }
}
