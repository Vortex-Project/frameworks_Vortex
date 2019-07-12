package vortex.support.lottie.model.animatable;

import vortex.support.lottie.value.Keyframe;
import vortex.support.lottie.animation.keyframe.TextKeyframeAnimation;
import vortex.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
