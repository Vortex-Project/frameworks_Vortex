package vortex.support.lottie.model.animatable;

import vortex.support.lottie.value.Keyframe;
import vortex.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import vortex.support.lottie.animation.keyframe.ScaleKeyframeAnimation;
import vortex.support.lottie.value.ScaleXY;

import java.util.List;

public class AnimatableScaleValue extends BaseAnimatableValue<ScaleXY, ScaleXY> {

  AnimatableScaleValue() {
    this(new ScaleXY(1f, 1f));
  }

  public AnimatableScaleValue(ScaleXY value) {
    super(value);
  }

  public AnimatableScaleValue(List<Keyframe<ScaleXY>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ScaleXY, ScaleXY> createAnimation() {
    return new ScaleKeyframeAnimation(keyframes);
  }
}
