package vortex.support.lottie.parser;

import android.os.AsyncTask;
import android.util.JsonReader;

import vortex.support.lottie.Cancellable;
import vortex.support.lottie.LottieComposition;
import vortex.support.lottie.OnCompositionLoadedListener;

import java.io.IOException;

public final class AsyncCompositionLoader
    extends AsyncTask<JsonReader, Void, LottieComposition> implements Cancellable {
  private final OnCompositionLoadedListener loadedListener;

  @SuppressWarnings("WeakerAccess") public AsyncCompositionLoader(OnCompositionLoadedListener loadedListener) {
    this.loadedListener = loadedListener;
  }

  @Override protected LottieComposition doInBackground(JsonReader... params) {
    try {
      return LottieComposition.Factory.fromJsonSync(params[0]);
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  @Override protected void onPostExecute(LottieComposition composition) {
    loadedListener.onCompositionLoaded(composition);
  }

  @Override  public void cancel() {
    cancel(true);
  }
}
