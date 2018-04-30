package havoc.support.lottie.model.animatable;

import havoc.support.lottie.value.Keyframe;
import havoc.support.lottie.animation.keyframe.TextKeyframeAnimation;
import havoc.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
