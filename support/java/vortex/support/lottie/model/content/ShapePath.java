package vortex.support.lottie.model.content;

import vortex.support.lottie.LottieDrawable;
import vortex.support.lottie.animation.content.Content;
import vortex.support.lottie.animation.content.ShapeContent;
import vortex.support.lottie.model.animatable.AnimatableShapeValue;
import vortex.support.lottie.model.layer.BaseLayer;

public class ShapePath implements ContentModel {
  private final String name;
  private final int index;
  private final AnimatableShapeValue shapePath;

  public ShapePath(String name, int index, AnimatableShapeValue shapePath) {
    this.name = name;
    this.index = index;
    this.shapePath = shapePath;
  }

  public String getName() {
    return name;
  }

  public AnimatableShapeValue getShapePath() {
    return shapePath;
  }

  @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new ShapeContent(drawable, layer, this);
  }

  @Override public String toString() {
    return "ShapePath{" + "name=" + name +
        ", index=" + index +
        '}';
  }
}
