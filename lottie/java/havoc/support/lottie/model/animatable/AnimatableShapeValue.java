package havoc.support.lottie.model.animatable;

import android.graphics.Path;

import havoc.support.lottie.value.Keyframe;
import havoc.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import havoc.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import havoc.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
