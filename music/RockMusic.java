package music;

import java.util.Arrays;

public class RockMusic extends MusicStyles{

    public RockMusic(String Object, String[] strings) {
        super();
        playMusic();{
            System.out.println(Object + " playing " + Arrays.toString(strings));
        }
    }
}
