package music;

public class MainMusic extends MusicStyles {

    public static void main(String[] args) {
        ClassicMusic mozart = new ClassicMusic("Wolfgang Mozart", new String[]{"Piano sonata N 5",
                "Turkish March", "Symphony N 41"});

        ClassicMusic bach = new ClassicMusic("Johann Bach", new String[]{"Sonate in a-Moll",
                "Orchestral Suite N3", "Prelude N6"});
        RockMusic acdc = new RockMusic("ACDC", new String[]{"Big Gan", "Hells Bells", "Back in Black"});
        RockMusic ozzy = new RockMusic("Ozzy Osbourne", new String[]{"Crazy Train", "No More Tears",
                "Bark at the Moon"});
        PopMusic madonna = new PopMusic("Madonna", new String[]{"Holiday", "Erotica", "Rain"});

        PopMusic boneym = new PopMusic("BoneyM", new String[]{"Sanny", "Daddy coll", "Ma Baker"});

        MusicStyles[] musicStyles = {mozart, bach, acdc, ozzy, madonna, boneym};

        for (MusicStyles m :musicStyles) {
            m.playMusic();
        }

    }
}