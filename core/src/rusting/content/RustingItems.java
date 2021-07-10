package rusting.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class RustingItems implements ContentList {
    public static Item
        melonaleum, bulastelt, taconite
    ;
    @Override
    public void load() {
        melonaleum = new Item("melonaleum", Color.valueOf("#6572ca")){{
            flammability = 0.1f;
            explosiveness = 3;
            radioactivity = 0.25f;
            charge = 2.25f;
            hardness = 3;
            cost = 1.35f;
        }};

        taconite = new Item("taconite", Color.valueOf("#f6cccc")){{
            hardness = 1;
            cost = 0.86f;
        }};

        bulastelt = new Item("bulastelt", Color.valueOf("#bcbcbc")){{
            hardness = 2;
            cost = 1.05f;
        }};
    }
}