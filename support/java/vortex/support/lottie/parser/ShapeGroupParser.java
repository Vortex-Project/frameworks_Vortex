package vortex.support.lottie.parser;

import android.util.JsonReader;

import vortex.support.lottie.LottieComposition;
import vortex.support.lottie.model.content.ContentModel;
import vortex.support.lottie.model.content.ShapeGroup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ShapeGroupParser {

  private ShapeGroupParser() {}

  static ShapeGroup parse(
      JsonReader reader, LottieComposition composition) throws IOException {
    String name = null;
    List<ContentModel> items = new ArrayList<>();

    while (reader.hasNext()) {
      switch (reader.nextName()) {
        case "nm":
          name = reader.nextString();
          break;
        case "it":
          reader.beginArray();
          while (reader.hasNext()) {
            ContentModel newItem = ContentModelParser.parse(reader, composition);
            if (newItem != null) {
              items.add(newItem);
            }
          }
          reader.endArray();
          break;
        default:
          reader.skipValue();
      }
    }

    return new ShapeGroup(name, items);
  }
}
