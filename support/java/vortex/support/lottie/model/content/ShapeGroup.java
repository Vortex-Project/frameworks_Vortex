package vortex.support.lottie.model.content;

import vortex.support.lottie.LottieDrawable;
import vortex.support.lottie.animation.content.Content;
import vortex.support.lottie.animation.content.ContentGroup;
import vortex.support.lottie.model.layer.BaseLayer;

import java.util.Arrays;
import java.util.List;

public class ShapeGroup implements ContentModel {
  private final String name;
  private final List<ContentModel> items;

  public ShapeGroup(String name, List<ContentModel> items) {
    this.name = name;
    this.items = items;
  }

  public String getName() {
    return name;
  }

  public List<ContentModel> getItems() {
    return items;
  }

  @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new ContentGroup(drawable, layer, this);
  }

  @Override public String toString() {
    return "ShapeGroup{" + "name='" + name + "\' Shapes: " + Arrays.toString(items.toArray()) + '}';
  }
}
