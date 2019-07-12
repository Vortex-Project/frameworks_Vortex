package vortex.support.lottie.model.content;


import android.support.annotation.Nullable;

import vortex.support.lottie.LottieDrawable;
import vortex.support.lottie.animation.content.Content;
import vortex.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
