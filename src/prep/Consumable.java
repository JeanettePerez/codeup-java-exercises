package prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Consumable {
    void consume();
    List<String> getFullDescription();
}
