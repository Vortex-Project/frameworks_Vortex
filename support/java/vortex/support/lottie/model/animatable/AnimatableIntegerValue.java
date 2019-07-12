package vortex.support.lottie.model.animatable;

import vortex.support.lottie.value.Keyframe;
import vortex.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import vortex.support.lottie.animation.keyframe.IntegerKeyframeAnimation;

import java.util.List;

public class AnimatableIntegerValue extends BaseAnimatableValue<Integer, Integer> {

  public AnimatableIntegerValue() {
    super(100);
  }

  public AnimatableIntegerValue(List<Keyframe<Integer>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<Integer, Integer> createAnimation() {
    return new IntegerKeyframeAnimation(keyframes);
  }
}
