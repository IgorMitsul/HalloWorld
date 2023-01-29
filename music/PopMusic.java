package music;

import java.util.Arrays;

public class PopMusic extends MusicStyles{


   PopMusic boneym = new PopMusic("BoneyM", new String [] {"Sanny", "Daddy coll", "Ma Baker"});

    public PopMusic(String Object, String[] strings) {
        super();
        playMusic();{
            System.out.println(Object + " playing " + Arrays.toString(strings));
        }
    }
}
