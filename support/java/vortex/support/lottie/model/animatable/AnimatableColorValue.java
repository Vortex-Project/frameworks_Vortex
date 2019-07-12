package vortex.support.lottie.model.animatable;

import vortex.support.lottie.value.Keyframe;
import vortex.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import vortex.support.lottie.animation.keyframe.ColorKeyframeAnimation;

import java.util.List;

public class AnimatableColorValue extends BaseAnimatableValue<Integer, Integer> {
  public AnimatableColorValue(List<Keyframe<Integer>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<Integer, Integer> createAnimation() {
    return new ColorKeyframeAnimation(keyframes);
  }
}
