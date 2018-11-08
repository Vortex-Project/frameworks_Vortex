package havoc.support.lottie.model.content;


import android.support.annotation.Nullable;

import havoc.support.lottie.LottieDrawable;
import havoc.support.lottie.animation.content.Content;
import havoc.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
